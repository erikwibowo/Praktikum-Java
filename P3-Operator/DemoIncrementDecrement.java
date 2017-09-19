public class DemoIncrementDecrement{

	public static void main(String[] args) {
		int x = 1, y = 1, z = 1;

		//Nilai awal
		System.out.println("Nilai x : "+x);
		System.out.println("Nilai y : "+y);
		System.out.println("Nilai z : "+z);

		//Increment
		x++; y++;
		System.out.println("Nilai x : "+x);
		System.out.println("Nilai y : "+y++);
		System.out.println("Nilai z : "+ ++z);

		System.out.println("Nilai y : "+y);

		//Decrement
		x--; y--;
		System.out.println("Nilai x : "+x);
		System.out.println("Nilai y : "+y--);
		System.out.println("Nilai z : "+ --z);

		System.out.println("Nilai y : "+y);
	}

}