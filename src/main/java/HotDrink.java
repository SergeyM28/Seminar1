public class HotDrink extends Drink{
    private int tp;
    public HotDrink(String name, Double cost, Double volume, int tp) {
        super(name, cost, volume);
        this.tp = tp;
    }

    public int getTp() {
        return tp;
    }

    public void setTp(int tp) {
        this.tp = tp;
    }

}
