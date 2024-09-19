public class Lab_4 {
	public static void main(String[] args) {
		int distance_To_NY = 2580;
		
		int results = distance_To_NY / 60;
		
		System.out.println(results);
		
		int convert = 313297;
		
		int days = convert / (24 * 3600);
        convert %= 24 * 3600;
        
        int hours = convert / 3600;
        convert %= 3600;
        
        int minutes = convert / 60;
        
        int seconds = convert % 60;
        
        System.out.println(days + ":" + hours + ":" + minutes + ":" + seconds);
        
        int number = 213;
        
        int x = (number / 10) % 10;
        
        System.out.println("The tens place in the given number is: " + x);
        
        double amount = 2.50;
        
        int dollars = (int) amount;
        
        int cents = (int) Math.round((amount - dollars) * 100);
        
        System.out.println(dollars + " dollars " + "and " + cents + " cents");
        
        int miles = 200;
        
        int gallons_Gas = miles / 25;
        
        System.out.println("You will need " + gallons_Gas + " of gas to complete the trip!");
        
		int random = (int) (Math.random() * 10) + 1;
		
		if (random == 0) {
			System.out.println("Zero");
		} else if(random == 1) {
			System.out.println("One");
		} else if (random == 2) {
			System.out.println("Two");
		} else if (random == 3) {
			System.out.println("Three");
		} else if (random == 4) {
			System.out.println("Four");
		} else if (random == 5) {
			System.out.println("Five");
		} else {
			System.out.println("Other");
		}
	}
}
