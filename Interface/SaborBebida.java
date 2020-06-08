package Interface;

public enum SaborBebida {
    
    COCA_COLA(5),
	PEPSE(3),
	SPRITE(3),
	FANTA(2),
	SUCO_DE_LARANJA(2.5),
	AGUA_COM_GAS(2.5),
	GUARANA(4);
	
	private double valor;
	
	private SaborBebida(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}
}