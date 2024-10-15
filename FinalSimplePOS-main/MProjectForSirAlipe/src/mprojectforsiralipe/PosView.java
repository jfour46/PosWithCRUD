
package mprojectforsiralipe;

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;


public class PosView extends javax.swing.JFrame {

    PosDAO pDAO = new PosDAO();
    public PosView() {
        initComponents();
        pDAO.showProductsPr();
        pDAO.showProducts();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        productsBtn = new javax.swing.JButton();
        posBtn = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        codeLabelq = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pProductNField = new javax.swing.JTextField();
        pPriceField = new javax.swing.JTextField();
        uploadLabel = new javax.swing.JLabel();
        uploadBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        pStockField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        stockFld = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        codeFields = new javax.swing.JLabel();
        productNameField1 = new javax.swing.JTextField();
        priceField = new javax.swing.JTextField();
        qtyField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        proTable = new javax.swing.JTable();
        add = new javax.swing.JButton();
        photoLabelInPosPanel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cashField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        totalField = new javax.swing.JTextField();
        changeBtn = new javax.swing.JButton();
        changeField = new javax.swing.JTextField();
        deleteOrderBtn = new javax.swing.JButton();
        recieptBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 34)); // NOI18N
        jLabel1.setText("Simple POS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 25, 226, 70));

        productsBtn.setBackground(new java.awt.Color(255, 0, 51));
        productsBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        productsBtn.setForeground(new java.awt.Color(255, 255, 255));
        productsBtn.setText("Products");
        getContentPane().add(productsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 124, 206, 60));

        posBtn.setBackground(new java.awt.Color(102, 204, 255));
        posBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        posBtn.setForeground(new java.awt.Color(255, 255, 255));
        posBtn.setText("POS");
        getContentPane().add(posBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 215, 206, 60));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codeLabelq.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        codeLabelq.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(codeLabelq, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 69, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Product Name");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 141, 36));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Price");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 69, 36));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Stocks");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 69, 36));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Code");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 69, 36));

        pProductNField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(pProductNField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 146, 153, 50));

        pPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pPriceFieldActionPerformed(evt);
            }
        });
        jPanel1.add(pPriceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 120, 40));

        uploadLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(uploadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, 210, 150));

        uploadBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        uploadBtn.setText("Upload Photo");
        jPanel1.add(uploadBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 230, 190, 50));

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Product Name", "Stocks", "Price"
            }
        ));
        jScrollPane3.setViewportView(productTable);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 1120, 480));

        updateBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updateBtn.setText("Update");
        jPanel1.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 160, 50));

        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteBtn.setText("Delete");
        jPanel1.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 160, 50));

        addBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addBtn.setText("Add Product");
        jPanel1.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 160, 50));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setText("Search Product Name :");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 296, 200, 50));

        searchField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 296, 260, 40));

        pStockField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(pStockField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 100, 40));

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Product Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 94, 128, 35));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Code");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 94, 77, 35));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Qty");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 94, 77, 35));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Price");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 94, 77, 35));

        stockFld.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        stockFld.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(stockFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 135, 77, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Stock");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 94, 77, 35));

        codeFields.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        codeFields.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(codeFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 135, 77, 40));

        productNameField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(productNameField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 135, 140, 40));

        priceField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(priceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 135, 88, 40));

        qtyField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(qtyField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 135, 80, 40));

        proTable.setBackground(new java.awt.Color(255, 51, 51));
        proTable.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        proTable.setForeground(new java.awt.Color(255, 255, 255));
        proTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Product Name", "Stocks", "Price"
            }
        ));
        jScrollPane1.setViewportView(proTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 510, 629));

        add.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        add.setText("Add Order");
        jPanel2.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 208, 132, 52));

        photoLabelInPosPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(photoLabelInPosPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 266, 183, 148));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Photo");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 420, 183, 37));

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Product Name", "Qty", "Price", "TOTAL"
            }
        ));
        jScrollPane2.setViewportView(orderTable);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 405, 420));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Order");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 384, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Cash :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 580, 66, 40));

        cashField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(cashField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 572, 123, 50));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Total :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, 66, 40));

        totalField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(totalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 580, 123, 40));

        changeBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        changeBtn.setText("Change");
        jPanel2.add(changeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 640, 114, 42));
        jPanel2.add(changeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 640, 130, 40));

        deleteOrderBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteOrderBtn.setText("Delete Order");
        jPanel2.add(deleteOrderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 720, 210, 50));

        recieptBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        recieptBtn.setText("Print Reciept");
        jPanel2.add(recieptBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 680, 200, 100));

        jTabbedPane1.addTab("tab2", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, -51, 1150, 920));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    public void allListener(ActionListener a){
        uploadBtn.addActionListener(a);
        addBtn.addActionListener(a);
        deleteBtn.addActionListener(a);
        updateBtn.addActionListener(a);
        productsBtn.addActionListener(a);
        posBtn.addActionListener(a);
        add.addActionListener(a);
        deleteOrderBtn.addActionListener(a);
        changeBtn.addActionListener(a);
        recieptBtn.addActionListener(a);
        
       
    }
    public void click(MouseListener a){
        productTable.addMouseListener(a);
        proTable.addMouseListener(a);
    }
    public void search(KeyListener a){
        searchField.addKeyListener(a);
    }

    private void pPriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pPriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pPriceFieldActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton add;
    public javax.swing.JButton addBtn;
    public static javax.swing.JTextField cashField1;
    public javax.swing.JButton changeBtn;
    public static javax.swing.JTextField changeField;
    public static javax.swing.JLabel codeFields;
    public static javax.swing.JLabel codeLabelq;
    public javax.swing.JButton deleteBtn;
    public javax.swing.JButton deleteOrderBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTable orderTable;
    public static javax.swing.JTextField pPriceField;
    public static javax.swing.JTextField pProductNField;
    public static javax.swing.JTextField pStockField;
    public static javax.swing.JLabel photoLabelInPosPanel;
    public javax.swing.JButton posBtn;
    public static javax.swing.JTextField priceField;
    public static javax.swing.JTable proTable;
    public static javax.swing.JTextField productNameField1;
    public static javax.swing.JTable productTable;
    public javax.swing.JButton productsBtn;
    public static javax.swing.JTextField qtyField1;
    public javax.swing.JButton recieptBtn;
    public static javax.swing.JTextField searchField;
    public static javax.swing.JLabel stockFld;
    public static javax.swing.JTextField totalField;
    public javax.swing.JButton updateBtn;
    public static javax.swing.JButton uploadBtn;
    public static javax.swing.JLabel uploadLabel;
    // End of variables declaration//GEN-END:variables
}
