import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		ShopManager shop1 = new ShopManager();
		List<Proprieta> proprietaProdotto = new ArrayList<>();
		Proprieta proprie = new Proprieta("cottura", "10");
		Proprieta proprieta1 = new Proprieta("cottura", "20");
		proprietaProdotto.add(proprie);
		proprietaProdotto.add(proprieta1);
		Prodotto prodotto = new Prodotto("barilla", "pasta", 15, "pasta integrale", proprietaProdotto, 5);
		Prodotto prodotto1=new Prodotto("mulino bianco","biscotti",4,"Biscotti integrali",proprietaProdotto,14);
		
	}

}
