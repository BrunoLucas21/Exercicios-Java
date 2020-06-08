package Interface;

import Interface.Carboidrato;
import Interface.Proteina;

public abstract class Refeicao implements Item {
    
    private double desconto;
	private Proteina prot;
	private Carboidrato carb;
	
	public Refeicao(Proteina prot, Carboidrato carb) {
		this.carb = carb;
		this.prot = prot;
		this.desconto = 0.2;
	}
	
	@Override
	public double getPreco() {
		return prot.getValor() + carb.getValor();
	}
	
	@Override
	public String getDescricao() {
		return prot.name()+" com "+carb.name();
	}

	public Proteina getProteina() {
		return prot;
	}
	
	public Carboidrato getCarboidrato() {
		return carb;
	}
}