/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author XPC
 */
public class Bibliotecólogo extends Persona {
    private String codigoBibliotecologo;
    private Registrador registro;
    

    public Bibliotecólogo() {
    }

    public Bibliotecólogo(String codigoBibliotecologo, String cedula, String nombre) {
        super(cedula, nombre);
        this.codigoBibliotecologo = codigoBibliotecologo;
    }

    public String getCodigoBibliotecologo() {
        return codigoBibliotecologo;
    }

    public void setCodigoBibliotecologo(String codigoBibliotecologo) {
        this.codigoBibliotecologo = codigoBibliotecologo;
    }

    public Registrador getRegistro() {
        return registro;
    }

    public void setRegistro(Registrador registro) {
        this.registro = registro;
    }

   
    
    
}
