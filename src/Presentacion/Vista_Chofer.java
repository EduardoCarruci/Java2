package Presentacion;

import Datos.Chofer;
import Datos.Empleado;
import Logica.FChofer;
import Logica.FEmpleado;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Vista_Chofer extends javax.swing.JInternalFrame {

    private String accion = "guardar";

    public Vista_Chofer() {
        initComponents();
        mostrar("");
          Label.setIcon(new ImageIcon(getClass().getResource("/Files/123213.png")));
          Label_People.setIcon(new ImageIcon(getClass().getResource("/Files/1124.png")));
           Label_Bus.setIcon(new ImageIcon(getClass().getResource("/Files/if_delivery_10110.png")));
           Label_Phone1.setIcon(new ImageIcon(getClass().getResource("/Files/phone.png")));
           LabelDireccion.setIcon(new ImageIcon(getClass().getResource("/Files/street.png")));
        habilitar();
    }

    void inhabilitar() {
        Text_Nombre.setEnabled(false);
        Text_Apellido.setEnabled(false);
        Text_Codigo.setEnabled(false);
        Text_Telefono.setEnabled(false);

        Text_Direccion.setEnabled(false);
        Text_Compañia.setEnabled(false);

        Btn_Eliminar.setEnabled(false);
        Btn_Nuevo.setEnabled(false);
        Btn_Buscar.setEnabled(false);
        Btn_Guardar.setEnabled(false);
        Btn_Cancelar.setEnabled(false);

    }

    void habilitar() {
        Text_Nombre.setEnabled(true);
        Text_Compañia.setEnabled(true);
        Text_Apellido.setEnabled(true);
        Text_Codigo.setEnabled(true);
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
        Text_Codigo.setText("");
        Text_Telefono.setText("");
        Text_Direccion.setText("");
        Text_Compañia.setText("");
    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            FChofer func = new FChofer();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Text_Direccion = new javax.swing.JTextArea();
        Btn_Nuevo = new javax.swing.JButton();
        Btn_Guardar = new javax.swing.JButton();
        Btn_Cancelar = new javax.swing.JButton();
        Text_Compañia = new javax.swing.JTextField();
        Text_Telefono = new javax.swing.JTextField();
        Text_Apellido = new javax.swing.JTextField();
        Text_Codigo = new javax.swing.JTextField();
        Text_Nombre = new javax.swing.JTextField();
        Label = new javax.swing.JLabel();
        Label_Phone1 = new javax.swing.JLabel();
        LabelDireccion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Listado = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        Btn_Buscar = new javax.swing.JButton();
        Btn_Eliminar = new javax.swing.JButton();
        Text_Buscar = new javax.swing.JTextField();
        Label_Registros = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Label_Bus = new javax.swing.JLabel();
        Label_People = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Cedula:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel5.setText("Apellido:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel6.setText("Telefono:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel7.setText("Direccion:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel8.setText("Compañia:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        Text_Direccion.setBackground(new java.awt.Color(255, 204, 204));
        Text_Direccion.setColumns(20);
        Text_Direccion.setRows(5);
        jScrollPane2.setViewportView(Text_Direccion);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 180, 250, 112));

        Btn_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/10.png"))); // NOI18N
        Btn_Nuevo.setText("Nuevo");
        Btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NuevoActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        Btn_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/22.png"))); // NOI18N
        Btn_Guardar.setText("Guardar");
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, -1, -1));

        Btn_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_cancel_10103.png"))); // NOI18N
        Btn_Cancelar.setText("Cancelar");
        Btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CancelarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, -1));
        jPanel1.add(Text_Compañia, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 330, 270, -1));
        jPanel1.add(Text_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 140, 250, -1));
        jPanel1.add(Text_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 290, -1));
        jPanel1.add(Text_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 220, 27));
        jPanel1.add(Text_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 220, -1));

        Label.setPreferredSize(new java.awt.Dimension(72, 72));
        jPanel1.add(Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Label_Phone1.setPreferredSize(new java.awt.Dimension(32, 32));
        jPanel1.add(Label_Phone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        LabelDireccion.setPreferredSize(new java.awt.Dimension(72, 72));
        jPanel1.add(LabelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Tabla_Listado.setBackground(new java.awt.Color(204, 204, 255));
        Tabla_Listado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        jLabel9.setText("Buscar:");

        Btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/11.png"))); // NOI18N
        Btn_Buscar.setText("Buscar");
        Btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BuscarActionPerformed(evt);
            }
        });

        Btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_question_10129.png"))); // NOI18N
        Btn_Eliminar.setText("Borrar");
        Btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EliminarActionPerformed(evt);
            }
        });

        Label_Registros.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Text_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(Btn_Buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn_Eliminar))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Label_Registros, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Btn_Buscar)
                    .addComponent(Btn_Eliminar)
                    .addComponent(Text_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_Registros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel1.setText("Listado de Choferes");

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel2.setText("Registro de Choferes");

        Label_Bus.setPreferredSize(new java.awt.Dimension(32, 32));

        Label_People.setPreferredSize(new java.awt.Dimension(32, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Label_Bus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Label_People, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_Bus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Label_People, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed

        if (Text_Codigo.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa una Cedula");
            Text_Codigo.requestFocus();
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

        if (Text_Compañia.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa una Compañia");
            Text_Compañia.requestFocus();
            return;
        }
        Chofer chofer = new Chofer();
        FChofer func = new FChofer();

        //enviar datos hacia los metodos setter
        chofer.setCedula(Integer.parseInt(Text_Codigo.getText()));
        chofer.setDireccion(Text_Direccion.getText());
        chofer.setApellido(Text_Apellido.getText());
        chofer.setNombre(Text_Nombre.getText());
        chofer.setTelefono(Text_Telefono.getText());
        chofer.setCompañia(Text_Compañia.getText());

        if (accion.equals("guardar")) {
            if (func.insertar(chofer)) {
                System.out.println("Chofer registrado");   //mostrando registros
                mostrar("");

                inhabilitar();
            }

        } else if (accion.equals("editar")) {
            chofer.setCedula(Integer.parseInt(Text_Codigo.getText()));
            chofer.setNombre(Text_Nombre.getText());
            chofer.setApellido(Text_Apellido.getText());
            chofer.setTelefono(Text_Telefono.getText());
            chofer.setDireccion(Text_Direccion.getText());
            chofer.setCompañia(Text_Compañia.getText());

            if (func.editar(chofer)) {
                System.out.println("Chofer editado");
                mostrar("");
                limpiarcampos();
                inhabilitar();

            }
        }

        habilitar();
        limpiarcampos();
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NuevoActionPerformed
        limpiarcampos();
        habilitar();
        Btn_Guardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_Btn_NuevoActionPerformed

    private void Btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CancelarActionPerformed
        limpiarcampos();
    }//GEN-LAST:event_Btn_CancelarActionPerformed

    private void Btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarActionPerformed
        mostrar(Text_Buscar.getText());
    }//GEN-LAST:event_Btn_BuscarActionPerformed

    private void Btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EliminarActionPerformed
        if (!Text_Codigo.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Eliminar Chofer ?", "Confimar", 2);
            if (confirmacion == 0) {
                FChofer func = new FChofer();
                Chofer chofer = new Chofer();

                chofer.setCedula(Integer.parseInt(Text_Codigo.getText()));
                func.eliminar(chofer);
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
        //editar

        int fila = Tabla_Listado.rowAtPoint(evt.getPoint());

        Text_Codigo.setText(Tabla_Listado.getValueAt(fila, 0).toString());
        Text_Nombre.setText(Tabla_Listado.getValueAt(fila, 1).toString());
        Text_Apellido.setText(Tabla_Listado.getValueAt(fila, 2).toString());
        Text_Telefono.setText(Tabla_Listado.getValueAt(fila, 3).toString());
        Text_Direccion.setText(Tabla_Listado.getValueAt(fila, 4).toString());
        Text_Compañia.setText(Tabla_Listado.getValueAt(fila, 5).toString());


    }//GEN-LAST:event_Tabla_ListadoMouseClicked

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
            java.util.logging.Logger.getLogger(Vista_Chofer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Chofer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Chofer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Chofer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Chofer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Buscar;
    private javax.swing.JButton Btn_Cancelar;
    private javax.swing.JButton Btn_Eliminar;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Nuevo;
    private javax.swing.JLabel Label;
    private javax.swing.JLabel LabelDireccion;
    private javax.swing.JLabel Label_Bus;
    private javax.swing.JLabel Label_People;
    private javax.swing.JLabel Label_Phone1;
    private javax.swing.JLabel Label_Registros;
    private javax.swing.JTable Tabla_Listado;
    private javax.swing.JTextField Text_Apellido;
    private javax.swing.JTextField Text_Buscar;
    private javax.swing.JTextField Text_Codigo;
    private javax.swing.JTextField Text_Compañia;
    private javax.swing.JTextArea Text_Direccion;
    private javax.swing.JTextField Text_Nombre;
    private javax.swing.JTextField Text_Telefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
