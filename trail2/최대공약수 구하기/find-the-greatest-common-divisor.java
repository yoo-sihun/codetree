import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        commonDivisor(n, m);// Please write your code here.
    }

    public static void commonDivisor(int n, int m) {
        if(n < m) {
            for(int i = n; i > 0; i--) {
                if(m % i == 0 && n % i == 0){
                    System.out.println(i);
                    break;
                }
            }
        }else {
            for(int i = m; i > 0; i--) {
                if(m % i == 0 && n % i == 0){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
