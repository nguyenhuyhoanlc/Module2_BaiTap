import java.time.LocalDate;
import java.util.Scanner;

public class Test {
    static Manager manager = new Manager();
    static Scanner sc = new Scanner(System.in);
    static final String REGEX_MANUFACTURING_DATE = "^[0-9]{4}(-[0-9]{2}){2}$";
    public static void main(String[] args) {
        String dateOfManufacture;
        int chose;
        do {
            System.out.println("1.ADD NEW MEAT");
            System.out.println("2.ADD NEW CRISPYFLOUR");
            System.out.println("3.SHOW ALL");
            System.out.println("4.TOTAL MEAT");
            System.out.println("5.TOTAL CRISPYFLOUR");
            System.out.println("6.EXIT PROGRAM");
            chose = Integer.parseInt(sc.nextLine());
        switch (chose){
            case 1:
                System.out.println("Enter ID :");
                String id = sc.nextLine();
                System.out.println("Enter name :");
                String name = sc.nextLine();
                LocalDate manufacturingDate = null;
                do {
                    System.out.println("Nhập ngày sản xuất kiểu yyyy-MM-dd");
                    dateOfManufacture = sc.nextLine();
                    try {
                        manufacturingDate = LocalDate.parse(dateOfManufacture);
                    }catch (Exception e){}
                }while (!dateOfManufacture.matches(REGEX_MANUFACTURING_DATE));
                System.out.println("Enter cost");
                int cost = sc.nextInt();
                System.out.println("Enter weight");
                double weight = sc.nextDouble();
                Meat meat = new Meat(id, name, manufacturingDate, cost, weight);
                sc.nextLine();
                manager.addNewMeat(meat);
                break;
            case 2:
                System.out.println("Enter ID :");
                String id1 = sc.nextLine();
                System.out.println("Enter name :");
                String name1 = sc.nextLine();
                LocalDate manufacturingDate1 = null;
                do {
                    System.out.println("Nhập ngày sản xuất kiểu yyyy/MM/dd");
                    dateOfManufacture = sc.nextLine();
                    try {
                        manufacturingDate1 = LocalDate.parse(dateOfManufacture);
                    } catch (Exception exception){}
                }while (!dateOfManufacture.matches(REGEX_MANUFACTURING_DATE));
                System.out.println("Enter cost");
                int cost1 = sc.nextInt();
                System.out.println("Enter quantity");
                double quantity = sc.nextDouble();
                CrispyFlour crispyFlour = new CrispyFlour(id1, name1, manufacturingDate1, cost1,quantity);
                sc.nextLine();
                manager.addNewCrispyFlour(crispyFlour);
                break;
            case 3:
                manager.showAllMeat();
                manager.showAllCrispy();
                break;
            case 4:
                System.out.println(manager.totalDifferenceMeat());
                break;
            case 5:
                System.out.println(manager.totalDifferenceCrispyFlour());
                break;
            case 6:
                System.out.println("Exit Program");
                System.exit(0);
                break;
        }
        }while (chose !=0);
    }

    public void addNewMeat(){

    }
}
