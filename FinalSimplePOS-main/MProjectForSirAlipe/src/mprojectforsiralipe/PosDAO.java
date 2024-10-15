
package mprojectforsiralipe;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class PosDAO {
    public static String path;
    public static File fil;
    Connection con = null;
    PreparedStatement ps;
    ResultSet rs;
    PosModel pm;
    public void addDataProduct(PosModel pm){
        try
            {   
                con = PosDbConnection.getConnection();
                ps = con.prepareStatement("INSERT INTO posproject (productName, stocks, price, image) VALUES(?,?,?,?)");
                ps.setString(1, pm.getProName());
                ps.setInt(2, pm.getStocks());
                ps.setInt(3, pm.getPrice());
                InputStream inputSt = new FileInputStream(new File(path));
                ps.setBlob(4, inputSt);
                
                int check = ps.executeUpdate();
                
                if(check == 1)
                {
                    JOptionPane.showMessageDialog(null, "Successfully add Products!!", "Message", JOptionPane.PLAIN_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Can't add Products!!", "Message", JOptionPane.ERROR_MESSAGE);
                }
                
                PosView.codeLabelq.setText("");
                PosView.pProductNField.setText("");
                PosView.pStockField.setText("");
                PosView.pPriceField.setText("");
                PosView.uploadLabel.setText("");
                showProductsPr();
                
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex, "Error Occured", JOptionPane.ERROR_MESSAGE);
            }
            showProductsPr();
        }
    public void uploadImg(){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showOpenDialog(null);
            fil = fileChooser.getSelectedFile();
            path = fil.getAbsolutePath();
            try 
            {
                BufferedImage bufferedImg = ImageIO.read(new File(path));
                Image img = bufferedImg.getScaledInstance(210, 150, Image.SCALE_SMOOTH);
                ImageIcon imgIcon = new ImageIcon(img);
                PosView.uploadLabel.setIcon(imgIcon);
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(PosDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public void deleteProduct(){
        try
        {   
            int codef = Integer.parseInt(PosView.codeLabelq.getText());
            con = PosDbConnection.getConnection();
            ps = con.prepareStatement("DELETE FROM posproject WHERE code = ?");
            ps.setInt(1, codef);
            int check = ps.executeUpdate();
            
            if(check == 1)
            {
                JOptionPane.showMessageDialog(null, "Successfully Delete Product!!", "Message", JOptionPane.PLAIN_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Can't Delete Product!!", "Message", JOptionPane.ERROR_MESSAGE);
            }
  
            PosView.codeLabelq.setText("");
            PosView.pProductNField.setText("");
            PosView.pStockField.setText("");
            PosView.pPriceField.setText("");
            showProductsPr();
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex, "Error Occured", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void updateProduct(PosModel pm){
        try
        {
            int codef = Integer.parseInt(PosView.codeLabelq.getText());
            con = PosDbConnection.getConnection();
            ps = con.prepareStatement("UPDATE posproject set productName = ?, stocks = ?, price = ? WHERE code = ?");
            ps.setString(1,pm.getProName());
            ps.setInt(2, pm.getStocks());
            ps.setInt(3, pm.getPrice());
            ps.setInt(4, codef);
                
            int check = ps.executeUpdate();
                
            if(check == 1)
            {
                JOptionPane.showMessageDialog(null, "Successfully update Product!!", "Message", JOptionPane.PLAIN_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Can't update Product!!", "Message", JOptionPane.ERROR_MESSAGE);
            }
                
            PosView.codeLabelq.setText("");
            PosView.pProductNField.setText("");
            PosView.pStockField.setText("");
            PosView.pPriceField.setText("");
            showProductsPr();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex, "Error Occured", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void showProductsPr(){
        try{
            con = PosDbConnection.getConnection();
            DefaultTableModel det =  (DefaultTableModel) PosView.productTable.getModel();
            det.setRowCount(0);
        
            Statement s = con.createStatement();
            rs = s.executeQuery("SELECT * FROM posproject");
        
            while(rs.next()){
                Vector vec = new Vector();
            
                vec.add(rs.getString(1));
                vec.add(rs.getString(2));
                vec.add(rs.getString(3));
                vec.add(rs.getString(4));
                vec.add(rs.getBlob(5));
            
            
                det.addRow(vec);
            }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
    }
    public void tableInProductClick(){
        DefaultTableModel mo = (DefaultTableModel) PosView.productTable.getModel();
                
            String codeInProduct = mo.getValueAt(PosView.productTable.getSelectedRow(),0).toString();
            String pNameInProduct = mo.getValueAt(PosView.productTable.getSelectedRow(), 1).toString();
            String stockInProduct = mo.getValueAt(PosView.productTable.getSelectedRow(), 2).toString();
            String priceInProduct = mo.getValueAt(PosView.productTable.getSelectedRow(),3).toString();
                
                
            PosView.codeLabelq.setText(codeInProduct);
            PosView.pProductNField.setText(pNameInProduct);
            PosView.pStockField.setText(stockInProduct);
            PosView.pPriceField.setText(priceInProduct);
            
            String code = PosView.codeLabelq.getText();
            try {
                con = PosDbConnection.getConnection();
                ps = con.prepareStatement("SELECT * FROM posproject WHERE code = ?");
                ps.setString(1, code);
            
                rs = ps.executeQuery();
                if(rs.next())
                {  
                   loadImage();
                }
                else 
                {
                    JOptionPane.showMessageDialog(null, "No image Found", "Message", JOptionPane.PLAIN_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex);
                Logger.getLogger(PosDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public void tableInPosClick(){
        DefaultTableModel mo = (DefaultTableModel) PosView.proTable.getModel();
                
            String codeInProduct = mo.getValueAt(PosView.proTable.getSelectedRow(),0).toString();
            String pNameInProduct = mo.getValueAt(PosView.proTable.getSelectedRow(), 1).toString();
            String stockInProduct = mo.getValueAt(PosView.proTable.getSelectedRow(), 2).toString();
            String priceInProduct = mo.getValueAt(PosView.proTable.getSelectedRow(),3).toString();
                
                
            PosView.codeFields.setText(codeInProduct);
            PosView.productNameField1.setText(pNameInProduct);
            PosView.stockFld.setText(stockInProduct);
            PosView.priceField.setText(priceInProduct);
            
            String code = PosView.codeFields.getText();
            try {
                con = PosDbConnection.getConnection();
                ps = con.prepareStatement("SELECT * FROM posproject WHERE code = ?");
                ps.setString(1, code);
            
                rs = ps.executeQuery();
                if(rs.next())
                {  
                   loadImageInPosPanel();
                }
                else 
                {
                    JOptionPane.showMessageDialog(null, "No image Found", "Message", JOptionPane.PLAIN_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex);
                Logger.getLogger(PosDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public void loadImage(){
        try {
            byte[] imgData = rs.getBytes("Image");
            ImageIcon imgIcon1 = new ImageIcon(imgData);
            Image img = imgIcon1.getImage();
            Image img2 = img.getScaledInstance(210, 150, Image.SCALE_SMOOTH);
            ImageIcon imgIcon2 = new ImageIcon(img2);
            
            PosView.uploadLabel.setIcon(imgIcon2);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
            Logger.getLogger(PosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void loadImageInPosPanel(){
        try {
            byte[] imgData = rs.getBytes("Image");
            ImageIcon imgIcon1 = new ImageIcon(imgData);
            Image img = imgIcon1.getImage();
            Image img2 = img.getScaledInstance(183, 148, Image.SCALE_SMOOTH);
            ImageIcon imgIcon2 = new ImageIcon(img2);
            
            PosView.photoLabelInPosPanel.setIcon(imgIcon2);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
            Logger.getLogger(PosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public  void showProducts(){
        try
        {
            DefaultTableModel det =  (DefaultTableModel) PosView.proTable.getModel();
            det.setRowCount(0);
            con = PosDbConnection.getConnection();
            Statement s = con.createStatement();
            rs = s.executeQuery("SELECT * FROM posproject");

            while(rs.next()){
                Vector vec = new Vector();

                vec.add(rs.getString(1));
                vec.add(rs.getString(2));
                vec.add(rs.getString(3));
                vec.add(rs.getString(4));
                vec.add(rs.getBlob(5));


                det.addRow(vec);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void addOrder(){
            int code = Integer.parseInt(PosView.codeFields.getText());
            String pname = PosView.productNameField1.getText();
            int quantity = Integer.parseInt(PosView.qtyField1.getText());
            int price = Integer.parseInt(PosView.priceField.getText());
            
            
            DefaultTableModel model = (DefaultTableModel) PosView.orderTable.getModel();
            int total = PosModel.calculateOrder(quantity, price);
            for(int add = 0; add <PosView.orderTable.getRowCount() ; add++){
            if(pname == PosView.orderTable.getValueAt(add,1)){
                model.removeRow(PosView.orderTable.convertRowIndexToModel(add));
                }
            }
            Vector vec = new Vector();
        
            vec.add(code);
            vec.add(pname);
            vec.add(quantity);
            vec.add(price);
            vec.add(total);
        
            model.addRow(vec);
            
            solve();
            stockUpda();
            showProducts();
            PosView.codeFields.setText("");
            PosView.productNameField1.setText("");
            PosView.qtyField1.setText("");
            PosView.priceField.setText("");
            PosView.stockFld.setText("");
    }
    public static void solve(){
        int total = 0;
        for(int i = 0 ; i< PosView.orderTable.getRowCount() ; i++){
           
            int value = Integer.parseInt(PosView.orderTable.getValueAt(i, 4).toString());
            
            total = value+total;
            
            PosView.totalField.setText(total+"");
      }
    }
    public void stockUpda(){
            int stk = Integer.parseInt(PosView.stockFld.getText());
            int qty = Integer.parseInt(PosView.qtyField1.getText());
            int code = Integer.parseInt(PosView.codeFields.getText());
            
            int result = PosModel.updateStocks(stk, qty);
            try
            {   
                con = PosDbConnection.getConnection();
                ps = con.prepareStatement("UPDATE posproject set stocks = ? WHERE code = ?");
                ps.setInt(1, result);
                ps.setInt(2, code);
                
                ps.executeUpdate();

            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    public  void deleteOrd(){
        DefaultTableModel mod = (DefaultTableModel) PosView.orderTable.getModel();
        int selec = PosView.orderTable.getSelectedRow();
        mod.removeRow(selec);  
    }
    public void searchProduct(){
            DefaultTableModel def = (DefaultTableModel) PosView.productTable.getModel();
            final TableRowSorter<TableModel> sor = new TableRowSorter<>(def);
          
            PosView.productTable.setRowSorter(sor);
          
            String model = PosView.searchField.getText();
            if(model.length() == 0)
            {
              sor.setRowFilter(null);
            }
            else{
              sor.setRowFilter(RowFilter.regexFilter(model));
          }
    }
    public void reciept(){
        RecieptFr rf = new RecieptFr();
        rf.setVisible(true);

        RecieptFr.labelReciept.setText("============================================================\n");
        RecieptFr.labelReciept.setText(RecieptFr.labelReciept.getText()+"=====================      SARI SARI STORE    ======================\n");
        RecieptFr.labelReciept.setText(RecieptFr.labelReciept.getText()+"============================================================\n\n");
        RecieptFr.labelReciept.setText(RecieptFr.labelReciept.getText()+"---Product---\t--Quantity-- \t --Price--  \t --Total--\n\n");
        DefaultTableModel md = (DefaultTableModel) PosView.orderTable.getModel();
        
        for(int i = 0 ; i < PosView.orderTable.getRowCount() ; i++){
            String product = PosView.orderTable.getValueAt(i,1).toString();
            String quantity = PosView.orderTable.getValueAt(i, 2).toString();
            String  price= PosView.orderTable.getValueAt(i, 3).toString();
            String total = PosView.orderTable.getValueAt(i, 4).toString();
            
            RecieptFr.labelReciept.setText(RecieptFr.labelReciept.getText()+"    "+product+"\t "+quantity+"\t    "+price+"\t    "+total+"\n\n");

        }
        RecieptFr.labelReciept.setText(RecieptFr.labelReciept.getText()+"Total Price:: " + "\t " +PosView.totalField.getText()+"\n");
        RecieptFr.labelReciept.setText(RecieptFr.labelReciept.getText()+"Cash:: " + "\t " +PosView.cashField1.getText()+"\n");
        RecieptFr.labelReciept.setText(RecieptFr.labelReciept.getText()+"Change:: " + "\t " +PosView.changeField.getText()+"\n\n");
        RecieptFr.labelReciept.setText(RecieptFr.labelReciept.getText()+"\n");
        RecieptFr.labelReciept.setText(RecieptFr.labelReciept.getText()+"============================================================\n");
        RecieptFr.labelReciept.setText(RecieptFr.labelReciept.getText()+"===============      THANKS COME  AGAIN     ===============");
        
        PosView.totalField.setText("");
        PosView.cashField1.setText("");
        PosView.changeField.setText("");
        DefaultTableModel mod = (DefaultTableModel) PosView.orderTable.getModel();
        mod.setRowCount(0);
            
        }
    
    
            
}
