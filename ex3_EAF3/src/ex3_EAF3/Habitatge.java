package ex3_EAF3;

public class Habitatge{

	private String numeroCompte = "";
	private String nomTitular = "";
	private float saldo = 0;
	private float interes = 0;
	
	public Habitatge(String numeroCompte, String nomTitular, float saldo, float interes) {
		super();
		this.numeroCompte = numeroCompte;
		this.nomTitular = nomTitular;
		this.saldo = saldo;
		this.interes = interes;
	}

	public void ingres(float importe) {
		this.saldo = saldo+importe;
	}
	
	public void transferencia(float importe) {
		this.saldo = saldo-importe;
		
	}

	// GETTERS && SETTERS
	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public String getNomTitular() {
		return nomTitular;
	}

	public void setNomTitular(String nomTitular) {
		this.nomTitular = nomTitular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getInteres() {
		return interes;
	}

	public void setInteres(float interes) {
		this.interes = interes;
	}
}
