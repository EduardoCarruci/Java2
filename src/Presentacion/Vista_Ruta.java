package Presentacion;

import Datos.Ruta;
import Logica.FRuta;
import java.sql.Time;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Vista_Ruta extends javax.swing.JInternalFrame {

    private String accion = "guardar";

    public Vista_Ruta() {
        initComponents();
        mostrar("");
        Label_Destino.setIcon(new ImageIcon(getClass().getResource("/Files/maping.png")));
         Label_Clock.setIcon(new ImageIcon(getClass().getResource("/Files/if_clock_285673.png")));
          Label_Money.setIcon(new ImageIcon(getClass().getResource("/Files/if_bank_59530.png")));
        habilitar();
        this.setTitle("Registro de Rutas");
    }

    void inhabilitar() {
   
        Text_Codigo.setEnabled(false);
        Text_Destino.setEnabled(false);
         //TimeChooeser.setTime(new Date(00,00,00));
        Text_PlacaBus.setEnabled(false);

        Text_Precio.setEnabled(false);
        Text_Salida.setEnabled(false);

        Btn_Eliminar.setEnabled(false);
        Btn_Nuevo.setEnabled(false);
        Btn_Buscar.setEnabled(false);
        Btn_Guardar.setEnabled(false);
        Btn_Cancelar.setEnabled(false);

    }

    void habilitar() {
        Text_Codigo.setEnabled(true);
        Text_Destino.setEnabled(true);
      
        Text_PlacaBus.setEnabled(false);

        Text_Precio.setEnabled(true);
        Text_Salida.setEnabled(true);

        Btn_Eliminar.setEnabled(true);
        Btn_Nuevo.setEnabled(true);
        Btn_Buscar.setEnabled(true);
        Btn_Guardar.setEnabled(true);
        Btn_Cancelar.setEnabled(true);

    }

    void limpiarcampos() {
        Text_Codigo.setText("");
        Text_Destino.setText("");
       
        Text_PlacaBus.setText("");
       // TimeChooeser.setTime(new Date(00,00,00));
        
        Text_Precio.setText("");
        Text_Salida.setText("");
        Text_Chofer.setText("");
    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            FRuta func = new FRuta();
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
        Text_Codigo = new javax.swing.JTextField();
        jLabel_Cedula = new javax.swing.JLabel();
        jLabel_Nombre = new javax.swing.JLabel();
        jLabel_Apellido = new javax.swing.JLabel();
        Text_Salida = new javax.swing.JTextField();
        Text_Precio = new javax.swing.JTextField();
        jLabel_Telefono = new javax.swing.JLabel();
        Text_Destino = new javax.swing.JTextField();
        jLabel_Direccion = new javax.swing.JLabel();
        jLabel_Tarjeta = new javax.swing.JLabel();
        Text_PlacaBus = new javax.swing.JTextField();
        Btn_Guardar = new javax.swing.JButton();
        Btn_Cancelar = new javax.swing.JButton();
        Btn_Nuevo = new javax.swing.JButton();
        Btn_BuscarBuses = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Text_Chofer = new javax.swing.JTextField();
        Btn_Chofer = new javax.swing.JButton();
        Label_Destino = new javax.swing.JLabel();
        Label_Clock = new javax.swing.JLabel();
        Label_Money = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_Salida = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_Listado = new javax.swing.JTable();
        jTextField_Buscar = new javax.swing.JTextField();
        Btn_Buscar = new javax.swing.JButton();
        Btn_Eliminar = new javax.swing.JButton();
        Label_Registros = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Text_Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_CodigoActionPerformed(evt);
            }
        });
        jPanel1.add(Text_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 35, 299, -1));

        jLabel_Cedula.setText("Codigo:");
        jPanel1.add(jLabel_Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 38, -1, -1));

        jLabel_Nombre.setText("Precio:");
        jPanel1.add(jLabel_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel_Apellido.setText("Salida:");
        jPanel1.add(jLabel_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 117, -1, -1));

        Text_Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_SalidaActionPerformed(evt);
            }
        });
        jPanel1.add(Text_Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 114, 225, -1));

        Text_Precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_PrecioActionPerformed(evt);
            }
        });
        jPanel1.add(Text_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 225, -1));

        jLabel_Telefono.setText("Destino:");
        jPanel1.add(jLabel_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 169, -1, -1));

        Text_Destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_DestinoActionPerformed(evt);
            }
        });
        jPanel1.add(Text_Destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 166, 225, -1));

        jLabel_Direccion.setText("Horario:");
        jPanel1.add(jLabel_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 218, -1, -1));

        jLabel_Tarjeta.setText("Placa de Bus:");
        jPanel1.add(jLabel_Tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 286, -1, -1));

        Text_PlacaBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_PlacaBusActionPerformed(evt);
            }
        });
        jPanel1.add(Text_PlacaBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 283, 114, -1));

        Btn_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_mail_10119.png"))); // NOI18N
        Btn_Guardar.setText("Guardar");
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 399, 115, 45));

        Btn_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_busy_59537.png"))); // NOI18N
        Btn_Cancelar.setText("Cancelar");
        Btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CancelarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 401, -1, -1));

        Btn_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_finished-work_59563.png"))); // NOI18N
        Btn_Nuevo.setText("Nuevo");
        Btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NuevoActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 399, -1, 45));

        Btn_BuscarBuses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_school_bus_44999.png"))); // NOI18N
        Btn_BuscarBuses.setText("Buscar Buses");
        Btn_BuscarBuses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BuscarBusesActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_BuscarBuses, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 273, 148, -1));

        jLabel3.setText("Chofer:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 355, -1, -1));
        jPanel1.add(Text_Chofer, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 352, 114, -1));

        Btn_Chofer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_testimonials_45013.png"))); // NOI18N
        Btn_Chofer.setText("Buscar Chofer");
        Btn_Chofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ChoferActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Chofer, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 332, 148, -1));

        Label_Destino.setPreferredSize(new java.awt.Dimension(64, 64));
        jPanel1.add(Label_Destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 122, -1, -1));

        Label_Clock.setPreferredSize(new java.awt.Dimension(64, 64));
        jPanel1.add(Label_Clock, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        Label_Money.setPreferredSize(new java.awt.Dimension(32, 32));
        jPanel1.add(Label_Money, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 82, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Listado"));

        jLabel_Salida.setText("Buscar:");

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
        jScrollPane2.setViewportView(Tabla_Listado);

        jTextField_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_BuscarActionPerformed(evt);
            }
        });

        Btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_checkmark-g_86134.png"))); // NOI18N
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

        Label_Registros.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Registros, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel_Salida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_Buscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_Eliminar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Salida)
                    .addComponent(jTextField_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Buscar)
                    .addComponent(Btn_Eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Label_Registros, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel1.setText("Registro de Rutas");

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel2.setText("Listado de Rutas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Text_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_CodigoActionPerformed
        Text_Codigo.transferFocus();
    }//GEN-LAST:event_Text_CodigoActionPerformed

    private void Text_SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_SalidaActionPerformed
        Text_Salida.transferFocus();
    }//GEN-LAST:event_Text_SalidaActionPerformed

    private void Text_PrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_PrecioActionPerformed
        Text_Precio.transferFocus();
    }//GEN-LAST:event_Text_PrecioActionPerformed

    private void Text_DestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_DestinoActionPerformed
        Text_Destino.transferFocus();
    }//GEN-LAST:event_Text_DestinoActionPerformed

    private void Text_PlacaBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_PlacaBusActionPerformed
        Text_PlacaBus.transferFocus();
    }//GEN-LAST:event_Text_PlacaBusActionPerformed

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed

        if (Text_Codigo.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa una Codigo");
            Text_Codigo.requestFocus();
            return;
        }
        if (Text_Precio.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa un Precio");
            Text_Precio.requestFocus();
            return;
        }
        if (Text_Salida.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa una ciudad de Salidad");
            Text_Salida.requestFocus();
            return;
        }
        if (Text_Destino.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa un Destino");
            Text_Destino.requestFocus();
            return;
        }

        if (Text_PlacaBus.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa un Numero de Placa");
            Text_PlacaBus.requestFocus();
            return;
        }

        Ruta ruta = new Ruta();
        FRuta func = new FRuta();

        ruta.setCodigo(Integer.parseInt(Text_Codigo.getText()));
        ruta.setBuses(Text_PlacaBus.getText());
        ruta.setDestino(Text_Destino.getText());
        ruta.setSalida(Text_Salida.getText());
        ruta.setPrecio(Integer.parseInt(Text_Precio.getText()));
       // ruta.setHorario(Time.valueOf(TimeChooeser.getFormatedTime()));
        ruta.setChofer(Integer.parseInt(Text_Chofer.getText()));

        if (accion.equals("guardar")) {
            if (func.insertar(ruta)) {
                System.out.println("Ruta registrado");   //mostrando registros
                mostrar("");

                inhabilitar();
            }

        } else if (accion.equals("editar")) {
            ruta.setCodigo(Integer.parseInt(Text_Codigo.getText()));
            ruta.setBuses(Text_PlacaBus.getText());
            ruta.setDestino(Text_Destino.getText());
            ruta.setSalida(Text_Salida.getText());
            ruta.setPrecio(Integer.parseInt(Text_Precio.getText()));
           // ruta.setHorario(Time.valueOf(TimeChooeser.getFormatedTime()));
            ruta.setChofer(Integer.parseInt(Text_Chofer.getText()));

            if (func.editar(ruta)) {
                System.out.println("Ruta editado");
                mostrar("");
                limpiarcampos();
                inhabilitar();

            }
        }

        habilitar();
        limpiarcampos();
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CancelarActionPerformed
        Btn_Guardar.setText("Guardar");
        accion = "guardar";
        limpiarcampos();
    }//GEN-LAST:event_Btn_CancelarActionPerformed

    private void Btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NuevoActionPerformed
        limpiarcampos();
        habilitar();
        Btn_Guardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_Btn_NuevoActionPerformed

    private void Tabla_ListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_ListadoMouseClicked
        Btn_Guardar.setText("Editar");
        accion = "editar";
        habilitar();
        Btn_Eliminar.setEnabled(true);

        int fila = Tabla_Listado.rowAtPoint(evt.getPoint());
        //venta.setFecha_De_Venta(new Date(a, m, d));
        Text_Codigo.setText(Tabla_Listado.getValueAt(fila, 0).toString());
        Text_Precio.setText(Tabla_Listado.getValueAt(fila, 1).toString());
        Text_Salida.setText(Tabla_Listado.getValueAt(fila, 2).toString());
        Text_Destino.setText(Tabla_Listado.getValueAt(fila, 3).toString());
      //  TimeChooeser.setTime(Time.valueOf(Tabla_Listado.getValueAt(fila,4).toString()));
        Text_PlacaBus.setText(Tabla_Listado.getValueAt(fila, 5).toString());
        Text_Chofer.setText(Tabla_Listado.getValueAt(fila, 6).toString());
        


    }//GEN-LAST:event_Tabla_ListadoMouseClicked

    private void jTextField_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_BuscarActionPerformed

    private void Btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarActionPerformed
        mostrar(jTextField_Buscar.getText());
    }//GEN-LAST:event_Btn_BuscarActionPerformed

    private void Btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EliminarActionPerformed
        if (!Text_Codigo.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Eliminar Ruta ?", "Confimar", 2);
            if (confirmacion == 0) {
                FRuta func = new FRuta();
                Ruta ruta = new Ruta();

                ruta.setCodigo(Integer.parseInt(Text_Codigo.getText()));
                func.eliminar(ruta);
                mostrar("");
                inhabilitar();

            }
        }
        limpiarcampos();
        Btn_Nuevo.setEnabled(true);
    }//GEN-LAST:event_Btn_EliminarActionPerformed

    private void Btn_BuscarBusesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarBusesActionPerformed
        Vista_BusesListado buseslistado = new Vista_BusesListado();
        buseslistado.toFront();
        buseslistado.setVisible(true);
    }//GEN-LAST:event_Btn_BuscarBusesActionPerformed

    private void Btn_ChoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ChoferActionPerformed
         Vista_ChoferesListado choferesListado = new Vista_ChoferesListado();
        choferesListado.toFront();
        choferesListado.setVisible(true);
    }//GEN-LAST:event_Btn_ChoferActionPerformed

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
            java.util.logging.Logger.getLogger(Vista_Ruta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Ruta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Ruta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Ruta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Ruta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Buscar;
    private javax.swing.JButton Btn_BuscarBuses;
    private javax.swing.JButton Btn_Cancelar;
    private javax.swing.JButton Btn_Chofer;
    private javax.swing.JButton Btn_Eliminar;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Nuevo;
    private javax.swing.JLabel Label_Clock;
    private javax.swing.JLabel Label_Destino;
    private javax.swing.JLabel Label_Money;
    private javax.swing.JLabel Label_Registros;
    private javax.swing.JTable Tabla_Listado;
    public static javax.swing.JTextField Text_Chofer;
    private javax.swing.JTextField Text_Codigo;
    private javax.swing.JTextField Text_Destino;
    public static javax.swing.JTextField Text_PlacaBus;
    private javax.swing.JTextField Text_Precio;
    private javax.swing.JTextField Text_Salida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Apellido;
    private javax.swing.JLabel jLabel_Cedula;
    private javax.swing.JLabel jLabel_Direccion;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_Salida;
    private javax.swing.JLabel jLabel_Tarjeta;
    private javax.swing.JLabel jLabel_Telefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField_Buscar;
    // End of variables declaration//GEN-END:variables
}
