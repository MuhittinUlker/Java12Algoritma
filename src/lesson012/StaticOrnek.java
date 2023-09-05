package lesson012;

public class StaticOrnek {

	int number1;
	static int number2;

	public void numaraVer() {
		System.out.println("Numara ver metodu");
		number1++;
		number2++;
		System.out.println("num1: " + number1);
		System.out.println("num2: " + number2);
	}

	public static void numaraVer2() {
		System.out.println("Numara ver 2 metodu");
		number2++;
//		number1++;							  //static bir metod içerisinde static olmayan bir özellik 
//		System.out.println("num1: "+number1); //direk olarak kullanılmaz.nesne oluşturarak kullanabiliriz.
		System.out.println("num2: " + number2);
	}

	public static void main(String[] args) {

		number2 = 5;
		StaticOrnek.number2 = 10;
		StaticOrnek nesne = new StaticOrnek();
		nesne.number1 = 10;
		System.out.println(nesne.number1); // 10
		System.out.println(number2); // 10

		nesne = new StaticOrnek();
		System.out.println(nesne.number1); // 0
		System.out.println(number2); // 10

		nesne.numaraVer();
		nesne.numaraVer();

		StaticOrnek nesne2 = new StaticOrnek();
		System.out.println(nesne2.number1); // 0
		System.out.println(nesne.number1); // 2
		System.out.println(number2); // 12
		System.out.println(number2); // 12

		numaraVer2();
		StaticOrnek.numaraVer2();
		nesne.numaraVer();
		nesne2.numaraVer();
		System.out.println("********************************");
		System.out.println(nesne2.number1); // 1
		System.out.println(nesne.number1); // 3
		System.out.println(number2); // 16
		System.out.println(number2); // 16
	}
}
