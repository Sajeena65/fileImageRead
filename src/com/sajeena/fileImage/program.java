/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.fileImage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Admin
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        String link = "http://cdn.wallpaper.com/main/wallpaper-itmf.jpg";
        URL url = new URL(link);
        URLConnection conn=url.openConnection();
            InputStream is=conn.getInputStream();
            String[] tokens=link.split("/");
            String path="C:/Users/Admin/Desktop/output/";
            FileOutputStream os=new FileOutputStream(path+tokens[tokens.length-1]);
            byte[] data=new byte[1024];
            int i=0;
            while((i=is.read(data))!=-1){
                os.write(data,0,i);
            }
            os.close();
            is.close();
            
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }

}
