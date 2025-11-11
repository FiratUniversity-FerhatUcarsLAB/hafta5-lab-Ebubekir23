/*
 * Ad Soyad: Ebubekir Yılmaz
 * Öğrenci No: 250541051
 * Tarih: 9.11.2025
 * Açıklama: E-Ticaret Sepet Hesaplayıcı
 * Bu program kullanıcıdan istediği fiyat ve adet bilgilerini aldıktan sonra
 * toplam satış tutarını hesaplar. Ardından indirim oranı, KDV ve kargo
 * ücretini de ekleyerek genel toplamı ekrana yazdırır.
 */

import java.util.Scanner;

public class EticaretSepetHesaplayici {

	// KDV ve Kargo Sabiti
	final static double VAT_RATE = 0.18;
	final static double SHIPPING_FEE = 29.99;

	// a ürünü
	public static double uruna(double sales, double piece) {
		return sales * piece;
	}

	// b ürünü
	public static double urunb(double sales, double piece) {
		return sales * piece;
	}

	// c ürünü
	public static double urunc(double sales, double piece) {
		return sales * piece;
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);

		System.out.println("-----E-Ticaret Sepet Hesaplayıcı-----\n");

		// a satış
		System.out.print("A Ürününün Fiyatı: ");
		double fiyata = inputScanner.nextDouble();
		System.out.print("A Ürününün Adeti: ");
		double adeta = inputScanner.nextDouble();

		double satisa = uruna(fiyata, adeta);
		System.out.printf("A Ürününün Satış Toplamı: %.2f TL\n\n", satisa);

		// b satış
		System.out.print("B Ürününün Fiyatı: ");
		double fiyatb = inputScanner.nextDouble();
		System.out.print("B Ürününün Adeti: ");
		double adetb = inputScanner.nextDouble();

		double satisb = urunb(fiyatb, adetb);
		System.out.printf("B Ürününün Satış Toplamı: %.2f TL\n\n", satisb);

		// c satış
		System.out.print("C Ürününün Fiyatı: ");
		double fiyatc = inputScanner.nextDouble();
		System.out.print("C Ürününün Adeti: ");
		double adetc = inputScanner.nextDouble();

		double satisc = urunc(fiyatc, adetc);
		System.out.printf("C Ürününün Satış Fiyatı: %.2f TL\n\n", satisc);

		// ara toplam
		double satistoplam = satisa + satisb + satisc;
		System.out.printf("Ara Toplam: %.2f TL\n\n", satistoplam);

		// indirim oranı
		System.out.print("İndirim Oranı (%): ");
		double oran = inputScanner.nextDouble();

		// indirim tutarı
		double indirim = satistoplam * (oran / 100);
		System.out.printf("İndirim Tutarı: %.2f TL\n\n", indirim);

		// indirimli toplam
		double indirimlitoplam = satistoplam - indirim;
		System.out.printf("İndirimli Toplam: %.2f TL\n\n", indirimlitoplam);

		// KDV tutarı
		double kdvtutari = indirimlitoplam * VAT_RATE;
		System.out.printf("KDV Tutarı: %.2f TL\n\n", kdvtutari);

		// genel toplam
		double geneltoplam = indirimlitoplam + kdvtutari + SHIPPING_FEE;
		System.out.printf("Genel Toplam: %.2f TL\n", geneltoplam);

		inputScanner.close();

	}

}
