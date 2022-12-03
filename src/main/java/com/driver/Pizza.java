package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private String bill;
    private int extraCheesePrice;
    private int  extraToppingPrice;
    private int TakeAwayPrice;
    private boolean CheeseAdded;
    private boolean ToppingAdded;
    private boolean TakeAwayAdded;

    private boolean isBillGenerated;




    public Pizza(Boolean isVeg){
        this.CheeseAdded = false;
        this.ToppingAdded = false;
        this.TakeAwayAdded = false;
        this.extraCheesePrice = 80;
        this.isVeg = isVeg;
        this.TakeAwayPrice = 20;


        if(isVeg == true){
            this.price = 300;
            this.extraToppingPrice = 70;
        }
        else{
           this.price = 400;
           this.extraToppingPrice = 120;
        }
        this.bill = "Base Price Of The Pizza: "+this.price + "\n";
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        if(CheeseAdded == false){
            this.price = this.price + this.extraCheesePrice;
            CheeseAdded = true;
        }


    }

    public void addExtraToppings(){
        // your code goes here
        if(ToppingAdded == false ) {
            this.price = this.price + this.extraToppingPrice;
            ToppingAdded = true;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(TakeAwayAdded == false){
            this.price = this.price + this.TakeAwayPrice;
            TakeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated == false ){

            isBillGenerated = true;

            if(CheeseAdded == true){
                this.bill = this.bill + "Extra Cheese Added: " + this.extraCheesePrice + "\n";
            }
            if(ToppingAdded == true){
                this.bill = this.bill + "Extra Toppings Added: " + this.extraToppingPrice + "\n";
            }
            if(TakeAwayAdded == true){
                this.bill = this.bill + "Paperbag Added: " + this.TakeAwayPrice + "\n";
            }
            this.bill = this.bill + "Total Price: " +this.price + "\n";
        }
        return this.bill;
    }
}
