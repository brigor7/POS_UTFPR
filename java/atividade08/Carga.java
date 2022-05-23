final public class Carga extends Veiculo implements Calcular {

	private int cargaMax;
	private int tara;

	public Carga() {
		cargaMax = 0;
		tara = 0;
	}

	public int getCargaMax() {
		return cargaMax;
	}

	final public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	public int getTara() {
		return tara;
	}

	final public void setTara(int tara) {
		this.tara = tara;
	}

	@Override
	public float calcVel(float velocMax) {
		return velocMax * 10000;
	}

	@Override
	public int calcular() {
		int somaNum = 0;
		somaNum += getMotor().getQtdPist();
		somaNum += getMotor().getPotencia();
		somaNum += getQtdRodas();
		somaNum += getVelocMax();
		somaNum += getTara();
		somaNum += getCargaMax();
		
		return somaNum;
	}

}
