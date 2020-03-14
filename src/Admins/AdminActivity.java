package Admins;

import Inventory.brand;
import Inventory.category;
import Inventory.customer;
import Inventory.order;
import javax.swing.ImageIcon;
import Main.Admin;
import Inventory.product;
import Inventory.stock;
import Inventory.supplier;


/**
 *
 * @author Saima
 */
public class AdminActivity extends javax.swing.JFrame {

    String username;
    Admin admin = new Admin();

    public AdminActivity() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/icon_1.png"));
        this.setIconImage(ic.getImage());
    }

    public void User(String username) {
        this.username = username;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        productbox = new javax.swing.JButton();
        catbox = new javax.swing.JButton();
        stobox = new javax.swing.JButton();
        brandbox = new javax.swing.JButton();
        supbox = new javax.swing.JButton();
        cusbox = new javax.swing.JButton();
        orbox = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to the Menu");
        setSize(new java.awt.Dimension(1000, 550));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome To");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Inventory Management");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("System (IMS)");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Menu");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cross.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(524, 524, 524)
                .addComponent(jLabel16)
                .addGap(89, 89, 89))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addComponent(jLabel16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        productbox.setBackground(new java.awt.Color(0, 153, 153));
        productbox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        productbox.setForeground(new java.awt.Color(255, 255, 255));
        productbox.setText("Product");
        productbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        productbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productboxMouseClicked(evt);
            }
        });
        productbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productboxActionPerformed(evt);
            }
        });

        catbox.setBackground(new java.awt.Color(0, 153, 153));
        catbox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        catbox.setForeground(new java.awt.Color(255, 255, 255));
        catbox.setText("Category");
        catbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        catbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catboxMouseClicked(evt);
            }
        });
        catbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catboxActionPerformed(evt);
            }
        });

        stobox.setBackground(new java.awt.Color(0, 153, 153));
        stobox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        stobox.setForeground(new java.awt.Color(255, 255, 255));
        stobox.setText("Stock");
        stobox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        stobox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stoboxMouseClicked(evt);
            }
        });
        stobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stoboxActionPerformed(evt);
            }
        });

        brandbox.setBackground(new java.awt.Color(0, 153, 153));
        brandbox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        brandbox.setForeground(new java.awt.Color(255, 255, 255));
        brandbox.setText("Brand");
        brandbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        brandbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brandboxMouseClicked(evt);
            }
        });
        brandbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandboxActionPerformed(evt);
            }
        });

        supbox.setBackground(new java.awt.Color(0, 153, 153));
        supbox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        supbox.setForeground(new java.awt.Color(255, 255, 255));
        supbox.setText("Supplier");
        supbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        supbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supboxMouseClicked(evt);
            }
        });
        supbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supboxActionPerformed(evt);
            }
        });

        cusbox.setBackground(new java.awt.Color(0, 153, 153));
        cusbox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cusbox.setForeground(new java.awt.Color(255, 255, 255));
        cusbox.setText("Customer");
        cusbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        cusbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cusboxMouseClicked(evt);
            }
        });
        cusbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusboxActionPerformed(evt);
            }
        });

        orbox.setBackground(new java.awt.Color(0, 153, 153));
        orbox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        orbox.setForeground(new java.awt.Color(255, 255, 255));
        orbox.setText("Order");
        orbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        orbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orboxMouseClicked(evt);
            }
        });
        orbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(productbox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(catbox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(orbox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cusbox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(brandbox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(stobox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(supbox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(productbox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(catbox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(brandbox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(stobox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orbox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cusbox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(supbox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(175, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved

    }//GEN-LAST:event_formMouseMoved

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
      Admin admin = new Admin();
        admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void productboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productboxActionPerformed

    private void productboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productboxMouseClicked
        // TODO add your handling code here:
           product pro = new product();
        pro.setVisible(true);
        dispose();
    }//GEN-LAST:event_productboxMouseClicked

    private void catboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catboxMouseClicked
        // TODO add your handling code here:
            category cat = new category();
        cat.setVisible(true);
        dispose();
    }//GEN-LAST:event_catboxMouseClicked

    private void catboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catboxActionPerformed

    private void stoboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stoboxMouseClicked
        // TODO add your handling code here:
           stock sto = new stock();
        sto.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_stoboxMouseClicked

    private void stoboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stoboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stoboxActionPerformed

    private void brandboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brandboxMouseClicked
        // TODO add your handling code here:
             brand br = new brand();
        br.setVisible(true);
        dispose();
    }//GEN-LAST:event_brandboxMouseClicked

    private void brandboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandboxActionPerformed

    private void supboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supboxMouseClicked
        // TODO add your handling code here:
                  supplier sup = new supplier();
        sup.setVisible(true);
        dispose();
    }//GEN-LAST:event_supboxMouseClicked

    private void supboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supboxActionPerformed

    private void cusboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cusboxMouseClicked
        // TODO add your handling code here:
        customer cus = new customer();
        cus.setVisible(true);
        dispose();
    }//GEN-LAST:event_cusboxMouseClicked

    private void cusboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusboxActionPerformed

    private void orboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orboxMouseClicked
        // TODO add your handling code here:
           order ord = new order();
        ord.setVisible(true);
        dispose();
    }//GEN-LAST:event_orboxMouseClicked

    private void orboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orboxActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new AdminActivity().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brandbox;
    private javax.swing.JButton catbox;
    private javax.swing.JButton cusbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton orbox;
    private javax.swing.JButton productbox;
    private javax.swing.JButton stobox;
    private javax.swing.JButton supbox;
    // End of variables declaration//GEN-END:variables
}
