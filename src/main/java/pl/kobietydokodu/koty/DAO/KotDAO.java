package pl.kobietydokodu.koty.DAO;

import java.util.LinkedList;
import java.util.List;
import pl.kobietydokodu.koty.domain.Kot;

public class KotDAO {

	private List<Kot> koty=new LinkedList<Kot>();
	
	public void dodajKota(Kot kot){
		koty.add(kot);
	}

	@Override
	public String toString() {
		return "KotDAO [koty=" + koty + "]";
	}

	public List getKoty() {
		return koty;
	}

	public void setKoty(List koty) {
		this.koty = koty;
	}
	
	
	
	
	
}
