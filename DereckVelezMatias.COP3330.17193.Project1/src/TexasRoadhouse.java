//Class: Texas Roadhouse
//Purpose: Represents a Texas Roadhouse server. Servers can tell customers their bill
//         and the price of happy hour drinks.

public class TexasRoadhouse {
    //Fields
    private String bill;

    private double happyHour;

    private String steakTemp;

    private int rolls;

    //Constructor: Creates our Roadhouse instances based on the bill, happyHour, steakTemp, and rolls values.
    public TexasRoadhouse(String bill, double happyHour, String steakTemp, int rolls) {
        this.bill = bill;
        this.happyHour = happyHour;
        this.steakTemp = steakTemp;
        this.rolls = rolls;
    }

    //Overloaded constructor: Sets all fields to null or zero
    public TexasRoadhouse() {
        this.bill = null;
        this.happyHour = 0;
        this.steakTemp = null;
        this.rolls = 0;
    }

    //Getters and setters
    public String getBill() {       //Gets name on bill
        return bill;                //Returns name on bill
    }
    public void setBill(String bill) {      //Sets name on bill
        this.bill = bill;                   //Updates name on bill
    }

    public double getHappyHour() {      //Gets happy hour drink price
        return happyHour;               //Returns happy hour drink price
    }
    public void setHappyHour(double happyHour) {        //Sets price of happy hour drinks
        this.happyHour = happyHour;                     //Updates drink price
    }

    public String getSteakTemp() {      //Gets steak temperature
        return steakTemp;               //Returns steak temperature
    }
    public void setSteakTemp(String steakTemp) {        //Sets steak temperature
        this.steakTemp = steakTemp;                     //Updates steak temperature
    }

    public int getRolls() {     //Gets number of bread rolls
        return rolls;           //Returns number of bread rolls
    }
    public void setRolls(int rolls) {   //Sets number of bread rolls
        this.rolls = rolls;             //Updates number of bread rolls
    }

    //Custom method: Gives the customer another round of bread rolls
    public void anotherRound(int rolls) {   //Lets you input how many more rounds of bread rolls you want
        this.rolls += rolls;                //Increases the original amount of bread rolls by the amount input
    }

    //Print method: Displays the full bill
    public void printDetails() {
        System.out.println("Alrighty " + bill + ", so your order was a " + steakTemp  + " steak with " + rolls + " orders of our delicious bread rolls.");
        if (happyHour == 0){
            System.out.println("And drinks are on the house!\n");
        } else {
            System.out.println("And your drinks are " + happyHour + " because it's Happy Hour!\n");
        }
    }
}
