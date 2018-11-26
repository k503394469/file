/**
 * FileInputStream 使用
 * 因为File没有读写能力，所以需要使用InputStream流
 */
package com.file;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class F1 {
    public static void main(String[] args) {
        File f=new File("src/com/file/Ftest.java");
        FileInputStream fis=null;
        try {
            fis=new FileInputStream(f);
            //定义一个字节数组，相当于缓存
            byte[]b=new byte[1024];
            int n=0;//得到实际读取到的字节数
            while ((n=fis.read(b))!=-1){                
                //把字节转成String
                String s=new String(b,0,n);
                System.out.println(s);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            try {
                fis.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
