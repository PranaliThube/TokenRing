import java.util.*;

public class TokenRing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.print("Ring: ");
        for (int i = 0; i < n; i++) System.out.print(i + " -> ");
        System.out.println(0);

        for (int token = 0, ch = 1; ch == 1; token = sc.nextInt()) {
            System.out.print("\nSender: ");
            int s = sc.nextInt();
            System.out.print("Receiver: ");
            int r = sc.nextInt();
            System.out.print("Data: ");
            int d = sc.nextInt();

            System.out.print("Token Passing: ");
            for (int i = token; i != s; i = (i + 1) % n) System.out.print(i + " -> ");
            System.out.println(s);

            System.out.println("Sender " + s + " sending data: " + d);
            for (int i = s; i != r; i = (i + 1) % n)
                System.out.println("Data " + d + " forwarded by " + i);
            System.out.println("Receiver " + r + " received data: " + d);

            System.out.print("Send again? (1-Yes, 0-No): ");
            ch = sc.nextInt();
        }
        sc.close();
    }
}