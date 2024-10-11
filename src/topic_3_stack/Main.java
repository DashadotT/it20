package topic_3_stack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack st = new Stack(5);

        while (true) {
            System.out.println("================");
            System.out.println("Choose number you want to perform"
                    + "\n1. Stack size"
                    + "\n2. Push number"
                    + "\n3. Peek top Element"
                    + "\n4. Pop top Element"
                    + "\n5. Exit");
            System.out.println("================");

            //using try catch to catch invalid input and try again
            try {

                System.out.print("Response: ");

                int choice = sc.nextInt();
                System.out.println();

                switch (choice) {

                    //to know the stack size
                    case 1:
                        System.out.println("The stack size is: " + st.size());
                        break;

                }
            } catch (Exception e) {
                System.out.println("Input is not a valid. Please try again!");
                sc.next();
            }
        }

    }

}
