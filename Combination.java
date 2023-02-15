import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,r,n1 = 1, r1 = 1, x1 = 1;
        System.out.print("Enter n for C(n,r):  ");
        n = input.nextInt();
        System.out.print("Enter r for C(n,r):  ");
        r = input.nextInt();

        for ( int i = 1; i<=n; i++){
            n1 = n1*i;

        }

        for ( int i = 1; i<=r; i++){
            r1 = r1*i;

        }

        for ( int i = 1; i<=n-r; i++){
            x1 = x1*i;

        }

        System.out.print("C(" + n+ "," + r +") is " +  ((n1)/(r1 * x1)) );


    }
}
