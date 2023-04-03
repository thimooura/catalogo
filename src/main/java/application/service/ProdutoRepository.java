package application.service;

import domain.Produtos;
import org.hibernate.validator.constraints.UUID;

import java.util.List;
import java.util.Optional;

public interface ProdutoRepository {
    Produtos salva(Produtos produtos);
    List<Produtos> buscaTodosProdutos();

    Produtos buscaProdutosAtravesId(java.util.UUID idProduto);

}
