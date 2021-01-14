import java.time.LocalDate;

public abstract class Material {
    private final String id;
    private final String name;
    private final LocalDate manufacturingDate;
    private final int cost;

    public Material(String id, String name, LocalDate manufacturingDate, int cost) {
        this.id = id;
        this.name = name;
        this.manufacturingDate = manufacturingDate;
        this.cost = cost;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public int getCost() {
        return cost;
    }

    public double getAmount(){
        return 0;
    }

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                ", cost=" + cost
                ;
    }

}
