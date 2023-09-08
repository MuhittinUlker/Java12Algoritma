package lesson014;

import java.time.LocalDateTime;

public class AdminManager {

	public void basvuruOnayla(Account account) {
		if (account.isKrediBasvurusu()) {
			System.out.println("Kredi başvurunuz onaylanmıştır.");
			account.setMoney(account.getMoney() + account.getIstenenKrediMiktari());
			account.setIstenenKrediMiktari(0);
			account.setKrediBasvurusu(false);
			account.setKrediBorcuVarMi(true);
			account.setKrediBorcu(account.getIstenenKrediMiktari());
		} else {
			System.out.println(account.getAccountNo() + " nolu hesap için kredi başvurusu bulunmamaktadır.");
		}
	}
	public void basvuruOnayla(User user) throws InterruptedException {
		if(user.getAccount().isKrediBasvurusu()) {
			System.out.println(LocalDateTime.now());
			Thread.sleep(5000);
			mailGonder(user);
			System.out.println("Kredi başvurunuz onaylanmıştır. ");
			user.getAccount().setMoney(user.getAccount().getMoney() + user.getAccount().getIstenenKrediMiktari());
			user.getAccount().setIstenenKrediMiktari(0);
			user.getAccount().setKrediBasvurusu(false);
		}else {
			System.out.println(user.getAccount().getAccountNo() + " Numaralı Hesap için Kredi başvurusu bulunmamaktadır");
		}
	}

	public void basvuruReddet(Account account) {
		if (account.isKrediBasvurusu()) {
			System.out.println("Kredi başvurunuz reddedilmiştir.");
			account.setIstenenKrediMiktari(0);
			account.setKrediBasvurusu(false);
		}
	}
	
	public void mailGonder(User user) { // metoda -> String mesaj ekle
		Mail mail = new Mail();
		mail.setBaslik("X Bank Kredi Baş. Hk.");
		mail.setIcerik(user.getAccount().getIstenenKrediMiktari()+" tutarında krediniz onaylandı.\nBu mail "+mail.getGonderiSaati().getHour()+":"+mail.getGonderiSaati().getMinute()+"'da gönderilmiştir.");
		user.getGelenKutusu().add(mail);
	}
}
