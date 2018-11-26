/**
 * File 基本用法
 */
package com.file;

import java.io.*;

public class F0 {

    public static void main(String[] args) throws IOException {
//        File f=new File("src/com/file/linshi/test/Test1.txt");
//        if (!f.exists()) {
//            f.createNewFile();
//        }else{
//            System.out.println("已创建");
//        }
//        
        File f = new File("src/com/file/linshi/test");
//        if (f.isDirectory()) {
//            System.out.println("exsit");
//        }else{
//            f.mkdir();
//        }
        //列出文件
        File f1=new File("c:/");
        if (f1.isDirectory()) {
            File []lists=f1.listFiles();
            for (int i = 0; i < lists.length; i++) {
                System.out.println(lists[i].getName());
            }
        }
    }
}
