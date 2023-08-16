package lesson003;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		
		//girilen 3 sayıyı büyükten küçüğe sıralayalım
		
		Scanner scanner = new Scanner(System.in);

		int sayi1, sayi2, sayi3,enBuyuk=0,enKucuk=0,ortanca=0;

		System.out.println("İlk sayıyı giriniz:");
		sayi1 = scanner.nextInt();

		System.out.println("İkinci sayıyı giriniz:");
		sayi2 = scanner.nextInt();

		System.out.println("Üçüncü sayıyı giriniz:");
		sayi3 = scanner.nextInt();
		
		if(sayi1>=sayi2 && sayi2>=sayi3) {
			enBuyuk=sayi1;
		}else if(sayi2>=sayi1 && sayi2>=sayi3) {
			enBuyuk=sayi2;
		}else{
			enBuyuk=sayi3;
		}
		
		if(sayi1<=sayi2 && sayi2<=sayi3) {
			enKucuk=sayi1;
		}else if(sayi2<=sayi1 && sayi2<=sayi3) {
			enKucuk=sayi2;
		}else{
			enKucuk=sayi3;
		}
		
		if(sayi1<=sayi2 && sayi1>=sayi3) {
			ortanca=sayi1;
		}else if(sayi2<=sayi3&&sayi2>=sayi1) {
			ortanca=sayi2;
		}else {
			ortanca=sayi3;
		}
		
		System.out.println(enBuyuk +" > "+ ortanca +" > " +enKucuk);
		
	}

}
