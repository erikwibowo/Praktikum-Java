public class DemoKondisi {
	public static void main(String[] args) {
		String status = "";
		int grade = 80;

		//Mendapatkan status pelajar
		status = (grade >= 60)?"passed":"fail";
		//print status
		System.out.println(status);
	}
}