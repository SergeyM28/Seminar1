import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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
