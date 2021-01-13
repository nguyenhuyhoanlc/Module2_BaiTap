import java.time.LocalDate;

public class Meat extends Material implements Discount {
    private double weight;

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount(){
        return weight * getCost();
    }

    @Override
    public LocalDate getExpiryDate(){
        return getManufacturingDate().plusDays(7);
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
