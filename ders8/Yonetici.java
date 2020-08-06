package javadersleri.ders8;

public class Yonetici extends Calisan {

	private int sorumlu_kisi;

	public Yonetici(String isim, int maas, String departman, int sorumlu_kisi) {

		super(isim, maas, departman);
		this.sorumlu_kisi = sorumlu_kisi;

	}

	public void zam_yap(int zam_miktarý) {

		System.out.println("Çalýþanlara " + zam_miktarý + " TL Zam Yapýldý");
	
	}

	public void bilgileriGoster() {
		System.out.println("Ýsim" + getIsim());
		System.out.println("Maaþ " + getMaas());
		System.out.println("Departman " + getDepartman());
		super.bilgileriGoster();

		System.out.println("Sorumlu Kiþi Sayýsý " + this.sorumlu_kisi);
	}
}
