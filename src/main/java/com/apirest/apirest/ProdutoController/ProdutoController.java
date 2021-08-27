package com.apirest.apirest.ProdutoController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.apirest.apirest.ProdutoInterface.ProdutoRepository;
import com.apirest.apirest.ProdutoModel.Produto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value="API REST Produtos")
@CrossOrigin(origins="*")
public class ProdutoController {
	
	@Autowired	
	public ProdutoRepository prodRepository;
	
	
	@GetMapping("/produtos")
	@ApiOperation(value="Retorna uma lista de produtos.")
	public List <Produto> listaProduto(){
		return prodRepository.findAll();
	}
	
	@GetMapping("/produto/{id}")
	@ApiOperation(value="Retorna um produto pelo id.")
	public Produto listaProdutoUnico(@PathVariable(value="id")long id){
		return prodRepository.findById(id);
	}

	@PostMapping("/produto/postar")
	@ApiOperation(value="Realiza a postagem de um produto!")
	public Produto salvaProduto(@RequestBody Produto produto){
		return prodRepository.save(produto);
	}
	@PutMapping("/produto/alterar")
	@ApiOperation(value="Altera o valor dos produtos.")
	public Produto alteraProduto(@RequestBody Produto produto){
		return prodRepository.save(produto);
	}
	@DeleteMapping("/produto/{id}")
	@ApiOperation(value="Delete o valor desejado.")
	public void deletaProduto(@PathVariable(value="id")long id) {
		prodRepository.deleteById(id);
	}
}