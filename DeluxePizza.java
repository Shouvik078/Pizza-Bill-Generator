package PizzaProject;

public class DeluxePizza extends Pizza {
    public DeluxePizza(Boolean isVeg) {
        super(isVeg);

        // Option -1
        addExtraCheese();
        addExtraToppings();
    }
}
