
package Presentacion;

import Logica.FBuses;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


public class Vista_BusesListado extends javax.swing.JFrame {

  
    public Vista_BusesListado() {
        initComponents();
         mostrar("");
        this.setLocationRelativeTo(null);
        Texto.setIcon(new ImageIcon(getClass().getResource("/Files/s1.png")));
        Fondo.setIcon(new ImageIcon(getClass().getResource("/Files/fondoazul.jpg")));
        this.setResizable(false);
    }
    
     void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            FBuses func = new FBuses();
            modelo = func.mostrarVista(buscar);
            Tabla_listado.setModel(modelo);
            jLabel_totalregistros.setText("Total Registros: " + Integer.toString(func.totalregistros));

        } catch (Exception e) {
            System.out.println(e);

        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel_Salida = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_listado = new javax.swing.JTable();
        jTextField_Buscar = new javax.swing.JTextField();
        jButton_Buscar = new javax.swing.JButton();
        jLabel_totalregistros = new javax.swing.JLabel();
        Texto = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.red, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.gray));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Salida.setText("Buscar:");
        jPanel2.add(jLabel_Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 40, -1, -1));

        Tabla_listado.setBackground(new java.awt.Color(153, 255, 255));
        Tabla_listado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabla_listado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_listadoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Tabla_listadoMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla_listado);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 79, 635, 157));

        jTextField_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_BuscarActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 37, 112, -1));

        jButton_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/11.png"))); // NOI18N
        jButton_Buscar.setText("Buscar");
        jButton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 27, -1, -1));
        jPanel2.add(jLabel_totalregistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 199, 21));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 90, 670, 310));

        Texto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Texto.setForeground(new java.awt.Color(102, 102, 255));
        getContentPane().add(Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 11, 632, 70));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 675, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tabla_listadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_listadoMouseClicked

    }//GEN-LAST:event_Tabla_listadoMouseClicked

    private void Tabla_listadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_listadoMousePressed
        if (evt.getClickCount() == 2) {
            int fila = Tabla_listado.getSelectedRow();
            String cod;
            String valor; // enviando codigo y valor;
            String valor2;

            cod = Tabla_listado.getValueAt(fila, 0).toString();
            valor = Tabla_listado.getValueAt(fila, 1).toString();
            valor2 = Tabla_listado.getValueAt(fila, 2).toString();
            try {
                Vista_Ruta.Text_PlacaBus.setText(cod);
            } catch (Exception e) {
                Vista_Venta.Text_NumerodeBus.setText(cod);
               
            }
            /*Vista_Ruta.Text_PlacaBus.setText(cod);
            Vista_Venta.Text_Bus.setText(cod);*/
            /* Vista_Venta.Text_NombreCliente.setText(valor);
            Vista_Venta.Text_ApellidoCliente.setText(valor2);*/

            this.dispose();

        }
    }//GEN-LAST:event_Tabla_listadoMousePressed

    private void jTextField_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_BuscarActionPerformed

    }//GEN-LAST:event_jTextField_BuscarActionPerformed

    private void jButton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarActionPerformed
        mostrar(jTextField_Buscar.getText());
    }//GEN-LAST:event_jButton_BuscarActionPerformed

    
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
            java.util.logging.Logger.getLogger(Vista_BusesListado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_BusesListado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_BusesListado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_BusesListado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_BusesListado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JTable Tabla_listado;
    private javax.swing.JLabel Texto;
    private javax.swing.JButton jButton_Buscar;
    private javax.swing.JLabel jLabel_Salida;
    private javax.swing.JLabel jLabel_totalregistros;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField_Buscar;
    // End of variables declaration//GEN-END:variables
}
