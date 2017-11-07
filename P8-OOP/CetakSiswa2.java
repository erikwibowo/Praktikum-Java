class CetakSiswa2{
		
		public static void main(String[] args) {
			Siswa data = new Siswa();
			data.infoSiswa();

			data.no_absen = 1;
			System.out.println("No. Absen\t\t: "+data.no_absen);

			data.setNis("160001");
			System.out.println("NIS\t\t\t: "+data.nis);

			data.setNama("Zidna Aisya Karima");
			System.out.println("Nama Siswa\t\t: "+data.nama_siswa);

			data.setTtl("Pekalongan", "14-09-1997");
			System.out.println("Tempat, Tanggal lahir\t: "+data.tmp_lahir+", "+data.tgl_lahir);

			data.setNilai(75.5, 80.75);
			System.out.println("Nilai IPA\t\t: "+data.nilai_ipa);
			System.out.println("Nilai IPS\t\t: "+data.nilai_ips);
		}

}