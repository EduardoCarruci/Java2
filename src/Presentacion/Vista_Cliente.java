
package Presentacion;

import Datos.Cliente;
import Logica.FCliente;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Vista_Cliente extends javax.swing.JInternalFrame {

    public Vista_Cliente() {
        initComponents();
        mostrar("");
        habilitar();
        this.setTitle("Formulario Clientes");
        this.setResizable(false);
        Label_CARD.setIcon(new ImageIcon(getClass().getResource("/Files/card.png")));
        

    }

    private String accion = "guardar";

    
    void inhabilitar() {
        jText_Nombre.setEnabled(false);
        jText_Apellido.setEnabled(false);
        jText_Cedula.setEnabled(false);
        jText_Telefono.setEnabled(false);
        jTextField_Tarjeta.setEnabled(false);
        jTextDireccion.setEnabled(false);

        jButton_Eliminar.setEnabled(false);
        jButton_Nuevo.setEnabled(false);
        jButton_Buscar.setEnabled(false);

    }

    void habilitar() {
        jText_Nombre.setEnabled(true);
        jText_Apellido.setEnabled(true);
        jText_Cedula.setEnabled(true);
        jText_Telefono.setEnabled(true);
        jTextField_Tarjeta.setEnabled(true);
        jTextDireccion.setEnabled(true);

        jButton_Eliminar.setEnabled(true);
        jButton_Nuevo.setEnabled(true);
        jButton_Buscar.setEnabled(true);

    }

    void limpiarcampos() {
        jText_Nombre.setText("");
        jText_Apellido.setText("");
        jText_Cedula.setText("");
        jText_Telefono.setText("");
        jTextField_Tarjeta.setText("");
        jTextDireccion.setText("");
    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            FCliente func = new FCliente();
            modelo = func.mostrar(buscar);
            Tabla_listado.setModel(modelo);
            jLabel_totalregistros.setText("Total Registros: " + Integer.toString(func.totalregistros));

        } catch (Exception e) {
            System.out.println(e);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jText_Cedula = new javax.swing.JTextField();
        jLabel_Cedula = new javax.swing.JLabel();
        jLabel_Nombre = new javax.swing.JLabel();
        jLabel_Apellido = new javax.swing.JLabel();
        jText_Apellido = new javax.swing.JTextField();
        jText_Nombre = new javax.swing.JTextField();
        jLabel_Telefono = new javax.swing.JLabel();
        jText_Telefono = new javax.swing.JTextField();
        jLabel_Direccion = new javax.swing.JLabel();
        jLabel_Tarjeta = new javax.swing.JLabel();
        jTextField_Tarjeta = new javax.swing.JTextField();
        jComboBox_Tarjeta = new javax.swing.JComboBox<>();
        jButton_Guardar = new javax.swing.JButton();
        jButton_Cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextDireccion = new javax.swing.JTextArea();
        jButton_Nuevo = new javax.swing.JButton();
        Label_CARD = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_Salida = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_listado = new javax.swing.JTable();
        jTextField_Buscar = new javax.swing.JTextField();
        jButton_Buscar = new javax.swing.JButton();
        jButton_Eliminar = new javax.swing.JButton();
        jLabel_totalregistros = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel1.setText(" Registro - Cliente");

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jText_Cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_CedulaActionPerformed(evt);
            }
        });

        jLabel_Cedula.setText("Cedula:");

        jLabel_Nombre.setText("Nombre:");

        jLabel_Apellido.setText("Apellido:");

        jText_Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_ApellidoActionPerformed(evt);
            }
        });

        jText_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_NombreActionPerformed(evt);
            }
        });

        jLabel_Telefono.setText("Telefono:");

        jText_Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_TelefonoActionPerformed(evt);
            }
        });

        jLabel_Direccion.setText("Direccion:");

        jLabel_Tarjeta.setText("Numero de Tarjeta:");

        jTextField_Tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_TarjetaActionPerformed(evt);
            }
        });

        jComboBox_Tarjeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Credito", "Debito" }));

        jButton_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_mail_10119.png"))); // NOI18N
        jButton_Guardar.setText("Guardar");
        jButton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GuardarActionPerformed(evt);
            }
        });

        jButton_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_busy_59537.png"))); // NOI18N
        jButton_Cancelar.setText("Cancelar");
        jButton_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelarActionPerformed(evt);
            }
        });

        jTextDireccion.setColumns(20);
        jTextDireccion.setRows(5);
        jScrollPane1.setViewportView(jTextDireccion);

        jButton_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/10.png"))); // NOI18N
        jButton_Nuevo.setText("Nuevo");
        jButton_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NuevoActionPerformed(evt);
            }
        });

        Label_CARD.setPreferredSize(new java.awt.Dimension(32, 32));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Nombre)
                            .addComponent(jLabel_Apellido)
                            .addComponent(jLabel_Cedula))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_Cedula)
                            .addComponent(jText_Nombre)
                            .addComponent(jText_Apellido)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel_Telefono)
                            .addGap(13, 13, 13)
                            .addComponent(jText_Telefono))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel_Direccion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton_Nuevo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton_Guardar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton_Cancelar))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel_Tarjeta)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField_Tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox_Tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Label_CARD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Cedula))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Nombre)
                    .addComponent(jText_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Apellido)
                    .addComponent(jText_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_Telefono)
                    .addComponent(jText_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel_Direccion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_Tarjeta)
                        .addComponent(jTextField_Tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox_Tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Label_CARD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Guardar)
                    .addComponent(jButton_Cancelar)
                    .addComponent(jButton_Nuevo))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Listado"));

        jLabel_Salida.setText("Buscar:");

        Tabla_listado.setBackground(new java.awt.Color(102, 204, 255));
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
        });
        jScrollPane2.setViewportView(Tabla_listado);

        jTextField_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_BuscarActionPerformed(evt);
            }
        });

        jButton_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/11.png"))); // NOI18N
        jButton_Buscar.setText("Buscar");
        jButton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarActionPerformed(evt);
            }
        });

        jButton_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_cancel_10103.png"))); // NOI18N
        jButton_Eliminar.setText("Eliminar");
        jButton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel_Salida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Buscar)
                                .addGap(26, 26, 26)
                                .addComponent(jButton_Eliminar))
                            .addComponent(jLabel_totalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jButton_Buscar)
                    .addComponent(jButton_Eliminar))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_totalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel2.setText("Listado de Clientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_TarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_TarjetaActionPerformed
        jTextField_Tarjeta.transferFocus();
    }//GEN-LAST:event_jTextField_TarjetaActionPerformed

    private void jTextField_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_BuscarActionPerformed

    private void jButton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GuardarActionPerformed
        
        if (jText_Cedula.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa una Cedula");
            jText_Cedula.requestFocus();
            return;
        }
        if (jText_Nombre.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa un Nombre");
            jText_Nombre.requestFocus();
            return;
        }
        if (jText_Apellido.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa un Apellido");
            jText_Apellido.requestFocus();
            return;
        }
        if (jText_Telefono.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa un Telefono");
            jText_Telefono.requestFocus();
            return;
        }
        if (jTextDireccion.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa una Direccion");
            jTextDireccion.requestFocus();
            return;
        }
        if (jTextField_Tarjeta.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa un Numero de Tarjeta");
            jTextField_Tarjeta.requestFocus();
            return;
        }

        Cliente cliente = new Cliente();
        FCliente func = new FCliente();

        
        cliente.setCedula(Integer.parseInt(jText_Cedula.getText()));

        int seleccionado = jComboBox_Tarjeta.getSelectedIndex();
        cliente.setTipoTarjeta((String) jComboBox_Tarjeta.getItemAt(seleccionado));

        cliente.setTarjeta(jTextField_Tarjeta.getText());
        cliente.setDireccion(jTextDireccion.getText());
        cliente.setApellido(jText_Apellido.getText());
        cliente.setNombre(jText_Nombre.getText());
        cliente.setTelefono(jText_Telefono.getText());

        if (accion.equals("guardar")) {
            if (func.insertar(cliente)) {
                System.out.println("Cliente registrado");   
                mostrar("");

                inhabilitar();
            }

        } else if (accion.equals("editar")) {
            cliente.setCedula(Integer.parseInt(jText_Cedula.getText()));
            cliente.setNombre(jText_Nombre.getText());
            cliente.setApellido(jText_Apellido.getText());
            cliente.setTelefono(jText_Telefono.getText());
            cliente.setDireccion(jTextDireccion.getText());
            cliente.setTarjeta(jTextField_Tarjeta.getText());
            cliente.setTipoTarjeta(jComboBox_Tarjeta.getItemAt(seleccionado));

            if (func.editar(cliente)) {
                System.out.println("Cliente editado");
                mostrar("");
                limpiarcampos();
                inhabilitar();

            }
        }

    habilitar();
    limpiarcampos();
    }//GEN-LAST:event_jButton_GuardarActionPerformed

    private void jButton_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelarActionPerformed
    jButton_Guardar.setText("Guardar");
    accion = "guardar";
    limpiarcampos();
    }//GEN-LAST:event_jButton_CancelarActionPerformed

    private void jButton_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NuevoActionPerformed
        limpiarcampos();
        habilitar();
        jButton_Guardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_jButton_NuevoActionPerformed

    private void jButton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EliminarActionPerformed
        if (!jText_Cedula.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Eliminar Cliente ?", "Confimar", 2);
            if (confirmacion == 0) {
                FCliente func = new FCliente();
                Cliente cliente = new Cliente();

                cliente.setCedula(Integer.parseInt(jText_Cedula.getText()));
                func.eliminar(cliente);
                mostrar("");
                inhabilitar();

            }
        }
        limpiarcampos();
        jButton_Nuevo.setEnabled(true);
    }//GEN-LAST:event_jButton_EliminarActionPerformed

    private void jButton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarActionPerformed
        mostrar(jTextField_Buscar.getText());
    }//GEN-LAST:event_jButton_BuscarActionPerformed

    private void jText_CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_CedulaActionPerformed
        jText_Cedula.transferFocus();
    }//GEN-LAST:event_jText_CedulaActionPerformed

    private void jText_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_NombreActionPerformed
        jText_Nombre.transferFocus();
    }//GEN-LAST:event_jText_NombreActionPerformed

    private void jText_ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_ApellidoActionPerformed
        jText_Apellido.transferFocus();
    }//GEN-LAST:event_jText_ApellidoActionPerformed

    private void jText_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_TelefonoActionPerformed
        jText_Telefono.transferFocus();
    }//GEN-LAST:event_jText_TelefonoActionPerformed

    private void Tabla_listadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_listadoMouseClicked
        jButton_Guardar.setText("Editar");
        accion = "editar";
        habilitar();
        jButton_Eliminar.setEnabled(true);
        //editar

        //donde hice click 
        int fila = Tabla_listado.rowAtPoint(evt.getPoint());

        jText_Cedula.setText(Tabla_listado.getValueAt(fila, 0).toString());
        jText_Nombre.setText(Tabla_listado.getValueAt(fila, 1).toString());
        jText_Apellido.setText(Tabla_listado.getValueAt(fila, 2).toString());
        // jComboBox_Tarjeta.setSelectedItem(Tabla_listado.getValueAt(fila, 3).toString());
        jTextDireccion.setText(Tabla_listado.getValueAt(fila, 3).toString());
        jText_Telefono.setText(Tabla_listado.getValueAt(fila, 3).toString());
        jTextField_Tarjeta.setText(Tabla_listado.getValueAt(fila, 5).toString());
        jComboBox_Tarjeta.setSelectedItem(Tabla_listado.getValueAt(fila, 6));


    }//GEN-LAST:event_Tabla_listadoMouseClicked

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
            java.util.logging.Logger.getLogger(Vista_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_CARD;
    private javax.swing.JTable Tabla_listado;
    private javax.swing.JButton jButton_Buscar;
    private javax.swing.JButton jButton_Cancelar;
    private javax.swing.JButton jButton_Eliminar;
    private javax.swing.JButton jButton_Guardar;
    private javax.swing.JButton jButton_Nuevo;
    private javax.swing.JComboBox<String> jComboBox_Tarjeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Apellido;
    private javax.swing.JLabel jLabel_Cedula;
    private javax.swing.JLabel jLabel_Direccion;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_Salida;
    private javax.swing.JLabel jLabel_Tarjeta;
    private javax.swing.JLabel jLabel_Telefono;
    private javax.swing.JLabel jLabel_totalregistros;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextDireccion;
    private javax.swing.JTextField jTextField_Buscar;
    private javax.swing.JTextField jTextField_Tarjeta;
    private javax.swing.JTextField jText_Apellido;
    private javax.swing.JTextField jText_Cedula;
    private javax.swing.JTextField jText_Nombre;
    private javax.swing.JTextField jText_Telefono;
    // End of variables declaration//GEN-END:variables
}
