public class Factorial {
    public static void main(String[] args) {

        int number = 7; 
        long factorial = 1; 
        
      
        for (int i = 1; i <= number; i++) {
            factorial *= i; 
        }
        
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}

// 7 * 6 * 5 * 4 * 3 * 2 *1