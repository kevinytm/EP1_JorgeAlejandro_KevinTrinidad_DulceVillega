
package com.mycompany.grafo.Controlador;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Archivo {
    
    
    public void leerArchivo(){
        try{
            File file = new File("archivo.graph");
            List<String> contenido=Files.readAllLines(file.toPath());
            for (String s:contenido) {
                System.out.println(s);
            }
        }catch(IOException ex){
            System.out.println("Error: "+ex);
        }
    }

    public void guardarArchivo(List<String> nombres){
        try{
            File file = new File("archivo.graph");
            FileWriter fw = new FileWriter(file,true);  
            for(String nombre:nombres){
                fw.append(nombre);
                fw.append(";");
            }
            fw.append("\n");
            fw.close();
        }catch(IOException ex){
            System.out.println("Error: "+ex);
        }

    }    
}
