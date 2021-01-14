import java.util.ArrayList;
import java.util.List;

public class Manager {
    List<Meat> meatList = new ArrayList<>();
    List<CrispyFlour> crispyFlourList = new ArrayList<>();

    public double totalDifferenceCrispyFlour(){
        double total = 0;
        for (CrispyFlour a: crispyFlourList) {
            total += a.getAmount() - a.getRealMoney();
        }
        return total;
    }

    public double totalDifferenceMeat(){
        double total1 =0;
        for (Meat b: meatList) {
            total1 += b.getAmount() - b.getRealMoney();
        }
        return total1;
    }

    public void addNewMeat(Meat meat){
        meatList.add(meat);
    }

    public void addNewCrispyFlour(CrispyFlour crispyFlour){
        crispyFlourList.add(crispyFlour);
    }

    public void showAllMeat(){
        for (Meat meat : meatList) {
            System.out.println(meat);
        }
    }

    public void showAllCrispy(){
        for (CrispyFlour crispyFlour : crispyFlourList) {
            System.out.println(crispyFlour);
        }
    }
}
