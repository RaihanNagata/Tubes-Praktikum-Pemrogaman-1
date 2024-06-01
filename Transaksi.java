package tubes;

public class Transaksi {
	private String kode;
	private String tgl;
	private String jam;
	private int debit;
	
	public Transaksi(String kode, String tgl, String jam, int debit) {
		super();
		this.kode = kode;
		this.tgl = tgl;
		this.jam = jam;
		this.debit = debit;
	}
	public String getKode() {
		return kode;
	}
	public void setKode(String kode) {
		this.kode = kode;
	}
	public String getTgl() {
		return tgl;
	}
	public void setTgl(String tgl) {
		this.tgl = tgl;
	}
	public String getJam() {
		return jam;
	}
	public void setJam(String jam) {
		this.jam = jam;
	}
	public int getDebit() {
		return debit;
	}
	public void setDebit(int debit) {
		this.debit = debit;
	}
}
