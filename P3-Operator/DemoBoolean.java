public class DemoBoolean {

	public static void main(String[] args) {
		//And : & dan &&
		int a = 5, b = 7;
		if ((a<2) & (b++<10)) {
			b+=2;
			System.out.println(b);
		}

		int c = 5, d = 7;
		if ((c<2) && (d++<10)) {
			d+=2;
			System.out.println(d);
		}

		//Or : | dan ||
		int e = 5, f = 7;
		if ((e<2) | (f++<10)) {
			f+=2;
			System.out.println(f);
		}

		int g = 5, h = 7;
		if ((g<2) || (h++<10)) {
			h+=2;
			System.out.println(h);
		}
	}

}