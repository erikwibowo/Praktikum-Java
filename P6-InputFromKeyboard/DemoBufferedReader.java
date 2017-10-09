import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoBufferedReader {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(
            new InputStreamReader(System.in));
            String nama = "";
            System.out.print("Masukkan nama anda : ");
            try {
                nama = dataIn.readLine();
            }
            catch (IOException e) {
                System.out.println(e);
            }

            System.out.println("Selamat datang : "+nama);
    }
}
