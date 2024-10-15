
package mprojectforsiralipe;


public class MFrame {
    public static void main(String[] args){
        PosView pv = new PosView();
        pv.setVisible(true);
        new PosController(pv);
  
    }
    
}
