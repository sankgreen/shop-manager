import java.util.ArrayList;
import java.util.List;

public class ShopManager {
	public ShopManager() {
		super();
	}

	@Override
	public String toString() {
		return "ShopManager [prodotti=" + prodotti + ", dipendenti=" + dipendenti + ", carteDiFedelta=" + carteDiFedelta
				+ "]";
	}

	private List<Prodotto> prodotti = new ArrayList<>();
	private List<Dipendente> dipendenti = new ArrayList<>();
	private List<CartaFedelta> carteDiFedelta = new ArrayList<>();

	public ShopManager(List<Prodotto> prodotti, List<Dipendente> dipendenti, List<CartaFedelta> carteDiFedelta) {
		super();
		this.prodotti = prodotti;
		this.dipendenti = dipendenti;
		this.carteDiFedelta = carteDiFedelta;
	}

	public List<Prodotto> getProdotti() {
		return prodotti;
	}

	public void setProdotti(List<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}

	public List<Dipendente> getDipendenti() {
		return dipendenti;
	}

	public void setDipendenti(List<Dipendente> dipendenti) {
		this.dipendenti = dipendenti;
	}

	public List<CartaFedelta> getCarteDiFedelta() {
		return carteDiFedelta;
	}

	public void setCarteDiFedelta(List<CartaFedelta> carteDiFedelta) {
		this.carteDiFedelta = carteDiFedelta;
	}
}
