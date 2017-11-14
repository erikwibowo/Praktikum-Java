public class RumusMatematika {
	
	double a, t;
	double l_segitiga;

	public static void main(String[] args) {
		RumusMatematika rm = new RumusMatematika();
		rm.luasSegitiga();
	}

	void luasSegitiga(){
		a = 7;
		t = 10;
		l_segitiga = 0.5*a*t;
		System.out.println("Luas Segitiga = "+l_segitiga);
	}

}