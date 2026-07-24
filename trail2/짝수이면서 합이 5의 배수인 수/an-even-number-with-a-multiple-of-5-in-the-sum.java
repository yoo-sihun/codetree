import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(answer(n) == 1){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }// Please write your code here.
    }

    public static int answer(int n) {
        int a = n / 10;
        int b = n % 10;
        if(n % 2 == 0 && (a+b) % 5 == 0){
            return 1;
        }else{
            return 0;
        }
    }
}