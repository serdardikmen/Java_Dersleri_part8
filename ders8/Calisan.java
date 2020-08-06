package javadersleri.ders8;

public class Calisan {

	private String isim;
	private int maas;
	private String departman;

	public Calisan(String isim, int maas, String departman) {

		this.isim = isim;
		this.maas = maas;
		this.departman = departman;

	}

	public void calis() {
		System.out.println("�al��an �al���yor");

	}

	public void bilgileriGoster() {
		System.out.println("�sim" + isim);
		System.out.println("Maa� " + maas);
		System.out.println("Departman " + departman);

	}

	public void departman_Degistir(String yeni_departman) {

		System.out.println("Departman De�i�tiriliyor...");
		this.departman = yeni_departman;
		System.out.println("Yeni departman" + this.departman);
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

	public String getDepartman() {
		return departman;
	}

	public void setDepartman(String departman) {
		this.departman = departman;
	}
}