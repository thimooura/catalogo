package br.com.desafio.catalogo.cliente.application.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class ProdutoRequest {


    @NotBlank
    private String name;
    @NotNull
    private String description;
    @NotNull
    private String preco;
}