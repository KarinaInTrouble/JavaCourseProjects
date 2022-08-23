import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name = "Karina";
        System.out.println("Hello, it's me, " + name + ", trying to learn Java)");

        Scanner in = new Scanner(System.in);
        System.out.println("Can I handle it?");
        String answer = in.nextLine();
        if (answer != "No" ^ answer != "Нет") {
            System.out.println("Let's see it!");
        }
        else{
            System.out.println("I hope that :) ");
        }

        in.close();

    }
}
