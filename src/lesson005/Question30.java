package lesson005;

public class Question30 {

	public static void main(String[] args) {

		// Java,Spring,Postgre,React

		String text = "  Java  , Spring , Postgre   ,  React";

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ',') {
				System.out.println();
				continue;
				}
			if(text.charAt(i) == ' ') {
				continue;

			} 
				System.out.print(text.charAt(i));
			
		}
		/*System.out.println();
		System.out.println();

		int index = 0;

		for (int j = 0; j < text.length(); j++) {
			if (text.charAt(j) == ',') {
				System.out.println(text.substring(index, j));
				index = j + 1;
			}
		}
		System.out.println(text.substring(index));
*/
	}
}
