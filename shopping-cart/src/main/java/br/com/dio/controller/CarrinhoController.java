package br.com.dio.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dio.model.Carrinho;
import br.com.dio.model.Item;
import br.com.dio.service.CarrinhoService;

@RestController
@RequestMapping(value = "/cart")
public class CarrinhoController {

	@Autowired
	private CarrinhoService carrinhoService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public Carrinho addItem(@PathVariable("id") Integer id, @RequestBody Item item) {
        Optional<Carrinho> carrinhoSalvo = carrinhoService.buscarCarrinhoPorId(id);
        Carrinho carrinho;
        if (carrinhoSalvo.isEmpty()) {
            carrinho = new Carrinho(id);
        }
        else {
            carrinho = carrinhoSalvo.get();
        }
        carrinho.getItems().add(item);
        return carrinhoService.salvar(carrinho);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Carrinho> findById(@PathVariable("id") Integer id) {
        Optional<Carrinho> buscarCarrinhoPorId = carrinhoService.buscarCarrinhoPorId(id);
		return carrinhoService.buscarCarrinhoPorId(id).isPresent() ? ResponseEntity.ok(buscarCarrinhoPorId.get()) : ResponseEntity.notFound().build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void clear(@PathVariable("id") Integer id) {
        carrinhoService.deletar(id);
    }

}
