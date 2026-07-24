import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        commonDivisor(n, m);// Please write your code here.
    }

    public static void commonDivisor(int n, int m) {
        int min = Math.min(n, m);
        for (int i = min; i > 0; i--) {
            if (n % i == 0 && m % i == 0) {
                min = i;
                break;
            }
        }
        int a = n / min;
        int b = m / min;
        int common = a * b * min;
        System.out.println(common);
    }
}