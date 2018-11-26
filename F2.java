package com.file;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class F2 {
    public static void main(String[] args) {
        File f=new File("src/com/file/linshi/Test1.txt");
        FileOutputStream fos=null;
        final int SIZE=4096;
        try {
            fos=new FileOutputStream(f);
            String s="Test Text\r\n";
            String s1="china";
            //byte[] b=new byte[SIZE];
            //把String转为byte array
            fos.write(s.getBytes());
            fos.write(s1.getBytes());
            if (f.exists()) {
                
            }
        } catch (Exception e) {
        }finally{
            try {
                fos.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
