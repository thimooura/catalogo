package br.com.desafio.produto.application.repository;

import java.util.List;

import br.com.desafio.produto.domain.Produtos;

public interface ProdutoRepository {
	Produtos salva(Produtos produtos);

	List<Produtos> buscaTodosProdutos();

	Produtos buscaProdutosAtravesId(java.util.UUID idProduto);

}
