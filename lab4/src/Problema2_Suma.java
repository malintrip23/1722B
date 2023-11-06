import java.util.Scanner;

public class Problema2_Suma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        if (n < 0) n = n * -1;
        while (n > 0) {
            sum = sum + (n % 10);
            n = n / 10;
        }
        System.out.println(sum);
    }
}
