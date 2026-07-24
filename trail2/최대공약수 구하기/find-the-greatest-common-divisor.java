import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        commonDivisor(n, m);
    
    }

    public static void commonDivisor(int n, int m) {
        int min = Math.min(n, m);

        for (int i = min; i > 0; i--) {
            if (n % i == 0 && m % i == 0) {
                System.out.println(i);
                break; 
            }
        }
    }
}