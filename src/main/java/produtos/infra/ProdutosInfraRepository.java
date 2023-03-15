package produtos.infra;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;
import service.ProdutoRepository;
import service.Produtos;
@Repository
@Log4j2
@RequiredArgsConstructor
public class ProdutosInfraRepository implements ProdutoRepository {
    private final ProdutoDataSprintJPARepository produtoDataSprintJPARepository;
    @Override
    public Produtos salva(Produtos produtos) {
        log.info("[inicia] ProdutoInfraRepository - salva");
        produtoDataSprintJPARepository.save(produtos);
        log.info("[finaliza] ProdutoInfraRepository - salva");
        return produtos;
    }
}
