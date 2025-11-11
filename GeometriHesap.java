/*
 * Ad Soyad: Ebubekir Yılmaz
 * Öğrenci No: 250541051
 * Tarih: 9.11.2025
 * Açıklama: Geometrik Şekil Hesaplayıcı
 * Bu program kullanıcıdan istediği ölçüleri aldıktan sonra
 * metot yardımıyla kare, dikdörtgen, daire ve üçgen şekillerinin
 * alan ve çevre hesaplamalarını yapıp ekrana yazdırır.
 */

import java.util.Scanner;

public class GeometrikSekilHesaplayici {
	// kare
	public static double kareninAlaniniHesapla(double side) {
		return side * side;

	}

	public static double kareninCevresiniHesapla(double kenar) {
		return 4 * kenar;

	}

	// dikdörtgen
	public static double dikdortgeninAlaniniHesapla(double short_side, double long_side) {
		return short_side * long_side;

	}

	public static double dikdortgeninCevresiniHesapla(double short_side, double long_side) {
		return 2 * (short_side + long_side);

	}

	// daire
	public static double daireninAlaniniHesapla(double radius) {
		return radius * radius * Math.PI;

	}

	public static double daireninCevresiniHesapla(double radius) {
		return 2 * Math.PI * radius;
	}

	public static double ucgeninAlaniniHesapla(double base, double height) {
		return base * height / 2;
	}

	public static double ucgeninCevresiniHesapla(double a, double b, double c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("-----Geometrik Şekil Hesaplayıcı-----\n");

		System.out.print("Karenin Bir Kenarı: ");
		double kare_kenar = input.nextDouble();

		double karenin_alani = kareninAlaniniHesapla(kare_kenar);
		double karenin_cevresi = kareninCevresiniHesapla(kare_kenar);

		System.out.printf("Karenin Alanı: %.2f cm²\n", karenin_alani);
		System.out.printf("Karenin Çevresi: %.2f cm\n\n", karenin_cevresi);

		System.out.print("Dikdörtgenin Kısa Kenarı: ");
		double kisa_kenar = input.nextDouble();

		System.out.print("Dikdörtgenin Uzun Kenarı: ");
		double uzun_kenar = input.nextDouble();

		double dikdortgenin_alani = dikdortgeninAlaniniHesapla(kisa_kenar, uzun_kenar);
		double dikdortgenin_cevresi = dikdortgeninCevresiniHesapla(kisa_kenar, uzun_kenar);

		System.out.printf("Dikdörtgenin Alanı: %.2f cm²\n", dikdortgenin_alani);
		System.out.printf("Dikdörtgenin Çevresi: %.2f cm\n\n", dikdortgenin_cevresi);

		System.out.print("Dairenin Yarıçapı: ");
		double yaricap = input.nextDouble();

		double dairenin_alani = daireninAlaniniHesapla(yaricap);
		double dairenin_cevresi = daireninCevresiniHesapla(yaricap);

		System.out.printf("Dairenin Alanı: %.2f cm²\n", dairenin_alani);
		System.out.printf("Dairenin Çevresi: %.2f cm\n\n", dairenin_cevresi);

		System.out.print("Üçgenin Tabanı: ");
		double taban = input.nextDouble();

		System.out.print("Üçgenin Yüksekliği: ");
		double yukseklik = input.nextDouble();

		System.out.print("Üçgenin a Kenarı: ");
		double a = input.nextDouble();

		System.out.print("Üçgenin b Kenarı: ");
		double b = input.nextDouble();

		System.out.print("Üçgenin c Kenarı: ");
		double c = input.nextDouble();

		double ucgenin_alani = ucgeninAlaniniHesapla(taban, yukseklik);
		double ucgenin_cevresi = ucgeninCevresiniHesapla(a, b, c);

		System.out.printf("Üçgenin Alanı: %.2f cm²\n", ucgenin_alani);
		System.out.printf("Üçgenin Çevresi: %.2f cm\n", ucgenin_cevresi);

		input.close();

	}

}
