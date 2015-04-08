package com.jm.simulacion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Casa
 */
public class Muestra {
    
    private static final int MIN = 0;
    private static final int MAX = 36;
    private static final int CANT_DATOS = 100;
    private int[] datos;
    
    public int[] getDatos(){
        return generarDatos();
    }
    
    /*
    public static int[] generarMuestras(int length){
        int[] muestra = new int[length];
        
        return muestra;
    }
    */
    private int[] generarDatos(){
        datos = new int[CANT_DATOS];
        for (int i = 0; i < CANT_DATOS; i++) {
            int n = (int) (Math.random () * (MAX - MIN) + 1); 
            datos[i] = n;
        }
        return datos;
    }
    
    public void guardarDatos() throws IOException{
        File f = new File("muestra");
        FileWriter w = null;
        BufferedWriter bw = null;
        PrintWriter wr = null;
        try{
            w = new FileWriter(f);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);	
            //wr.write("Esta es una linea de codigo");//escribimos en el archivo 
            for (int i = 0; i < getDatos().length; i++) {
                wr.append(datos[i]+"\n");                   
            }
            

        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally{
            wr.close();
            bw.close();
        }
       }
    
    
    
}
