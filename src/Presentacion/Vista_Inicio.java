
package Presentacion;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Vista_Inicio extends javax.swing.JFrame {
    
    public Vista_Inicio() {
        initComponents();
        

       JLabel_Fondo.setIcon(new ImageIcon(getClass().getResource("/Files/fondo.jpg")));
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Files/LOGO.png")));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    
   
        this.setTitle("Sistema de Reserva");
    }
    
 


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        Label_Cedula = new javax.swing.JLabel();
        Label_Nombre = new javax.swing.JLabel();
        Label_Apellido = new javax.swing.JLabel();
        Label_Telefono = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JLabel_Fondo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menu_Reservas = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        menu_Clientes = new javax.swing.JMenu();
        Menu_Cliente = new javax.swing.JMenuItem();
        menu_Empleados = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        Menu_Buses = new javax.swing.JMenuItem();
        Menu_Chofer = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        menu_Rutas = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        CheckBox_RutaListado = new javax.swing.JCheckBoxMenuItem();
        menu_Consultas = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        menu_Salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1050, 730));

        desktopPane.setBackground(new java.awt.Color(153, 204, 255));
        desktopPane.add(Label_Cedula);
        Label_Cedula.setBounds(10, 10, 130, 0);
        desktopPane.add(Label_Nombre);
        Label_Nombre.setBounds(10, 40, 130, 0);
        desktopPane.add(Label_Apellido);
        Label_Apellido.setBounds(10, 70, 130, 0);
        desktopPane.add(Label_Telefono);
        Label_Telefono.setBounds(10, 100, 130, 0);
        desktopPane.add(jLabel1);
        jLabel1.setBounds(160, 110, 0, 0);
        desktopPane.add(JLabel_Fondo);
        JLabel_Fondo.setBounds(0, 0, 1090, 700);

        menuBar.setBackground(new java.awt.Color(204, 204, 255));
        menuBar.setForeground(new java.awt.Color(204, 204, 255));

        menu_Reservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/i1.png"))); // NOI18N
        menu_Reservas.setMnemonic('h');
        menu_Reservas.setText("Venta");

        contentMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/12.png"))); // NOI18N
        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Pasajes");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        menu_Reservas.add(contentMenuItem);

        menuBar.add(menu_Reservas);

        menu_Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/13.png"))); // NOI18N
        menu_Clientes.setText("Clientes");
        menu_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ClientesActionPerformed(evt);
            }
        });

        Menu_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/7.png"))); // NOI18N
        Menu_Cliente.setText("Clientes ");
        Menu_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_ClienteActionPerformed(evt);
            }
        });
        menu_Clientes.add(Menu_Cliente);

        menuBar.add(menu_Clientes);

        menu_Empleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/23.png"))); // NOI18N
        menu_Empleados.setText("Empleados");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/10.png"))); // NOI18N
        jMenuItem1.setText("Empleados");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menu_Empleados.add(jMenuItem1);

        menuBar.add(menu_Empleados);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_bus_45270.png"))); // NOI18N
        jMenu1.setText("Buses");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        Menu_Buses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_transportation_service_45471.png"))); // NOI18N
        Menu_Buses.setText("Registrar/Consultar");
        Menu_Buses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_BusesActionPerformed(evt);
            }
        });
        jMenu1.add(Menu_Buses);

        menuBar.add(jMenu1);

        Menu_Chofer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_testimonials_45013.png"))); // NOI18N
        Menu_Chofer.setText("Chofer");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/29.png"))); // NOI18N
        jMenuItem2.setText("Chofer");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Menu_Chofer.add(jMenuItem2);

        menuBar.add(Menu_Chofer);

        menu_Rutas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/24.png"))); // NOI18N
        menu_Rutas.setText("Rutas");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Registrar/Eliminar Ruta");
        jCheckBoxMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_school_bus_44999.png"))); // NOI18N
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        menu_Rutas.add(jCheckBoxMenuItem1);

        CheckBox_RutaListado.setSelected(true);
        CheckBox_RutaListado.setText("Consultar Rutas");
        CheckBox_RutaListado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_alliance_45276 (1).png"))); // NOI18N
        CheckBox_RutaListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_RutaListadoActionPerformed(evt);
            }
        });
        menu_Rutas.add(CheckBox_RutaListado);

        menuBar.add(menu_Rutas);

        menu_Consultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/8.png"))); // NOI18N
        menu_Consultas.setText("Consultas Avanzadas");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/5.png"))); // NOI18N
        jMenuItem3.setText("Consulta por Fecha ");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menu_Consultas.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/27.png"))); // NOI18N
        jMenuItem4.setText("Boletos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menu_Consultas.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/11.png"))); // NOI18N
        jMenuItem5.setText("Listado Pasajeros");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menu_Consultas.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_laboratory_45314.png"))); // NOI18N
        jMenuItem6.setText("Total de ventas dada una Fecha");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menu_Consultas.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/25.png"))); // NOI18N
        jMenuItem7.setText("Recaudacion por Tasa de Salida");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        menu_Consultas.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_delivery_10110.png"))); // NOI18N
        jMenuItem8.setText("Historial de un Cliente");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        menu_Consultas.add(jMenuItem8);

        menuBar.add(menu_Consultas);

        menu_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_cancel_10103.png"))); // NOI18N
        menu_Salir.setText("Salir");
        menu_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_SalirMouseClicked(evt);
            }
        });
        menuBar.add(menu_Salir);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1082, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ClientesActionPerformed
      
    }//GEN-LAST:event_menu_ClientesActionPerformed

    private void Menu_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_ClienteActionPerformed
     Vista_Cliente vistacliente = new Vista_Cliente();
      desktopPane.add(vistacliente);
      vistacliente.toFront();
      vistacliente.setVisible(true);
    }//GEN-LAST:event_Menu_ClienteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Vista_Empleado vistaempleado = new Vista_Empleado();
      desktopPane.add(vistaempleado);
      vistaempleado.toFront();
      vistaempleado.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menu_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_SalirMouseClicked
       this.dispose();
    }//GEN-LAST:event_menu_SalirMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
      Vista_Chofer vistachofer = new Vista_Chofer();
      desktopPane.add(vistachofer);
      vistachofer.toFront();
      vistachofer.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
    Vista_Venta vistaventa = new Vista_Venta();
    Vista_Venta.Text_Empleado.setText(Label_Cedula.getText());
    
    desktopPane.add(vistaventa);
    vistaventa.toFront();
    vistaventa.setVisible(true);
  
    
    
    }//GEN-LAST:event_contentMenuItemActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
       Vista_Ruta vistaruta = new Vista_Ruta();
      desktopPane.add(vistaruta);
      vistaruta.toFront();
      vistaruta.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void Menu_BusesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_BusesActionPerformed
        Vista_Buses vistabuses = new Vista_Buses();
      desktopPane.add(vistabuses);
      vistabuses.toFront();
      vistabuses.setVisible(true);
    }//GEN-LAST:event_Menu_BusesActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
     
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void CheckBox_RutaListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_RutaListadoActionPerformed
    Vista_RutaListado rutaListado = new Vista_RutaListado();
        rutaListado.toFront();
        rutaListado.setVisible(true);
    }//GEN-LAST:event_CheckBox_RutaListadoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       Vista_Fecha vistaFecha = new Vista_Fecha();
        desktopPane.add(vistaFecha);
        vistaFecha.toFront();
        vistaFecha.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    Vista_Boleto Vistaboleto = new Vista_Boleto();
    desktopPane.add(Vistaboleto);
        Vistaboleto.toFront();
        Vistaboleto.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       Vista_Pasajeros vistapasajeros = new Vista_Pasajeros();
       desktopPane.add(vistapasajeros);
        vistapasajeros.toFront();
        vistapasajeros.setVisible(true); 
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       Vista_TotalVentasXFecha vistaTVXFecha = new Vista_TotalVentasXFecha();
       desktopPane.add(vistaTVXFecha);
       vistaTVXFecha.toFront();
       vistaTVXFecha.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
    Vista_TasaSalida vistaTasaSalida = new Vista_TasaSalida();
    desktopPane.add(vistaTasaSalida);
        vistaTasaSalida.toFront();
        vistaTasaSalida.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
       Vista_ViajesCliente vistaViajesCliente = new Vista_ViajesCliente();
        desktopPane.add(vistaViajesCliente);
        vistaViajesCliente.toFront();
        vistaViajesCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Vista_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem CheckBox_RutaListado;
    public static javax.swing.JLabel JLabel_Fondo;
    public static javax.swing.JLabel Label_Apellido;
    public static javax.swing.JLabel Label_Cedula;
    public static javax.swing.JLabel Label_Nombre;
    public static javax.swing.JLabel Label_Telefono;
    private javax.swing.JMenuItem Menu_Buses;
    private javax.swing.JMenu Menu_Chofer;
    private javax.swing.JMenuItem Menu_Cliente;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menu_Clientes;
    private javax.swing.JMenu menu_Consultas;
    private javax.swing.JMenu menu_Empleados;
    private javax.swing.JMenu menu_Reservas;
    private javax.swing.JMenu menu_Rutas;
    private javax.swing.JMenu menu_Salir;
    // End of variables declaration//GEN-END:variables

}
