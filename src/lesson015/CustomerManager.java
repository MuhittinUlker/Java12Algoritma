package lesson015;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CustomerManager {
	
	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

	public void register() {
		String username = Utility.getStringValue("Username Girin: ");
		String password = Utility.getStringValue("Password Girin: ");
		String tc = Utility.getStringValue("T.C. Girin: ");
		double balance = Utility.getDoubleValue("Bakiyenizi girin: ");
		Customer customer = new Customer(username, password, tc, balance);
		Runner.library.getCustomerList().add(customer);
		System.out.println(username+" kullanıcı adı ile kayıt yapıldı.");
	}
	
	public Customer login() {
		while (true) {
			String username = Utility.getStringValue("Username Girin: ");
			
			Customer customer = findByUsername(username);
			if (customer!=null) {
				for (int i = 3; i >=0; i--) {
					String password = Utility.getStringValue("Password Girin: ");
					if (customer.getPassword().equals(password)) {
						System.out.println("Hoşgeldiniz "+username);
						return customer;
				}else {
					System.out.println("Şifre hatalı.."+(i-1)+" hakkınız kaldı..");
				}
			}System.out.println("Hesabınız askıya alındı..");
			customer.setLevel(ELevel.SUSPENDED);
			return null;
		}else {
			System.out.println("Kullanıcı bulunamadı..");
			return null;
		}
	}
}
	
	private Customer findByUsername(String username) {
		for (Customer customer : Runner.library.getCustomerList()) {
			if (customer.getUsername().equals(username)) {
				return customer;
			}
		}
		return null;
	}
	
	public LocalDateTime zamanBelirle() {
		int iadeTarihi = Utility.getIntValue("Kaç gün sonra iade edeceksiniz: ");
		LocalDateTime currentDate = LocalDateTime.now();
		LocalDateTime returnDate = currentDate.plusDays(iadeTarihi);
		return returnDate;
	}
	
	
}
