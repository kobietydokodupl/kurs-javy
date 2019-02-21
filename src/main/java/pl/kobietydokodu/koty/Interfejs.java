package pl.kobietydokodu.koty;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import pl.kobietydokodu.koty.DAO.KotDAO;
import pl.kobietydokodu.koty.domain.Kot;


public class Interfejs {
	
	private static KotDAO kotDAO=new KotDAO();
	private static SimpleDateFormat sdf=new SimpleDateFormat("yyyy.MM.dd");
	private static Scanner scanner=new Scanner(System.in);
	
	public static void main(String [] args) {
		
		
	
		while(true) {
		System.out.println("Witaj! Wybierz co chcesz zrobiæ:\n Dodaj kota- wpisz 1.\n Poka¿ koty- wpisz 2. \n Zamknij program- wpisz x");
		String userChoice=getUserInput();
		
		if(userChoice.equals("1")) {
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
		           
		           kotDAO.dodajKota(kotek);
		
			continue;
		}
		if(userChoice.equals("2")) {
			List<Kot> cats=kotDAO.getKoty();
			for(int i=0;i<cats.size();i++) {
				System.out.println("Imiê kota: "+ cats.get(i).getImie()+ " id kota: "+i);
			}
			Integer catIndex;
			while(true) {
			System.out.println("Wybierz kota, wpisz jego id");
			String answer=getUserInput();
			if(Pattern.matches("[0-9]+",answer )) {
				catIndex=Integer.parseInt(answer);
				break;
			}
			System.out.println("Coœ posz³o nie tak...");
			
			
			}
			if(cats.get(catIndex)!=null)
				System.out.println("Czeœæ nazwyam siê " +cats.get(catIndex)x);
			else {
				System.out.println("Taki kot nie istnieje");
			}
			continue;
		}
		if(userChoice.equals("x")) {
			break;
		}
		}
	}
	
	public static String getUserInput() {
		return scanner.nextLine().trim();
	}

}