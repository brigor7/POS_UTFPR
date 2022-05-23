final public class Passeio extends Veiculo implements Calcular {
	
	private int qtdPassageiros;
	
	public Passeio() {
		qtdPassageiros = 0;
	}

	public int getQtdPassageiros() {
		return qtdPassageiros;
	}
	
	final public void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}

	@Override
	public float calcVel(float velocMax) {
		float velocidade = velocMax * 1000;
		return velocidade;
	}

	@Override
	public int calcular() {
		int somaLetras = 0;
		somaLetras += getPlaca().length();
		somaLetras += getMarca().length();
		somaLetras += getModelo().length();
		somaLetras += getCor().length();
		return somaLetras;
	}


}
