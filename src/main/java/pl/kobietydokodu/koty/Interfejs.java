package pl.kobietydokodu.koty;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

import pl.kobietydokodu.koty.domain.Kot;


public class Interfejs {

	private static Scanner scanner=new Scanner(System.in);
	
	public static void main(String [] args) {
	
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy.MM.dd");
		Kot kotek=new Kot();
		
        System.out.println("Podaj imiê kota:");
        kotek.setImie(getUserInput());

        System.out.println("Podaj imiê opiekuna:");
        kotek.setImieOpiekuna(getUserInput());
        

        while(true) {
        System.out.println("Podaj datê:");
        String answer=getUserInput();
        boolean check=Pattern.matches("[0-9]{4}\\.[01][0-2]\\.[0-3][0-9]", answer);
        if(check==true) {
            try {
            	kotek.setData(sdf.parse(answer));
            	break;
                }
                catch(Exception e) {}
        	}
        }
        
        while(true) {
        System.out.println("Podaj wagê:");
        String answer=getUserInput();
        boolean check=Pattern.matches("[0-9]+(\\.[0-9]+)?", answer);
        if(check==true) {
            	kotek.setWaga(Float.valueOf(answer));
            	break;
        	}
        }
	
        System.out.print(kotek);
	}
	
	public static String getUserInput() {
		return scanner.nextLine().trim();
	}

}