/**
 * This is the moddel for the vending machines
 * Author: Logan Bateman, 000918989
 */

public class VendingMachine {
    private String productName;
    private double price;
    private int quantity;
    private double credits;
    private double total;
    private int userToonie;
    private int userLoonie;
    private double userQuarter;
    private double userNickel;
    private double userDime;
    //private static int count = 1;

    /**
     * This is the default constructor
     */
    public VendingMachine(){
        productName="Orange Fanta";
        price=2.50;
        quantity=10;
    }

    /**
     * This is the constructor where you can input only the product name
     */
    public VendingMachine(String productName){
        this.productName=productName;
        price=2.50;
        quantity=10;
    }

    /**
     * This is the constructor where you can input only the price
     */
    public VendingMachine(double price){
        productName="Orange Fanta";
        this.price=price;
        quantity=10;
    }

    /**
     * This is the constructor where you can input only the quantity
     */
    public VendingMachine(int quantity){
        productName="Orange Fanta";
        price=2.50;
        this.quantity=quantity;
    }

    /**
     * This is the constructor where you can input the poduct name and price
     */
    public VendingMachine(String productName, double price){
        this.productName=productName;
        this.price=price;
        quantity=10;
    }

    /**
     * This is the constructor where you can input the product name and the
     * quantity
     */
    public VendingMachine(String productName, int quantity){
        this.productName=productName;
        price=2.50;
        this.quantity=quantity;
    }

    /**
     * This is the constructor where you can input the price and quantity
     */
    public VendingMachine(double price, int quantity){
        productName="Orange Fanta";
        this.price=price;
        this.quantity=quantity;
    }

    /**
     * This is the constructor where you can input all the parameters
     */
    public VendingMachine(String productName, double price, int quantity){
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
    }

    /**
     * this sets our toonie variable
     * @param toonie is what we set the userToonie to
     */
    public void setToonie(int toonie){ this.userToonie=toonie; }

    /**
     * this gets our userToonie variable
     */
    public int getToonie(){ return userToonie; }

    /**
     * this sets our loonie variable
     * @param loonie is what we set the userLoonie to
     */
    public void setLoonie(int loonie){ this.userLoonie=loonie; }

    /**
     * this gets our userLoonie variable
     */
    public int getLoonie(){ return userLoonie; }

    /**
     * this sets our quarter variable
     * @param quarter is what we set the userQuarter to
     */
    public void setQuarter(int quarter){ this.userQuarter=quarter; }

    /**
     * this gets our userQuarter variable
     */
    public double getQuarter(){ return userQuarter; }

    /**
     * this sets our dime variable
     * @param dime is what we set the userDime to
     */
    public void setDime(int dime){ this.userDime=dime; }

    /**
     * this gets our userDime variable
     */
    public double getDime(){ return userDime; }

    /**
     * this sets our nickel variable
     * @param nickel is what we set the userNickel to
     */
    public void setNickel(int nickel){ this.userNickel=nickel; }

    /**
     * this gets our userNickel variable
     */
    public double getNickel(){ return userNickel; }

    public void setQuantity(int quantity){ this.quantity = quantity-1; }

    public int getQuantity(){ return quantity; }

    /**
     * This gets the total
     * @return the total
     */
    public double getTotal(){ return total; }


    /**
     * @return the total amount of money in our vending machine
     */
    public double totalCalc() {
        this.userToonie *= 2;
        this.userLoonie *= 1;
        this.userQuarter *= 0.25;
        this.userDime *= 0.1;
        this.userNickel *= 0.05;
        this.total = (double)(this.userToonie + this.userLoonie) + this.userQuarter + this.userDime + this.userNickel;
        return this.total;
    }

    /**
     *
     * @return the credits left after a purchase
     */
    public double moneyUp(){
        credits=total-price;
        if(credits<=0){
            return 0;
        }
        return credits;
    }

    /**
     * @return the formatted string to the user
     */
    @Override
    public String toString(){
        return String.format("Vending Machine %d: %d, %s, %.2f, %.2f, %.2f\n",
                1, getQuantity(), productName, price, moneyUp(), getTotal());
    }

    public String toString2(){
        return String.format("Vending Machine %d: %d, %s, %.2f, %.2f, %.2f\n",
                2, getQuantity(), productName, price, moneyUp(), getTotal());
    }
}