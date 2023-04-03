package application.service;

import org.hibernate.validator.constraints.UUID;

import java.util.List;

public interface Produtoservice {
    ProdutoResponse criaProduto(ProdutoRequest produtoRequest);
    List<ProdutoListResponse> buscaTodosProdutos();
    ProdutoDetalhadoResponse buscaProdutoAtravesId(UUID idProduto);

    ProdutoDetalhadoResponse buscaProdutoAtravesId(java.util.UUID idProduto);
}
