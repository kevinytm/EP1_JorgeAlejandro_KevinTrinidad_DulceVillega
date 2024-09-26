/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grafo.Controlador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Vertice {
    private String label;
    private int data;
    private List<Vertice> edges;
    private boolean visited;
    
    
    
    public Vertice(String label,int data){
        this.label = label;
        this.data=data;
        this.edges = new ArrayList<>();
    }
 
    public void addEdges(Vertice... vertice){
        this.edges.addAll(Arrays.asList(vertice));
    }
    
    @Override
    public String toString(){
        return label+"["+data+"]";
    }    
}
