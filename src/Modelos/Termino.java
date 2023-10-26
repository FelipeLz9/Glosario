/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 * Representa un término con su palabra y su descripción en un glosario.
 * Cada instancia de esta clase contiene una palabra y una descripción asociada.
 * 
 * Esta clase se utiliza para almacenar y manipular información sobre términos y sus definiciones.
 * 
 * @author Juan Felipe López
 * @author Sebastián García Gil
 */
public class Termino {
    private String palabra;
    private String descripcion;
    
     /**
     * Constructor de la clase Termino.
     * 
     * @param palabra La palabra o término.
     * @param descripcion La descripción asociada al término.
     */

    public Termino(String palabra, String descripcion) {
        this.palabra = palabra;
        this.descripcion = descripcion;
    }

    /**
     * @return the palabra
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * @param palabra the palabra to set
     */
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
