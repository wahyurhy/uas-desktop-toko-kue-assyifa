/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.assyifacake.views.MenuUtama;

import com.assyifacake.views.Login.*;
import com.assyifacake.views.Produk.AturProdukInternalView;
import com.assyifacake.views.Produk.DaftarPembeliInternalView;
import com.assyifacake.views.Produk.DetailProdukInternalView;
import com.assyifacake.views.Produk.LihatProdukInternalView;
import com.assyifacake.views.Resep.LihatResepInternalView;
import com.assyifacake.views.Resep.DetailResepInternalView;
import com.assyifacake.views.Resep.AturResepInternalView;
import com.assyifacake.views.Transaksi.DetailTransaksiInternalView;
import com.assyifacake.views.Transaksi.LihatTransaksiInternalView;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author hp
 */
public class MenuUtamaView extends javax.swing.JFrame {

    /**
     * Creates new form LoginView
     */
    private final JPopupMenu popupProduk = new JPopupMenu();
    private final JPopupMenu popupResep = new JPopupMenu();
    private final JPopupMenu popupTransaksi = new JPopupMenu();
    private final JPopupMenu popupUser = new JPopupMenu();
    private JMenuItem menuItem = null;
    
    public MenuUtamaView() {
        initComponents();
        
//        Produk
//        LihatProdukInternalView lpiv = new LihatProdukInternalView();
//        panel.add(lpiv); 
//        Dimension desktopSize = panel.getSize();
//        Dimension jInternalFrameSize = lpiv.getSize();
//        lpiv.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
//        (desktopSize.height- jInternalFrameSize.height)/2);
//        lpiv.setVisible(true);
        
//        AturProdukInternalView apiv = new AturProdukInternalView();
//        panel.add(apiv);
//        Dimension desktopSize = panel.getSize();
//        Dimension jInternalFrameSize = apiv.getSize();
//        apiv.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
//        (desktopSize.height- jInternalFrameSize.height)/2);
//        apiv.setVisible(true);
        
//        DetailProdukInternalView dpiv = new DetailProdukInternalView();
//        panel.add(dpiv);
//        Dimension desktopSize = panel.getSize();
//        Dimension jInternalFrameSize = dpiv.getSize();
//        dpiv.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
//        (desktopSize.height- jInternalFrameSize.height)/2);
//        dpiv.setVisible(true);

//        Resep
//          LihatResepInternalView lriv = new LihatResepInternalView();
//          panel.add(lriv); 
//          Dimension desktopSize = panel.getSize();
//          Dimension jInternalFrameSize = lriv.getSize();
//          lriv.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
//          (desktopSize.height- jInternalFrameSize.height)/2);
//          lriv.setVisible(true);
        
//        AturResepInternalView ariv = new AturResepInternalView();
//        panel.add(ariv);
//        Dimension desktopSize = panel.getSize();
//        Dimension jInternalFrameSize = ariv.getSize();
//        ariv.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
//        (desktopSize.height- jInternalFrameSize.height)/2);
//        ariv.setVisible(true);
        
//        DetailResepInternalView driv = new DetailResepInternalView();
//        panel.add(driv);
//        Dimension desktopSize = panel.getSize();
//        Dimension jInternalFrameSize = driv.getSize();
//        driv.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
//        (desktopSize.height- jInternalFrameSize.height)/2);
//        driv.setVisible(true);

//        Transaksi
//        LihatTransaksiInternalView ltiv = new LihatTransaksiInternalView();
//        panel.add(ltiv); 
//        Dimension desktopSize = panel.getSize();
//        Dimension jInternalFrameSize = ltiv.getSize();
//        ltiv.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
//        (desktopSize.height- jInternalFrameSize.height)/2);
//        ltiv.setVisible(true);
        
//        AturTransaksiInternalView ativ = new AturTransaksiInternalView();
//        panel.add(ativ);
//        Dimension desktopSize = panel.getSize();
//        Dimension jInternalFrameSize = ativ.getSize();
//        ativ.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
//        (desktopSize.height- jInternalFrameSize.height)/2);
//        ativ.setVisible(true);
        
//        DetailTransaksiInternalView dtiv = new DetailTransaksiInternalView();
//        panel.add(dtiv);
//        Dimension desktopSize = panel.getSize();
//        Dimension jInternalFrameSize = dtiv.getSize();
//        dtiv.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
//        (desktopSize.height- jInternalFrameSize.height)/2);
//        dtiv.setVisible(true);

        DaftarPembeliInternalView dpiv = new DaftarPembeliInternalView();
        panel.add(dpiv); 
        Dimension desktopSize = panel.getSize();
        Dimension jInternalFrameSize = dpiv.getSize();
        dpiv.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
        (desktopSize.height- jInternalFrameSize.height)/2);
        dpiv.setVisible(true);

//        // user image
//        JLabel userIc;
//        setSize(40, 40);
//        setLayout(null);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        ImageIcon imgUserIc = new ImageIcon("src/main/java/com/assyifacake/resources/img/ic_user.png");
//        
//        userIc = new JLabel("", imgUserIc, JLabel.CENTER);
//        userIc.setBounds(700,10,40,40);
//        add(userIc);
        
        // bg image
        JLabel background;
        setSize(770, 540);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon(getClass().getResource("/img/bg_dark.png"));
        
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0,0,770,540);
        add(background);
        setVisible(true);
        
        // Call Our Method
        createPopupProduk(this);
        createPopupResep(this);
        createPopupTransaksi(this);
        createPopupUser(this);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JDesktopPane();
        produkNavTF = new javax.swing.JLabel();
        resepNavTF = new javax.swing.JLabel();
        transaksiNavTF = new javax.swing.JLabel();
        daftarPembeliNavTF = new javax.swing.JLabel();
        usernameTF = new javax.swing.JLabel();
        icUserLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel.setPreferredSize(new java.awt.Dimension(770, 480));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        produkNavTF.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        produkNavTF.setForeground(new java.awt.Color(255, 255, 255));
        produkNavTF.setText("Produk");
        produkNavTF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        produkNavTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produkNavTFMouseClicked(evt);
            }
        });

        resepNavTF.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        resepNavTF.setForeground(new java.awt.Color(255, 255, 255));
        resepNavTF.setText("Resep");
        resepNavTF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resepNavTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resepNavTFMouseClicked(evt);
            }
        });

        transaksiNavTF.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        transaksiNavTF.setForeground(new java.awt.Color(255, 255, 255));
        transaksiNavTF.setText("Transaksi");
        transaksiNavTF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transaksiNavTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transaksiNavTFMouseClicked(evt);
            }
        });

        daftarPembeliNavTF.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        daftarPembeliNavTF.setForeground(new java.awt.Color(255, 255, 255));
        daftarPembeliNavTF.setText("Daftar Pembeli");
        daftarPembeliNavTF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        daftarPembeliNavTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                daftarPembeliNavTFMouseClicked(evt);
            }
        });

        usernameTF.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        usernameTF.setForeground(new java.awt.Color(255, 255, 255));
        usernameTF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        usernameTF.setText("Username");
        usernameTF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usernameTF.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        usernameTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameTFMouseClicked(evt);
            }
        });

        icUserLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_user.png"))); // NOI18N
        icUserLB.setText("jLabel5");
        icUserLB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icUserLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icUserLBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(produkNavTF)
                .addGap(30, 30, 30)
                .addComponent(resepNavTF)
                .addGap(30, 30, 30)
                .addComponent(transaksiNavTF)
                .addGap(30, 30, 30)
                .addComponent(daftarPembeliNavTF)
                .addGap(18, 18, 18)
                .addComponent(usernameTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(icUserLB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(produkNavTF)
                    .addComponent(resepNavTF)
                    .addComponent(transaksiNavTF)
                    .addComponent(daftarPembeliNavTF)
                    .addComponent(usernameTF)
                    .addComponent(icUserLB))
                .addGap(9, 9, 9)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTFMouseClicked
        // TODO add your handling code here:
        // Show Popup Menu
        popupUser.show(this, 600, 80);
    }//GEN-LAST:event_usernameTFMouseClicked

    private void icUserLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icUserLBMouseClicked
        // TODO add your handling code here:
        // Show Popup Menu
        popupUser.show(this, 600, 80);
    }//GEN-LAST:event_icUserLBMouseClicked

    private void produkNavTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produkNavTFMouseClicked
        // TODO add your handling code here:
        // Show Popup Menu
        popupProduk.show(this, 30, 80);
    }//GEN-LAST:event_produkNavTFMouseClicked

    private void resepNavTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resepNavTFMouseClicked
        // TODO add your handling code here:
        // Show Popup Menu
        popupResep.show(this, 130, 80);
    }//GEN-LAST:event_resepNavTFMouseClicked

    private void transaksiNavTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaksiNavTFMouseClicked
        // TODO add your handling code here:
        // Show Popup Menu
        popupTransaksi.show(this, 230, 80);
    }//GEN-LAST:event_transaksiNavTFMouseClicked

    private void daftarPembeliNavTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daftarPembeliNavTFMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Pindah Panel belum di coding");
    }//GEN-LAST:event_daftarPembeliNavTFMouseClicked

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
            java.util.logging.Logger.getLogger(MenuUtamaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtamaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtamaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtamaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuUtamaView().setVisible(true);
//            }
//        });
        new MenuUtamaView().setVisible(true);
    }
    
    // =================================================Menu Popup Produk ========================================================
    
    // Create Menu Method
    private void createPopupProduk(JFrame frame) {
        // Create File Menu
        menuItem = new JMenuItem(
                "Lihat Produk",
                new ImageIcon(getClass().getResource("/img/ic_view.png")
        ));
        // Apply Desc
        menuItem.getAccessibleContext().setAccessibleDescription("Lihat Produk");
        menuItem.setFont(new Font("Montserrat", Font.PLAIN, 18));
        // Create an Action Listener
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                JOptionPane.showMessageDialog(null, "Pindah Panel belum di coding");
                
            }
        });
        // Add Menu Item Into Popup Menu
        popupProduk.add(menuItem);

        // Add another menu item to popup menu
        menuItem = new JMenuItem(
                "Atur Produk",
                new ImageIcon(getClass().getResource("/img/ic_settings.png")
        ));
        // Apply Desc
        menuItem.getAccessibleContext().setAccessibleDescription("Atur Produk");
        menuItem.setFont(new Font("Montserrat", Font.PLAIN, 18));
        // Create an Action Listener
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    
                    JOptionPane.showMessageDialog(null, "Pindah Panel belum di coding");
            
                }
            }

            );
        // Add Menu Item Into Popup Menu
            popupProduk.add (menuItem);
            
        }
    
    // =================================================Menu Popup Resep ========================================================
    
    // Create Menu Method
    private void createPopupResep(JFrame frame) {
        // Create File Menu
        menuItem = new JMenuItem(
                "Lihat Resep",
                new ImageIcon(getClass().getResource("/img/ic_view.png")
        ));
        // Apply Desc
        menuItem.getAccessibleContext().setAccessibleDescription("Lihat Resep");
        menuItem.setFont(new Font("Montserrat", Font.PLAIN, 18));
        // Create an Action Listener
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                JOptionPane.showMessageDialog(null, "Pindah Panel belum di coding");
                
            }
        });
        // Add Menu Item Into Popup Menu
        popupResep.add(menuItem);

        // Add another menu item to popup menu
        menuItem = new JMenuItem(
                "Atur Resep",
                new ImageIcon(getClass().getResource("/img/ic_settings.png")
        ));
        // Apply Desc
        menuItem.getAccessibleContext().setAccessibleDescription("Atur Resep");
        menuItem.setFont(new Font("Montserrat", Font.PLAIN, 18));
        // Create an Action Listener
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    
                    JOptionPane.showMessageDialog(null, "Pindah Panel belum di coding");
            
                }
            }

            );
        // Add Menu Item Into Popup Menu
            popupResep.add (menuItem);
            
        }
    
    // =================================================Menu Popup Transaksi ========================================================
    
    // Create Menu Method
    private void createPopupTransaksi(JFrame frame) {
        // Create File Menu
        menuItem = new JMenuItem(
                "Lihat Transaksi",
                new ImageIcon(getClass().getResource("/img/ic_view.png")
        ));
        // Apply Desc
        menuItem.getAccessibleContext().setAccessibleDescription("Lihat Transaksi");
        menuItem.setFont(new Font("Montserrat", Font.PLAIN, 18));
        // Create an Action Listener
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                JOptionPane.showMessageDialog(null, "Pindah Panel belum di coding");
                
            }
        });
        // Add Menu Item Into Popup Menu
        popupTransaksi.add(menuItem);

        // Add another menu item to popup menu
        menuItem = new JMenuItem(
                "Buat Transaksi",
                new ImageIcon(getClass().getResource("/img/ic_plus.png")
        ));
        // Apply Desc
        menuItem.getAccessibleContext().setAccessibleDescription("Buat Transaksi");
        menuItem.setFont(new Font("Montserrat", Font.PLAIN, 18));
        // Create an Action Listener
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    
                    JOptionPane.showMessageDialog(null, "Pindah Panel belum di coding");
            
                }
            }

            );
        // Add Menu Item Into Popup Menu
            popupTransaksi.add (menuItem);
            
        // Add another menu item to popup menu
        menuItem = new JMenuItem(
                "Laporan Penjualan",
                new ImageIcon(getClass().getResource("/img/ic_statistic.png")
        ));
        // Apply Desc
        menuItem.getAccessibleContext().setAccessibleDescription("Laporan Penjualan");
        menuItem.setFont(new Font("Montserrat", Font.PLAIN, 18));
        // Create an Action Listener
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    
                    JOptionPane.showMessageDialog(null, "Pindah Panel belum di coding");
            
                }
            }

            );
        // Add Menu Item Into Popup Menu
            popupTransaksi.add (menuItem);
            
        }
    
    // =================================================Menu Popup User ========================================================
    
    // Create Menu Method
    private void createPopupUser(JFrame frame) {
        // Create File Menu
        menuItem = new JMenuItem(
                "Atur Akun",
                new ImageIcon(getClass().getResource("/img/ic_settings.png")
        ));
        // Apply Desc
        menuItem.getAccessibleContext().setAccessibleDescription("Atur Akun");
        menuItem.setFont(new Font("Montserrat", Font.PLAIN, 18));
        // Create an Action Listener
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                JOptionPane.showMessageDialog(null, "Pindah Panel belum di coding");
                
            }
        });
        // Add Menu Item Into Popup Menu
        popupUser.add(menuItem);
            
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel daftarPembeliNavTF;
    private javax.swing.JLabel icUserLB;
    private javax.swing.JDesktopPane panel;
    private javax.swing.JLabel produkNavTF;
    private javax.swing.JLabel resepNavTF;
    private javax.swing.JLabel transaksiNavTF;
    private javax.swing.JLabel usernameTF;
    // End of variables declaration//GEN-END:variables
}
