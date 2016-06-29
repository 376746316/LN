package com.chinasofti.cetp.utils;

import java.io.BufferedReader;   
import java.io.File;
import java.io.IOException;   
import java.io.InputStream;
import java.io.InputStreamReader;   
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;

import org.apache.log4j.Logger;

public class Address {
	
	private static final Logger logger = Logger.getLogger(DocConverter.class);
	   /**  
     * 获取当前操作系统名称.  
     * return 操作系统名称 例如:windows xp,linux 等.  
     */  
    private String getOSName() {   
        return System.getProperty("os.name").toLowerCase();   
    }   
       
    /**  
     * 获取unix网卡的mac地址.  
     * 非windows的系统默认调用本方法获取.如果有特殊系统请继续扩充新的取mac地址方法.  
     * @return mac地址  
     */  
    private String getUnixMACAddress() {   
        String mac = null;   
        BufferedReader bufferedReader = null;   
        Process process = null;   
        try {   
            process = Runtime.getRuntime().exec("ifconfig eth0");// linux下的命令，一般取eth0作为本地主网卡 显示信息中包含有mac地址信息   
            bufferedReader = new BufferedReader(new InputStreamReader(process   
                    .getInputStream()));   
            String line = null;   
            int index = -1;   
            while ((line = bufferedReader.readLine()) != null) {   
                index = line.toLowerCase().indexOf("hwaddr");// 寻找标示字符串[hwaddr]   
                if (index >= 0) {// 找到了   
                    mac = line.substring(index +"hwaddr".length()+ 1).trim();//  取出mac地址并去除2边空格   
                    break;   
                }   
            }   
        } catch (IOException e) {   
        	e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
        } finally {   
            try {   
                if (bufferedReader != null) {   
                    bufferedReader.close();   
                }   
            } catch (IOException e1) {   
            	e1.printStackTrace();
    			StringWriter sw = new StringWriter();
    			e1.printStackTrace(new PrintWriter(sw, true));
    			String str = sw.toString();
    			logger.error(str);
            }   
            bufferedReader = null;   
            process = null;   
        }   
  
        return mac;   
    }   
  
    /**  
     * 获取widnows网卡的mac地址.  
     * @return mac地址  
     */  
    private String getWindowsMACAddress() {   
        String mac = null;   
        BufferedReader bufferedReader = null;   
        Process process = null;   
        try {   
            process = Runtime.getRuntime().exec("ipconfig /all");// windows下的命令，显示信息中包含有mac地址信息   
            bufferedReader = new BufferedReader(new InputStreamReader(process   
                    .getInputStream(),"GB2312"));   
            String line = null;   
            int index = -1;   
            while ((line = bufferedReader.readLine()) != null) {  

                index = line.toLowerCase().indexOf("physical address");// 寻找标示字符串[physical address]
                if(index < 0){
                	index = line.toLowerCase().indexOf("物理地址");
                }
                if (index >= 0) {// 找到了   
                    index = line.indexOf(":");// 寻找":"的位置   
                    if (index>=0) {   
                        mac = line.substring(index + 1).trim();//  取出mac地址并去除2边空格   
                    }   
                    break;   
                }   
            }   
        } catch (IOException e) {   
        	e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
        } finally {   
            try {   
                if (bufferedReader != null) {   
                    bufferedReader.close();   
                }   
            } catch (IOException e1) {   
            	e1.printStackTrace();
    			StringWriter sw = new StringWriter();
    			e1.printStackTrace(new PrintWriter(sw, true));
    			String str = sw.toString();
    			logger.error(str);
            }   
            bufferedReader = null;   
            process = null;   
        }   
  
        return mac;   
    }   
  
    public String getAddress() { 
    	String mac = "";
        String os = getOSName();   
   
        if(os.startsWith("windows")){   
            //本地是windows   
            mac = getWindowsMACAddress();   
        }else{   
            //本地是非windows系统 一般就是unix   
            mac = getUnixMACAddress();   
        }   
        return mac;
    }
    /**  
     * 获取widnows磁盘的卷号.  
     * @return 卷号 
     */  
    private String getWinVolume() {   
    	 String volmark = null;   
         BufferedReader bufferedReader = null;   
         Process process = null;   
         try {   
        	 /*
        	  * windows下的dir命令，显示信息中包含有磁盘地址信息,如下所示   
        	  * 驱动器 C 中的卷是 Windows
        	  * 卷的序列号是 945C-D467
        	  */
        	 File[] files = File.listRoots();  
          	 File file = files[0];
          	 
  	    	 String path = file.getPath().replaceAll("\\\\", "/");  
  	    	 String dir = path.replace("/", ""); 
  	    	 String cmdStr = "cmd /c vol " + dir; 
  	        
             process = Runtime.getRuntime().exec(cmdStr);
             bufferedReader = new BufferedReader(new InputStreamReader(process   
                     .getInputStream(),"GB2312"));   
             
             String firstLine = bufferedReader.readLine(); //读取第一行
             
             if(firstLine != null){
            	 String secondLine = bufferedReader.readLine(); //读取第二行,里面含有卷信息
            	 
                 if(secondLine!=null){
                	 String[] tempstr = secondLine.trim().split(" "); //以空格分隔
                	 if(tempstr.length>1) volmark = tempstr[1]; //空格后面为卷号
                 }      	 
             }
                         
         } catch (IOException e) {  
        	 e.printStackTrace();
 			StringWriter sw = new StringWriter();
 			e.printStackTrace(new PrintWriter(sw, true));
 			String str = sw.toString();
 			logger.error(str);
         } finally {   
             try {   
                 if (bufferedReader != null) {   
                     bufferedReader.close();   
                 }   
             } catch (IOException e1) {   
            	e1.printStackTrace();
     			StringWriter sw = new StringWriter();
     			e1.printStackTrace(new PrintWriter(sw, true));
     			String str = sw.toString();
     			logger.error(str);
             }   
             bufferedReader = null;   
             process = null;   
         }   
     
    	 return volmark;
    }
    
    /**  
     * 获取Linux的卷号.  
     * @return 卷号 
	 * 
     */  
    private String getLinuxVolume() {   
    	 String volmark = null; 
		 String cmdStr  = "hdparm -i /dev/sda";
         BufferedReader bufferedReader = null;   
         Process process = null;   
         try {   
 	        // TODO 此函数未做测试,还受到权限限制
             process = Runtime.getRuntime().exec(cmdStr);
             bufferedReader = new BufferedReader(new InputStreamReader(process   
                     .getInputStream(),"GB2312"));   
             
			String line = null;   
            int index = -1;   
            while ((line = bufferedReader.readLine()) != null) {  

                index = line.toLowerCase().indexOf("SerialNo=");// 寻找标示字符串[SerialNo=]

                if (index >= 0) {// 找到了   
                	volmark = line.substring(index + 1).trim();//  取出SerialNo地址
                    break;   
                }   
            }            
         } catch (IOException e) {  
        	e.printStackTrace();
 			StringWriter sw = new StringWriter();
 			e.printStackTrace(new PrintWriter(sw, true));
 			String str = sw.toString();
 			logger.error(str); 
         } finally {   
             try {   
                 if (bufferedReader != null) {   
                     bufferedReader.close();   
                 }   
             } catch (IOException e1) {   
            	e1.printStackTrace();
     			StringWriter sw = new StringWriter();
     			e1.printStackTrace(new PrintWriter(sw, true));
     			String str = sw.toString();
     			logger.error(str);
             }   
             bufferedReader = null;   
             process = null;   
         }   

    	 return volmark;
    }
    
    public String getVolume() { 
    	String volmark = "";
        String os = getOSName();   
   
        if(os.startsWith("windows")){   
            //本地是windows   
        	volmark = getWinVolume();   
        }else{   
            //本地是非windows系统 一般就是Linux   
        	volmark = getLinuxVolume();   
        }   
        return volmark;
    }
    
     
    /**  
     * 测试用的main方法.  
     *   
     * @param argc  
     *            运行参数.  
     */  
    public static void main(String[] argc) { 
    	Address address = new Address();
        logger.info(address.getVolume());
    }   


}
