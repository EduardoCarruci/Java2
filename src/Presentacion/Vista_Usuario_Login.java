
package Presentacion;

import Datos.Empleado;
import Logica.FEmpleado;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Vista_Usuario_Login extends javax.swing.JFrame {

   
    public Vista_Usuario_Login() {
        
        initComponents();
        Label_Usuario.setIcon(new ImageIcon(getClass().getResource("/Files/4.png")));
        Label_Fondo.setIcon(new ImageIcon(getClass().getResource("/Files/fondo2.jpg")));
        
        
        setTitle("Acceso al sistema");
        setLocationRelativeTo(null);
        setResizable(false);
        
    
     
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Text_Password = new javax.swing.JPasswordField();
        Text_Usuario = new javax.swing.JTextField();
        Btn_Ingresar = new javax.swing.JButton();
        Btn_Salir = new javax.swing.JButton();
        Label_Usuario = new javax.swing.JLabel();
        Label_Fondo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setText("Usuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 153));
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        jPanel1.add(Text_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 130, -1));
        jPanel1.add(Text_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 27, 129, -1));

        Btn_Ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_ok_10125.png"))); // NOI18N
        Btn_Ingresar.setText("Ingresar");
        Btn_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_IngresarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 137, -1, -1));

        Btn_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_cancel_10103.png"))); // NOI18N
        Btn_Salir.setText("Salir");
        Btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 137, 105, -1));
        jPanel1.add(Label_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 20, 150, 160));
        jPanel1.add(Label_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 190));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 0, 8));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_IngresarActionPerformed
        try {
        DefaultTableModel modelo; 
        
        FEmpleado func = new FEmpleado();
        Empleado empleado = new Empleado();
        
        empleado.setLogin(Text_Usuario.getText());
        empleado.setPassword(Text_Password.getText());
        
        modelo = func.login(empleado.getLogin(), empleado.getPassword());
        
        Tabla.setModel(modelo);
        
        if(func.totalregistros > 0){
            this.dispose();
            Vista_Inicio vistaInicio = new Vista_Inicio();
            vistaInicio.toFront();
            vistaInicio.setVisible(true);
            
            
            Vista_Inicio.Label_Cedula.setText(Tabla.getValueAt(0,0).toString());
            Vista_Inicio.Label_Nombre.setText(Tabla.getValueAt(0,1).toString());
            Vista_Inicio.Label_Apellido.setText(Tabla.getValueAt(0,2).toString());
            System.out.println("llegue");
            Vista_Inicio.Label_Telefono.setText(Tabla.getValueAt(0,3).toString());
            Vista_Inicio.JLabel_Fondo.setText(Tabla.getValueAt(0,4).toString());
            
        }
        else if("admin".equals(Text_Usuario.getText()) && Text_Password.getText().equals("admin") ){
            this.dispose();
            Vista_Inicio vistaInicio = new Vista_Inicio();
            vistaInicio.toFront();
            vistaInicio.setVisible(true);
            
        }
            
            
        else JOptionPane.showMessageDialog(null,"Usuario No encontrado");
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_Btn_IngresarActionPerformed

    private void Btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirActionPerformed
        
    }//GEN-LAST:event_Btn_SalirActionPerformed

    
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
            java.util.logging.Logger.getLogger(Vista_Usuario_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Usuario_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Usuario_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Usuario_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Usuario_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Ingresar;
    private javax.swing.JButton Btn_Salir;
    private javax.swing.JLabel Label_Fondo;
    private javax.swing.JLabel Label_Usuario;
    private javax.swing.JTable Tabla;
    private javax.swing.JPasswordField Text_Password;
    private javax.swing.JTextField Text_Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
