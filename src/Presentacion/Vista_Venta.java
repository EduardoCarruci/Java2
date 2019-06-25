package Presentacion;

import Datos.Chofer;
import Datos.Venta;
import Logica.Conexion;
import Logica.FVenta;

import static Presentacion.Vista_Fecha.Text_Buscar;
import java.io.File;
import java.sql.Connection;
import java.sql.Date;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class Vista_Venta extends javax.swing.JInternalFrame {

    private String accion = "guardar";
    public static int IDUSER;

    public Vista_Venta() {
        initComponents();
        mostrar("");
        habilitar();
        this.setTitle("Registro de Ventas");
        Label_Moneyt.setIcon(new ImageIcon(getClass().getResource("/Files/if_Money-Increase_379342 (1).png")));
        User.setIcon(new ImageIcon(getClass().getResource("/Files/if_thumbnail_15546 (1).png")));
        Label_110.setIcon(new ImageIcon(getClass().getResource("/Files/if_sign-check_299110.png")));
    }

    void inhabilitar() {
        Text_Codigo.setEnabled(false);
        Text_Asiento.setEnabled(false);
        Text_Buscar.setEnabled(false);
        Text_Cliente.setEnabled(false);
        Text_TasadeSalida.setEnabled(false);
        Text_Empleado.setEnabled(false);
        Text_IVA.setEnabled(false);
        Text_NumerodeBus.setEnabled(false);
        Text_Ruta.setEnabled(false);
        Text_NumerodeBus.setEnabled(false);
        Text_Monto.setEnabled(false);

        Btn_Bus.setEnabled(false);
        Btn_Buscar.setEnabled(false);
        Btn_Cancelar.setEnabled(false);
        Btn_Cliente.setEnabled(false);
        Btn_Eliminar.setEnabled(false);
        Btn_Empleado.setEnabled(false);
        Btn_Guardar.setEnabled(false);
        Btn_Nuevo.setEnabled(false);
        Btn_Ruta.setEnabled(false);
        Date_FechaSalida.setEnabled(false);
        Date_FechadeVenta.setEnabled(false);

    }

    void habilitar() {
        Date_FechaSalida.setEnabled(true);
        Date_FechadeVenta.setEnabled(true);
        Text_Codigo.setEnabled(true);
        Text_Asiento.setEnabled(true);
        Text_Buscar.setEnabled(true);
        Text_Cliente.setEnabled(false);
        Text_Monto.setEnabled(false);
        Text_TasadeSalida.setEnabled(false);

        Text_Empleado.setEnabled(false);
        Text_IVA.setEnabled(false);

        Text_Ruta.setEnabled(false);
        Text_NumerodeBus.setEnabled(false);

        Btn_Bus.setEnabled(true);
        Btn_Buscar.setEnabled(true);
        Btn_Cancelar.setEnabled(true);
        Btn_Cliente.setEnabled(true);
        Btn_Eliminar.setEnabled(true);
        Btn_Empleado.setEnabled(true);
        Btn_Guardar.setEnabled(true);
        Btn_Nuevo.setEnabled(true);
        Btn_Ruta.setEnabled(true);

    }

    void limpiarcampos() {
        Text_Codigo.setText("");
        Text_Asiento.setText("");
        Text_Buscar.setText("");
        Text_Cliente.setText("");
        Text_TasadeSalida.setText("");
        Text_Empleado.setText("");
        Text_IVA.setText("");
        Text_NumerodeBus.setText("");
        Text_Ruta.setText("");
        Text_NumerodeBus.setText("");
        Text_Monto.setText("");
        Date_FechaSalida.setDate(null);
        Date_FechadeVenta.setDate(null);
    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            FVenta func = new FVenta();
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Listado = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        Btn_Buscar = new javax.swing.JButton();
        Btn_Eliminar = new javax.swing.JButton();
        Text_Buscar = new javax.swing.JTextField();
        Label_Registros = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        Label_110 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Btn_Nuevo = new javax.swing.JButton();
        Btn_Guardar = new javax.swing.JButton();
        Btn_Cancelar = new javax.swing.JButton();
        Text_Codigo = new javax.swing.JTextField();
        Date_FechadeVenta = new com.toedter.calendar.JDateChooser();
        Date_FechaSalida = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Text_Asiento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ComboBox_MedioPago = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Text_TasadeSalida = new javax.swing.JTextField();
        Text_IVA = new javax.swing.JTextField();
        Text_Empleado = new javax.swing.JTextField();
        Text_Cliente = new javax.swing.JTextField();
        Text_Ruta = new javax.swing.JTextField();
        Text_NumerodeBus = new javax.swing.JTextField();
        Btn_Ruta = new javax.swing.JButton();
        Btn_Bus = new javax.swing.JButton();
        Btn_Cliente = new javax.swing.JButton();
        Btn_Empleado = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        Text_Monto = new javax.swing.JTextField();
        Label_Moneyt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        Btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/22.png"))); // NOI18N
        Btn_Eliminar.setText("Borrar");
        Btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EliminarActionPerformed(evt);
            }
        });

        Label_Registros.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N

        User.setToolTipText("");
        User.setPreferredSize(new java.awt.Dimension(64, 64));

        Label_110.setPreferredSize(new java.awt.Dimension(32, 32));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/pdf.png"))); // NOI18N
        jButton1.setText("Generar Boleto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Text_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_Buscar)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_Eliminar)
                        .addGap(31, 31, 31)
                        .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Label_Registros, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Label_110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(20, 20, 20))))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(Btn_Buscar)
                                    .addComponent(Btn_Eliminar)
                                    .addComponent(Text_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Registros, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 39, -1, 522));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Codigo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 17, -1, -1));

        Btn_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_checkmark-g_86134.png"))); // NOI18N
        Btn_Nuevo.setText("Nuevo");
        Btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NuevoActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        Btn_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/24.png"))); // NOI18N
        Btn_Guardar.setText("Guardar");
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, -1, -1));

        Btn_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_cancel_10103.png"))); // NOI18N
        Btn_Cancelar.setText("Cancelar");
        Btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CancelarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, -1, -1));
        jPanel1.add(Text_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 14, 220, -1));
        jPanel1.add(Date_FechadeVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 45, 216, -1));
        jPanel1.add(Date_FechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 119, 216, -1));

        jLabel4.setText("Fecha Salida:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 125, -1, -1));

        jLabel5.setText("Asiento Asignado:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 86, -1, -1));

        jLabel6.setText("Fecha Venta:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 51, -1, -1));
        jPanel1.add(Text_Asiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 83, 216, -1));

        jLabel7.setText("Medio de Pago:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 160, -1, -1));

        ComboBox_MedioPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Debito", "Credito" }));
        jPanel1.add(ComboBox_MedioPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 157, 216, -1));

        jLabel8.setText("Tasa de Salida:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 198, -1, -1));

        jLabel10.setText("Iva:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel11.setText("Ruta");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel12.setText("Empleado:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel13.setText("Cliente");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel14.setText("Numero de Bus:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        Text_TasadeSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_TasadeSalidaActionPerformed(evt);
            }
        });
        jPanel1.add(Text_TasadeSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 90, -1));
        jPanel1.add(Text_IVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 240, 130, -1));
        jPanel1.add(Text_Empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 280, 100, -1));
        jPanel1.add(Text_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 330, 100, -1));
        jPanel1.add(Text_Ruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 360, 100, -1));
        jPanel1.add(Text_NumerodeBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 107, -1));

        Btn_Ruta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_map-marker_173052.png"))); // NOI18N
        Btn_Ruta.setText("Buscar Ruta");
        Btn_Ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RutaActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Ruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 140, 30));

        Btn_Bus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_bus_45270.png"))); // NOI18N
        Btn_Bus.setText("Buscar Bus");
        Btn_Bus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BusActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Bus, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 130, 30));

        Btn_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/23.png"))); // NOI18N
        Btn_Cliente.setText("Buscar Cliente");
        Btn_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ClienteActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, 30));

        Btn_Empleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/if_profiles-o_86379.png"))); // NOI18N
        Btn_Empleado.setText("Buscar Empleado");
        Btn_Empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, 40));

        jLabel15.setText("Monto:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        Text_Monto.setEditable(false);
        Text_Monto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_MontoActionPerformed(evt);
            }
        });
        jPanel1.add(Text_Monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 133, -1));

        Label_Moneyt.setPreferredSize(new java.awt.Dimension(64, 64));
        jPanel1.add(Label_Moneyt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 39, -1, 522));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Registro de Ventas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Listado de Ventas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 11, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tabla_ListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_ListadoMouseClicked
        Btn_Guardar.setText("Editar");
        accion = "editar";
        habilitar();
        Btn_Eliminar.setEnabled(true);
        //editar

        int fila = Tabla_Listado.rowAtPoint(evt.getPoint());

        Text_Codigo.setText(Tabla_Listado.getValueAt(fila, 0).toString());
        Date_FechadeVenta.setDate(Date.valueOf(Tabla_Listado.getValueAt(fila, 1).toString()));
        Text_Asiento.setText(Tabla_Listado.getValueAt(fila, 2).toString());
        Date_FechaSalida.setDate(Date.valueOf(Tabla_Listado.getValueAt(fila, 3).toString()));
        ComboBox_MedioPago.setSelectedItem(Tabla_Listado.getValueAt(fila, 4).toString());
        Text_TasadeSalida.setText(Tabla_Listado.getValueAt(fila, 5).toString());
        Text_IVA.setText(Tabla_Listado.getValueAt(fila, 6).toString());
        Text_Empleado.setText(Tabla_Listado.getValueAt(fila, 7).toString());
        Text_Cliente.setText(Tabla_Listado.getValueAt(fila, 8).toString());
        Text_Ruta.setText(Tabla_Listado.getValueAt(fila, 9).toString());
        Text_NumerodeBus.setText(Tabla_Listado.getValueAt(fila, 10).toString());
        Text_Monto.setText(Tabla_Listado.getValueAt(fila, 11).toString());

    }//GEN-LAST:event_Tabla_ListadoMouseClicked

    private void Btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarActionPerformed
        mostrar(Text_Buscar.getText());
    }//GEN-LAST:event_Btn_BuscarActionPerformed

    private void Btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EliminarActionPerformed
        if (!Text_Codigo.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Eliminar Venta ?", "Confimar", 2);
            if (confirmacion == 0) {
                FVenta func = new FVenta();
                Venta venta = new Venta();

                venta.setCodigo(Integer.parseInt(Text_Codigo.getText()));
                func.eliminar(venta);
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

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed

        if (Text_Codigo.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa un Codigo");
            Text_Codigo.requestFocus();
            return;
        }
        if (Text_Asiento.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa un Asiento");
            Text_Asiento.requestFocus();
            return;
        }
        if (Text_Cliente.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa un Cliente");
            Text_Cliente.requestFocus();
            return;
        }
        if (Text_Empleado.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa un Empleado");
            Text_Empleado.requestFocus();
            return;
        }
        if (Text_IVA.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa un iva");
            Text_IVA.requestFocus();
            return;
        }

        if (Text_NumerodeBus.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa un numero de Bus");
            Text_NumerodeBus.requestFocus();
            return;
        }
        if (Text_Ruta.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa una Ruta");
            Text_Ruta.requestFocus();
            return;
        }
        if (Text_TasadeSalida.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa una Tasa de Salida");
            Text_TasadeSalida.requestFocus();
            return;
        }
        if (Text_Monto.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa un monto");
            Text_Monto.requestFocus();
            return;
        }
        Venta venta = new Venta();
        FVenta func = new FVenta();

        Calendar cal;
        int d, m, a;
        cal = Date_FechaSalida.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR)-1900;

        venta.setFechaSalida(new Date(a, m, d));
        cal = Date_FechadeVenta.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR)-1900;

        venta.setFecha_De_Venta(new Date(a, m, d));

        int seleccionado = ComboBox_MedioPago.getSelectedIndex();
        venta.setMedio_De_Pago((String) ComboBox_MedioPago.getItemAt(seleccionado));
        venta.setCodigo(Integer.parseInt(Text_Codigo.getText()));
        venta.setAsiento_Asignado(Integer.parseInt(Text_Asiento.getText()));
        venta.setTasa_Salida(Integer.parseInt(Text_TasadeSalida.getText()));
        venta.setIVA(Integer.parseInt(Text_IVA.getText()));
        venta.setCliente(Integer.parseInt(Text_Cliente.getText()));
        venta.setRuta(Integer.parseInt(Text_Ruta.getText()));
        venta.setNumerodeBus(Text_NumerodeBus.getText());
        venta.setEmpleado(Integer.parseInt(Text_Empleado.getText()));

        venta.setMonto(Integer.parseInt(Text_Monto.getText()));

        if (accion.equals("guardar")) {
            if (func.insertar(venta)) {
                System.out.println("venta registrada");   //mostrando registros
                mostrar("");

                inhabilitar();
            }

        } else if (accion.equals("editar")) {
            venta.setCodigo(Integer.parseInt(Text_Codigo.getText()));
            venta.setEmpleado(Integer.parseInt(Text_Empleado.getText()));

            if (func.editar(venta)) {
                System.out.println("Venta editada");
                mostrar("");
                limpiarcampos();
                inhabilitar();

            }
        }

        habilitar();
        limpiarcampos();
        Btn_Guardar.setText("Guardar");
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CancelarActionPerformed
        limpiarcampos();
        Btn_Guardar.setText("Guardar");
    }//GEN-LAST:event_Btn_CancelarActionPerformed

    private void Btn_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ClienteActionPerformed
        Vista_ClienteListado clienteListado = new Vista_ClienteListado();
        clienteListado.toFront();
        clienteListado.setVisible(true);
    }//GEN-LAST:event_Btn_ClienteActionPerformed

    private void Btn_RutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RutaActionPerformed
        Vista_RutaListado rutaListado = new Vista_RutaListado();
        rutaListado.toFront();
        rutaListado.setVisible(true);
    }//GEN-LAST:event_Btn_RutaActionPerformed

    private void Btn_BusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BusActionPerformed
        Vista_BusesListado busesListado = new Vista_BusesListado();
        busesListado.toFront();
        busesListado.setVisible(true);
    }//GEN-LAST:event_Btn_BusActionPerformed

    private void Btn_EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EmpleadoActionPerformed
        Vista_EmpleadoListado EmpleadoListado = new Vista_EmpleadoListado();
        EmpleadoListado.toFront();
        EmpleadoListado.setVisible(true);
    }//GEN-LAST:event_Btn_EmpleadoActionPerformed

    private void Text_MontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_MontoActionPerformed

    }//GEN-LAST:event_Text_MontoActionPerformed

    private void Text_TasadeSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_TasadeSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_TasadeSalidaActionPerformed

    private Connection connection = new Conexion().conectar();
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Text_Buscar
        if (!Text_Buscar.getText().equals("")) {

            Map p = new HashMap();
          
            
            p.put("Codigo", Text_Buscar.getText());
            
            
            JasperReport report;
            JasperPrint print;
            try {
                report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                        + "/src/Reportes/Reporte_Boleto.jrxml");
                print = JasperFillManager.fillReport(report, p, connection);
                JasperViewer view = new JasperViewer(print, false);
                view.setTitle("Boleto");
                view.setVisible(true);
            } catch (JRException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Vista_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Bus;
    private javax.swing.JButton Btn_Buscar;
    private javax.swing.JButton Btn_Cancelar;
    private javax.swing.JButton Btn_Cliente;
    private javax.swing.JButton Btn_Eliminar;
    private javax.swing.JButton Btn_Empleado;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Nuevo;
    private javax.swing.JButton Btn_Ruta;
    private javax.swing.JComboBox<String> ComboBox_MedioPago;
    private com.toedter.calendar.JDateChooser Date_FechaSalida;
    private com.toedter.calendar.JDateChooser Date_FechadeVenta;
    private javax.swing.JLabel Label_110;
    private javax.swing.JLabel Label_Moneyt;
    private javax.swing.JLabel Label_Registros;
    private javax.swing.JTable Tabla_Listado;
    private javax.swing.JTextField Text_Asiento;
    private javax.swing.JTextField Text_Buscar;
    public static javax.swing.JTextField Text_Cliente;
    private javax.swing.JTextField Text_Codigo;
    public static javax.swing.JTextField Text_Empleado;
    public static javax.swing.JTextField Text_IVA;
    public static javax.swing.JTextField Text_Monto;
    public static javax.swing.JTextField Text_NumerodeBus;
    public static javax.swing.JTextField Text_Ruta;
    public static javax.swing.JTextField Text_TasadeSalida;
    private javax.swing.JLabel User;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    // End of variables declaration//GEN-END:variables
}
