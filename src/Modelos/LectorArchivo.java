/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author lopez
 */
public class LectorArchivo  {
    
    Charset charset = Charset.forName("UTF-8");
    
    public String leer(String palabra) throws IOException{
        String[] elementos = null;
        String desc = null;
        Path input = Paths.get("C:\\Users\\lopez\\OneDrive\\Escritorio\\Terminos.txt");
        try (BufferedReader lector = Files.newBufferedReader(input,charset)){
            String line;
            while ((line = lector.readLine()) != null){
                elementos = line.split(" | ");
                if(elementos[0].equals(palabra)){
                    desc = line.substring(line.indexOf(" ") +2);
                }
            }
            lector.close();
        }catch(IOException e){
        throw e;
        }
        return desc;
    }
    
    public ArrayList listarContenidoDeArchivo() throws IOException {
        ArrayList<String> elementos = new ArrayList<>();
        Path input = Paths.get("C:\\Users\\lopez\\OneDrive\\Escritorio\\Terminos.txt");
        try (BufferedReader br = Files.newBufferedReader(input, charset)) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split(" ");
                if(palabras.length > 0){
                    elementos.add(palabras[0]);
                }
            }
        }
        return elementos;
    }
}