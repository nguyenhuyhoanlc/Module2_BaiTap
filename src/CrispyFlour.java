import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount{
    private double quantity;

    public CrispyFlour(double quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, double quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount(){
        return quantity * getCost();
    }

    @Override
    public LocalDate getExpiryDate(){
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public String toString() {
        return "CrispyFlour{" +
                "quantity=" + quantity +
                '}';
    }

    @Override
    public double getRealMoney(){
        if (LocalDate.now().plusMonths(2).isAfter(this.getManufacturingDate())) {
            return this.getAmount() * 0.6;
        } else if (LocalDate.now().plusDays(4).isAfter(this.getManufacturingDate())) {
            return this.getAmount() * 0.8;
        } else {
            return this.getAmount() * 0.95;
        }
    }

}
