package br.com.dio.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.dio.model.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Long>{

}
