package Presentacion;

import Datos.Buses;
import Logica.FBuses;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Vista_Buses extends javax.swing.JInternalFrame {

    private String accion = "guardar";

    public Vista_Buses() {
        initComponents();
        habilitar();
        mostrar("");
        
         Label_Imagen.setIcon(new ImageIcon(getClass().getResource("/Files/112.png")));
           Label_Letrero.setIcon(new ImageIcon(getClass().getResource("/Files/c4.png")));
         
    }

    void inhabilitar() {
        Text_Año.setEnabled(false);
        Text_Modelo.setEnabled(false);
        Text_NumBus.setEnabled(false);
        Text_NumeroAsientos.setEnabled(false);
        Text_Placa.setEnabled(false);
      

        Btn_Nuevo.setEnabled(false);
        Btn_Guardar.setEnabled(false);
        Btn_Cancelar.setEnabled(false);

    }

    void habilitar() {
        Text_Año.setEnabled(true);
        Text_Modelo.setEnabled(true);
        Text_NumBus.setEnabled(true);
        Text_NumeroAsientos.setEnabled(true);
        Text_Placa.setEnabled(true);
       

        Btn_Nuevo.setEnabled(true);
        Btn_Guardar.setEnabled(true);
        Btn_Cancelar.setEnabled(true);

    }

    void limpiarcampos() {
        Text_Año.setText("");
        Text_Modelo.setText("");
        Text_NumBus.setText("");
        Text_NumeroAsientos.setText("");
        Text_Placa.setText("");
       
    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;

            FBuses func = new FBuses();
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
        Text_Placa = new javax.swing.JTextField();
        jLabel_Cedula = new javax.swing.JLabel();
        jLabel_Nombre = new javax.swing.JLabel();
        jLabel_Apellido = new javax.swing.JLabel();
        Text_NumeroAsientos = new javax.swing.JTextField();
        Text_Modelo = new javax.swing.JTextField();
        jLabel_Telefono = new javax.swing.JLabel();
        Text_Año = new javax.swing.JTextField();
        jLabel_Tarjeta = new javax.swing.JLabel();
        Text_NumBus = new javax.swing.JTextField();
        Btn_Guardar = new javax.swing.JButton();
        Btn_Cancelar = new javax.swing.JButton();
        Btn_Nuevo = new javax.swing.JButton();
        Label_Imagen = new javax.swing.JLabel();
        Label_Letrero = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Listado = new javax.swing.JTable();
        Label_Registros = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Text_Buscar = new javax.swing.JTextField();
        Btn_Buscar = new javax.swing.JButton();
        Btn_Eliminar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Text_Placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_PlacaActionPerformed(evt);
            }
        });
        jPanel1.add(Text_Placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 236, -1));

        jLabel_Cedula.setText("Placa:");
        jPanel1.add(jLabel_Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel_Nombre.setText("Modelo:");
        jPanel1.add(jLabel_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel_Apellido.setText("Numero Asientos:");
        jPanel1.add(jLabel_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        Text_NumeroAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_NumeroAsientosActionPerformed(evt);
            }
        });
        jPanel1.add(Text_NumeroAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 190, -1));

        Text_Modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_ModeloActionPerformed(evt);
            }
        });
        jPanel1.add(Text_Modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 233, -1));

        jLabel_Telefono.setText("Año:");
        jPanel1.add(jLabel_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        Text_Año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_AñoActionPerformed(evt);
            }
        });
        jPanel1.add(Text_Año, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 242, -1));

        jLabel_Tarjeta.setText("Numero de Bus:");
        jPanel1.add(jLabel_Tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        Text_NumBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_NumBusActionPerformed(evt);
            }
        });
        jPanel1.add(Text_NumBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 189, -1));

        Btn_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/10.png"))); // NOI18N
        Btn_Guardar.setText("Guardar");
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        Btn_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_cancel_10103.png"))); // NOI18N
        Btn_Cancelar.setText("Cancelar");
        Btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CancelarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        Btn_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_school_bus_44999.png"))); // NOI18N
        Btn_Nuevo.setText("Nuevo");
        Btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NuevoActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 107, -1));
        jPanel1.add(Label_Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 128, 128));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 160, 310, 340));

        Label_Letrero.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        Label_Letrero.setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().add(Label_Letrero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 290, 157));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel11.setText("Listado de Buses");

        Tabla_Listado.setBackground(new java.awt.Color(204, 255, 255));
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

        jLabel10.setText("Buscar:");

        Btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/11.png"))); // NOI18N
        Btn_Buscar.setText("Buscar");
        Btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BuscarActionPerformed(evt);
            }
        });

        Btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/26.png"))); // NOI18N
        Btn_Eliminar.setText("Eliminar");
        Btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_Registros, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(28, 28, 28)
                        .addComponent(Text_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(Btn_Buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn_Eliminar)))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Text_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Buscar)
                    .addComponent(Btn_Eliminar))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Label_Registros, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 38, -1, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tabla_ListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_ListadoMouseClicked
        Btn_Guardar.setText("Editar");
        accion = "editar";
        habilitar();
        Btn_Eliminar.setEnabled(true);

        int fila = Tabla_Listado.rowAtPoint(evt.getPoint());

        Text_Placa.setText(Tabla_Listado.getValueAt(fila, 0).toString());
        Text_Modelo.setText(Tabla_Listado.getValueAt(fila, 1).toString());
        Text_NumeroAsientos.setText(Tabla_Listado.getValueAt(fila, 2).toString());
        Text_Año.setText(Tabla_Listado.getValueAt(fila, 3).toString());
       
        Text_NumBus.setText(Tabla_Listado.getValueAt(fila, 4).toString());


    }//GEN-LAST:event_Tabla_ListadoMouseClicked

    private void Btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarActionPerformed
        mostrar(Text_Buscar.getText());
    }//GEN-LAST:event_Btn_BuscarActionPerformed

    private void Btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EliminarActionPerformed
        if (!Text_Placa.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Eliminar Bus ?", "Confimar", 2);
            if (confirmacion == 0) {
                FBuses func = new FBuses();
                Buses buses = new Buses();

                buses.setPlaca(Text_Placa.getText());
                func.eliminar(buses);
                mostrar("");
                inhabilitar();

            }
        }
        limpiarcampos();
        Btn_Nuevo.setEnabled(true);
    }//GEN-LAST:event_Btn_EliminarActionPerformed

    private void Btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NuevoActionPerformed
        limpiarcampos();
        habilitar();
        Btn_Guardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_Btn_NuevoActionPerformed

    private void Btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CancelarActionPerformed
        Btn_Guardar.setText("Guardar");
        accion = "guardar";
        limpiarcampos();
    }//GEN-LAST:event_Btn_CancelarActionPerformed

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed

        if (Text_Placa.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa una Placa");
            Text_Placa.requestFocus();
            return;
        }
        if (Text_Modelo.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa un Modeo");
            Text_Modelo.requestFocus();
            return;
        }
        if (Text_NumeroAsientos.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa un Numero de Asientos");
            Text_NumeroAsientos.requestFocus();
            return;
        }
        if (Text_Año.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa un Año de fabricacion del Bus");
            Text_Año.requestFocus();
            return;
        }

        if (Text_NumBus.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa un Numero de Bus");
            Text_NumBus.requestFocus();
            return;
        }

        Buses buses = new Buses();
        FBuses func = new FBuses();

        //enviar datos hacia los metodos setter
        buses.setPlaca(Text_Placa.getText());
        buses.setNumerodeBus(Integer.parseInt(Text_NumBus.getText()));
        buses.setNum_asientos(Integer.parseInt(Text_NumeroAsientos.getText()));
        buses.setModelo(Text_Modelo.getText());
        buses.setAño(Integer.parseInt(Text_Año.getText()));

        if (accion.equals("guardar")) {
            if (func.insertar(buses)) {
                System.out.println("Bus registrado");   //mostrando registros
                mostrar("");

                inhabilitar();
            }

        } else if (accion.equals("editar")) {
            buses.setPlaca(Text_Placa.getText());
            buses.setNumerodeBus(Integer.parseInt(Text_NumBus.getText()));
             buses.setNum_asientos(Integer.parseInt(Text_NumeroAsientos.getText()));
            buses.setModelo(Text_Modelo.getText());
           buses.setAño(Integer.parseInt(Text_Año.getText()));

            if (func.editar(buses)) {
                System.out.println("Cliente editado");
                mostrar("");
                limpiarcampos();
                inhabilitar();

            }
        }

        habilitar();
        limpiarcampos();
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Text_NumBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_NumBusActionPerformed
        Text_NumBus.transferFocus();
    }//GEN-LAST:event_Text_NumBusActionPerformed

    private void Text_AñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_AñoActionPerformed
        Text_Año.transferFocus();
    }//GEN-LAST:event_Text_AñoActionPerformed

    private void Text_ModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_ModeloActionPerformed
        Text_Modelo.transferFocus();
    }//GEN-LAST:event_Text_ModeloActionPerformed

    private void Text_NumeroAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_NumeroAsientosActionPerformed
        Text_NumeroAsientos.transferFocus();
    }//GEN-LAST:event_Text_NumeroAsientosActionPerformed

    private void Text_PlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_PlacaActionPerformed
        Text_Placa.transferFocus();
    }//GEN-LAST:event_Text_PlacaActionPerformed

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
            java.util.logging.Logger.getLogger(Vista_Buses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Buses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Buses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Buses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Buses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Buscar;
    private javax.swing.JButton Btn_Cancelar;
    private javax.swing.JButton Btn_Eliminar;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Nuevo;
    private javax.swing.JLabel Label_Imagen;
    private javax.swing.JLabel Label_Letrero;
    private javax.swing.JLabel Label_Registros;
    private javax.swing.JTable Tabla_Listado;
    private javax.swing.JTextField Text_Año;
    private javax.swing.JTextField Text_Buscar;
    private javax.swing.JTextField Text_Modelo;
    private javax.swing.JTextField Text_NumBus;
    private javax.swing.JTextField Text_NumeroAsientos;
    private javax.swing.JTextField Text_Placa;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel_Apellido;
    private javax.swing.JLabel jLabel_Cedula;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_Tarjeta;
    private javax.swing.JLabel jLabel_Telefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
