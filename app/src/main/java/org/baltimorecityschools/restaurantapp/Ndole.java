package org.baltimorecityschools.restaurantapp;

    public class Ndole {

        String protein;
        String sides;
        int quantity;
        double price;
        public static final double BASEPRICE = 12.99;

        public Ndole(String pprotein,String psides,int pquantity){
        protein=pprotein;
        sides=psides;
        quantity=pquantity;
        calcPrice();

        }

        public Ndole(){
            protein="";
            sides="";
            quantity=0;
            calcPrice();


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

        public void setProtein(String newProtein){
            protein = newProtein;

             calcPrice();
        }



        public void setSides(String newSides){
            sides = newSides;

            calcPrice();
        }

        public void setQuantity(int newQuantity){
            quantity = newQuantity;
            calcPrice();
        }

        public void calcPrice(){

            price=BASEPRICE;
            if(getProtein().equals("shrimp"))   price+=3.99;
            else if (getProtein().equals("chicken"))  price+=2.99;

            if(getSides().equals("cassava")) price+=1.99;
            else if(getSides().equals("plantains")) price+=1.75;
            else if (getSides().equals("bobolo")) price+=1.99;

            price*=quantity;

        }

        public String toString(){
            return "Protein " + protein + "/n" +  "sides" + sides + "quantity " + quantity + "price " + price;
        }


    }

