import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int rowNum = N;
        int colNum = N;
        rectNum(rowNum, colNum);
        // Please write your code here.
    }

    public static void rectNum(int rowNum, int colNum) {
        int num = 1;
        for(int i = 0; i < rowNum; i++) {
            for(int j = 0; j < colNum; j++) {
                System.out.print(num + " ");
                num++;

                if(num > 9){
                num = 1;
            }
            }
            
            System.out.println();
        }
    }
}