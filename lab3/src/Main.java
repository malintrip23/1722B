import java.util.Scanner;

public class Main {
        public static void Problema1() {
            String[] a ={"java","test","university"};
            String[] b ={"car","university","plane"};

            System.out.println("Elementele comune din cele 2 siruri:");
            for(String elA : a){
                for(String elB : b){
                    if(elA.equals(elB)){
                        System.out.println(elA);
                    }
                }
            }
        }
        public static boolean isPrime(int i){
            if(i<=1) return false;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0) return false;
            }
            return true;
        }

        public static void Problema2() {
            int[] nr = {1, 2, 3, 34, 23, 17, 13, 99 ,71, 7};
            System.out.println("Numerele prime din sir sunt: ");
            for(int i : nr){
                if(isPrime(i)){
                    System.out.println(i);
                }
            }
        }

        public static void Problema3() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("N = ");
            int n = scanner.nextInt();
            scanner.close();
            int nr1=0;
            int nr2=1;
            System.out.print(nr1 + " " + nr2 + " ");
            int nr;
            nr=nr1+nr2;
            while(nr<=n){
                System.out.print(nr + " ");
                nr1=nr2;
                nr2=nr;
                nr=nr1+nr2;
            }
        }

        public static void Problema4() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("cuvantul este: ");
            String cuv = scanner.nextLine();
            scanner.close();

            boolean isPal=true;
            int i=0;
            int j=cuv.length()-1;
            while(i<j){
                if(cuv.charAt(i)!=cuv.charAt(j)){
                    isPal=false;
                    break;
                }
                i++;
                j--;
            }
            if(isPal) System.out.println("Cuvantul este palindrom");
            else System.out.println("Cuvantul nu este palindrom");
        }

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ce problema doriti sa rezolvati?");
            int pr=scanner.nextInt();
            if(pr==1) Problema1();
            if(pr==2) Problema2();
            if(pr==3) Problema3();
            if(pr==4) Problema4();
        }

}