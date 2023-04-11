package br.com.desafio.produto.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/produto")
public interface ProdutoApi {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	ProdutoResponse postProduto(@Valid @RequestBody ProdutoRequest produtoRequest);

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<ProdutoListResponse> getTodosProdutos();

	@GetMapping(value = "/{IdProduto}")
	@ResponseStatus(code = HttpStatus.OK)
	ProdutoListResponse getProdutoAtravesId(@PathVariable UUID idProduto);
}
