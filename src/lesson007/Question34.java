package lesson007;

import java.util.Random;
import java.util.Scanner;

public class Question34 {

	public static void main(String[] args) {
		
		// 5 tahmin haklı sayi tahmin uygulaması
		// sürekli kullanıcıdan sayı tahmini istenecek
		// küçük tahmin ise arttır değilse azalt diyeceğiz
		// kaçıncıda doğru yaptığını söyle
		// sayı 1-100 arasında rnd sayıyı tahmin
		
		Scanner scanner = new Scanner(System.in);
		Random rnd = new Random();
		int[] tahminler=new int[5];
		int tahminHakkı=5;
		int sayi = rnd.nextInt(1,101);
		System.out.println("Random sayınız===> "+sayi);
		System.out.print(tahminHakkı+" hakkınız var. Bir tahmin giriniz: ");
		int tahmin = scanner.nextInt();
		int sayac=1,tahminSayisi=0;
		bitir:
		while(tahminHakkı>0) {
			sayac++;
			tahminHakkı--;
			tahminler[tahminSayisi]=tahmin;
			tahminSayisi++;
			if(tahmin==sayi) {
				System.out.println("Tebrikler "+(sayac-1)+". denemede buldunuz.");
				System.out.print("Kaçıncı tahmininizi görmek istersiniz? ");
				int soru = scanner.nextInt();
				System.out.println(soru+". tahmininiz: "+tahminler[soru-1]);
				break;					
			}else if(tahminHakkı==0) {
				break bitir;
			}
			else if (tahmin<sayi) {
				System.out.println("Bilemediniz. Tahminizi arttırın.");	
				System.out.print(tahminHakkı+" hakkınız kaldı.Bir tahmin giriniz: ");
				tahmin = scanner.nextInt();
			}else if(tahmin>sayi) {
				System.out.println("Bilemediniz. Tahmininizi azaltın.");
				System.out.print(tahminHakkı+" hakkınız kaldı.Bir tahmin giriniz: ");
				tahmin = scanner.nextInt();
				}
			}
		if(tahminHakkı==0){			
			System.out.println("Tahmin hakkınız bitti.");
			System.out.print("Kaçıncı tahmininizi görmek istersiniz? ");
			int soru = scanner.nextInt();
			System.out.println(soru+". tahmininiz: "+tahminler[soru-1]);
			}
	}	
}
