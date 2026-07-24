import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();// Please write your code here.
        int b = sc.nextInt();
        int c = sc.nextInt();

        int answer = getLow(a, b, c);
        System.out.println(answer);
    }

    public static int getLow(int a, int b, int c) {
        int min = Math.min(a,b);
        min = Math.min(min, c);
        return min;
    }
}