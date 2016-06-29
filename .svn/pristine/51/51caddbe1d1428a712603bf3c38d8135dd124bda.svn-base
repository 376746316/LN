<%@ page import="java.io.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	BufferedInputStream bis = null;
	BufferedOutputStream bos = null;
	OutputStream os = null;
	try {
		String fileurl1 = request.getParameter("fileurl1");
		fileurl1 = new String(fileurl1.getBytes("iso8859-1"), "UTF-8");
		fileurl1 = fileurl1.replace("/", "\\");
		String filename = request.getParameter("filename");
		filename = new String(filename.getBytes("iso8859-1"), "UTF-8");
		String clientaddr = "";
		response.setContentType("application/x-msdownload");
		response.setHeader(
				"Content-disposition",
				"attachment; filename="
						+ new String(filename.getBytes("UTF-8"),
								"iso8859-1"));
		/* 	if (request.getHeader("x-forwarded-for") == null) {
				clientaddr = request.getRemoteAddr();
			}else{
				clientaddr = request.getHeader("x-forwarded-for");
			}  */
		FileInputStream fi = new java.io.FileInputStream(fileurl1);		
		bis = new BufferedInputStream(fi);
		os = response.getOutputStream();
		bos = new BufferedOutputStream(os);
		byte[] buff = new byte[2048];
		int bytesRead;
		while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
			bos.write(buff, 0, bytesRead);
		}
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		if (bis != null) {
			bis.close();
		}
		if (bos != null) {
			bos.close();
		} else {
			out.print("$.messager.alert('提示','对不起，没有可以下载的资源!','info')");
		}
		os.flush();
		os.close();
		os = null;
		response.flushBuffer();
		out.clear();
		out = pageContext.pushBody();
	}
%>
