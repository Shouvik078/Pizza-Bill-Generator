package PizzaProject;

public class Main {
    public static void main(String[] args) {

        /*
         * DeluxePizza dp = new DeluxePizza(true); // true = Veg Pizza false= Non Veg
         * Pizza
         * System.out.println(dp.getPrice()); // veg pizza + cheese + tappings = 460
         * 
         * dp.addTakeaway();
         * // dp.addExtraCheese();
         * // dp.addTakeaway();
         * System.out.println(dp.getBill()); // pizza price + cheese + tappings + paper
         * bag =
         * // = 480
         * 
         */
        Pizza p = new Pizza(false);

        p.addExtraCheese();
        p.addExtraToppings();
        // p.addTakeaway();

        System.out.println(p.getBill());

    }
}
