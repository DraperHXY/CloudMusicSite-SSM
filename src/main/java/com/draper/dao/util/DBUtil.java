package com.draper.dao.util;

import org.apache.commons.io.IOUtils;

import java.io.*;

public class DBUtil {

    public static void ByteToPath(byte[] datas, String path) {
        if (datas == null) {
            throw new NullPointerException("datas 为空");
        } else {
            try {
                InputStream in = null;
                in = new ByteArrayInputStream(datas);
                OutputStream out = new FileOutputStream(path);
                IOUtils.copy(in, out);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
