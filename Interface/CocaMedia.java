public abstract class CocaMedia extends Bebida{

	public CocaMedia(Tamanho tamanho, SaborBebida sabor) {
		super(tamanho, sabor);
	}
	
	@Override
	public double getPreco() {
		return getTamanho().getValor() + SaborBebida.COCA_COLA.getValor();
	}
	
	@Override
	public String getDescricao(SaborBebida sabor) {
		return ""+getSabor()+""+getTamanho();
	}
	
	@Override
	public String getSabor() {
		return SaborBebida.COCA_COLA.name();
	}
}