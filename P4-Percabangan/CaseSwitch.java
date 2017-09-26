public class CaseSwitch { //nama file harus diawali huruf kapital dan harus sama dengan nama kelas utama
    
    public static void main(String[] args) {
        String color = "Blue"; //String 'S' besar
        switch (color) {
            case "Blue":  //100 ganti "Blue"
                System.out.println("My favorite color is Blue");
                break; //tambah break;
            case "Red": //100 ganti "Red"
                System.out.println("My favorite color is Red");
                break; //tambah break;
            case "Green": //100 ganti "Green"
                System.out.println("My favorite color is Green");
                break; //tambah break;
            default:
                System.out.println("My favorite color is Black");
                break; //tambah break;
        }
    }

}