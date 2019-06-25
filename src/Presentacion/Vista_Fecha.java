package Presentacion;

import Logica.Conexion;
import Logica.FFecha;
import Logica.FVenta;
import java.io.File;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class Vista_Fecha extends javax.swing.JInternalFrame {

    public Vista_Fecha() {
        initComponents();
        mostrar("");
        this.setTitle("Busqueda por Fecha indicada");
        this.Label_Text.setIcon(new ImageIcon(getClass().getResource("/Files/34c.png")));
        this.Label_Fondo.setIcon(new ImageIcon(getClass().getResource("/Files/fondoazul.jpg")));
        this.Label_User.setIcon(new ImageIcon(getClass().getResource("/Files/MSN.png")));
        this.Label_Sell.setIcon(new ImageIcon(getClass().getResource("/Files/if_cart_add_10105.png")));

    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            FVenta func = new FVenta();
            modelo = func.mostrarBusquedaparaFecha(buscar);
            Tabla_listado.setModel(modelo);
            jLabel_totalregistros.setText("Total Registros: " + Integer.toString(func.totalregistros));

        } catch (Exception e) {
            System.out.println(e);

        }
    }

    void mostrarFechaAvanzada(String buscar) {
        try {
            DefaultTableModel modelo;
            FFecha func = new FFecha();

            modelo = func.mostrarFechaActual(buscar);
            Table_Fecha.setModel(modelo);
            // jLabel_totalregistros.setText("Total Registros: " + Integer.toString(func.totalregistros));

        } catch (Exception e) {
            System.out.println(e);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Fecha = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel_Salida = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_listado = new javax.swing.JTable();
        Text_Buscar = new javax.swing.JTextField();
        jButton_Buscar = new javax.swing.JButton();
        jLabel_totalregistros = new javax.swing.JLabel();
        Label_Text = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Label_User = new javax.swing.JLabel();
        Label_Sell = new javax.swing.JLabel();
        Btn_Reporte = new javax.swing.JButton();
        Label_Fondo = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table_Fecha.setBackground(new java.awt.Color(255, 204, 204));
        Table_Fecha.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Table_Fecha);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 245, 90));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Listado"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Salida.setText("Buscar:");
        jPanel2.add(jLabel_Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 31, -1, -1));

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

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 72, 630, 253));

        Text_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_BuscarActionPerformed(evt);
            }
        });
        jPanel2.add(Text_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 28, 112, -1));

        jButton_Buscar.setText("Buscar");
        jButton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 27, -1, -1));
        jPanel2.add(jLabel_totalregistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 336, 213, 21));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 84, -1, -1));

        Label_Text.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(Label_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 11, 599, 67));

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel2.setText("Busqueda por Fecha");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, -1, 43));
        getContentPane().add(Label_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 140, 140));

        Label_Sell.setPreferredSize(new java.awt.Dimension(32, 32));
        getContentPane().add(Label_Sell, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        Btn_Reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/pdf.png"))); // NOI18N
        Btn_Reporte.setText("Reporte");
        Btn_Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ReporteActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, -1, -1));
        getContentPane().add(Label_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tabla_listadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_listadoMouseClicked

    }//GEN-LAST:event_Tabla_listadoMouseClicked

    private void Tabla_listadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_listadoMousePressed

    }//GEN-LAST:event_Tabla_listadoMousePressed

    private void Text_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_BuscarActionPerformed

    }//GEN-LAST:event_Text_BuscarActionPerformed

    private void jButton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarActionPerformed
        mostrarFechaAvanzada(Text_Buscar.getText());
    }//GEN-LAST:event_jButton_BuscarActionPerformed

    private Connection connection = new Conexion().conectar();


    private void Btn_ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ReporteActionPerformed
        if (!Text_Buscar.getText().equals("")) {

            Map p = new HashMap();
            p.put("fechaDeVenta", Text_Buscar.getText());
            JasperReport report;
            JasperPrint print;
            try {
                report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                        + "/src/Reportes/Reporte_EDC.jrxml");
                print = JasperFillManager.fillReport(report, p, connection);
                JasperViewer view = new JasperViewer(print, false);
                view.setTitle("Reporte de Montos dada una Fecha");
                view.setVisible(true);
            } catch (JRException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_Btn_ReporteActionPerformed

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
            java.util.logging.Logger.getLogger(Vista_Fecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Fecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Fecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Fecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Fecha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Reporte;
    private javax.swing.JLabel Label_Fondo;
    private javax.swing.JLabel Label_Sell;
    private javax.swing.JLabel Label_Text;
    private javax.swing.JLabel Label_User;
    private javax.swing.JTable Tabla_listado;
    private javax.swing.JTable Table_Fecha;
    public static javax.swing.JTextField Text_Buscar;
    private javax.swing.JButton jButton_Buscar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Salida;
    private javax.swing.JLabel jLabel_totalregistros;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
