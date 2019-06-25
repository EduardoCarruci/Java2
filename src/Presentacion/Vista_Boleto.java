
package Presentacion;

import Logica.FVenta;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


public class Vista_Boleto extends javax.swing.JInternalFrame {

   
    public Vista_Boleto() {
        initComponents();
        mostrar("");
        
         Label.setIcon(new ImageIcon(getClass().getResource("/Files/ListadoBoletos.png")));
         Label_Fondo.setIcon(new ImageIcon(getClass().getResource("/Files/fondo.jpg")));
      
    }
void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            FVenta func = new FVenta();
            modelo = func.mostrarBoleto(buscar);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_listado = new javax.swing.JTable();
        jLabel_totalregistros = new javax.swing.JLabel();
        Label = new javax.swing.JLabel();
        Label_Fondo = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Listado"));

        Tabla_listado.setBackground(new java.awt.Color(204, 204, 255));
        Tabla_listado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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
        Tabla_listado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tabla_listado.setEnabled(false);
        Tabla_listado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_listadoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Tabla_listadoMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla_listado);

        jLabel_totalregistros.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_totalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(802, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_totalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));
        getContentPane().add(Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 788, 106));
        getContentPane().add(Label_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1080, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tabla_listadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_listadoMouseClicked

    }//GEN-LAST:event_Tabla_listadoMouseClicked

    private void Tabla_listadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_listadoMousePressed
     
    }//GEN-LAST:event_Tabla_listadoMousePressed

    
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
            java.util.logging.Logger.getLogger(Vista_Boleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Boleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Boleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Boleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Boleto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label;
    private javax.swing.JLabel Label_Fondo;
    private javax.swing.JTable Tabla_listado;
    private javax.swing.JLabel jLabel_totalregistros;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
