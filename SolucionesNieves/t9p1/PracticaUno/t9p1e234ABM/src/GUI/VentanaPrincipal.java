package GUI;

import Excepciones.AcontecimientoNoEncontrado;
import Excepciones.CampoVacio;
import Excepciones.NombreNoValido;
import javax.swing.JOptionPane;
import t9p1e2.Controlador;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        this.setExtendedState(this.MAXIMIZED_BOTH);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jToolBar1 = new javax.swing.JToolBar();
        bAlta = new javax.swing.JButton();
        bEditar = new javax.swing.JButton();
        bBorrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mAlta = new javax.swing.JMenuItem();
        mBaja = new javax.swing.JMenuItem();
        mModificacion = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        mSalirListado = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        bAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/alta.png"))); // NOI18N
        bAlta.setToolTipText("Alta de un acontecimeinto");
        bAlta.setFocusable(false);
        bAlta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bAlta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAltaActionPerformed(evt);
            }
        });
        jToolBar1.add(bAlta);

        bEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/editar.png"))); // NOI18N
        bEditar.setFocusable(false);
        bEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });
        jToolBar1.add(bEditar);

        bBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/papelera.jpg"))); // NOI18N
        bBorrar.setFocusable(false);
        bBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bBorrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarActionPerformed(evt);
            }
        });
        jToolBar1.add(bBorrar);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Empresa");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("XXXXXXXXXXX");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Dedicada a la organización de acontecimientos en Vitoria desde 1900");

        jMenu1.setText("Acontecimientos");

        mAlta.setText("Alta");
        mAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAltaActionPerformed(evt);
            }
        });
        jMenu1.add(mAlta);

        mBaja.setText("Baja");
        mBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBajaActionPerformed(evt);
            }
        });
        jMenu1.add(mBaja);

        mModificacion.setText("Modificación");
        mModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mModificacionActionPerformed(evt);
            }
        });
        jMenu1.add(mModificacion);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("Asistencia");

        jMenuItem2.setText("Alta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Listado");
        jMenuBar1.add(jMenu6);

        jMenu2.setText("Salir");

        mSalirListado.setText("Salir");
        mSalirListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSalirListadoActionPerformed(evt);
            }
        });
        jMenu2.add(mSalirListado);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAltaActionPerformed
             Controlador.visualizarVentanaAlta();
    }//GEN-LAST:event_mAltaActionPerformed

    private void bAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAltaActionPerformed
             mAlta.doClick();
    }//GEN-LAST:event_bAltaActionPerformed

    private void mSalirListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSalirListadoActionPerformed
            Controlador.terminar();
    }//GEN-LAST:event_mSalirListadoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     
    }//GEN-LAST:event_formWindowOpened

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        mModificacion.doClick();
    }//GEN-LAST:event_bEditarActionPerformed

    private void bBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarActionPerformed
        mBaja.doClick();
    }//GEN-LAST:event_bBorrarActionPerformed

    public void validarNombre(String nombre) throws Exception
    {
         if (nombre.isEmpty())
                throw new CampoVacio("Es obligatorio indicar el nombre del evento");
         if (nombre.length()< 3)
                throw new NombreNoValido();
    }
    
    private void mBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBajaActionPerformed
        try
        {
            String nombre = javax.swing.JOptionPane.showInputDialog(this,"Teclea el nombre del acontecimiento que quieres eliminar");
            validarNombre(nombre);
            Controlador.borrarAcontecimiento(nombre);
            JOptionPane.showMessageDialog(this,"Acontecimiento borrado");
            
        }
        catch(AcontecimientoNoEncontrado e)
        {
            JOptionPane.showMessageDialog(this,"No hay ningún acontecimiento con el nombre indicado");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Problemas eliminando " + e.getMessage());
        }
    }//GEN-LAST:event_mBajaActionPerformed

    private void mModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mModificacionActionPerformed
        try
        {
            String nombre = javax.swing.JOptionPane.showInputDialog(this,"Teclea el nombre del acontecimiento que quieres modificar");
            validarNombre(nombre);
            Controlador.modificarAcontecimientoParteUno(nombre);
        }
        catch(AcontecimientoNoEncontrado e)
        {
            JOptionPane.showMessageDialog(this,"No hay ningún acontecimiento con el nombre indicado");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Problemas modificando " + e.getMessage());
        }
    }//GEN-LAST:event_mModificacionActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public boolean mostrar(String datos)
    {
        JOptionPane.showMessageDialog(this,datos);
        int respuesta = JOptionPane.showConfirmDialog(this,"¿ Estas seguro? Los datos se eliminarán de forma permanente");
        if (respuesta == 0)
            return true;
        else
            return false;
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlta;
    private javax.swing.JButton bBorrar;
    private javax.swing.JButton bEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mAlta;
    private javax.swing.JMenuItem mBaja;
    private javax.swing.JMenuItem mModificacion;
    private javax.swing.JMenuItem mSalirListado;
    // End of variables declaration//GEN-END:variables
}
