package de.java2html;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //Just a smoke test
        String result = Java2Html.convertToHtml(FileUtils.readFileToString(new File("E:\\src\\spring-framework\\spring-beans\\src\\main\\java\\org\\springframework\\beans\\BeanWrapperImpl.java"),"utf-8")); //$NON-NLS-1$
        FileUtils.writeStringToFile(new File("E:\\src\\test.html"),result);

    }
}
