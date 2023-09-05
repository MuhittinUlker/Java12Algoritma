package lesson012.oop;

import java.util.UUID;

public class Runner {

	public static void main(String[] args) {
		
		BankAccount hesap1 = new BankAccount(UUID.randomUUID().toString(),5450.45);
		
		BankAccount hesap2 = new BankAccount(UUID.randomUUID().toString());
		//hesap2.setBalance(10536.75);
		
		BankAccount hesap3 = new BankAccount();
		
		System.out.println(hesap1);
		
		hesap2.getInfo();
		
		hesap3.getInfo();
	}

}
