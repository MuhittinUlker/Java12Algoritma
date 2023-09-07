package lesson013.product;

import java.util.ArrayList;
import java.util.List;

public class Database {

	private static List<Product> database = new ArrayList<>();

	public static List<Product> getDatabase() {
		return database;
	}

	public static void setDatabase(List<Product> database) {
		Database.database = database;
	}
	
	
	
}
