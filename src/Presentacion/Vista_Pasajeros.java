
package Presentacion;

import Logica.Conexion;
import Logica.FVenta;

import static Presentacion.Vista_Fecha.Text_Buscar;
import java.io.File;
import java.sql.Connection;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;


public class Vista_Pasajeros extends javax.swing.JInternalFrame {

    
    public Vista_Pasajeros() {
        initComponents();
        mostrar("","","","");
        this.setTitle("Listado de Pasajeros");
        Label_User.setIcon(new ImageIcon(getClass().getResource("/Files/if_thumbnail_15546 (2).png")));
        Label_User2.setIcon(new ImageIcon(getClass().getResource("/Files/if_delivery_10110.png")));
        Label_Codigo.setVisible(false);
      //  this.setLocationRelativeTo(null);
    }

      void mostrar(String Destino,String Salida,String Fecha,String Horario) {
        try {
            DefaultTableModel modelo;
            FVenta func = new FVenta();
            modelo = func.mostrarPasajeros(Destino,Salida,Fecha,Horario);
            Tabla_listado.setModel(modelo);
            jLabel_totalregistros.setText("Total Registros: " + Integer.toString(func.totalregistros));
            func.Asignar_Codigo(Destino, Salida, Fecha, Horario);

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
        Text_Destino = new javax.swing.JTextField();
        jButton_Buscar = new javax.swing.JButton();
        jLabel_totalregistros = new javax.swing.JLabel();
        jLabel_Salida1 = new javax.swing.JLabel();
        Text_Salida = new javax.swing.JTextField();
        jLabel_Salida2 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jLabel_Salida3 = new javax.swing.JLabel();
        Text_Horario = new javax.swing.JTextField();
        Text_FechaSalida = new javax.swing.JTextField();
        Btn_Generar = new javax.swing.JButton();
        Label_Codigo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Label_User = new javax.swing.JLabel();
        Label_User2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jPanel2.setBackground(new java.awt.Color(0, 204, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Listado"));

        jLabel_Salida.setText("Destino:");

        Tabla_listado.setBackground(new java.awt.Color(255, 204, 204));
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

        Text_Destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_DestinoActionPerformed(evt);
            }
        });

        jButton_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_editcopy_15512.png"))); // NOI18N
        jButton_Buscar.setText("Buscar");
        jButton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarActionPerformed(evt);
            }
        });

        jLabel_Salida1.setText("Salida:");

        Text_Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_SalidaActionPerformed(evt);
            }
        });

        jLabel_Salida2.setText("Fecha de Salida:");

        jLabel_Salida3.setText("Horario:");

        Text_Horario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_HorarioActionPerformed(evt);
            }
        });

        Btn_Generar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/pdf.png"))); // NOI18N
        Btn_Generar.setText("Generar Listado");
        Btn_Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Salida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Text_Destino, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_Salida1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Text_Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_Salida2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text_FechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Salida3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Text_Horario, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel_totalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Btn_Generar)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Salida)
                    .addComponent(Text_Destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Buscar)
                    .addComponent(jLabel_Salida1)
                    .addComponent(Text_Salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Salida2)
                    .addComponent(Text_Horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Salida3)
                    .addComponent(Text_FechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_totalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Btn_Generar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Label_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 170, Short.MAX_VALUE)
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 170, Short.MAX_VALUE)))
        );

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel1.setText("Listado de Pasajeros");

        Label_User.setPreferredSize(new java.awt.Dimension(32, 32));

        Label_User2.setPreferredSize(new java.awt.Dimension(32, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_User2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label_User, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label_User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9))
                    .addComponent(Label_User2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tabla_listadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_listadoMouseClicked

    }//GEN-LAST:event_Tabla_listadoMouseClicked

    private void Tabla_listadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_listadoMousePressed

    }//GEN-LAST:event_Tabla_listadoMousePressed

    private void Text_DestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_DestinoActionPerformed

    }//GEN-LAST:event_Text_DestinoActionPerformed

    private void jButton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarActionPerformed
        mostrar(Text_Destino.getText(),Text_Salida.getText(),Text_FechaSalida.getText(),Text_Horario.getText());
        
    }//GEN-LAST:event_jButton_BuscarActionPerformed

    private void Text_SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_SalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_SalidaActionPerformed

    private void Text_HorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_HorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_HorarioActionPerformed
    private Connection connection = new Conexion().conectar();

    private void Btn_GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GenerarActionPerformed
          if (!Label_Codigo.getText().equals("")){
      
            Map p = new HashMap();
            p.put("Codigo", Label_Codigo.getText());
            
            JasperReport report;
            JasperPrint print;
            try {
                report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                        + "/src/Reportes/Pasajeros.jrxml");
                print = JasperFillManager.fillReport(report, p, connection);
                JasperViewer view = new JasperViewer(print, false);
                view.setTitle("Reporte de Pasajeros");
                view.setVisible(true);
            } catch (JRException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_Btn_GenerarActionPerformed

 
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
            java.util.logging.Logger.getLogger(Vista_Pasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Pasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Pasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Pasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Pasajeros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Generar;
    public static javax.swing.JLabel Label_Codigo;
    private javax.swing.JLabel Label_User;
    private javax.swing.JLabel Label_User2;
    private javax.swing.JTable Tabla_listado;
    private javax.swing.JTextField Text_Destino;
    private javax.swing.JTextField Text_FechaSalida;
    private javax.swing.JTextField Text_Horario;
    private javax.swing.JTextField Text_Salida;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton_Buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Salida;
    private javax.swing.JLabel jLabel_Salida1;
    private javax.swing.JLabel jLabel_Salida2;
    private javax.swing.JLabel jLabel_Salida3;
    private javax.swing.JLabel jLabel_totalregistros;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
