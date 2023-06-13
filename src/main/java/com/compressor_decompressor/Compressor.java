/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.compressor_decompressor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author drekh
 */
public class Compressor {
    public static void method(File file) throws IOException {
        String fileDirectory = file.getParent();
        FileInputStream input = new FileInputStream(file);
        FileOutputStream output = new FileOutputStream(fileDirectory + "\\compressFile.gz");
        GZIPOutputStream output_zp = new GZIPOutputStream(output);
        byte[] buffer = new byte[1024];
        int len;
        while((len = input.read(buffer)) != -1) {
            output_zp.write(buffer, 0, len);
        }
        input.close();
        output.close();
        output_zp.close();
    }
    public static void main(String[] args) throws IOException {
        File path = new File("\\Users\\drekh\\Downloads");
        method(path);
    }
}
