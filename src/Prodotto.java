import java.util.ArrayList;
import java.util.List;

public class Prodotto {
	private String marca;
	private String modello;
	private double prezzo;
	private String descrizione;
	private List<Proprieta> prop = new ArrayList<>();
	private int numeroPunti;

	public Prodotto(String marca, String mod, double pre, String desc, List<Proprieta> proprieta,
			int numeroPunti) {
		super();
		this.marca = marca;
		this.modello = mod;
		this.prezzo = pre;
		this.descrizione = desc;
		this.prop = prop;
		this.numeroPunti = numeroPunti;
	}

	public List<Proprieta> getProprieta() {
		return prop;
	}

	public void setProprieta(List<Proprieta> proprieta) {
		this.proprieta = proprieta;
	}

	public int getNumeroPunti() {
		return numeroPunti;
	}

	public void setNumeroPunti(int numeroPunti) {
		this.numeroPunti = numeroPunti;
	}

	@Override
	public String toString() {
		return "Prodotto [marca=" + marca + ", modello=" + modello + ", prezzo=" + prezzo + ", descrizione="
				+ descrizione + ", proprieta=" + prop + ", numeroPunti=" + numeroPunti + "]";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}
