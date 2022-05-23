public abstract class Veiculo {
	
	private String placa;
	private String marca;
	private String modelo;
	private String cor;
	private int qtdRodas;
	private float velocMax;
	private Motor motor;
	
	public Veiculo() {
		placa = "";
		marca = "";
		modelo = "";
		cor = "";
		qtdRodas = 0;
		velocMax = 0;
		motor = new Motor();
	}

	public String getPlaca() {
		return placa;
	}

	final public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	final public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	final public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	final public void setCor(String cor) {
		this.cor = cor;
	}

	public float getVelocMax() {
		return velocMax;
	}

	final public void setVelocMax(float velocMax) throws VelocException {		
		if (velocMax <= 80 || velocMax >=110) {
			throw new VelocException();
		}
		this.velocMax = velocMax;
	}

	public int getQtdRodas() {
		return qtdRodas;
	}

	final public void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}

	public Motor getMotor() {
		return motor;
	}
	
	final public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", velocMax="
				+ velocMax + ", qtdRodas=" + qtdRodas + ", - motor - qtdPist=" + motor.getQtdPist() + " potencia= "+motor.getPotencia()+" ]";
	}
	
	public abstract float calcVel(float velocMax);

}
