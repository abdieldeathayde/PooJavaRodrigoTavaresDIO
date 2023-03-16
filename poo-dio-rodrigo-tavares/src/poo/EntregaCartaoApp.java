package poo;

import java.util.ArrayList;

import poomodel.Cliente;
import poomodel.Endereco;

public class EntregaCartaoApp {

	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		endereco.cep = "000000";
		//dados do endereço
		
		Cliente cliente = new Cliente();
		
		//dados do cliente
		try {
			cliente.adicionaEndereco(endereco);
			System.out.println("Endereco adicionado com Sucesso!");
		} catch (Exception e) {
			System.err.println("Houve um erro ao adicionar endereco: " + e.getMessage());
		}
	}
}
