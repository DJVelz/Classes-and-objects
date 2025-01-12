/*
 * Name: Dereck Velez Matias
 * Course: COP 3330C-17193
 * Date: 08/31/24
 * Program Objective: Takes customers' orders for Wendy's and Texas Roadhouse.
 * Inputs: - For Wendy's you can input the name of the customer, the type of sandwich, the number of
 *         nuggets, and the number of frosties the customer wants.
 *         - Texas Roadhouse lets you input the name on the bill, the temperature of their steak,
 *         the rounds of bread rolls received, and the price of drinks on happy hour.
 * Outputs: The complete orders will be printed for every customer.
 */

public class RestaurantApp {
    public static void main(String[] args) {
        //Instantiating objects: Assigns attributes for objects
        Wendys wendy = new Wendys();
        Wendys dave = new Wendys("Dave", "Spicy Chicken", 10, 1);

        TexasRoadhouse kent = new TexasRoadhouse();
        TexasRoadhouse willie = new TexasRoadhouse("Willie", 13.75, "Rare", 2);

        //Initial print: Print the order from the instantiation
        wendy.printOrder();
        dave.printOrder();

        kent.printDetails();
        willie.printDetails();

        //Using methods: Updates the orders
        wendy.moreFood("Baconator", 7, 8);
        dave.moreFood("Dave's Single", 20, 1);

        kent.anotherRound(2);
        willie.anotherRound(5);

        //Updated print: Prints the updated orders
        wendy.printOrder();
        dave.printOrder();

        kent.printDetails();
        willie.printDetails();
    }
}
