package javadersleri.ders8;

public class Yonetici extends Calisan {

	private int sorumlu_kisi;

	public Yonetici(String isim, int maas, String departman, int sorumlu_kisi) {

		super(isim, maas, departman);
		this.sorumlu_kisi = sorumlu_kisi;

	}

	public void zam_yap(int zam_miktar�) {

		System.out.println("�al��anlara " + zam_miktar� + " TL Zam Yap�ld�");
	
	}

	public void bilgileriGoster() {
		System.out.println("�sim" + getIsim());
		System.out.println("Maa� " + getMaas());
		System.out.println("Departman " + getDepartman());
		super.bilgileriGoster();

		System.out.println("Sorumlu Ki�i Say�s� " + this.sorumlu_kisi);
	}
}
