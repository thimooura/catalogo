package application.service;

import domain.Produtos;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class ProdutoDetalhadoResponse {
    private UUID idProduto;
    private String name;
    private String description;

    private String preco;

    private LocalDateTime dataDoCadastro;

    public ProdutoDetalhadoResponse(Produtos produtos) {
        this.name = produtos.getName();
        this.description = produtos.getDescription();
        this.preco = produtos.getPreco();
        this.dataDoCadastro = produtos.getDataDoCadastro();
        this.idProduto = produtos.getIdProduto();
    }
}
