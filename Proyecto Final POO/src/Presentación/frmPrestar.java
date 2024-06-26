/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Presentación;

import Entidades.Bibliotecólogo;
import Entidades.Libro;
import Entidades.Prestamo;
import Entidades.Usuario;
import Lógica.Logica;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author XPC
 */
public class frmPrestar extends javax.swing.JInternalFrame {
    
    /**
     * Creates new form frmPrestar
     */
    public frmPrestar() {
        initComponents();
        
        
    }
    private void estadoInicial(){
        txtName.setText("");
        txtCedula.setText("");
        txtCodigoUsuario.setText("");
        txtCodigoBiblio.setText("");
        txtTitulo.setText("");
        txtGenero.setText("");
        txtEditorial.setText("");
        txtNameBiblio.setText("");
        txtCedulaBibliotecologo.setText("");
        txtCedula.requestFocus();
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEnviar = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtCodigoUsuario = new javax.swing.JTextField();
        txtCedulaBibliotecologo = new javax.swing.JTextField();
        txtCodigoBiblio = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNameBiblio = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(btnEnviar)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnEnviar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblName.setText("Nombre");

        lblCedula.setText("Cedula");

        lblCodigo.setText("Codigo");

        jLabel5.setText("Cedula Bibliotecologo");

        jLabel6.setText("Codigo Bibliotecologo");

        jLabel7.setText("Titulo Del Libro");

        jLabel2.setText("Editorial");

        jLabel3.setText("Genero");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Prestamos");
        jLabel1.setToolTipText("");

        txtCedulaBibliotecologo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaBibliotecologoActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre del Bibliotecologo");

        txtNameBiblio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameBiblioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCedula)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(lblCodigo)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(lblName)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(txtCedula)
                            .addComponent(txtCodigoUsuario)
                            .addComponent(txtCedulaBibliotecologo)
                            .addComponent(txtCodigoBiblio)
                            .addComponent(txtTitulo)
                            .addComponent(txtEditorial)
                            .addComponent(txtGenero)
                            .addComponent(txtNameBiblio))
                        .addGap(12, 12, 12)))
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNameBiblio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCedulaBibliotecologo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCodigoBiblio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaBibliotecologoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaBibliotecologoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaBibliotecologoActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
        if(txtName.getText().length()==0 || txtCedula.getText().length()==0 || txtCodigoUsuario.getText().length()==0 || txtCodigoBiblio.getText().length()==0 || txtTitulo.getText().length()==0 || txtGenero.getText().length()==0 || txtEditorial.getText().length()==0 || txtCedulaBibliotecologo.getText().length()==0 || txtNameBiblio.getText().length()==0)  {
            JOptionPane.showMessageDialog(null, "Debe completar todos los datos", "Datos faltantes", JOptionPane.WARNING_MESSAGE);
        }else{
            
             frmTablaPrestamos tabla = new frmTablaPrestamos();
            Usuario miUsuario = new Usuario();
            miUsuario.setNombre(txtName.getText());
            miUsuario.setCedula(txtCedula.getText());
            miUsuario.setCodigoUsuario(txtCodigoUsuario.getText());
            
            Bibliotecólogo miBibliotecologo = new Bibliotecólogo();
            miBibliotecologo.setNombre(txtNameBiblio.getText());
            miBibliotecologo.setCedula(txtCedulaBibliotecologo.getText());
            miBibliotecologo.setCodigoBibliotecologo(txtCodigoBiblio.getText());
            
            Libro miLibro=new Libro();
            miLibro.setEditorial(txtEditorial.getText());
            miLibro.setTitulo(txtTitulo.getText());
            miLibro.setGenero(txtGenero.getText().toLowerCase());
            
            Prestamo miPrestamo = new Prestamo();
            
            miPrestamo.setBiblioPrestamo(miBibliotecologo);
            miPrestamo.setLibroPrestamo(miLibro);
            miPrestamo.setUsuarioPrestamo(miUsuario);
            tabla.RefrescarTabla();
            Logica miLogica = new Logica();
            if(miLogica.enviarACapaAccesoDatos(miPrestamo)){
                
                JOptionPane.showMessageDialog(null, "Felicidades: Datos guardados correctamente...", "Guardar datos", JOptionPane.INFORMATION_MESSAGE);
               
                
                this.estadoInicial();
                
                
            }else{
                JOptionPane.showMessageDialog(null, "Salado: Los datos no se guardaron correctamente...", "Error al guardar datos", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void txtNameBiblioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameBiblioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameBiblioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCedulaBibliotecologo;
    private javax.swing.JTextField txtCodigoBiblio;
    private javax.swing.JTextField txtCodigoUsuario;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNameBiblio;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
