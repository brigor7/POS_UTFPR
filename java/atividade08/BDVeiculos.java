import java.util.ArrayList;
import java.util.List;

public class BDVeiculos {
	
	private List<Passeio> listaPasseio;
	private List<Carga> listaCarga;
        private static BDVeiculos bdVeiculos;
	
	public BDVeiculos() {
            listaPasseio = new ArrayList<>();
            listaCarga = new ArrayList<>();
	}
        
        public static BDVeiculos getInstance(){
            if (bdVeiculos == null){
            	bdVeiculos = new BDVeiculos();
            }
            return bdVeiculos;
        }
	
	public List<Passeio> getListaPasseio() {
		return listaPasseio;
	}

	public void setListaPasseio(List<Passeio> listPasseio) {
		this.listaPasseio = listPasseio;
	}

	public List<Carga> getListaCarga() {
		return listaCarga;
	}

	public void setListCarga(List<Carga> listaCarga) {
		this.listaCarga = listaCarga;
	}

	
	public void placaVeiculoExisteCadastrada(String placa) throws VeicExistException {
		for (int i = 0; i < listaPasseio.size(); i++) {
			if (listaPasseio.get(i)!= null && listaPasseio.get(i).getPlaca().equalsIgnoreCase(placa)) {
				throw new VeicExistException();
			}						
		}
	}
	
	public void placaCargaCadastrada(String placa) throws VeicExistException {
		for (int i = 0; i < listaCarga.size(); i++) {
			if (listaCarga.get(i)!= null && listaCarga.get(i).getPlaca().equalsIgnoreCase(placa)) {
				throw new VeicExistException();
			}						
		}
	}
	
	public void velocidadePermitida(float velocidade) throws VelocException {
		for (int i = 0; i < listaPasseio.size(); i++) {
			if (velocidade <= 80 || velocidade >= 110) {
				throw new VelocException();
			}						
		}
	}
	
	@SuppressWarnings("unused")
	private Passeio getPasseio() throws VelocException {
		Passeio passeio = new Passeio();
		passeio.setPlaca("jsf");
		passeio.setVelocMax(100);
		passeio.setMarca("Ford");
		passeio.setModelo("KA");
		
		return passeio;
	}
	
	@SuppressWarnings("unused")
	private Carga getCarga() throws VelocException {
		Carga carga = new Carga();
		carga.setPlaca("jpa");
		carga.setVelocMax(90);
		carga.setMarca("Chevrolet");
		carga.setModelo("S10");
		
		return carga;
	}

}
