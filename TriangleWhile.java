import java.util.Scanner;

public class TriangleWhile {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = sc.nextInt();
        int j,l = 0;
        int i = 0;
        int k = 1;

        while(i<n){
            j = 0;
            while(j<=n-i-2){
                System.out.print(" ");
                j+=1;
            }
            l = 0;
            j = 0;
            while(l<k){
                System.out.print("*");
                l+=1;
            }
            k+=2;
            System.out.println();
            i+=1;
        }
    }
}
