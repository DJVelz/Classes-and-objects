// Class: Wendy's
// Purpose: Represents a Wendy's cashier. A cashier is able to take customers' orders.

public class Wendys {
    //Fields
    private String name;

    private String sandwich;

    private int nuggets;

    private int frosty;

    //Constructor: Creates our Wendy's instances based on the name, sandwich, nuggets, and frosty of the customer
    public Wendys(String name,String sandwich, int nuggets, int frosty) {
        this.name = name;
        this.sandwich = sandwich;
        this.nuggets = nuggets;
        this.frosty = frosty;
    }

    //Overloaded Constructor: Sets all fields to null or zero if nothing is input
    public Wendys() {
        this.name = null;
        this.sandwich = null;
        this.nuggets = 0;
        this.frosty = 0;
    }

    //Getters and setters
    public String getName() {   //Gets customer's name
        return name;            //Returns customer's name
    }
    public void setName(String name) {  //Sets customer's name
        this.name = name;               //Updates customer's name
    }

    public String getSandwich() {   //Get name of sandwich
        return sandwich;            //Return name of sandwich
    }
    public void setSandwich(String sandwich) {  //Sets the name of sandwich
        this.sandwich = sandwich;               //Updates name of sandwich
    }

    public int getNuggets() {       //Gets the number of nuggets
        return nuggets;             //Returns the number of nuggets
    }
    public void setNuggets(int nuggets) {   //Sets the number of nuggets
        this.nuggets = nuggets;             //Updates number of frosties
    }

    public int getFrosty() {        //Get number of frosties
        return frosty;              //Return number of frosties
    }
    public void setFrosty(int frosty) {     //Set number of frosties
        this.frosty = frosty;               //Updates number of frosties
    }

    //Custom method: Lets customers add more food to their order
    public void moreFood(String sandwich, int nuggets, int frosty) {
        this.sandwich = sandwich;   //Sets a new sandwich name
        this.nuggets = nuggets;     //Assigns a new number of nuggets
        this.frosty = frosty;       //Assigns a new number of frosties
    }

    //Print method: Displays the attributes for this class
    public void printOrder() {
        if (frosty == 1) {
            System.out.println("Okay " + name + ", so that was a " + sandwich + " sandwich with " + nuggets + " nuggets and " + frosty + " frosty. Will that be all?\n");
        } else {
            System.out.println("Okay " + name + ", so that was a " + sandwich + " sandwich with " + nuggets + " nuggets and " + frosty + " frosties. Will that be all?\n");
        }
    }
}
