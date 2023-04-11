package br.com.desafio.catalogo.cliente.application.api;

import jakarta.validation.Valid;
import org.hibernate.validator.constraints.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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