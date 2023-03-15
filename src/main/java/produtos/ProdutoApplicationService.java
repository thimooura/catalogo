package produtos;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2

public class ProdutoApplicationService implements Produtoservice {
    @Override
    public ProdutoResponse criaProduto(ProdutoRequest produtoRequest) {
        log.info("[inicia] ProdutoApplicationService - criaProduto");
        Produtos produto = produtoRepository.salva(new Produtos(produtoRequest));
        log.info("[finaliza] ProdutoApplicationService - criaProduto");

        return null;
    }
}
