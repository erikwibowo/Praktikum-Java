public class CaseIf_Else { //nama file dan nama kelas harus sama
    
    public static void main(String[] args) {
        int stok = 47;
        int jmlambil = 5;

        if(jmlambil > stok){ //harusnya >
            System.out.println("Stok barang tidak mencukupi");
        }else {
            System.out.println("Data sudah sesuai");
        }
    }

}