import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int total = A + B;
        double C = total / 2.0;
        System.out.printf("%d %.1f", total, C);// Please write your code here.
    }
}