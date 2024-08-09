import java.util.*;

public class taking_input {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        //nextint() to take int number
        //nextfloat() to take a float input
        System.out.println(name);
    }
    
}

class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Single Scanner instance
        
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        
        int sum = a + b;
        System.out.println("The sum is: " + sum);
        
        sc.close(); // Close the Scanner when done
    }
}
