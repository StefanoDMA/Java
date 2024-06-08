/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;




/**
 *
 * @author XPC
 */
public class Prestamo {
    private Usuario usuarioPrestamo;
    private Libro libroPrestamo;
    private Bibliotecólogo biblioPrestamo;

    public Prestamo() {
    }

    public Prestamo(Usuario usuarioPrestamo, Libro libroPrestamo, Bibliotecólogo biblioPrestamo) {
        this.usuarioPrestamo = usuarioPrestamo;
        this.libroPrestamo = libroPrestamo;
        this.biblioPrestamo = biblioPrestamo;
    }


    public Usuario getUsuarioPrestamo() {
        return usuarioPrestamo;
    }

    public void setUsuarioPrestamo(Usuario usuarioPrestamo) {
        this.usuarioPrestamo = usuarioPrestamo;
    }

    public Libro getLibroPrestamo() {
        return libroPrestamo;
    }

    public void setLibroPrestamo(Libro libroPrestamo) {
        this.libroPrestamo = libroPrestamo;
    }

    public Bibliotecólogo getBiblioPrestamo() {
        return biblioPrestamo;
    }

    public void setBiblioPrestamo(Bibliotecólogo biblioPrestamo) {
        this.biblioPrestamo = biblioPrestamo;
    }

    
    
    
    
}
