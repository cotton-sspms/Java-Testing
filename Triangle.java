import java.util.Scanner;

public class Triangle{
    public static void main(String[] agrs){
    Scanner sc = new Scanner(System.in);
    System.out.print("Input number: ");
    int n = sc.nextInt();
    int k = 0;

        for(int i = 1; i <= n; ++i, k = 0 ){
            for(int j = 1; j <= n - i; ++j){
                System.out.print("  ");
            }
            while(k != 2 * i - 1){
                System.out.print("X ");
                ++k;
            }
            System.out.println();
        }
    }
}
