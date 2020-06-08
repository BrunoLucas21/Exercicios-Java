package Interface;

public class Restaurante extends Cliente {
	
	private String nome;
	
	public Restaurante(String nome) {
		super(nome);
	}

	Cliente c = new Cliente(nome);
	
	public void adicionarCliente(Cliente c) {
		Item mesa = null;
		c.adicionarPedido(mesa);
	}
	
	public void adicionarPedido(int mesa, Item i) throws ClienteInexistenteException{
		
		throw new ClienteInexistenteException();
	}
	
	public void removerPedido(int mesa, Item i) throws PedidoInexistenteException{
		throw new PedidoInexistenteException();
	}
	
	public double computarPagamentoCliente(int mesa) {
		return mesa;
	}
	
	public void receberPagamentoCliente(int mesa, double pagamento) throws PagamentoInvalidoException{
		throw new PagamentoInvalidoException();
	}
}