import java.util.ArrayList;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numar de angajati: ");
        int n = scanner.nextInt();

        ArrayList<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("\nAngajatul " + (i + 1) + ":");
            System.out.print("Nume: ");
            String name = scanner.next();
            System.out.print("Email: ");
            String email = scanner.next();
            System.out.print("Tarif pe ora: ");
            double hourRate = scanner.nextDouble();
            System.out.print("Numar ore lucrate pe zi: ");
            int capacity = scanner.nextInt();
            System.out.print("Zile libere: ");
            int freeDays = scanner.nextInt();

            Employee employee = new Employee(name, email, hourRate, capacity, freeDays);
            employees.add(employee);
        }

        System.out.println("\nSalarii lunare:");
        for (int i = 0; i < n; i++) {
            Employee employee = employees.get(i);
            System.out.println(employee.calculateMonthlyIncome() + " lei , " + employee.calculateDailyIncome() + " lei/zi , " + employee.calculateDailyIncome() * 21 + " lei/luna");
        }
    }
}