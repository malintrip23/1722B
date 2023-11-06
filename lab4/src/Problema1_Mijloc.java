import java.util.Scanner;

public class Problema1_Mijloc {
    public static void main(String[] args) {
            System.out.println("Cuvant: ");
            Scanner in = new Scanner(System.in);
            String cuv = in.next();
            int lungime=cuv.length();
            char mijImp = cuv.charAt(lungime/2);
            if(lungime%2==0) {
                char mijPar = cuv.charAt(lungime/2-1);
                System.out.print(mijPar);
                System.out.print(mijImp);
            }
            else System.out.println(mijImp);
    }
}