import java.util.Scanner;

public class Test {
    static Manager manager = new Manager();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int chose;
        do {
            System.out.println("1.ADD NEW MEAT");
            System.out.println("2.ADD NEW CRISPYFLOUR");
            System.out.println("3.SHOW ALL DISCOUNT");
            System.out.println("4.TOTAL MEAT");
            System.out.println("5.TOTAL CRISPYFLOUR");
            System.out.println("6.EXIT PROGRAM");
        chose = Integer.parseInt(sc.nextLine());
        switch (chose){
            case 1:
                manager.addNewMeat();
                break;
            case 2:
                manager.addNewCrispyFlour();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        }while (chose !=0);
    }
}
