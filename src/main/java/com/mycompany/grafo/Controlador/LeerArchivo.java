/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grafo.Controlador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeerArchivo {
    
    
    public void leerArchivoVertices(){
        String rutaArchivo = "Archivo.graph"; 
        List<String> vertices = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                for (String parte : partes) {
                    vertices.add(parte);
                }
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }       
    }
    
    public void leerArchioAdyacencias(){
        String rutaArchivo = "Archivo.graph"; 
        List<String> adyacencias = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                // Omitir el primer elemento
                for (int i = 1; i < partes.length; i++) {
                    adyacencias.add(partes[i]);
                }
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }       
    }
    
    
}
