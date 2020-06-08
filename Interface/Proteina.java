package Interface;

public enum Proteina {
    
    PICANHA(20), 
	MAMINHA(15), 
	FRANGO(15), 
	LINGUICA(5), 
	ALCATRA(10), 
	CUPIM(12);
	
	private double valor;
	
	private Proteina(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
}