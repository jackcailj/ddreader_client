package com.dangdang.reader.client.util;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by cailianjie on 2016-6-27.
 */
public class DUtils {

    public static String getStrackTrace(Throwable t){
        StringWriter stringWriter= new StringWriter();
        PrintWriter writer= new PrintWriter(stringWriter);
        t.printStackTrace(writer); StringBuffer buffer= stringWriter.getBuffer();
        return buffer.toString();
    }
}
