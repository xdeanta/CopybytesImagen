/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copybytesimagen;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Xavier
 */
public class ModArchivo {
    public static void copiarArchivo(String nombre){
        File name;
        FileInputStream org=null;
        FileOutputStream copia=null;
        name=new File(nombre);
        try{
            int contenido;
            org=new FileInputStream(name);
            copia=new FileOutputStream("foto2.jpg",true);
            while((contenido=org.read()) != -1){
                copia.write(contenido);
            }
        }catch(IOException e){
            System.out.println("Hubo un error con un archivo");
        }finally{
            try{
               if(org != null){
                   org.close();
               } 
               if(copia != null){
                   copia.close();
               } 
            }catch(IOException e2){
                System.out.println("Hubo un error al cerrar los archivos");
            }
        }
    }
    
    public static void copiarArchivoBuffer(String nombre){
        File name;
        BufferedInputStream org=null;
        BufferedOutputStream copia=null;
        name=new File(nombre);
        try{
            int contenido;
            org=new BufferedInputStream(new FileInputStream(name));
            copia=new BufferedOutputStream(new FileOutputStream("foto2.jpg",true));
            while((contenido=org.read()) != -1){
                copia.write(contenido);
            }
        }catch(IOException e){
            System.out.println("Hubo un error con un archivo");
        }finally{
            try{
               if(org != null){
                   org.close();
               } 
               if(copia != null){
                   copia.close();
               } 
            }catch(IOException e2){
                System.out.println("Hubo un error al cerrar los archivos");
            }
        }
    }
}
