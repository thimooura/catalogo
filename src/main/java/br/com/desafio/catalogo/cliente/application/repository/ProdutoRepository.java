package br.com.desafio.catalogo.cliente.application.repository;

import br.com.desafio.catalogo.cliente.domain.Produtos;

import java.util.List;

public interface ProdutoRepository {
    Produtos salva(Produtos produtos);
    List<Produtos> buscaTodosProdutos();

    Produtos buscaProdutosAtravesId(java.util.UUID idProduto);

}
