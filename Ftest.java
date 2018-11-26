package com.file;

import java.io.*;
public class Ftest {
    public static void main(String[] args) {
        final int SIZE=4096;
        File f=new File("src/com/file/linshi/note.txt");
        try {
            FileInputStream fis=new FileInputStream(f);
            byte[] zifu=new byte[SIZE];
            int n=0;
            while ((n=fis.read(zifu))!=-1) {                
                System.out.println(new String(zifu,0,n));
            }
            fis.close();
        } catch (Exception e) {
        }
    }
}
