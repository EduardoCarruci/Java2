package Presentacion;

import Datos.Cliente;
import Datos.Empleado;
import Logica.FCliente;
import Logica.FEmpleado;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Vista_Empleado extends javax.swing.JInternalFrame {

    private String accion = "guardar";

    public Vista_Empleado() {
        initComponents();
        mostrar("");
        habilitar();
        this.setResizable(false);
         Label_Empleado.setIcon(new ImageIcon(getClass().getResource("/Files/user.png")));
    }

    void inhabilitar() {
        Text_Nombre.setEnabled(false);
        Text_Apellido.setEnabled(false);
        Text_Cedula.setEnabled(false);
        Text_Telefono.setEnabled(false);

        Text_Direccion.setEnabled(false);
        Text_Login.setEnabled(false);
        Text_Password.setEnabled(false);
        Btn_Eliminar.setEnabled(false);
        Btn_Nuevo.setEnabled(false);
        Btn_Buscar.setEnabled(false);
        Btn_Guardar.setEnabled(false);
        Btn_Cancelar.setEnabled(false);

    }

    void habilitar() {
        Text_Nombre.setEnabled(true);
        Text_Apellido.setEnabled(true);
        Text_Cedula.setEnabled(true);
        Text_Login.setEnabled(true);
        Text_Password.setEnabled(true);
        Text_Telefono.setEnabled(true);

        Text_Direccion.setEnabled(true);

        Btn_Eliminar.setEnabled(true);
        Btn_Nuevo.setEnabled(true);
        Btn_Buscar.setEnabled(true);
        Btn_Guardar.setEnabled(true);
        Btn_Cancelar.setEnabled(true);

    }

    void limpiarcampos() {
        Text_Nombre.setText("");
        Text_Apellido.setText("");
        Text_Cedula.setText("");
        Text_Telefono.setText("");
        Text_Direccion.setText("");
        Text_Login.setText("");
        Text_Password.setText("");
    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            FEmpleado func = new FEmpleado();
            modelo = func.mostrar(buscar);
            Tabla_Listado.setModel(modelo);
            Label_Registros.setText("Total Registros: " + Integer.toString(func.totalregistros));

        } catch (Exception e) {
            System.out.println(e);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Text_Direccion = new javax.swing.JTextArea();
        Btn_Nuevo = new javax.swing.JButton();
        Btn_Guardar = new javax.swing.JButton();
        Btn_Cancelar = new javax.swing.JButton();
        Text_Cedula = new javax.swing.JTextField();
        Text_Nombre = new javax.swing.JTextField();
        Text_Apellido = new javax.swing.JTextField();
        Text_Telefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Text_Login = new javax.swing.JTextField();
        Text_Password = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Listado = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        Text_Buscar = new javax.swing.JTextField();
        Btn_Buscar = new javax.swing.JButton();
        Btn_Eliminar = new javax.swing.JButton();
        Label_Registros = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Label_Empleado = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Cedula:");

        jLabel5.setText("Nombre:");

        jLabel6.setText("Apellido:");

        jLabel7.setText("Telefono:");

        jLabel8.setText("Direccion:");

        Text_Direccion.setColumns(20);
        Text_Direccion.setRows(5);
        jScrollPane5.setViewportView(Text_Direccion);

        Btn_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_edit_59559.png"))); // NOI18N
        Btn_Nuevo.setText("Nuevo");
        Btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NuevoActionPerformed(evt);
            }
        });

        Btn_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/11.png"))); // NOI18N
        Btn_Guardar.setText("Guardar");
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });

        Btn_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_todo_list_add_17451.png"))); // NOI18N
        Btn_Cancelar.setText("Cancelar");
        Btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CancelarActionPerformed(evt);
            }
        });

        jLabel9.setText("Login:");

        jLabel10.setText("Password:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Text_Cedula)
                                    .addComponent(Text_Nombre)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5)
                                    .addComponent(Text_Login)
                                    .addComponent(Text_Password)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Text_Telefono)
                                    .addComponent(Text_Apellido)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Btn_Nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Cancelar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Text_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Text_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Text_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(Text_Telefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(7, 7, 7)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(Text_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Guardar)
                    .addComponent(Btn_Nuevo)
                    .addComponent(Btn_Cancelar))
                .addGap(18, 18, 18))
        );

        jPanel5.setBackground(new java.awt.Color(0, 204, 204));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Tabla_Listado.setBackground(new java.awt.Color(255, 204, 255));
        Tabla_Listado.setModel(new javax.swing.table.DefaultTableModel(
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
        Tabla_Listado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_ListadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_Listado);

        jLabel3.setText("Buscar:");

        Btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_search_b_44994.png"))); // NOI18N
        Btn_Buscar.setText("Buscar");
        Btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BuscarActionPerformed(evt);
            }
        });

        Btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_cancel_10103.png"))); // NOI18N
        Btn_Eliminar.setText("Eliminar");
        Btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Registros, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Text_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(Btn_Buscar)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_Eliminar)))
                        .addGap(0, 90, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Text_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Buscar)
                    .addComponent(Btn_Eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(Label_Registros, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel1.setText("Empleado:");

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel2.setText("Listado de Empleado:");

        Label_Empleado.setPreferredSize(new java.awt.Dimension(32, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Label_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addComponent(Label_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarActionPerformed
        mostrar(Text_Buscar.getText());
    }//GEN-LAST:event_Btn_BuscarActionPerformed


    private void Btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NuevoActionPerformed
        limpiarcampos();
        habilitar();
        Btn_Guardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_Btn_NuevoActionPerformed

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
        if (Text_Cedula.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa una Cedula");
            Text_Cedula.requestFocus();
            return;
        }
        if (Text_Nombre.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa un Nombre");
            Text_Nombre.requestFocus();
            return;
        }
        if (Text_Apellido.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa un Apellido");
            Text_Apellido.requestFocus();
            return;
        }
        if (Text_Telefono.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa un Telefono");
            Text_Telefono.requestFocus();
            return;
        }
        if (Text_Direccion.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa una Direccion");
            Text_Direccion.requestFocus();
            return;
        }

        if (Text_Login.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa un Login ");
            Text_Login.requestFocus();
            return;
        }

        if (Text_Password.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa una Contraseña");
            Text_Password.requestFocus();
            return;
        }

        Empleado empleado = new Empleado();
        FEmpleado func = new FEmpleado();

        //enviar datos hacia los metodos setter
        empleado.setCedula(Integer.parseInt(Text_Cedula.getText()));
        empleado.setDireccion(Text_Direccion.getText());
        empleado.setApellido(Text_Apellido.getText());
        empleado.setNombre(Text_Nombre.getText());
        empleado.setTelefono(Text_Telefono.getText());

        empleado.setLogin(Text_Login.getText());
        empleado.setPassword(Text_Password.getText());

        if (accion.equals("guardar")) {
            if (func.insertar(empleado)) {
                System.out.println("Empleado registrado");   //mostrando registros
                mostrar("");

                inhabilitar();
            }

        } else if (accion.equals("editar")) {
            empleado.setCedula(Integer.parseInt(Text_Cedula.getText()));
            empleado.setNombre(Text_Nombre.getText());
            empleado.setApellido(Text_Apellido.getText());
            empleado.setTelefono(Text_Telefono.getText());
            empleado.setDireccion(Text_Direccion.getText());
            empleado.setLogin(Text_Login.getText());
            empleado.setPassword(Text_Password.getText());

            if (func.editar(empleado)) {
                System.out.println("Empleado editado");
                mostrar("");
                limpiarcampos();
                inhabilitar();

            }
        }

        habilitar();
        limpiarcampos();
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EliminarActionPerformed
        if (!Text_Cedula.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Eliminar Empleado ?", "Confimar", 2);
            if (confirmacion == 0) {
                FEmpleado func = new FEmpleado();
                Empleado empleado = new Empleado();

                empleado.setCedula(Integer.parseInt(Text_Cedula.getText()));
                func.eliminar(empleado);
                mostrar("");
                inhabilitar();

            }
        }
        limpiarcampos();
        Btn_Nuevo.setEnabled(true);
    }//GEN-LAST:event_Btn_EliminarActionPerformed

    private void Tabla_ListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_ListadoMouseClicked
        Btn_Guardar.setText("Editar");
        accion = "editar";
        habilitar();
        Btn_Eliminar.setEnabled(true);

        int fila = Tabla_Listado.rowAtPoint(evt.getPoint());

        Text_Cedula.setText(Tabla_Listado.getValueAt(fila, 0).toString());
        Text_Nombre.setText(Tabla_Listado.getValueAt(fila, 1).toString());
        Text_Apellido.setText(Tabla_Listado.getValueAt(fila, 2).toString());
        Text_Telefono.setText(Tabla_Listado.getValueAt(fila, 3).toString());
        Text_Direccion.setText(Tabla_Listado.getValueAt(fila, 4).toString());
        Text_Login.setText(Tabla_Listado.getValueAt(fila, 5).toString());
        Text_Password.setText(Tabla_Listado.getValueAt(fila, 6).toString());


    }//GEN-LAST:event_Tabla_ListadoMouseClicked

    private void Btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CancelarActionPerformed
        Btn_Guardar.setText("Guardar");
        accion = "guardar";
        limpiarcampos();
    }//GEN-LAST:event_Btn_CancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Vista_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Buscar;
    private javax.swing.JButton Btn_Cancelar;
    private javax.swing.JButton Btn_Eliminar;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Nuevo;
    private javax.swing.JLabel Label_Empleado;
    private javax.swing.JLabel Label_Registros;
    private javax.swing.JTable Tabla_Listado;
    private javax.swing.JTextField Text_Apellido;
    private javax.swing.JTextField Text_Buscar;
    private javax.swing.JTextField Text_Cedula;
    private javax.swing.JTextArea Text_Direccion;
    private javax.swing.JTextField Text_Login;
    private javax.swing.JTextField Text_Nombre;
    private javax.swing.JTextField Text_Password;
    private javax.swing.JTextField Text_Telefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
