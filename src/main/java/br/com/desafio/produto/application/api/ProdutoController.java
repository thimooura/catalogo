package br.com.desafio.produto.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.produto.application.service.Produtoservice;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ProdutoController implements ProdutoApi {
	private final Produtoservice produtoService;

	@Override
	public ProdutoResponse postProduto(ProdutoRequest produtoRequest) {
		log.info("[inicia] ProdutoController - postProduto");
		ProdutoResponse produtoCriado = produtoService.criaProduto(produtoRequest);
		log.info("[finaliza] ProdutoController - postProduto");
		return produtoCriado;
	}

	@Override
	public List<ProdutoListResponse> getTodosProdutos() {
		log.info("[inicia] ProdutoController - getTodosProdutos");
		List<ProdutoListResponse> produto2 = produtoService.buscaTodosProdutos();
		log.info("[finaliza] ProdutoController - getTodosProdutos");
		return produto2;
	}

	@Override
	public ProdutoListResponse getProdutoAtravesId(UUID idProduto) {
		return null;
	}

	public ProdutoDetalhadoResponse getProdutoAtravesUd(UUID idProduto) {
		return produtoService.buscaProdutoAtravesId(idProduto);
	}
}
