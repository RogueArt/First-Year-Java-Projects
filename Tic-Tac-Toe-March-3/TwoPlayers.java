
import java.util.*;

public class TwoPlayers {
    public static void main (String[] args) {
        List<String> store = new ArrayList<String>();  
        for (int n = 1; n <= 10; n++) {
            store.add("=");
        }
        int input;
        String answer = "";
        boolean win = false;
        Scanner sc = new Scanner(System.in);

        while (win == false) {
            System.out.println("Player A's Turn!");

            while (!sc.hasNextInt()) {
                System.out.println("Please input a number from 1 through 9!");
                sc.next();
            }
            input = sc.nextInt();
            while ((store.get(input) == "X") || (store.get(input) == "O")) {
                System.out.println("That spot has already been played, try again!");
                System.out.println(store.get(1) + " " + store.get(2) + " " + store.get(3));
                System.out.println(store.get(4) + " " + store.get(5) + " " + store.get(6));
                System.out.println(store.get(7) + " " + store.get(8) + " " + store.get(9));
                System.out.println();
                // sc.next();
                input = sc.nextInt();
            }
            store.set(input, "X");
            System.out.println(store.get(1) + " " + store.get(2) + " " + store.get(3));
            System.out.println(store.get(4) + " " + store.get(5) + " " + store.get(6));
            System.out.println(store.get(7) + " " + store.get(8) + " " + store.get(9));
            System.out.println();

            if ((store.get(1) == "X" && store.get(2) == "X" && store.get(3) == "X") ||
            (store.get(4) == "X" && store.get(5) == "X" && store.get(6) == "X") ||
            (store.get(7) == "X" && store.get(8) == "X" && store.get(9) == "X") ||
            (store.get(1) == "X" && store.get(4) == "X" && store.get(7) == "X") ||
            (store.get(2) == "X" && store.get(5) == "X" && store.get(8) == "X") ||
            (store.get(3) == "X" && store.get(6) == "X" && store.get(9) == "X") ||
            (store.get(1) == "X" && store.get(5) == "X" && store.get(9) == "X") ||
            (store.get(3) == "X" && store.get(5) == "X" && store.get(7) == "X")) {
                win = true;
                System.out.print("Player A Wins!");
                break;
            }

            // Player B code
            System.out.println("Player B's Turn!");
            while (!sc.hasNextInt()) {
                System.out.println("Please input a number from 1 through 9!");
                sc.next();
            }
            input = sc.nextInt();
            while ((store.get(input) == "X") || (store.get(input) == "O")) {
                System.out.println("That spot has already been played, try again!");
                System.out.println(store.get(1) + " " + store.get(2) + " " + store.get(3));
                System.out.println(store.get(4) + " " + store.get(5) + " " + store.get(6));
                System.out.println(store.get(7) + " " + store.get(8) + " " + store.get(9));
                System.out.println();
                // sc.next();
                input = sc.nextInt();
            }
            store.set(input, "O");
            System.out.println(store.get(1) + " " + store.get(2) + " " + store.get(3));
            System.out.println(store.get(4) + " " + store.get(5) + " " + store.get(6));
            System.out.println(store.get(7) + " " + store.get(8) + " " + store.get(9));
            System.out.println();
            if ((store.get(1) == "O" && store.get(2) == "O" && store.get(3) == "O") ||
            (store.get(4) == "O" && store.get(5) == "O" && store.get(6) == "O") ||
            (store.get(7) == "O" && store.get(8) == "O" && store.get(9) == "O") ||
            (store.get(1) == "O" && store.get(4) == "O" && store.get(7) == "O") ||
            (store.get(2) == "O" && store.get(5) == "O" && store.get(8) == "O") ||
            (store.get(3) == "O" && store.get(6) == "O" && store.get(9) == "O") ||
            (store.get(1) == "O" && store.get(5) == "O" && store.get(9) == "O") ||
            (store.get(3) == "O" && store.get(5) == "O" && store.get(7) == "O")) {
                win = true;
                System.out.print("Player B Wins!");
                break;
            }

            if (store.get(1) != "=" && store.get(2) != "=" && store.get(3) != "=" &&
            store.get(4) != "=" && store.get(5) != "=" && store.get(6) != "=" &&
            store.get(7) != "=" &&  store.get(8) != "=" && store.get(9) != "=") {
                System.out.println("Draw! Do you wish to keep playing? (Yes = 1) (No = 2)");
                input = sc.nextInt();
                
                if (input == 1) {
                    System.out.println("Game has been reset!");
                    for (int n = 0; n < 10; n++) {
                        store.set(n, "=");
                    }
                }
                if (input == 2) {
                    System.out.println("Game over! Draw!");
                    win = true;
                }
            }
        }
    }
}
