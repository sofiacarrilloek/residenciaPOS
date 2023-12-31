/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import java.awt.Color;
import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author sofia
 */
public class Clientes extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
         Color  btnColorEntered= new Color(152,82,87);
         Color btnColorExit = new Color(193,142,151);
        
    public Clientes() {
        this.setExtendedState(MAXIMIZED_BOTH);
        // Establece el comportamiento al cerrar la ventana
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        // Agrega un WindowListener para interceptar el evento de cierre
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                confirmarCierre();
            }
        });
        initComponents();
    }


    private void confirmarCierre() {   
                 cerrarPrograma a = new cerrarPrograma();
                 a.setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        panelBackground = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        btnApartados1 = new javax.swing.JButton();
        btnProductos2 = new javax.swing.JButton();
        btnProductos3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_clientes = new javax.swing.JTable();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnApartados = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnClientes1 = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnProductos1 = new javax.swing.JButton();
        btnCorte = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBackground.setBackground(new java.awt.Color(255, 255, 255));
        panelBackground.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        panelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(191, 130, 135));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("IMAGEN");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 300, 60));

        jLabel2.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Punto de venta");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 450, 80));

        panelBackground.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30000, 80));

        jPanel3.setBackground(new java.awt.Color(246, 221, 223));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Teléfono:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Calificación");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Nombre:");

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        btnApartados1.setBackground(new java.awt.Color(193, 142, 151));
        btnApartados1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnApartados1.setForeground(new java.awt.Color(255, 255, 255));
        btnApartados1.setText("Nuevo");
        btnApartados1.setBorderPainted(false);
        btnApartados1.setFocusPainted(false);
        btnApartados1.setFocusable(false);
        btnApartados1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnApartados1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnApartados1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnApartados1MouseExited(evt);
            }
        });
        btnApartados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApartados1ActionPerformed(evt);
            }
        });

        btnProductos2.setBackground(new java.awt.Color(193, 142, 151));
        btnProductos2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnProductos2.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos2.setText("Editar");
        btnProductos2.setBorderPainted(false);
        btnProductos2.setFocusPainted(false);
        btnProductos2.setFocusable(false);
        btnProductos2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductos2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProductos2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProductos2MouseExited(evt);
            }
        });
        btnProductos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductos2ActionPerformed(evt);
            }
        });

        btnProductos3.setBackground(new java.awt.Color(193, 142, 151));
        btnProductos3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnProductos3.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos3.setText("Eliminar");
        btnProductos3.setBorderPainted(false);
        btnProductos3.setFocusPainted(false);
        btnProductos3.setFocusable(false);
        btnProductos3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductos3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProductos3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProductos3MouseExited(evt);
            }
        });
        btnProductos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductos3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(46, 46, 46)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(41, 41, 41)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(21, 21, 21)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnApartados1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProductos2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProductos3)))
                .addContainerGap(467, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApartados1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProductos2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProductos3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(424, Short.MAX_VALUE))
        );

        panelBackground.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, 1040, 710));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(630, 2000));

        tabla_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Teléfono", "Nombre", "Calificación"
            }
        ));
        tabla_clientes.setGridColor(new java.awt.Color(89, 89, 89));
        tabla_clientes.setSelectionBackground(new java.awt.Color(255, 153, 153));
        jScrollPane1.setViewportView(tabla_clientes);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Buscar:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1428, Short.MAX_VALUE))
        );

        panelBackground.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 770, 2030));

        jLabel7.setBackground(new java.awt.Color(89, 89, 89));
        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("       Administración de clientes");
        jLabel7.setOpaque(true);
        panelBackground.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1540, 30));

        jPanel2.setBackground(new java.awt.Color(237, 191, 194));

        btnApartados.setBackground(new java.awt.Color(193, 142, 151));
        btnApartados.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnApartados.setForeground(new java.awt.Color(255, 255, 255));
        btnApartados.setText("Apartados");
        btnApartados.setBorderPainted(false);
        btnApartados.setFocusPainted(false);
        btnApartados.setFocusable(false);
        btnApartados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnApartadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnApartadosMouseExited(evt);
            }
        });
        btnApartados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApartadosActionPerformed(evt);
            }
        });

        btnVentas.setBackground(new java.awt.Color(193, 142, 151));
        btnVentas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnVentas.setText("Ventas");
        btnVentas.setBorderPainted(false);
        btnVentas.setFocusPainted(false);
        btnVentas.setFocusable(false);
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVentasMouseExited(evt);
            }
        });
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        btnClientes1.setBackground(new java.awt.Color(155, 82, 87));
        btnClientes1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnClientes1.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes1.setText("Clientes");
        btnClientes1.setBorderPainted(false);
        btnClientes1.setFocusPainted(false);
        btnClientes1.setFocusable(false);

        btnInventario.setBackground(new java.awt.Color(193, 142, 151));
        btnInventario.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnInventario.setForeground(new java.awt.Color(255, 255, 255));
        btnInventario.setText("Inventario");
        btnInventario.setBorderPainted(false);
        btnInventario.setFocusPainted(false);
        btnInventario.setFocusable(false);
        btnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInventarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInventarioMouseExited(evt);
            }
        });
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });

        btnProductos1.setBackground(new java.awt.Color(193, 142, 151));
        btnProductos1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnProductos1.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos1.setText("Productos");
        btnProductos1.setBorderPainted(false);
        btnProductos1.setFocusPainted(false);
        btnProductos1.setFocusable(false);
        btnProductos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProductos1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProductos1MouseExited(evt);
            }
        });
        btnProductos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductos1ActionPerformed(evt);
            }
        });

        btnCorte.setBackground(new java.awt.Color(193, 142, 151));
        btnCorte.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnCorte.setForeground(new java.awt.Color(255, 255, 255));
        btnCorte.setText("Corte");
        btnCorte.setBorderPainted(false);
        btnCorte.setFocusPainted(false);
        btnCorte.setFocusable(false);
        btnCorte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCorteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCorteMouseExited(evt);
            }
        });
        btnCorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorteActionPerformed(evt);
            }
        });

        btnReporte.setBackground(new java.awt.Color(193, 142, 151));
        btnReporte.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnReporte.setForeground(new java.awt.Color(255, 255, 255));
        btnReporte.setText("Reportes");
        btnReporte.setBorderPainted(false);
        btnReporte.setFocusPainted(false);
        btnReporte.setFocusable(false);
        btnReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReporteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReporteMouseExited(evt);
            }
        });
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClientes1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnApartados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProductos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInventario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCorte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReporte)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApartados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProductos1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCorte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelBackground.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 2000, 50));

        getContentPane().add(panelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 3000, 3000));

        setBounds(0, 0, 1510, 771);
    }// </editor-fold>//GEN-END:initComponents

    private void btnApartados1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApartados1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnApartados1MouseClicked

    private void btnApartados1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApartados1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnApartados1MouseEntered

    private void btnApartados1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApartados1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnApartados1MouseExited

    private void btnApartados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApartados1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnApartados1ActionPerformed

    private void btnProductos2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductos2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductos2MouseClicked

    private void btnProductos2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductos2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductos2MouseEntered

    private void btnProductos2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductos2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductos2MouseExited

    private void btnProductos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductos2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductos2ActionPerformed

    private void btnProductos3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductos3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductos3MouseClicked

    private void btnProductos3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductos3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductos3MouseEntered

    private void btnProductos3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductos3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductos3MouseExited

    private void btnProductos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductos3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductos3ActionPerformed

    private void btnApartadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApartadosMouseEntered
        // TODO add your handling code here:
        btnApartados.setBackground(btnColorEntered);
    }//GEN-LAST:event_btnApartadosMouseEntered

    private void btnApartadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApartadosMouseExited
        // TODO add your handling code heres:
        btnApartados.setBackground(btnColorExit);
    }//GEN-LAST:event_btnApartadosMouseExited

    private void btnApartadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApartadosActionPerformed
        // TODO add your handling code here:
        apartados a = new apartados();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnApartadosActionPerformed

    private void btnVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseEntered
        // TODO add your handling code here:
        btnVentas.setBackground(btnColorEntered);
    }//GEN-LAST:event_btnVentasMouseEntered

    private void btnVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseExited
        // TODO add your handling code here:
        btnVentas.setBackground(btnColorExit);
    }//GEN-LAST:event_btnVentasMouseExited

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        // TODO add your handling code here:
        dashboard a = new dashboard();
        a.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnInventarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMouseEntered
        // TODO add your handling code here:
        btnInventario.setBackground(btnColorEntered);
    }//GEN-LAST:event_btnInventarioMouseEntered

    private void btnInventarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMouseExited
        // TODO add your handling code here:
        btnInventario.setBackground(btnColorExit);
    }//GEN-LAST:event_btnInventarioMouseExited

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        // TODO add your handling code here:
        inventario inv = new inventario();
        inv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnProductos1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductos1MouseEntered
        // TODO add your handling code here:
        btnProductos1.setBackground(btnColorEntered);
    }//GEN-LAST:event_btnProductos1MouseEntered

    private void btnProductos1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductos1MouseExited
        // TODO add your handling code here:
        btnProductos1.setBackground(btnColorExit);
    }//GEN-LAST:event_btnProductos1MouseExited

    private void btnProductos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductos1ActionPerformed
        // TODO add your handling code here:
        productos pro = new productos();
        pro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnProductos1ActionPerformed

    private void btnCorteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCorteMouseEntered
        // TODO add your handling code here:
        btnCorte.setBackground(btnColorEntered);
    }//GEN-LAST:event_btnCorteMouseEntered

    private void btnCorteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCorteMouseExited
        // TODO add your handling code here:
        btnCorte.setBackground(btnColorExit);
    }//GEN-LAST:event_btnCorteMouseExited

    private void btnCorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorteActionPerformed
        // TODO add your handling code here:
        corte cort = new corte();
        cort.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCorteActionPerformed

    private void btnReporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteMouseEntered
        // TODO add your handling code here:
        btnReporte.setBackground(btnColorEntered);
    }//GEN-LAST:event_btnReporteMouseEntered

    private void btnReporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteMouseExited
        // TODO add your handling code here:
        btnReporte.setBackground(btnColorExit);
    }//GEN-LAST:event_btnReporteMouseExited

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        // TODO add your handling code here:
        reportes rep = new reportes();
        rep.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnReporteActionPerformed

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApartados;
    private javax.swing.JButton btnApartados1;
    private javax.swing.JButton btnClientes1;
    private javax.swing.JButton btnCorte;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnProductos1;
    private javax.swing.JButton btnProductos2;
    private javax.swing.JButton btnProductos3;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JTable tabla_clientes;
    // End of variables declaration//GEN-END:variables
}
