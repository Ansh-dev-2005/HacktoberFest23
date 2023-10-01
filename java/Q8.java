import java.util.Scanner;

public class Q8 {
    void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (n-i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q8 obj8 = new Q8();
        Scanner sc = new Scanner(System.in);
        obj8.printTriangle(sc.nextInt());
        sc.close();
    }
}
