import java.util.Scanner;

public class ReadInput {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = in.next();

        System.out.print("Please enter your age: ");
        int age = in.nextInt();

        System.out.println("Your name is " + name + " and you are " + age + " years old.");
    }
}