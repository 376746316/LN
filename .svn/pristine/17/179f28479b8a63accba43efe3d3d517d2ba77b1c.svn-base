package com.chinasofti.cetp.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class PropertiesUtil
{
  private static final Log LOG = LogFactory.getLog(PropertiesUtil.class);

  public static Properties load(URL url) {
    Properties ret = new Properties();
    InputStream input = null;
    try {
      input = url.openStream();
      ret.load(input);
    } catch (IOException e) {
      LOG.error("fail to file :" + url, e);
    }

    return ret;
  }

  public static String getProperty(String resourceName, String key) {
    try {
      Properties ret = new Properties();
      InputStream input = PropertiesUtil.class.getResourceAsStream("/" + resourceName);
      ret.load(input);
      return ret.getProperty(key);
    } catch (IOException localIOException) {
    }
    return null;
  }
}
