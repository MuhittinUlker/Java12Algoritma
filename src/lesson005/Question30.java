package lesson005;

public class Question30 {

	public static void main(String[] args) {

		// Java, Spring ,Postgre , React
		// java
		// spring
		// postgre
		// react

		String text = "  Java  ,  ,   Spring , Postgre  , React  ";
		
		
		for(int i=0;i<text.length();i++) {
			
			if(text.charAt(i)==' '||text.charAt(i)==',') {
				continue;
			}else {

				if(text.charAt(i)==' ') {
					continue;
				}
				if (text.charAt(i)==',') {
					continue;
				}
				if((text.charAt(i)!=' ' || text.charAt(i)!=',')
						&&(text.charAt(i-1)==' '||(text.charAt(i-1)==','))) {
					System.out.println();
				}
			}
			System.out.print(text.charAt(i));	
		}
	}
}

/*
 * if (text.charAt(i) == ',') { index=i+1; for(int j = 0; ; j++) { String
 * yeniText=text.substring(index); if(yeniText.charAt(j) == ',') {
 * if(text.charAt(i) == ' ') { continue; } break; } break; } continue; }
 * if(text.charAt(i) == ' ') { continue; } System.out.print(text.charAt(i));
 */

/*
 * for(int i=0;i<text.length();i++) {
 * 
 * char karakter =text.charAt(i);
 * 
 * switch (karakter) { case ' ',',': break; case
 * 'A','B','C','Ç','D','E','F','G','H','I','İ','J','K','L','M','N','O','Ö','P','
 * R','S','Ş','T','U','Ü','V','Y','W','Q','Z': System.out.println();
 * System.out.print(karakter); break; default: System.out.print(karakter);
 * break; } }
 */

/*
 * for(int i=0;i<text.length();i++) {
 * 
 * if(i==text.length() ) { continue; } else {
 * 
 * if (text.charAt(i) == ',' || text.charAt(i) == ' ' ) { index=i+1; continue; }
 * else if(((text.charAt(i) == ',' || text.charAt(i) == ' ' )) &&
 * ((text.charAt((index)) != ',' || text.charAt((index)) != ' ' ))) {
 * System.out.println(); continue; } else { System.out.print(text.charAt(i)); }
 * } }
 */

/*
 * for (int i = 0; i < text.length(); i++) {
 * 
 * if (text.charAt(i)==' ') continue; if (text.charAt(i)==',') { index=i+1;
 * continue; }else if((text.charAt(i)==',') && ((text.charAt(index)!='
 * ')||text.charAt(index)!=',')){ System.out.println(); }else {
 * System.out.print(text.charAt(i)); } }
 */