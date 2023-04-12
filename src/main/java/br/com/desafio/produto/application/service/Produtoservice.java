package br.com.desafio.produto.application.service;

import java.util.List;
import java.util.UUID;

import br.com.desafio.produto.application.api.ProdutoDetalhadoResponse;
import br.com.desafio.produto.application.api.ProdutoListResponse;
import br.com.desafio.produto.application.api.ProdutoRequest;
import br.com.desafio.produto.application.api.ProdutoResponse;

public interface Produtoservice {
	ProdutoResponse criaProduto(ProdutoRequest produtoRequest);
	List<ProdutoListResponse> buscaTodosProdutos();
	ProdutoDetalhadoResponse buscaProdutoAtravesId(UUID idProduto);

}
