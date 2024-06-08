/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Bibliotecólogo;
import Entidades.Libro;
import Entidades.Prestamo;
import Entidades.ResultadoConsulta;
import Entidades.Usuario;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import javax.swing.JOptionPane;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author XPC
 */
public class AccesoADatos {
    public boolean guardarEnBaseDeDatos(Prestamo prestamoQueReciboDeLogica){
        
        try{
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/biblioteca", "root", "");

            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("insert into tbprestamo values (?,?,?,?,?,?,?,?,?,?)");
            sentencia.setString(1, "0");
            sentencia.setString(2, prestamoQueReciboDeLogica.getUsuarioPrestamo().getNombre());
            sentencia.setString(3, prestamoQueReciboDeLogica.getUsuarioPrestamo().getCedula());
            sentencia.setString(4, prestamoQueReciboDeLogica.getUsuarioPrestamo().getCodigoUsuario());
            sentencia.setString(5, prestamoQueReciboDeLogica.getBiblioPrestamo().getCodigoBibliotecologo());
            sentencia.setString(6, prestamoQueReciboDeLogica.getBiblioPrestamo().getNombre());
            sentencia.setString(7, prestamoQueReciboDeLogica.getBiblioPrestamo().getCedula());
            sentencia.setString(8, prestamoQueReciboDeLogica.getLibroPrestamo().getTitulo());
            sentencia.setString(9, prestamoQueReciboDeLogica.getLibroPrestamo().getEditorial());
            sentencia.setString(10, prestamoQueReciboDeLogica.getLibroPrestamo().getGenero());
            
            
            sentencia.execute();
            
            return true;
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error en la conexión a la base de datos", "Error grave", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean guardarEnBaseDeDatosMiRegistro(Bibliotecólogo AccesoARegister){
        
        try{
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/biblioteca", "root", "");

            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("insert into tbregister values (?,?,?)");
            sentencia.setString(1, "0");
            sentencia.setString(2, AccesoARegister.getRegistro().getUsername());
            sentencia.setString(3, AccesoARegister.getRegistro().getPassword());
            
            
            sentencia.execute();
            
            return true;
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error en la conexión a la base de datos", "Error grave", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
       
          
    

    
    public List<Prestamo> consultarTodosLosPrestamos (){
        List<Prestamo> laListaDePrestamo = new ArrayList();
        
        try{
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/biblioteca", "root", "");
            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("select * from tbprestamo");
                        
            ResultSet rs = sentencia.executeQuery();
            
            while(rs.next()){
                Prestamo miPrestamo = new Prestamo();
                Usuario miUsuario = new Usuario();
                Bibliotecólogo miBiblio = new Bibliotecólogo();
                Libro miLibro = new Libro();

                String nombre = rs.getString("nombreUsuario");
                String cedula = rs.getString("Cedula");
                String codigoUsuario = rs.getString("codigoUsuario");
                String codigoBiblio = rs.getString("codigoBiblio");
                String nombreBiblio = rs.getString("nombreBiblio");
                String cedulaBiblio = rs.getString("cedulaBiblio");
                String titulo = rs.getString("titulo");
                String editorial = rs.getString("editorial");
                String genero = rs.getString("genero");
                
                
                miUsuario.setNombre(nombre);
                miUsuario.setCedula(cedula);
                miUsuario.setCodigoUsuario(codigoUsuario);
                
                miBiblio.setCedula(cedulaBiblio);
                miBiblio.setNombre(nombreBiblio);
                miBiblio.setCodigoBibliotecologo(codigoBiblio);
                
                miLibro.setEditorial(editorial);
                miLibro.setGenero(genero);
                miLibro.setTitulo(titulo);
                
                miPrestamo.setLibroPrestamo(miLibro);
                miPrestamo.setUsuarioPrestamo(miUsuario);
                miPrestamo.setBiblioPrestamo(miBiblio);

                laListaDePrestamo.add(miPrestamo);
            }
        }catch (Exception e){
            System.out.println(e.toString());
            laListaDePrestamo = null;
        }
        return laListaDePrestamo;
    }
    
    public List<Libro> consultarGenero() {
        List<Libro> listaDeGenero = new ArrayList<>();
        

        try {
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/biblioteca", "root", "");
            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("SELECT * FROM tbprestamo WHERE genero = ?");
            ResultSet rs = sentencia.executeQuery();

            while (rs.next()) {
                Libro miLibro = new Libro();
                
                String genero = rs.getString("genero");
                miLibro.setGenero(genero);
                

                listaDeGenero.add(miLibro);
                
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            // Manejo de excepciones...
        }
        ;
        return listaDeGenero;
    }

    }


    
    
    



