import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * @author Logan Bateman
 * This is the GUI for the Vending Machine class made previously for assignment 2
 */
public class Main extends Application {

    // TODO: Instance Variables for View Components and Model
    private VendingMachine vm1;
    private VendingMachine vm2;
    private Label greeting = new Label("Welcome back to the break room!\nThere are still two vending machines here");

    //this is where the variables are initialised for vending machine 1
    private Label machine1 = new Label();
    private Button enterMoneyButton1 = new Button("Enter Money");
    private Button getChangeBackButton1 = new Button("Get Change Back");
    private Button vendAnItemButton1 = new Button("Vend an Item");
    private TextField changeToonie1 = new TextField("How many Toonies");
    private TextField changeLoonie1 = new TextField("How many Loonies");
    private TextField changeQuarter1 = new TextField("How many Quarters");
    private TextField changeDime1 = new TextField("How many Dimes");
    private TextField changeNickle1 = new TextField("How many Nickles");
    private Label changeBack1 = new Label("Your change 0.0");

    //this is where the variables are initialised for vending machine 2
    private Label machine2 = new Label();
    private Button enterMoneyButton2 = new Button("Enter Money");
    private Button getChangeBackButton2 = new Button("Get Change Back");
    private Button vendAnItemButton2 = new Button("Vend an Item");
    private TextField changeToonie2 = new TextField("How many Toonies");
    private TextField changeLoonie2 = new TextField("How many Loonies");
    private TextField changeQuarter2 = new TextField("How many Quarters");
    private TextField changeDime2= new TextField("How many Dimes");
    private TextField changeNickle2 = new TextField("How many Nickles");
    private Label changeBack2 = new Label("Your change 0.0");

    //this is where one off objects are initialised
    private Label vendItem = new Label();
    private Button leave = new Button("Leave the Break Room");

    /**
     * Make no changes here.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * This is where you create your components and the model and add event
     * handlers.
     *
     * @param stage The main stage
     * @throws Exception
     */

    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        Scene scene = new Scene(root, 700, 330, Color.BLUE); // set the size here
        stage.setTitle("Break Room"); // set the window title here
        stage.setScene(scene);
        root.setStyle("-fx-background-color: darkgrey;");
        // TODO: Add your GUI-building code here

        // 1. Create the model
        vm1 = new VendingMachine();
        vm2 = new VendingMachine("Coca-Cola", 2.75, 15);

        // 2. Create the GUI components
        machine1.setText(vm1.toString());
        machine2.setText(vm2.toString2());

        // 3. Add components to the root
        root.getChildren().addAll(greeting, machine1, machine2, enterMoneyButton1, getChangeBackButton1, vendAnItemButton1, enterMoneyButton2, getChangeBackButton2, vendAnItemButton2, changeToonie1, changeLoonie1, changeQuarter1, changeDime1, changeNickle1, changeBack1, changeToonie2, changeLoonie2, changeQuarter2, changeDime2, changeNickle2, changeBack2, vendItem, leave);

        // 4. Configure the components (colors, fonts, size, location)
        greeting.setPrefWidth(700);
        greeting.setFont(new Font("Times New Roman",30));
        greeting.setStyle("-fx-background-color: lightblue; -fx-text-fill:blue");

        //This starts the styling for all of vending machine 1
        changeToonie1.setPrefWidth(120);
        changeToonie1.setStyle("-fx-background-color: black; -fx-text-fill: gold;");
        changeLoonie1.setPrefWidth(120);
        changeLoonie1.setStyle("-fx-background-color: black; -fx-text-fill: gold;");
        changeQuarter1.setPrefWidth(120);
        changeQuarter1.setStyle("-fx-background-color: black; -fx-text-fill: silver;");
        changeDime1.setPrefWidth(120);
        changeDime1.setStyle("-fx-background-color: black; -fx-text-fill: silver;");
        changeNickle1.setPrefWidth(120);
        changeNickle1.setStyle("-fx-background-color: black; -fx-text-fill: silver;");
        changeBack1.setFont(new Font("Times New Roman", 15));

        enterMoneyButton1.setStyle("-fx-background-color: purple; -fx-text-fill: white;");
        getChangeBackButton1.setStyle("-fx-background-color: purple; -fx-text-fill: white;");
        vendAnItemButton1.setStyle("-fx-background-color: purple; -fx-text-fill: white;");
        //This ends the styling for all of vending machine 1

        //This starts the styling for all of vending machine 2
        changeToonie2.setPrefWidth(120);
        changeToonie2.setStyle("-fx-background-color: black; -fx-text-fill: gold;");
        changeLoonie2.setPrefWidth(120);
        changeLoonie2.setStyle("-fx-background-color: black; -fx-text-fill: gold;");
        changeQuarter2.setPrefWidth(120);
        changeQuarter2.setStyle("-fx-background-color: black; -fx-text-fill: silver;");
        changeDime2.setPrefWidth(120);
        changeDime2.setStyle("-fx-background-color: black; -fx-text-fill: silver;");
        changeNickle2.setPrefWidth(120);
        changeNickle2.setStyle("-fx-background-color: black; -fx-text-fill: silver;");
        changeBack2.setFont(new Font("Times New Roman", 15));

        enterMoneyButton2.setStyle("-fx-background-color: purple; -fx-text-fill: white;");
        getChangeBackButton2.setStyle("-fx-background-color: purple; -fx-text-fill: white;");
        vendAnItemButton2.setStyle("-fx-background-color: purple; -fx-text-fill: white;");
        //This ends the styling for all of vending machine 2

        leave.setStyle("-fx-background-color: blue; -fx-text-fill: white;");


        //this relocates all the objects in vending machine 1
        machine1.relocate(5,75);
        enterMoneyButton1.relocate(15, 95);
        getChangeBackButton1.relocate(135, 95);
        vendAnItemButton1.relocate(75, 140);
        changeToonie1.relocate(5,180);
        changeLoonie1.relocate(135,180);
        changeQuarter1.relocate(5,220);
        changeDime1.relocate(135,220);
        changeNickle1.relocate(70,260);
        changeBack1.relocate(60,300);

        //this relocates all the objects in vending machine 1
        machine2.relocate(425,75);
        enterMoneyButton2.relocate(435, 95);
        getChangeBackButton2.relocate(555, 95);
        vendAnItemButton2.relocate(495, 140);
        changeToonie2.relocate(425,185);
        changeLoonie2.relocate(555,185);
        changeQuarter2.relocate(425,225);
        changeDime2.relocate(555,225);
        changeNickle2.relocate(490,265);
        changeBack2.relocate(480,300);

        //this relocates the one-off objects
        vendItem.relocate(275,150);
        leave.relocate(275, 300);

        // 5. Add Event Handlers and do final setup
        enterMoneyButton1.setOnAction(this::enterMoney1Handler);
        enterMoneyButton2.setOnAction(this::enterMoney2Handler);
        getChangeBackButton1.setOnAction(this::changeBackHandler1);
        getChangeBackButton2.setOnAction(this::changeBackHandler2);
        vendAnItemButton1.setOnAction(this::vendAnItemHandler1);
        vendAnItemButton2.setOnAction(this::vendAnItemHandler2);
        leave.setOnAction(this::leaveHndler);

        // 6. Show the stage
        stage.show();
    }

    // TODO: Private Event Handlers and Helper Methods

    /**
     * This is the event handler for when the "enter money" button is pressed
     * Specifically for vending machine 1
     * @param e is when the button is pressed
     */
    public void enterMoney1Handler(ActionEvent e){
        int toonies = Integer.parseInt(changeToonie1.getText());
        vm1.setToonie(toonies);
        int loonies = Integer.parseInt(changeLoonie1.getText());
        vm1.setLoonie(loonies);
        int quarters = Integer.parseInt(changeQuarter1.getText());
        vm1.setQuarter(quarters);
        int dimes = Integer.parseInt(changeDime1.getText());
        vm1.setDime(dimes);
        int nickles = Integer.parseInt(changeNickle1.getText());
        vm1.setNickel(nickles);

        vm1.totalCalc();
        machine1.setText(vm1.toString());
        machine1.relocate(5,75);
    }

    /**
     * This is the event handler for when the "enter money" button is pressed
     * Specifically for vending machine 2
     * @param e is when the button is pressed
     */
    public void enterMoney2Handler(ActionEvent e){
        int toonies = Integer.parseInt(changeToonie2.getText());
        vm2.setToonie(toonies);
        int loonies = Integer.parseInt(changeLoonie2.getText());
        vm2.setLoonie(loonies);
        int quarters = Integer.parseInt(changeQuarter2.getText());
        vm2.setQuarter(quarters);
        int dimes = Integer.parseInt(changeDime2.getText());
        vm2.setDime(dimes);
        int nickles = Integer.parseInt(changeNickle2.getText());
        vm2.setNickel(nickles);

        vm2.totalCalc();
        machine2.setText(vm2.toString2());
        machine2.relocate(425,75);
    }

    /**
     * This is the event handler for when the "get change back" button is pressed
     * Specifically for vending machine 1
     * @param e is when the button is pressed
     */
    public void changeBackHandler1(ActionEvent e){
        changeBack1.setText("Your change: "+vm1.getTotal());
    }

    /**
     * This is the event handler for when the "get change back" button is pressed
     * Specifically for vending machine 2
     * @param e is when the button is pressed
     */
    public void changeBackHandler2(ActionEvent e){
        changeBack2.setText("Your change: "+vm2.getTotal());
    }


    /**
     * This is the event handler for when the "vend an item" button is pressed
     * Specifically for vending machine 1
     * @param e is when the button is pressed
     */
    public void vendAnItemHandler1(ActionEvent e){
        vm1.moneyUp();
        int x = vm1.getQuantity();
        vm1.setQuantity(x);
        machine1.setText(vm1.toString());
        vendItem.setText("*** VENDED THE ITEM ***");
        vendItem.setStyle("-fx-background-color: #66ff66; fx-text-fill: #003300;");
    }


    /**
     * This is the event handler for when the "vend an item" button is pressed
     * Specifically for vending machine 2
     * @param e is when the button is pressed
     */
    public void vendAnItemHandler2(ActionEvent e){
        vm2.moneyUp();
        int x = vm2.getQuantity();
        vm2.setQuantity(x);
        machine2.setText(vm2.toString2());
        vendItem.setText("*** VENDED THE ITEM ***");
        vendItem.setStyle("-fx-background-color: #66ff66; fx-text-fill: #003300;");
    }


    /**
     * This is the event handler for when the "leave the break room" button is pressed
     * @param e is when the button is pressed
     */
    public void leaveHndler(ActionEvent e){
        leave.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        ((Stage)(((Button)e.getSource()).getScene().getWindow())).close();
        //Credit to SedJ601 on stack overflow
    }

}