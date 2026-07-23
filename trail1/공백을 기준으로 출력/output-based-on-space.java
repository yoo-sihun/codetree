import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 공백이 포함된 문자열 한 줄 전체를 읽으려면 nextLine()을 사용합니다.
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

   
        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");

        System.out.println(str1 + str2);

        sc.close();
    }
}