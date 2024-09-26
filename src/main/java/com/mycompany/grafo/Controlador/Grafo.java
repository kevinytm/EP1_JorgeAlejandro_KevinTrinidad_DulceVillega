/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grafo.Controlador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author kevin
 */
public class Grafo {
    private String name;
    private List<Vertice> vertices;
    
    public Grafo(String name){
        this.name = name;
        this.vertices = new ArrayList<>();
    }
    
    public void addVertice(Vertice vertice){
        vertices.add(vertice);
    }
    
    public void addVertice(Vertice... vertice){
        /*for(Vertice01 v:vertices){
            this.vertices.add(v);
        }*/
        this.vertices.addAll(Arrays.asList(vertice));
    }
    
    @Override
    public String toString(){
        return name+" [Grado: "+vertices.size()+"]";
    }
    
    public void mostrarGradoVertices(){
        System.out.println("Lista del grado");
        for(Vertice v:vertices){
            System.out.println(v+"("+v.getEdges().size()+")");
        }
    }
    
    public void mostrarGradoAdyacencias(){
        System.out.println("Lista de adyacencia");
        for(Vertice v:vertices){
            System.out.println(v+"("+v.getEdges().size()+"){");
            for(Vertice edge:v.getEdges()){
                System.out.println(edge+", ");
            }
            System.out.println("])");
        }
    }
    
    public void recorridoEnAnchura(Vertice inicio){
        Queue<Vertice> queue = new LinkedList<>();
        inicio.setVisited(true);
        queue.add(inicio);
        
        Vertice actual;
        while(!queue.isEmpty()){
            actual =queue.poll();
            System.out.println(actual);
            for (Vertice v:actual.getEdges()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }
    }
    
    public void recorridoEnProfundidad(Vertice inicio){
        Stack<Vertice> stack = new Stack<>();
        inicio.setVisited(true);
        stack.add(inicio);
        
        Vertice actual;
        while(!stack.isEmpty()){
            actual =stack.pop();
            System.out.println(actual);
            for (Vertice v:actual.getEdges()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    stack.add(v);
                }
            }
        }
    }    
}
