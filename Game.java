import java.util.Scanner;

public class Game {
    static String goal = "homework";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello player, enter your name: ");
        String name = in.nextLine();

        Scanner input = new Scanner(System.in);

        // homework --------
        System.out.println("Your main goal is guess the word");
        System.out.println("Rules:\n 1- Enter symbol one by one \n 2 - If you'll guess symbol - you'll get the message -  GOOD TRY! \n 3 - Else - TRY AGAIN!");
        int lengthWord = goal.length();
        String maskWord = "-".repeat(lengthWord);
        System.out.println(maskWord);

        // --------
        // a
        // -a-a----
        // o
        // -a-a-o--
        do {
            System.out.println("Enter a symbol:");
            char symbol = input.next().charAt(0);
            // a 2
            // w -1
            if (goal.indexOf(symbol) >= 0) {
                System.out.println("GOOD TRY!");
                for (char elem : goal.toCharArray()) {
                    if (elem == symbol) {
                        maskWord = replaceMaskLetter(symbol, maskWord);
                    }
                }
                System.out.println(maskWord);
            } else {
                System.out.println("TRY AGAIN!");
                System.out.println(maskWord);
            }
        } while (maskWord.contains("-"));
        System.out.println("THE WINNER IS " + name.toUpperCase());
    }

    /*
    -a-a---- j
    ja-a----
     */
    public static String replaceMaskLetter(char symbol, String maskWord) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < goal.length(); i++) {
            if (goal.charAt(i) == symbol) {
                stringBuilder.append(symbol);
            } else if (maskWord.charAt(i) != '-') {
                stringBuilder.append(maskWord.charAt(i));
            } else {
                stringBuilder.append("-");
            }
        }
        return stringBuilder.toString();
    }

}
