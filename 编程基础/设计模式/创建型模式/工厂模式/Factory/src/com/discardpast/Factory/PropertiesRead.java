package com.discardpast.Factory;

/**
 * Created by discardpast on 17-9-5.
 */

import java.io.*;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * properties文件读取工具
 */
public class PropertiesRead {
    public Map<String, String> getProperties() {
        Properties type = new Properties();
        Map<String, String> map = new HashMap<String, String>();
        try {
            InputStream in = getClass().getResourceAsStream("type.properties");
            type.load(in);
            Enumeration en = type.propertyNames();
            while (en.hasMoreElements()) {
                String key = (String) en.nextElement();
                String property = type.getProperty(key);
                map.put(key, property);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}
