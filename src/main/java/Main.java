import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>(Arrays.asList(
                new Product("Mars", 30.0),
                new Product("Twix", 20.0)
        )
        );
        Machine machine = new Machine(list);
        String key = "Twix";
        System.out.println(machine.getProductByName(key));


        List<Product> listBottle = new ArrayList<Product>(Arrays.asList(
                new Drink("Mirinda", 30.0, 0.50),
                new Drink("Pepsi", 20.0, 0.50)
        ));
        Machine bottleMachine = new BottleMachine(listBottle);
        String keyBottle = "Pepsi";
        System.out.println(bottleMachine.getProductByName(keyBottle));

        List<Product> listHotDrink = new ArrayList<Product>(Arrays.asList(
                new HotDrink("Americano", 50.0, 0.25, 90),
                new HotDrink("Latte", 100.0, 0.4, 75),
                new HotDrink("Tea", 30.0, 0.3, 85)
        ));
        HotDrinkMachine hotDrinkMachine = new HotDrinkMachine(listHotDrink);
        String keyName = "Americano";
        Double keyVolume = 0.25;
        int keyTp = 90;
        System.out.println(hotDrinkMachine.getProduct(keyName, keyVolume, keyTp));
    }






}
