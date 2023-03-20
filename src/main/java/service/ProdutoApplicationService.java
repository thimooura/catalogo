package service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

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
        return ProdutoResponse.builder()
                .idProduto(produto.getIdProduto())
                .build();
    }
}
 
