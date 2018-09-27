import java.util.Scanner;

public class BT_KiemTraSoNguyenTo {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("number = ");
        number = scanner.nextInt();
        System.out.println(+number+" is prime: "+isPrime(number));
    }
    public static boolean isPrime(int number){
        boolean prime = true;
        for (int i=number; i<10000;i++) {
            int count = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) count++;
            }
            if (count == 0) prime = true;
            else prime = false;
        }
        return prime;
    }
}
