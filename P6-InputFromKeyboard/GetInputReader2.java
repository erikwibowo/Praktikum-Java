import java.io.*;
public class GetInputReader2 {
    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new
        InputStreamReader(System.in));
        String nim = "", nama = "", tempat = "", tgllahir = "";
        System.out.println("Masukkan nama anda : ");
            nama = dataIn.readLine();
        System.out.println("Masukkan NIM anda : ");
            nim = dataIn.readLine();
        System.out.println("Masukkan Tempat Lahir anda : ");
            tempat = dataIn.readLine();
        System.out.println("Masukkan Tanggal Lahir anda : ");
            tgllahir = dataIn.readLine();
            
        System.out.println("");
        System.out.println("-----------------");
        System.out.println("-----------------");
        
        System.out.println("Selamat Datang "+ nama);
        System.out.println("NIM   : "+ nim);
        System.out.println("Tempat Lahir   : "+ tempat);
        System.out.println("Tanggal Lahir   : "+ tgllahir);
    }
}
