import java.util.Scanner;

public class CoffeeMachine {


        double price;
        int quantity;
        double waterVolume;
        double watertemperature;






    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        Ingredients Apple = new Ingredients();

        System.out.println(" Please,enter your desired flavour here : ");

        String flavour = input.nextLine();

        Apple.Addstuff(flavour);
        CoffeeMachine MildCoffee = new CoffeeMachine();

        CoffeeMachine StongCoffee = new CoffeeMachine();

        CoffeeMachine HotWater = new CoffeeMachine();

        CoffeeMachine Cocoa = new CoffeeMachine();
MildCoffee.getprice(4,3);

int milk = 12;
int water = 4;

String status = mixture(12,4);

System.out.println(status);

mixture(15,7);




    }
    public double getprice(int unitprice, int quantity){

        price = unitprice*quantity;

        System.out.println(price);

        return price;




    }
    public static String mixture(int milk, int water){
        if(milk+water<20){
            System.out.println("out of order");
        } else{
            System.out.println("Now serving");
        }

        return "out of order";

    }
}
