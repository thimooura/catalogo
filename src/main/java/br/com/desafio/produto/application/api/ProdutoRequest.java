package br.com.desafio.produto.application.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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