package br.com.dio.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dio.model.Produto;
import br.com.dio.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public Produto criarProduto(Produto produto) {
		return produtoRepository.save(produto);
	}

	public Optional<Produto> buscarProdutoPorId(Long id) {
		return produtoRepository.findById(id);
	}
}
