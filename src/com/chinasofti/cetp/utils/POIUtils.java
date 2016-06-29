package com.chinasofti.cetp.utils;

import java.util.Iterator;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;

public class POIUtils {
	/**
	 * 复制一个单元格样式到目的单元格样式
	 * 
	 * @param fromStyle
	 * @param toStyle
	 */
	public static void copyCellStyle(CellStyle fromStyle, CellStyle toStyle) {
		toStyle.setAlignment(fromStyle.getAlignment());
		// 边框和边框颜色
		toStyle.setBorderBottom(fromStyle.getBorderBottom());
		toStyle.setBorderLeft(fromStyle.getBorderLeft());
		toStyle.setBorderRight(fromStyle.getBorderRight());
		toStyle.setBorderTop(fromStyle.getBorderTop());
		toStyle.setTopBorderColor(fromStyle.getTopBorderColor());
		toStyle.setBottomBorderColor(fromStyle.getBottomBorderColor());
		toStyle.setRightBorderColor(fromStyle.getRightBorderColor());
		toStyle.setLeftBorderColor(fromStyle.getLeftBorderColor());

		// 背景和前景
		toStyle.setFillBackgroundColor(fromStyle.getFillBackgroundColor());
		toStyle.setFillForegroundColor(fromStyle.getFillForegroundColor());

		toStyle.setDataFormat(fromStyle.getDataFormat());
		toStyle.setFillPattern(fromStyle.getFillPattern());
		// toStyle.setFont(fromStyle.getFont(null));
		toStyle.setHidden(fromStyle.getHidden());
		toStyle.setIndention(fromStyle.getIndention());// 首行缩进
		toStyle.setLocked(fromStyle.getLocked());
		toStyle.setRotation(fromStyle.getRotation());// 旋转
		toStyle.setVerticalAlignment(fromStyle.getVerticalAlignment());
		toStyle.setWrapText(fromStyle.getWrapText());

	}

	/**
	 * Sheet复制
	 * 
	 * @param fromSheet
	 * @param toSheet
	 * @param copyValueFlag
	 */
	public static void copySheet(Workbook wb, Sheet fromSheet, Sheet toSheet, boolean copyValueFlag) {
		// 合并区域处理
		mergerRegion(fromSheet, toSheet);
		for (Iterator rowIt = fromSheet.rowIterator(); rowIt.hasNext();) {

			Row tmpRow = (Row) rowIt.next();
			Row newRow = toSheet.createRow(tmpRow.getRowNum());
			System.out.println("RowNum: " + tmpRow.getRowNum());
			// 行复制
			copyRow(wb, tmpRow, newRow, copyValueFlag);
		}
	}

	/**
	 * 行复制功能
	 * 
	 * @param fromRow
	 * @param toRow
	 */
	public static void copyRow(Workbook wb, Row fromRow, Row toRow, boolean copyValueFlag) {
		for (Iterator cellIt = fromRow.cellIterator(); cellIt.hasNext();) {
			Cell tmpCell = (Cell) cellIt.next();
			Cell newCell = toRow.createCell(tmpCell.getColumnIndex());
			copyCell(wb, tmpCell, newCell, copyValueFlag, true, true);
		}
	}

	/**
	 * 复制原有sheet的合并单元格到新创建的sheet
	 * 
	 * @param sheetCreat
	 *            新创建sheet
	 * @param sheet
	 *            原有的sheet
	 */
	public static void mergerRegion(Sheet fromSheet, Sheet toSheet) {
		int sheetMergerCount = fromSheet.getNumMergedRegions();
		for (int i = 0; i < sheetMergerCount; i++) {
			CellRangeAddress mergedRegionAt = fromSheet.getMergedRegion(i);
			toSheet.addMergedRegion(mergedRegionAt);
		}
	}

	/**
	 * 复制单元格
	 * 
	 * @param srcCell
	 * @param distCell
	 * @param copyValueFlag
	 *            true则连同cell的内容一起复制
	 */
	public static void copyCell(Workbook wb, Cell srcCell, Cell distCell, boolean copyValueFlag, boolean copyTypeFlag, boolean copyStyleFlag) {
		// 样式
		if (copyStyleFlag) {
			CellStyle newstyle = wb.createCellStyle();
			copyCellStyle(srcCell.getCellStyle(), newstyle);
			distCell.setCellStyle(newstyle);
		}

		// 评论
		if (srcCell.getCellComment() != null) {
			distCell.setCellComment(srcCell.getCellComment());
		}

		// 不同数据类型处理
		int srcCellType = srcCell.getCellType();
		if (copyTypeFlag) {
			distCell.setCellType(srcCellType);
			if (copyValueFlag) {

				if (srcCellType == Cell.CELL_TYPE_NUMERIC) {
					if (DateUtil.isCellDateFormatted(srcCell)) {
						distCell.setCellValue(srcCell.getDateCellValue());
					} else {
						distCell.setCellValue(srcCell.getNumericCellValue());
					}
				} else if (srcCellType == Cell.CELL_TYPE_STRING) {
					distCell.setCellValue(srcCell.getRichStringCellValue());
				} else if (srcCellType == Cell.CELL_TYPE_BLANK) {
					// nothing21
				} else if (srcCellType == Cell.CELL_TYPE_BOOLEAN) {
					distCell.setCellValue(srcCell.getBooleanCellValue());
				} else if (srcCellType == Cell.CELL_TYPE_ERROR) {
					distCell.setCellErrorValue(srcCell.getErrorCellValue());
				} else if (srcCellType == Cell.CELL_TYPE_FORMULA) {
					distCell.setCellFormula(srcCell.getCellFormula());
				} else { // nothing29
				}
			}
		} else {
			if (copyValueFlag) {
				srcCell.setCellType(Cell.CELL_TYPE_STRING);
				distCell.setCellType(Cell.CELL_TYPE_STRING);
				distCell.setCellValue(srcCell.getStringCellValue());
			}
		}

	}

	public static String getPingYin(String src, boolean trim) {
		char[] t1 = null;
		t1 = src.toCharArray();
		String[] t2 = new String[t1.length];
		HanyuPinyinOutputFormat t3 = new HanyuPinyinOutputFormat();
		t3.setCaseType(HanyuPinyinCaseType.LOWERCASE);
		t3.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
		t3.setVCharType(HanyuPinyinVCharType.WITH_V);
		String t4 = "";
		int t0 = t1.length;
		try {
			for (int i = 0; i < t0; i++) {
				// 判断是否为汉字字符
				if (java.lang.Character.toString(t1[i]).matches("[\\u4E00-\\u9FA5]+")) {
					t2 = PinyinHelper.toHanyuPinyinStringArray(t1[i], t3);
					t4 += t2[0];
				} else if (!trim) {
					t4 += java.lang.Character.toString(t1[i]);
				}
			}
			// System.out.println(t4);
			return t4;
		} catch (BadHanyuPinyinOutputFormatCombination e1) {
			e1.printStackTrace();
		}
		return t4;
	}
}
