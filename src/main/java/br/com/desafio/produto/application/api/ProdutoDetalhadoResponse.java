package br.com.desafio.produto.application.api;

import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.desafio.produto.domain.Produtos;

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
