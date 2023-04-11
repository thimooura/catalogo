package br.com.desafio.produto.application.api;

import lombok.Value;

import java.util.List;
import java.util.stream.Collectors;

import br.com.desafio.produto.domain.Produtos;

@Value
public class ProdutoListResponse {

    private String name;
    private String description;

    private String preco;


    public static List<ProdutoListResponse> converte(List<Produtos> produtos) {
        return produtos.stream()
                .map(ProdutoListResponse::new)
                .collect(Collectors.toList());
    }
    public ProdutoListResponse(Produtos produtos) {
        this.name = produtos.getName();
        this.description = produtos.getDescription();
        this.preco = produtos.getPreco();
    }


    }

