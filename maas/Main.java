import java.util.Scanner;
public class Main {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in );

            System.out.print("çalışanınm adı :");
            String name = scanner.nextLine();
            System.out.print("çalışanın pozisyonu (Manager/Developer/Intern) :");
            String position = scanner.nextLine();
            System.out.print("çalışanın maaşı :");
            double salary = scanner.nextDouble();
            Employee emp = new Employee(name, position, salary);
            emp.printInfo();
            emp.applyRaise();
            emp.printInfo();
            scanner.close();
    }
}