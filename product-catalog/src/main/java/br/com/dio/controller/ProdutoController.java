package br.com.dio.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dio.model.Produto;
import br.com.dio.service.ProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService; 
	
	@RequestMapping(method = RequestMethod.POST)
	Produto criarProduto(@RequestBody Produto produto) {
		return produtoService.criarProduto(produto);
	}
	
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	ResponseEntity<Produto> buscarProdutoPorId(@PathVariable Long id) {
		Optional<Produto> produto = produtoService.buscarProdutoPorId(id);
		return produto.isPresent() ? ResponseEntity.ok(produto.get()) : ResponseEntity.notFound().build();
	}

}
