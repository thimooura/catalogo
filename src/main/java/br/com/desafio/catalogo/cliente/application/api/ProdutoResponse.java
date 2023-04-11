package br.com.desafio.catalogo.cliente.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;
@Value
@Builder
public class ProdutoResponse {
    private UUID idProduto;

}