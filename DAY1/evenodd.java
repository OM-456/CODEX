import java.util.*;

class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number to check even or odd\n");
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Given number is even\n");
        }

        else {
            System.out.println("given number is odd\n");
        }
    }
}