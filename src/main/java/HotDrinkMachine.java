import java.util.List;

public class HotDrinkMachine extends Machine {

    private List<HotDrink> listHotDrink;
    public HotDrinkMachine(List<Product> listHotDrink) {
        super(listHotDrink);
    }

    public Product getProduct(String name, double volume, int tp) {
        for (Product item : listHotDrink) {
            if (item instanceof HotDrink) {
                if (item.getName().equals(name) && ((HotDrink) item).getVolume().equals(volume) && ((HotDrink) item).getTp() == tp) {
                    return item;
                }
            }
        }
        throw new IllegalStateException("Product not found");
    }
}
