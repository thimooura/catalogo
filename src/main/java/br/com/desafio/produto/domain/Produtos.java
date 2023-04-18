package br.com.desafio.produto.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.desafio.produto.application.api.ProdutoRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Produtos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	private UUID idProduto;
	@NotBlank
	private String name;
	@NotNull
	private String description;
	@NotNull
	private String preco;

	private LocalDateTime dataDoCadastro;

	public Produtos(ProdutoRequest produtoRequest) {
		this.name = produtoRequest.getName();
		this.description = produtoRequest.getDescription();
		this.preco = produtoRequest.getPreco();
		this.dataDoCadastro = LocalDateTime.now();
	}

}
