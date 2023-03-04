package PizzaProject;

public class Pizza {
    private int price;
    int basePrice;
    int extraCheesePrice;
    int extraToppingsPrice;
    int paperBagPrice;

    /////////
    private boolean isVeg;
    private String bill;
    ////////
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isTakeAwayAdded;
    ////
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        this.extraCheesePrice = 80;
        this.paperBagPrice = 20;
        this.isCheeseAdded = false;
        if (this.isVeg == true) {
            this.basePrice = 300;
            this.extraToppingsPrice = 70;
        } else {
            this.basePrice = 400;
            this.extraToppingsPrice = 120;
        }
        this.price = basePrice;
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        if (isCheeseAdded == false) {
            this.price = this.price + this.extraCheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings() {
        if (isToppingsAdded == false) {
            this.price = this.price + this.extraToppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway() {
        if (isTakeAwayAdded == false) {
            this.price = this.price + this.paperBagPrice;
            isTakeAwayAdded = true;
        }
    }

    public String getBill() {

        if (isBillGenerated == false) {
            this.bill = "Base Price Of The Pizza: " + this.basePrice + "\n";

            if (isCheeseAdded == true) {
                this.bill = this.bill + "Extra Cheese Added: " + this.extraCheesePrice + "\n";
            }
            if (isToppingsAdded == true) {
                this.bill = this.bill + "Extra Toppings Added: " + this.extraToppingsPrice + "\n";
            }
            if (isTakeAwayAdded == true) {
                this.bill = this.bill + "Paper Bag added: " + this.paperBagPrice + "\n";
            }
            this.bill = this.bill + "Total Price: " + this.price + "\n";
            this.isBillGenerated = true;
        }
        return this.bill;
    }
}
