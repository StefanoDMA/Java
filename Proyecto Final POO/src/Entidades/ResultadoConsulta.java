/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.List;

/**
 *
 * @author XPC
 */
public class ResultadoConsulta {
    private List<String> listaDeGenero;
    
    
    public ResultadoConsulta(List<String> listaDeGenero, int totalPrestamos) {
        this.listaDeGenero = listaDeGenero;
        
    }

    public ResultadoConsulta() {
    }

    public List<String> getListaDeGenero() {
        return listaDeGenero;
    }

    public void setListaDeGenero(List<String> listaDeGenero) {
        this.listaDeGenero = listaDeGenero;
    }

    
}
