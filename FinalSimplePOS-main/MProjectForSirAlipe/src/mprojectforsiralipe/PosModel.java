
package mprojectforsiralipe;


public class PosModel {
   private String proName;
   private int stocks;
   private int price;
   private int code;
   public PosModel(){
       
   }
   public PosModel(String proName, int stocks, int price){
       this.proName=proName;
       this.stocks = stocks;
       this.price = price;
   }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public int getStocks() {
        return stocks;
    }

    public void setStocks(int stocks) {
        this.stocks = stocks;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public static int calculateOrder(int num1, int num2){
        return num1 * num2;
    }
    public static int subNumbers(int num1, int num2){
        return num1 - num2;
    }
    public static int updateStocks(int stock, int qty){
        return stock-qty;
        
    }
   
    
}
