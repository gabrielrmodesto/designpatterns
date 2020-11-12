import java.util.Calendar;

public class Conta {
    private String titular;
    protected double saldo;
	private Calendar dataAbertura;
	private String agencia;
	protected EstadoDaConta estado;
	
	public Conta(String titular, double saldo, Calendar dataAbertura){
        this.titular = titular;
        this.saldo = saldo;
		this.dataAbertura = dataAbertura;
		estado = new Positivo();
    }

    public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void saca(double valor) {
    	estado.saca(this, valor);
    }
    public void deposita(double valor) {
    	estado.deposita(this, valor);
    }
}