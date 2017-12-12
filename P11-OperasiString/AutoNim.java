public class AutoNim{

	public static void main(String[] args) {
		// NIM : Tahun masuk + Kode Prodi + No Urut Registrasi
		String ta = "2015";
		String kd_prodi = "153";
		String no_reeg = "0001";
		String nim;

		nim = ta.substring(2, 4)+kd_prodi+no_reeg;

		System.out.println("NIM : "+nim);
	}

}