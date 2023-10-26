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
 * Proporciona métodos para leer información desde un archivo de texto
 * utilizando la codificación UTF-8 y realizar operaciones relacionadas con los términos contenidos
 * en el archivo.
 * 
 * @author Juan Felipe López
 * @author Sebastián García Gil
 */
public class LectorArchivo  {
    
    Charset charset = Charset.forName("UTF-8");
    
    /**
     * Lee la descripción asociada a un término específico desde el archivo.
     * 
     * @param palabra La palabra o término cuya descripción se desea obtener.
     * @return La descripción asociada al término si se encuentra; de lo contrario, retorna nulo.
     * @throws IOException Si ocurre un error durante la lectura del archivo.
     */
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
    
    /**
     * Lista los términos contenidos en el archivo.
     * 
     * @return Un ArrayList que contiene los términos disponibles en el archivo.
     * @throws IOException Si ocurre un error durante la lectura del archivo.
     */
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