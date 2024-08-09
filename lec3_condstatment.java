import java.util.*;

public class lec3_condstatment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 to check age or 2 to check number:");
        int choice = sc.nextInt();

        if (choice == 1) {
            checkAge();
        } else if (choice == 2) {
            main2();  // Call the second method
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }

    private static void checkAge() {
        System.out.println("Enter the age : ");
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("adult");
        } else {
            System.out.println("Not adult");
        }

        sc.close();
    }

    public static void main2() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc2.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        sc2.close();
    }
}
