public class CetakSiswa1 {
	
	public static void main(String[] args) {
		Siswa data = new Siswa();
		data.infoSiswa();

		data.no_absen = 1;
		System.out.println(data.no_absen);

		data.setNis("160001");
		System.out.println(data.nis);

		data.setNama("Zidna Aisya Karima");
		System.out.println(data.nama_siswa);

		data.setTtl("Pekalongan", "14-09-1997");
		System.out.println(data.tmp_lahir+", "+data.tgl_lahir);

		data.setNilai(75.5, 80.75);
		System.out.println(data.nilai_ipa+", "+data.nilai_ips);
	}

}