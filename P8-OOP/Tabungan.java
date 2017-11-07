public class Tabungan{

	int saldo;

	public Tabungan(int initsaldo){
		saldo = initsaldo;
	}

	public void ambilUang(int jumlah){
		saldo -= jumlah;
	}

}