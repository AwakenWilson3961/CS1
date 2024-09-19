public class NumberGame {
	public static void main(String[] args) {
		int random = (int) (Math.random() * 100) + 1;
		int gucess = (int) (Math.random() * 100) + 1;
		if (gucess < random) {
			System.out.println("Too low");
		}
		System.out.print(random);
	}

}
	