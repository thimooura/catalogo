package br.com.desafio.catalogo.cliente.application.service;

import br.com.desafio.catalogo.cliente.application.repository.ProdutoRepository;
import br.com.desafio.catalogo.cliente.application.api.ProdutoDetalhadoResponse;
import br.com.desafio.catalogo.cliente.application.api.ProdutoListResponse;
import br.com.desafio.catalogo.cliente.application.api.ProdutoResponse;
import br.com.desafio.catalogo.cliente.application.api.ProdutoRequest;
import br.com.desafio.catalogo.cliente.domain.Produtos;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public abstract class ProdutoApplicationService implements Produtoservice {
    public final ProdutoRepository produtoRepository;
    @Override
    public ProdutoResponse criaProduto(ProdutoRequest produtoRequest) {
        log.info("[inicia] ProdutoApplicationService - criaProduto");
        Produtos produto = produtoRepository.salva(new Produtos(produtoRequest));
        log.info("[finaliza] ProdutoApplicationService - criaProduto");
        return ProdutoResponse.builder()
                .idProduto(produto.getIdProduto())
                .build();
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
 
