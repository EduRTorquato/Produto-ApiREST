package com.apirest.apirest.ProdutoModel;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



import com.sun.istack.NotNull;

class ProdutoTest {

	@Entity
	public class Contato {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	@NotNull
	private String nome;
	@NotNull
	private String descricao;
	@NotNull
	private float valor;
	
	
	}


}
