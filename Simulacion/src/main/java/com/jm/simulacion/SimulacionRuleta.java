/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jm.simulacion;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Casa
 */
public class SimulacionRuleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Muestra m = new Muestra();
        int[] datos = m.getDatos();
        for (int i = 0; i < datos.length; i++) {
            System.out.println(datos[i]);
        }
        m.guardarDatos();
    }
    
    public static void guardarDatos(){
    
    }
    
    public static List<Integer> generarMuestra(int tamanoMuestra){
        List<Integer> listaNumeros = new ArrayList<Integer>();
        
        return listaNumeros;
    } 
    
}
