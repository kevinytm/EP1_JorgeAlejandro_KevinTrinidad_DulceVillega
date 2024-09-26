package com.mycompany.grafo.Vista;

import com.mycompany.grafo.Controlador.Archivo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Vista {
    
    
    public void recopilarInformacion(){
        //Nùmero de nodos y los nombres
        int numNodos= getNumNodos();
        List<String> nombres = new ArrayList<>();
        nombres = getNombres(numNodos);
        
        //Adyancias
        List<String> adyacencias = new ArrayList<>();
        adyacencias = getAdyacencias(numNodos,nombres);
        
        //Salvar la información
        Archivo arc = new Archivo();
        arc.guardarArchivo(nombres);
        arc.guardarArchivo(adyacencias);
        
        
    }
    
    public int getNumNodos(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de nodos");
        int numNodos = sc.nextInt();
        return numNodos;
    }
    
    public List<String> getNombres(int numNodos){
        List<String> nombres = new ArrayList<>();

        for (int i = 0; i < numNodos; i++) {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Ingrese el nombre para el nodo "+(i+1)+": ");
            String nom = sc.next();
            nombres.add(nom);
        }        
        return nombres;
    }
    
    public List<String> getAdyacencias(int numNodos,List<String> nombres){
        Scanner sc = new Scanner(System.in);
        
        List<String> adyacencias = new ArrayList<>();
        
        System.out.println("Asigna las adyacencias, (Nodo1,Nodo2)");
        
        for(String nombre:nombres){
            System.out.println("["+nombre+"]: ");
            String adyacencia = sc.next();
            adyacencias.add(nombre+";"+adyacencia);
        }
        return adyacencias;
    }
}
