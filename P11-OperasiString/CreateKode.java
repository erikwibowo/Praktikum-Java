public class CreateKode{

	public static void main(String[] args) {

		String tahun_ajaran = "2017-2018";
		String semester = "Gasal";
		String kd_prodi = "153";
		String kode = "";
		//statement
		//output kode = "1718115301"
		String ta1 = tahun_ajaran.substring(2, 4);
		String ta2 = tahun_ajaran.substring(7, 9);
		String no_urut = "01";
		semester = semester.replace("Gasal", "1");

		/*if (semester.equals("Gasal")) {
			semester = "1";
		}else{
			semester = "2";
		}*/

		kode = ta1+ta2+semester+kd_prodi+no_urut;
		System.out.println("Kode = "+kode);
	}

}