/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author lopez
 */
public class Glosario {
    
    EscritorArchivo escritor = new EscritorArchivo();
    LectorArchivo lector = new LectorArchivo();
    
    public Glosario() {
    }
    
    public void agregarTermino(String palabra, String descripcion) throws IOException{
        Termino termino = new Termino(palabra, descripcion);
        try{
            escritor.escribirArchivo(termino);
        }catch(IOException e){
            throw e;
        }
        
    }
    
    public String buscar(String palabra) throws IOException{
        return lector.leer(palabra);
    }
    
    public ArrayList listar() throws IOException{
        return lector.listarContenidoDeArchivo();
    }
}
