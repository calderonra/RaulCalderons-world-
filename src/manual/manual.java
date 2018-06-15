/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manual;

import java.io.*;

/**
 *
 * @author Raul Calderon
 */
public class manual {
    public String leer(String direccion){
        
        String texto="";
        
        
        try{
            BufferedReader bf=new BufferedReader(new FileReader(direccion)) ;
            String temp="";
            String bfRead=bf.readLine();
            while((bfRead)!=null ){
                temp=temp + bfRead;
                
            }
            texto=temp;
        }catch(Exception e){
            System.err.println("error");
        }
        return texto;
    }
}
