/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Proporciona métodos para escribir palabras  y descripciones
 * en un archivo de texto utilizando la codificación UTF-8.
 * @author Juan Felipe López
 * @author Sebastián García Gil
 */
public class EscritorArchivo {
    
    Charset charset = Charset.forName("UTF-8");
    
    /**
     * Escribe un termino y su descripción en un archivo de texto.
     * 
     * @param termino El objeto Termino que contiene la palabra y la descripción a escribir.
     * @throws IOException Si ocurre un error durante la escritura en el archivo.
     */
    
    public void escribirArchivo(Termino termino) throws IOException{
        
        Path outFile = Paths.get("C:\\Users\\lopez\\OneDrive\\Escritorio\\Terminos.txt");
        
        BufferedWriter writer = Files.newBufferedWriter(outFile, charset, StandardOpenOption.APPEND);
        
        String descripcion = termino.getDescripcion();
        
       
        writer.write(termino.getPalabra(), 0, termino.getPalabra().length());
        writer.write(" | ");
        writer.write(descripcion, 0, descripcion.length());
        writer.newLine();
        
        writer.close();
    }
    
}
