public class PolimorphismBentukWajah{
	/*Main method*/
	public static void main(String[] args) {
		System.out.println("\n Program Polimorphism");
		System.out.println("==========================");
		
		//Membuat objek-objek raut(ekspresi) dari wajah
		Bentukwajah objbentuk = new Bentukwajah();
		Senyum objsenyum = new Senyum();
		Tertawa objtertawa = new Tertawa();
		Marah objmarah = new Marah();
		Sedih objsedih = new Sedih();

		//Polimorphism dari bentuk wajah ada 5 dimulai dari 0-4
		Bentukwajah[] Bentuk = new Bentukwajah[5];
		Bentuk[0] = objbentuk;
		Bentuk[1] = objsenyum;
		Bentuk[2] = objtertawa;
		Bentuk[3] = objmarah;
		Bentuk[4] = objsedih;

		System.out.println("Bentuk[0] : "+Bentuk[0].respons());
		System.out.println("Bentuk[1] : "+Bentuk[1].respons());
		System.out.println("Bentuk[2] : "+Bentuk[2].respons());
		System.out.println("Bentuk[3] : "+Bentuk[3].respons());
		System.out.println("Bentuk[4] : "+Bentuk[4].respons());

	}
}