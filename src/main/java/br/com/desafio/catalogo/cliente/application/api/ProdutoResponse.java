package br.com.desafio.catalogo.cliente.application.api;

import jakarta.validation.Valid;
import lombok.Builder;

import java.util.UUID;
@Valid
@Builder
public class ProdutoResponse {
    private UUID idProduto;

}