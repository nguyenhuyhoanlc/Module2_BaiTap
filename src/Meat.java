import java.time.LocalDate;

public class Meat extends Material implements Discount {
    private final double weight;

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    @Override
    public double getAmount(){
        return weight * getCost();
    }

    @Override
    public String toString() {
        return "Meat{" +
                "weight=" + weight +
                '}';
    }

    @Override
    public double getRealMoney(){
        if (LocalDate.now().plusDays(3).isAfter(this.getManufacturingDate())){
            return this.getAmount() * 0.5;
        } else if (LocalDate.now().plusDays(5).isAfter(this.getManufacturingDate())){
            return this.getAmount() * 0.7;
        } else {
            return this.getAmount() * 0.9;
        }
    }
}
