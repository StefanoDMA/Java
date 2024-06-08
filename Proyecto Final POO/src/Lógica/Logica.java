/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lógica;

import AccesoADatos.AccesoADatos;
import Entidades.Bibliotecólogo;

import Entidades.Libro;
import Entidades.Prestamo;
import Entidades.ResultadoConsulta;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;



/**
 *
 * @author XPC
 */
public class Logica {
    
   public boolean enviarRegistroACapaAccesoDatos(Bibliotecólogo AccesoARegister){
        if(AccesoARegister != null){
            //Si llegó
            AccesoADatos miCapaAD = new AccesoADatos();
            return miCapaAD.guardarEnBaseDeDatosMiRegistro(AccesoARegister);
        }else{
            //No llegó
            JOptionPane.showMessageDialog(null, "No se recibió la entidad", "Error en lógica", JOptionPane.ERROR_MESSAGE);
            return false;
     }
    }
    
    
    public boolean enviarACapaAccesoDatos(Prestamo prestamoQueReciboDePresentacion){
        if(prestamoQueReciboDePresentacion != null){
            //Si llegó
            AccesoADatos miCapaAD = new AccesoADatos();
            return miCapaAD.guardarEnBaseDeDatos(prestamoQueReciboDePresentacion);
        }else{
            //No llegó
            JOptionPane.showMessageDialog(null, "No se recibió la entidad", "Error en lógica", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public List<Prestamo> traerTodaLaBaseDeDatos(){
        AccesoADatos laCapaAccesoDatos = new AccesoADatos();
        
        
        return laCapaAccesoDatos.consultarTodosLosPrestamos();

    }
    
    public int totalDeLibros() {
        AccesoADatos laCapaAccesoDatos = new AccesoADatos();
        
        int total = laCapaAccesoDatos.consultarGenero().size();
       
        

        return total;
    }

    public String masPrestado(){
      AccesoADatos laCapaAccesoDatos = new AccesoADatos();
        
        int[] generoCount = new int[4]; 

       
        for (Prestamo miPrestamo : laCapaAccesoDatos.consultarTodosLosPrestamos()) {
            switch (miPrestamo.getLibroPrestamo().getGenero()) {
                case "Computacion":
                    generoCount[0]++;
                    break;
                case "ciencias":
                    generoCount[1]++;
                    break;
                case "finanzas":
                    generoCount[2]++;
                    break;
                case "medicina":
                    generoCount[3]++;
                    break;
            }
        }

        // Encontrar el género más 
        String[] generosDefinidos = {"Computación", "Ciencias", "Finanzas", "Medicina"};
        int maxPrestamos = generoCount[0];
        String generoMasPrestado = generosDefinidos[0];
;

        // Iterar a través de los géneros y mostrar sumarización
        for (int i = 0; i < generosDefinidos.length; i++) {
            

            if (generoCount[i] > maxPrestamos) {
                maxPrestamos = generoCount[i];
                generoMasPrestado = generosDefinidos[i];
            }

            
        }

       
        return generoMasPrestado;
    }
    
    public String menosPrestado(){
        AccesoADatos laCapaAccesoDatos = new AccesoADatos();
     
        int[] generoCount = new int[4]; 

        
        for (Prestamo miPrestamo : laCapaAccesoDatos.consultarTodosLosPrestamos()) {
            switch (miPrestamo.getLibroPrestamo().getGenero()) {
                case "computacion":
                    generoCount[0]++;
                    break;
                case "ciencias":
                    generoCount[1]++;
                    break;
                case "finanzas":
                    generoCount[2]++;
                    break;
                case "medicina":
                    generoCount[3]++;
                    break;
            }
        }

        // Encontrar el género menos prestado
        String[] generosDefinidos = {"Computación", "Ciencias", "Finanzas", "Medicina"};

        int minPrestamos = generoCount[0];
       
        String generoMenosPrestado = generosDefinidos[0];

        // Iterar a través de los géneros y mostrar sumarización
        for (int i = 0; i < generosDefinidos.length; i++) {
           

           

            if (generoCount[i] < minPrestamos) {
                minPrestamos = generoCount[i];
                generoMenosPrestado = generosDefinidos[i];
            }
        }

       
        return generoMenosPrestado;
    }
    public Integer computacion(){
        AccesoADatos laCapaAccesoDatos = new AccesoADatos();
        int contador = 0;
        String computacion = "computacion";
    for (Prestamo prestamo : laCapaAccesoDatos.consultarTodosLosPrestamos()) {
            if(computacion.equals(prestamo.getLibroPrestamo().getGenero())){
                contador = contador + 1;
        }
     
    }
    return contador;
    }
    public Integer ciencias(){
        AccesoADatos laCapaAccesoDatos = new AccesoADatos();
        int contador = 0;
        String computacion = "ciencias";
    for (Prestamo prestamo : laCapaAccesoDatos.consultarTodosLosPrestamos()) {
            if(computacion.equals(prestamo.getLibroPrestamo().getGenero())){
                contador = contador + 1;
        }
     
    }
    return contador;
    }
    public Integer finanzas(){
        AccesoADatos laCapaAccesoDatos = new AccesoADatos();
        int contador = 0;
        String computacion = "finanzas";
    for (Prestamo prestamo : laCapaAccesoDatos.consultarTodosLosPrestamos()) {
            if(computacion.equals(prestamo.getLibroPrestamo().getGenero())){
                contador = contador + 1;
        }
     
    }
    return contador;
    }
    public Integer medicina(){
        AccesoADatos laCapaAccesoDatos = new AccesoADatos();
        int contador = 0;
        String computacion = "medicina";
    for (Prestamo prestamo : laCapaAccesoDatos.consultarTodosLosPrestamos()) {
            if(computacion.equals(prestamo.getLibroPrestamo().getGenero())){
                contador = contador + 1;
        }
     
    }
    return contador;
    }
}




