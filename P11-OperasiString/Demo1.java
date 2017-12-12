public class Demo1{

	public static void main(String[] args) {
		String S = "Pemrograman Java";
		String HurufKapital = S.toUpperCase();
		String HurufKecil = S.toLowerCase();

		int IndexAwal = 12;
		int IndexAkhir = 16;
		char[] Karakter = new char[IndexAkhir-IndexAwal];
		S.getChars(IndexAwal, IndexAkhir, Karakter, 0);

		byte[] temp = new byte[S.length()];
		temp = S.getBytes();

		String Trim = S.trim();
		String Sub = S.substring(5,9);
		String Replace1 = S.replace("Pemrograman", "Program");
		String Replace2 = "Java".replace('v', 'w');

		System.out.println("Penggunaan toUpperCase()\t: "+HurufKapital);
		System.out.println("Penggunaan method toLowerCase()\t: "+HurufKecil);
		System.out.println("Penggunaan method charAt()\t: "+S.charAt(0));
		System.out.println("Penggunaan method getChar()\t: "+Karakter[0]);
		System.out.println("Penggunaan method getBytes()\t: "+temp[0]);
		System.out.println("Penggunaan method trim()\t: "+Trim);
		System.out.println("Penggunaan method substring()\t: "+Sub);
		System.out.println("Penggunaan method replace()\t: "+Replace1+" "+Replace2);
	}

}