
package mprojectforsiralipe;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static mprojectforsiralipe.PosDAO.fil;
import static mprojectforsiralipe.PosDAO.path;
import static mprojectforsiralipe.PosView.productTable;
import static mprojectforsiralipe.PosView.uploadBtn;


public class PosController {
    PosView pv;
    public PosController(PosView posv){
        this.pv = posv;
        this.pv.allListener(new addProdata());
        this.pv.click(new allClickLis());
        this.pv.search(new searchFiel());
//        this.pv.upAction(new upload());
    }
    
    class addProdata implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            PosDAO pdao = new PosDAO();
            
            if(e.getSource() == pv.addBtn ){
                String pname = pv.pProductNField.getText();
                int stck = Integer.parseInt(pv.pStockField.getText());
                int price = Integer.parseInt(pv.pPriceField.getText());
           
                PosModel pm = new PosModel(pname,stck,price);
                pdao.addDataProduct(pm);
            }
            else if(e.getSource() == pv.uploadBtn){
                pdao.uploadImg();
            }
            else if(e.getSource() == pv.productTable){
                pdao.tableInProductClick();
            }
            else if(e.getSource() == pv.deleteBtn)
            {
                pdao.deleteProduct();
            }
            else if(e.getSource() == pv.updateBtn){
                String pname = pv.pProductNField.getText();
                int stck = Integer.parseInt(pv.pStockField.getText());
                int price = Integer.parseInt(pv.pPriceField.getText());
                int code = Integer.parseInt(pv.pPriceField.getText());
                PosModel pm = new PosModel();
                pm.setProName(pname);
                pm.setStocks(stck);
                pm.setPrice(price);

                pdao.updateProduct(pm);
            }
            else if(e.getSource() == pv.productsBtn){
                pv.jTabbedPane1.setSelectedIndex(0);
                pdao.showProducts();
                pdao.showProductsPr();
            }
            else if(e.getSource() == pv.posBtn){
                pv.jTabbedPane1.setSelectedIndex(1);
                pdao.showProducts();
                pdao.showProductsPr();
            }
            else if(e.getSource() == pv.add){
                if(pv.qtyField1.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please Input a Quantity!!");
                    return;
                }
                pdao.addOrder();
            }
            else if(e.getSource() == pv.deleteOrderBtn){
                pdao.deleteOrd();
                pdao.solve();
            }
            else if(e.getSource() == pv.changeBtn){
                if(pv.cashField1.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please Input a Cash!!");
                    return;
                }
                int num1 = Integer.parseInt(pv.cashField1.getText());
                String total = pv.totalField.getText();
           
                int calcu = PosModel.subNumbers(num1, Integer.parseInt(total));
           
                pv.changeField.setText(calcu + "");
            }
            else if(e.getSource() == pv.recieptBtn){
                pdao.reciept();
            }
        }  
    }
    class allClickLis implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            PosDAO pdao = new PosDAO();
            if(e.getSource() == pv.productTable){
                pdao.tableInProductClick();
            }
            else if(e.getSource() == pv.proTable)
            {
              pdao.tableInPosClick();
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            
        }
        
    }
    class searchFiel implements KeyListener{

        

        @Override
        public void keyPressed(KeyEvent e) {
            PosDAO pdao = new PosDAO();
            pdao.searchProduct();
        }

        @Override
        public void keyTyped(KeyEvent e) {}
           

        @Override
        public void keyReleased(KeyEvent e) {
            
        }

        
        
    }

}
