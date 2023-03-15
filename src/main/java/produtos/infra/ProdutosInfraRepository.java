package produtos.infra;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;
import service.ProdutoRepository;
import service.Produtos;
@Repository
@Log4j2
public class ProdutosInfraRepository implements ProdutoRepository {
    private final ProdutoSprintJPARepository produtoSprintJPARepository;
    @Override
    public Produtos salva(Produtos produtos) {
        log.info("[inicia] ProdutoInfraRepository - salva");
        ProdutoSprintDataJPARepository.save(produtos);
        log.info("[finaliza] ProdutoInfraRepository - salva");
        return produtos;
    }
}
