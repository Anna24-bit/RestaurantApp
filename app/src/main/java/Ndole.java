public class Ndole {
    String protein;
    String sides;
    int quantity;
    double price;
    public static final double BASEPRICE = 12.99;

    public Ndole(String pprotein,String psides,int pquantity,double pprice){
    protein=pprotein;
    sides=psides;
    quantity=pquantity;
    price=pprice;
    }

    public Ndole(){
        protein="";
        sides="";
        quantity=0;
        price=0.0;

    }

    public String getProtein(){

        return protein;

    }

    public String getSides(){

        return sides;

    }

    public int getQuantity(){

        return quantity;

    }

    public double getPrice(){

        return price;

    }

    public void setProtein(){
        
    }




}
