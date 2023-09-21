package lesson020;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApiOrnek2 {

	/*	User sınıfımız olsun
	 * id ve name fields
	 * toString metodu
	 * bilgileriGoster metodu
	 * mainde user listesi oluşturup birkaç user atalım
	 * 
	 * 
	 */
	
	public static void main(String[] args) {

		List<User> users = new ArrayList<>();
		users.add(new User(1, "Ahmet",15000,EGender.MALE));
		users.add(new User(2, "Ali",20000,EGender.MALE));
		users.add(new User(3, "Ayşe",10000,EGender.FEMALE));
		users.add(new User(4, "Zeynep",25000,EGender.FEMALE));
		users.add(new User(5, "Ahmet",17000,EGender.MALE));
		
		//1-bütün userlar için bilgileriGoster metodunu çağıralım
		System.out.println("*****-*****");
		users.forEach(User::getInfo);
		
		//2- id'si 3ten büyükleri listeye atıp listeye getInfo diyelim
		System.out.println("*****-*****");
		List<User> filteredBy3User = users.stream()
				.filter(user->user.getId()>3)
				.toList();
		
		filteredBy3User.forEach(u->u.getInfo());
		
		//3- ismi ahmet olanları yeni liste
		System.out.println("*****-*****");
		
		List<User> ismiAhmet = users.stream()
				.filter(user->user.getName().equalsIgnoreCase("Ahmet"))
				.toList();
		ismiAhmet.forEach(System.out::println);
		
		/*
		 * toList vs collect.toList : toList immutable list döndüğü için
		 * collect ile toList yaparsak sonradan Liste üzerinde işlem yapabiliriz.
		 */
		
		//4- her bir user için yeni bir user nesnesi oluşturup isimlerinin yanına
		//   BA ekleyerek yeni listeye atalım
		System.out.println("*****-*****");
		
		List<User> newUsers = users.stream()
				.map((user-> new User(user.getId(), user.getName()+"BA")))
				.collect(Collectors.toList());
		
		newUsers.forEach(User::getInfo);
		
		//5- kullanıcaları aldıkları maaşa göre sıralayalım
		System.out.println("*****-*****");
		List<User> maasaGoreSirali = users.stream().sorted(Comparator.comparing(User::getSalary).reversed()).collect(Collectors.toList());
		maasaGoreSirali.forEach(User::getInfo);
		
		//6- isim ve salary değerlerini hashMap yapısına atalım
		System.out.println("*****-*****");
		Map<Integer, Integer> isimMaasMap = users.stream()
				.collect(Collectors.toMap(User::getId, User::getSalary));
		
		isimMaasMap.forEach((k,v)->System.out.println(k+" "+v));
		
		//7- 
	}

}
