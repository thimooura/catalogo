package br.com.desafio.produto.application.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import br.com.desafio.produto.application.api.ProdutoDetalhadoResponse;
import br.com.desafio.produto.application.api.ProdutoListResponse;
import br.com.desafio.produto.application.api.ProdutoRequest;
import br.com.desafio.produto.application.api.ProdutoResponse;
import br.com.desafio.produto.application.repository.ProdutoRepository;
import br.com.desafio.produto.domain.Produtos;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class ProdutoApplicationService implements Produtoservice {
	public final ProdutoRepository produtoRepository;

	@Override
	public ProdutoResponse criaProduto(ProdutoRequest produtoRequest) {
		log.info("[inicia] ProdutoApplicationService - criaProduto");
		Produtos produto = produtoRepository.salva(new Produtos(produtoRequest));
		log.info("[finaliza] ProdutoApplicationService - criaProduto");
		return ProdutoResponse.builder().idProduto(produto.getIdProduto()).build();
	}

	@Override
	public List<ProdutoListResponse> buscaTodosProdutos() {
		List<Produtos> produtos = produtoRepository.buscaTodosProdutos();
		return ProdutoListResponse.converte(produtos);
	}

	@Override
	public ProdutoDetalhadoResponse buscaProdutoAtravesId(UUID idProduto) {
		Produtos produto = produtoRepository.buscaProdutosAtravesId(idProduto);
		return new ProdutoDetalhadoResponse(produto);
	}
}
