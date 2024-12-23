/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import javax.swing.JFrame;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static main.AdminPageProduk.viewProduk;
import static main.AdminPageUser.viewData;
/**
 *
 * @author ASUS
 */
public class KasirPembelian extends javax.swing.JFrame {

    /**
     * Creates new form KasirPembelian
     */
    public KasirPembelian() {
        initComponents();
        setLocationRelativeTo(null); // Posisikan jendela di tengah layar
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Atur jendela menjadi full screen
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtCariProduk = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelNota = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnRemove1 = new javax.swing.JButton();
        txtJumlah1 = new javax.swing.JTextField();
        txtJumlah2 = new javax.swing.JTextField();
        txtKembalian = new javax.swing.JTextField();
        btnRemove2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelKeranjang = new javax.swing.JTable();
        btnBayar = new javax.swing.JButton();
        txtBayar = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        btnRemove3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PEMBELIAN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 518, 24, 471);
        jPanel2.add(jLabel1, gridBagConstraints);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 60));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cari Produk");

        txtCariProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariProdukActionPerformed(evt);
            }
        });
        txtCariProduk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariProdukKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtCariProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(896, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCariProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1290, 70));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Bayar");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("NOTA");

        jSpinner1.setModel(new javax.swing.SpinnerDateModel());
        jSpinner1.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner1, "dd-MMM-yyyy"));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Tanggal");

        TabelNota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NAMA PRODUK", "JUMLAH", "HARGA"
            }
        ));
        jScrollPane3.setViewportView(TabelNota);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Total");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Bayar");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Kembalian");

        btnRemove1.setBackground(new java.awt.Color(102, 102, 255));
        btnRemove1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnRemove1.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove1.setText("Kembali");
        btnRemove1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemove1ActionPerformed(evt);
            }
        });

        txtJumlah1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtJumlah1KeyReleased(evt);
            }
        });

        txtJumlah2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtJumlah2KeyReleased(evt);
            }
        });

        txtKembalian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKembalianKeyReleased(evt);
            }
        });

        btnRemove2.setBackground(new java.awt.Color(102, 102, 255));
        btnRemove2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnRemove2.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove2.setText("Cetak Nota");
        btnRemove2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemove2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtJumlah2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGap(95, 95, 95)
                                    .addComponent(txtJumlah1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(211, 211, 211))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btnRemove2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemove1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJumlah1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJumlah2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemove1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 470, 570));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Keranjang");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        TabelKeranjang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "KODE PRODUK", "NAMA PRODUK", "JUMLAH", "HARGA"
            }
        ));
        jScrollPane1.setViewportView(TabelKeranjang);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 740, 320));

        btnBayar.setBackground(new java.awt.Color(102, 102, 255));
        btnBayar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnBayar.setForeground(new java.awt.Color(255, 255, 255));
        btnBayar.setText("Bayar");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });
        jPanel4.add(btnBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 110, 40));

        txtBayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBayarKeyReleased(evt);
            }
        });
        jPanel4.add(txtBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 230, 40));

        txtTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTotalKeyReleased(evt);
            }
        });
        jPanel4.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 230, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Total");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, 40));

        btnRemove.setBackground(new java.awt.Color(102, 102, 255));
        btnRemove.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove.setText("Checkout");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel4.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 110, 40));

        btnRemove3.setBackground(new java.awt.Color(102, 102, 255));
        btnRemove3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnRemove3.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove3.setText("Remove");
        btnRemove3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemove3ActionPerformed(evt);
            }
        });
        jPanel4.add(btnRemove3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 110, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1290, 570));

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

    private void txtCariProdukKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariProdukKeyReleased
        
    }//GEN-LAST:event_txtCariProdukKeyReleased

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        try {
            int total = Integer.parseInt(txtTotal.getText());
            int bayar = Integer.parseInt(txtBayar.getText());

            if (bayar < total) {
                JOptionPane.showMessageDialog(this, "Uang yang dibayarkan tidak mencukupi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
            }

            int kembalian = bayar - total;


            txtKembalian.setText(String.valueOf(kembalian));


            DefaultTableModel modelNota = (DefaultTableModel) TabelNota.getModel();
            DefaultTableModel modelKeranjang = (DefaultTableModel) TabelKeranjang.getModel();


            for (int i = 0; i < modelKeranjang.getRowCount(); i++) {
                String namaProduk = modelKeranjang.getValueAt(i, 0).toString();
                String jumlah = modelKeranjang.getValueAt(i, 1).toString();
                String subtotal = modelKeranjang.getValueAt(i, 2).toString();


                Object[] row = {new java.util.Date(), namaProduk, jumlah, subtotal};
                modelNota.addRow(row);


                Transaksi.saveTransaksi(namaProduk, Integer.parseInt(jumlah), Integer.parseInt(subtotal), total, bayar, kembalian);
            }
        
            JOptionPane.showMessageDialog(this, "Pembayaran berhasil! Kembalian: " + kembalian, "Info", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid untuk total atau bayar!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBayarActionPerformed

    private void txtBayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBayarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBayarKeyReleased

    private void txtTotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalKeyReleased

    private void btnRemove1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemove1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemove1ActionPerformed

    private void txtJumlah1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJumlah1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlah1KeyReleased

    private void txtJumlah2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJumlah2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlah2KeyReleased

    private void txtKembalianKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKembalianKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKembalianKeyReleased

    private void btnRemove2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemove2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemove2ActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int selectedRow = TabelKeranjang.getSelectedRow();

        if (selectedRow != -1) { 
            DefaultTableModel Keranjang = (DefaultTableModel) TabelKeranjang.getModel();
            Keranjang.removeRow(selectedRow);

            updateTotal();

            JOptionPane.showMessageDialog(null, "Produk berhasil dihapus dari keranjang!", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Pilih produk yang ingin dihapus dari keranjang!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnRemove3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemove3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemove3ActionPerformed

    private void txtCariProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariProdukActionPerformed
        String kode = txtCariProduk.getText();

        DataProduk P = searchByPCode(kode);
        if (P == null) {
            //berikan pesan bahwa produk tidak ditemukan
        } else {
            //tambahkan ke keranjang belanja
            //cek apakah produk sudah ada di keranjang
            DefaultTableModel model = (DefaultTableModel) TabelKeranjang.getModel();

            int row = TabelKeranjang.getRowCount();
            if (row > 0) {
                //cek data
                boolean ada = false;
                int QTY = 0;
                int baris = 0;
                for (int i = 0; i < row; i++) {
                    String TCode = TabelKeranjang.getValueAt(i, 0).toString();
                    if (TCode.equals(kode)) {
                        ada = true;
                        QTY = Integer.parseInt(TabelKeranjang.getValueAt(i, 2).toString()) + 1;
                        baris = i;
                        break;
                    }
                }

                if (ada) {
                    //jika ditemukan di keranjang
                    TabelKeranjang.setValueAt(QTY, baris, 2);
                } else {
                    //jika tidak ditemukan di keranjang
                    Object[] produk = {
                        P.getKode_Produk(),
                        P.getNama_Produk(),
                        1,
                        P.getHarga_Jual()
                    };
                    model.addRow(produk);
                }
                txtCariProduk.setText("");
                txtCariProduk.requestFocus();
            } else {
                Object[] produk = {
                    P.getKode_Produk(),
                    P.getNama_Produk(),
                    1,
                    P.getHarga_Jual()
                };
                model.addRow(produk);
                txtCariProduk.setText("");
                txtCariProduk.requestFocus();
            }

        }
    }//GEN-LAST:event_txtCariProdukActionPerformed

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
            java.util.logging.Logger.getLogger(KasirPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KasirPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KasirPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KasirPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KasirPembelian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelKeranjang;
    private javax.swing.JTable TabelNota;
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnRemove1;
    private javax.swing.JButton btnRemove2;
    private javax.swing.JButton btnRemove3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JTextField txtCariProduk;
    private javax.swing.JTextField txtJumlah1;
    private javax.swing.JTextField txtJumlah2;
    private javax.swing.JTextField txtKembalian;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
    

    public void viewTransaksi() {
        String sql = "SELECT * FROM transaksi";
    
        try (Connection K = Koneksi.conn();
            Statement S = K.createStatement();
            ResultSet R = S.executeQuery(sql)) {

            DefaultTableModel model = (DefaultTableModel) TabelNota.getModel();
            while (R.next()) {
                String tanggalTransaksi = R.getString("tanggal_transaksi");
                String namaProduk = R.getString("nama_produk");
                int jumlah = R.getInt("jumlah");
                int subtotal = R.getInt("subtotal");

                Object[] row = {tanggalTransaksi, namaProduk, jumlah, subtotal};
                model.addRow(row);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat memuat transaksi.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void updateTotal() {
        DefaultTableModel Keranjang = (DefaultTableModel) TabelKeranjang.getModel();
        int total = 0;

        for (int i = 0; i < Keranjang.getRowCount(); i++) {
            try {
                int subtotal = Integer.parseInt(Keranjang.getValueAt(i, 2).toString()); // Kolom Subtotal
                total += subtotal; // Tambahkan ke total
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ada nilai subtotal yang tidak valid", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Keluar dari method jika ada error
            }
        }
        txtTotal.setText(String.valueOf(total));
    }

    private DataProduk searchByPCode(String kode) {
         try {
            Connection K = Koneksi.conn();
            Statement S = K.createStatement();
            String Q = "SELECT * FROM produk WHERE kode_produk='" + kode + "'";
            ResultSet R = S.executeQuery(Q);
            DataProduk P = null;
            while (R.next()) {
                P = new DataProduk();
                int id = R.getInt("id");
                String kode_produk = R.getString("kode_produk");
                String nama_produk = R.getString("nama_produk"); 
                String gambar_produk = R.getString("gambar_produk");  
                String kategori_produk = R.getString("kategori_produk");
                String supplier = R.getString("supplier");
                String harga_jual = R.getString("harga_jual");
                String harga_beli = R.getString("harga_beli");
                String stok_produk = R.getString("stok_produk");
                P.setId(id);
                P.setKode_Produk(kode_produk);
                P.setNama_Produk(nama_produk);
                P.setGambar_Produk(gambar_produk);
                P.setKategori_Produk(kategori_produk);
                P.setSupplier(supplier);
                P.setHarga_Jual(harga_jual);
                P.setHarga_Beli(harga_beli);
                P.setStok_Produk(stok_produk);
            }
            return P;

        } catch (SQLException e) {
        }

        return null;
        
    }

    
}
