package produtos;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

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

        return null;
    }


}

