import java.util.List;

public class HotDrinkMachine extends Machine {


    public HotDrinkMachine(List<Product> list) {
        super(list);
    }

    public Product getProduct(String name, double volume, int tp) {
        for (Product item : list) {
            if (item instanceof HotDrink) {
                if (item.getName().equals(name) && ((HotDrink) item).getVolume().equals(volume) && ((HotDrink) item).getTp() == tp) {
                    return item;
                }
            }
        }
        throw new IllegalStateException("Product not found");
    }
}
