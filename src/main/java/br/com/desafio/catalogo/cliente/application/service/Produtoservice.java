package br.com.desafio.catalogo.cliente.application.service;

import br.com.desafio.catalogo.cliente.application.api.ProdutoDetalhadoResponse;
import br.com.desafio.catalogo.cliente.application.api.ProdutoListResponse;
import br.com.desafio.catalogo.cliente.application.api.ProdutoRequest;
import br.com.desafio.catalogo.cliente.application.api.ProdutoResponse;
import org.hibernate.validator.constraints.UUID;

import java.util.List;

public interface Produtoservice {
    ProdutoResponse criaProduto(ProdutoRequest produtoRequest);
    List<ProdutoListResponse> buscaTodosProdutos();
    ProdutoDetalhadoResponse buscaProdutoAtravesId(UUID idProduto);

    ProdutoDetalhadoResponse buscaProdutoAtravesId(java.util.UUID idProduto);
}
