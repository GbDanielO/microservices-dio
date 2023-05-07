package br.com.dio.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dio.model.Carrinho;
import br.com.dio.repository.CarrinhoRepository;

@Service
public class CarrinhoService {

	@Autowired
	private CarrinhoRepository carrinhoRepository;

	public Optional<Carrinho> buscarCarrinhoPorId(Integer id) {
		return carrinhoRepository.findById(id);
	}

	public Carrinho salvar(Carrinho carrinho) {
		return carrinhoRepository.save(carrinho);
	}

	public void deletar(Integer id) {
		carrinhoRepository.deleteById(id);
		
	}
	
	
}
