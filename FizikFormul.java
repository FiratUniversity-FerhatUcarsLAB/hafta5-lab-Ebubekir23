/*
 * Ad Soyad: Ebubekir Yılmaz
 * Öğrenci No: 250541051
 * Tarih: 9.11.2025
 * Açıklama: Fizik Formül Hesaplama
 * Bu program kullanıcıdan istediği değerleri aldıktan sonra
 * metot yardımıyla hız, ivme, kuvvet, iş, güç, kinetik enerji,
 * potansiyel enerji ve momentum formüllerini hesaplayıp ekrana yazdırır.
 */

import java.util.Scanner;

public class FizikFormulAsistani {

	// GRAVITY sabiti
	final static double GRAVITY = 9.8;

	// hız
	public static double hizFormulu(double displacement, double time) {
		return displacement / time;
	}

	// ivme
	public static double ivmeFormulu(double speed, double time) {
		return speed / time;

	}

	// kuvvet
	public static double kuvvetFormulu(double mass, double acceleration) {
		return mass * acceleration;

	}

	// iş
	public static double isFormulu(double force, double distance) {
		return force * distance;

	}

	// güç
	public static double gucFormulu(double work, double time) {
		return work / time;

	}

	// kinetik enerji
	public static double kinetikEnerjiFormulu(double mass, double velocity) {
		return 0.5 * mass * Math.pow(velocity, 2);

	}

	// potansiyel enerji
	public static double potansiyelEnerjiFormulu(double mass, double height) {
		return mass * GRAVITY * height;

	}

	// momentum
	public static double momentumFormulu(double mass, double velocity) {
		return mass * velocity;
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);

		System.out.println("-----Fizik Formül Asistanı-----\n");

		// hız
		System.out.print("Yer Değiştirme: ");
		double yerdegistirme = inputScanner.nextDouble();
		System.out.print("Zaman: ");
		double zaman = inputScanner.nextDouble();

		double hiz = hizFormulu(yerdegistirme, zaman);
		System.out.printf("Hız: %.2f m/s\n\n", hiz);

		// ivme
		System.out.print("Hız Değişimi: ");
		double hizdegisimi = inputScanner.nextDouble();
		System.out.print("Zaman: ");
		double zaman2 = inputScanner.nextDouble();

		double ivme = ivmeFormulu(hizdegisimi, zaman2);
		System.out.printf("İvme: %.2f m/s²\n\n", ivme);

		// kuvvet
		System.out.print("Kütle: ");
		double kutle = inputScanner.nextDouble();
		System.out.print("İvme: ");
		double ivme2 = inputScanner.nextDouble();

		double kuvvet = kuvvetFormulu(kutle, ivme2);
		System.out.printf("Kuvvet: %.2f N\n\n", kuvvet);

		// iş
		System.out.print("Kuvvet: ");
		double kuvvet2 = inputScanner.nextDouble();
		System.out.print("Mesafe: ");
		double mesafe = inputScanner.nextDouble();

		double is = isFormulu(kuvvet2, mesafe);
		System.out.printf("İş: %.2f J\n\n", is);

		// güç
		System.out.print("İş: ");
		double is2 = inputScanner.nextDouble();
		System.out.print("Zaman: ");
		double zaman3 = inputScanner.nextDouble();

		double guc = gucFormulu(is2, zaman3);
		System.out.printf("Güç: %.2f W\n\n", guc);

		// kinetik enerji
		System.out.print("Kütle: ");
		double kutle2 = inputScanner.nextDouble();
		System.out.print("Hız: ");
		double hiz2 = inputScanner.nextDouble();

		double kinetikenerji = kinetikEnerjiFormulu(kutle2, hiz2);
		System.out.printf("Kinetik Enerji: %.2f J\n\n", kinetikenerji);

		// potansiyel enerji
		System.out.print("Kütle: ");
		double kutle3 = inputScanner.nextDouble();
		System.out.print("Yükseklik: ");
		double yukseklik = inputScanner.nextDouble();

		double potansiyelenerji = potansiyelEnerjiFormulu(kutle3, yukseklik);
		System.out.printf("Potansiyel Enerji: %.2f J\n\n", potansiyelenerji);

		// momentum
		System.out.print("Kütle: ");
		double kutle4 = inputScanner.nextDouble();
		System.out.print("Hız: ");
		double hiz3 = inputScanner.nextDouble();

		double momentum = momentumFormulu(kutle4, hiz3);
		System.out.printf("Momentum: %.2f N*s\n", momentum);

		inputScanner.close();

	}

}
