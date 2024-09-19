public class Lab_3 {
	public static void main(String[] args) {
		// Question one
		double radius = 4.5;
		double pi = 3.14159;
		double results_1 = pi * radius * radius;
		System.out.println("The area of the circle is " + results_1);
		// Question two
		double radius_2 = 4.5;
		double pi_2 = 3.14159;
		double circumference = 2 * pi_2 * radius_2;
		System.out.println("The circumference of the circle is " + circumference);
		// Question three
		double one_Foot = 0.305;		
		double results = one_Foot / 3.281;
		System.out.println("One foot is " + results + " in meters");
		// Question four
		int number = 512;
		boolean result = 2 < number;
		System.out.println(result);
		// Question five 
		char letter = 'b';
		int ascii = (int) letter;
		System.out.println("B is converted into " + ascii);
		// Question six 
		double number_1 = 12;
		int output = (int) number_1;
		float myFloat = 5.75f;
		int floatToInt = (int) myFloat;
		System.out.println(output + " " + floatToInt);
		// Question seven 
		int x = 1;
		double y = 2.5;
		boolean b;
		b = (x > y);
		b = !b;
		boolean c = b && (x < y);
		boolean d = c || (x > y);
		System.out.println(d);
		// Question eight 
        double fahrenheit = 68.0;
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Fahrenheit: " +  fahrenheit);
        System.out.println("Equivalent temperature in Celsius: " +  celsius);
        // Question nine 
        int dog_weight = 264;
        int divide = dog_weight / 16;
        System.out.println("The dog weight to ounces is : " + divide);
        // Question ten 
        int z = 80; 
        boolean isEqual = false;
        boolean isLessThan = false;
        boolean isGreaterThan = false;
        if (z == 100) {
            isEqual = true;
        } else if (z < 100) {
            isLessThan = true;
        } else {
            isGreaterThan = true;
        }
        System.out.println("Is equal to 100: " + isEqual);
        System.out.println("Is less than 100: " + isLessThan);
        System.out.println("Is greater than 100: " + isGreaterThan);
     }
}


