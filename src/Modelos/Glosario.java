/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Permite administrar un glosario de términos los cuales estan compuesto por palabras y descripciones,
 * permitiendo agregar términos, buscar definiciones y listar todas la palabras disponibles.
 * 
 * @author Juan Felipe López
 * @author Sebastián García Gil
 */
public class Glosario {
    
    EscritorArchivo escritor = new EscritorArchivo();
    LectorArchivo lector = new LectorArchivo();
    
     /**
     * Constructor por defecto de la clase Glosario.
     */
    public Glosario() {
    }
    
    /**
     * Agrega un nuevo término al glosario junto con su descripción.
     * 
     * @param palabra La palabra o término a agregar.
     * @param descripcion La descripción asociada al término.
     * @throws IOException Si ocurre un error durante la escritura en el archivo.
     */
    
    public void agregarTermino(String palabra, String descripcion) throws IOException{
        Termino termino = new Termino(palabra, descripcion);
        try{
            escritor.escribirArchivo(termino);
        }catch(IOException e){
            throw e;
        }
        
    }
      /**
     * Busca la descripción de un término en el glosario.
     * 
     * @param palabra La palabra o término a buscar.
     * @return La descripción asociada al término si se encuentra; de lo contrario, retorna nulo.
     * @throws IOException Si ocurre un error durante la lectura del archivo.
     */
    public String buscar(String palabra) throws IOException{
        return lector.leer(palabra);
    }
    
     /**
     * Lista todos los términos disponibles en el glosario.
     * 
     * @return Un ArrayList que contiene los términos disponibles en el glosario.
     * @throws IOException Si ocurre un error durante la lectura del archivo.
     */
    
    public ArrayList listar() throws IOException{
        return lector.listarContenidoDeArchivo();
    }
}
