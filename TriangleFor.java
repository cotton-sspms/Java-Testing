import java.util.Scanner;

public class TriangleFor {
    public static void main(String[] agrs){
    Scanner sc = new Scanner(System.in);
    System.out.print("Input number: ");
    int n = sc.nextInt();

        for(int i = n; i>0; i--){
            for(int j=i; j>1; j--){
                System.out.print("  ");
            }
            for(int j=i; j<n; j++){
                System.out.print(" X ");
            }
            for(int j=i; j<=n; j++){
                System.out.print(" X ");
            }
            for(int j=i; j>1; j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
