import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();
        if(input1.length() > input2.length()){
            System.out.println(input1 + " " + input1.length());
        }else if(input1.length() < input2.length()){
            System.out.println(input2 + " " + input2.length());
        }else{
            System.out.println("same");
        }// Please write your code here.
    }
}