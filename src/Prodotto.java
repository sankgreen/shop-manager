import java.util.ArrayList;
import java.util.List;

public class Prodotto {
	private String marca;
	private String modello;
	private double prezzo;
	private String descrizione;
	private List<Proprieta> proprieta = new ArrayList<>();
	private int numeroPunti;

	public Prodotto(String marca, String mod, double prezzo, String desc, List<Proprieta> proprieta,
			int numeroPunti) {
		super();
		this.marca = marca;
		this.modello = mod;
		this.prezzo = prezzo;
		this.descrizione = desc;
		this.proprieta = proprieta;
		this.numeroPunti = numeroPunti;
	}

	public List<Proprieta> getProprieta() {
		return proprieta;
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
				+ descrizione + ", proprieta=" + proprieta + ", numeroPunti=" + numeroPunti + "]";
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
