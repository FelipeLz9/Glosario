/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscritorArchivo {
    
    public void escribirArchivo(){
        
        String rutaArchivo = "miarchivo.txt";

        try {
            // Crear un objeto FileWriter con la ruta del archivo y el modo de anexar (true)
            FileWriter fileWriter = new FileWriter(rutaArchivo, true);

            // Crear un objeto BufferedWriter para escribir en el archivo
            BufferedWriter writer = new BufferedWriter(fileWriter);

            // El valor que deseas agregar al archivo
            String valorAAgregar = "Este es un nuevo valor que se agrega al archivo.";

            // Escribir el valor en el archivo
            writer.write(valorAAgregar);
            writer.newLine(); // Agregar un salto de línea después del valor

            // Cerrar el BufferedWriter y FileWriter para liberar los recursos
            writer.close();
            fileWriter.close();

            System.out.println("El valor se ha agregado al archivo con éxito.");
        } catch (IOException e) {
            System.err.println("Error al agregar contenido al archivo: " + e.getMessage());
        }
    }
    
}
