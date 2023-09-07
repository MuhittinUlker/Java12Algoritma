package lesson014;

import java.util.Random;
import java.util.Scanner;

public class AccountManager {

	static Scanner scanner = new Scanner(System.in);
	static Random rnd = new Random();

	public void paraYatir(Account account, double yatirilanTutar) {
		
		if (yatirilanTutar > 0 && yatirilanTutar <= 10000) {
			account.setMoney(account.getMoney() + yatirilanTutar);
			System.out.println("Hesabınıza " + yatirilanTutar + " TL tutarında para yatırıldı.\nGüncel bakiyeniz: "
					+ account.getMoney() + " TL");
		} else {
			System.out.println("10.000 TL'den fazla yatıramazsınız.");
		}
	}

	public void paraCek(Account account,double cekilecekTutar) {
		
		if (cekilecekTutar > 5000) {
			System.out.println("Günlük limitiniz 5000 TL'dir.");
		} else {
			if (account.getMoney() - cekilecekTutar < 0) {
				System.out.println("Yetersiz bakiye");
			} else {
				account.setMoney(account.getMoney() - cekilecekTutar);
				System.out.println("Hesabınızdan " + cekilecekTutar + " tutarında para çekildi.\nGüncel bakiyeniz: "
						+ account.getMoney() + " TL");
			}
		}
	}

	public void hesapBilgileri(Account account) {
		System.out.println("Hesap No: " + account.getAccountNo() + " Güncel Bakiyeniz: " + account.getMoney() + "TL");
	}
}
