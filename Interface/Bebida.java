package Interface;

public class Bebida implements Item{
    
    protected Tamanho tamanho;
	
	public Tamanho getTamanho() {
		return tamanho;
	}
	
	protected SaborBebida sabor;
	
	public Bebida(Tamanho tamanho, SaborBebida sabor) {
		this.sabor = sabor;
		this.tamanho = tamanho;
	}
	
	public SaborBebida getSabor() {
		return sabor;
	}

	@Override
	public double getPreco() {
		return sabor.getValor() + tamanho.getValor();
	}

	@Override
	public String getDescricao() {
		return sabor.name()+" "+tamanho.name();
	}
}