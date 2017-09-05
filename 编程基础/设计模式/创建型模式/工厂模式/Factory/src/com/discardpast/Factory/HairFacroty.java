package com.discardpast.Factory;

/**
 * Created by discardpast on 17-9-5.
 */

import java.util.Map;

/**
 * 发型工厂
 */
public class HairFacroty {

    public HairInterface getHair(String key) {
        if ("left".equals(key)) {
            return new LeftHair();
        } else if ("right".equals(key)) {
            return new RightHair();
        } else {
            return null;
        }
    }

    public HairInterface getHairByClass(String className) {
        try {
            HairInterface hair = (HairInterface) Class.forName(className).newInstance();
            return hair;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public HairInterface getHairByClassKey(String key) {
        try {
            PropertiesRead propertiesRead = new PropertiesRead();
            Map<String,String> map = propertiesRead.getProperties();
            String className;
            className = map.get(key);
            HairInterface hair = (HairInterface) Class.forName(className).newInstance();
            return hair;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
