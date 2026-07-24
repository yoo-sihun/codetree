import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();// Please write your code here.

        int answer = add(N);
        System.out.println(answer);
    }

    public static int add(int n) {
        int total = 0;
        for(int i = 1; i <= n; i++) {
            total += i;
        }
        return total/10;
    }
}