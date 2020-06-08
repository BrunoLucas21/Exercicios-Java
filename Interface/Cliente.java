package Interface;

import java.util.List;
import java.util.ArrayList;

public class Cliente {

    private String nome;
	private List<Cliente> pedidos;
	private int mesa;
	
	public Cliente(String nome) {
		this.nome = nome;
		this.pedidos = new ArrayList<Cliente>();
		this.mesa = mesa;
	}
	
	public void adicionarPedido(Item i) {
		pedidos.add((Cliente) i);
	}
    
} 
    
    
