package produtos.infra;

import handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import application.service.ProdutoRepository;
import domain.Produtos;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ProdutosInfraRepository implements ProdutoRepository {
    private final ProdutoDataSpringJPARepository produtoDataSpringJPARepository;
    @Override
    public Produtos salva(Produtos produtos) {
        log.info("[inicia] ProdutoInfraRepository - salva");
        produtoDataSpringJPARepository.save(produtos);
        log.info("[finaliza] ProdutoInfraRepository - salva");
        return produtos;
    }
    @Override
    public List<Produtos> buscaTodosProdutos() {
        log.info("[inicia] ProdutoInfraRepository - buscaTodosProdutos");
        List<Produtos> todosProdutos = produtoDataSpringJPARepository.findAll();
        log.info("[finaliza] ProdutoInfraRepository - buscaTodosProdutos");
        return todosProdutos;
    }

    @Override
    public Produtos buscaProdutosAtravesId(UUID idProduto) {
        log.info("[inicia] ClienteInfraRepository - buscaProdutoAtravesId");
        Produtos produtos = produtoDataSpringJPARepository.findById(idProduto)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Produto não encontrado!"));
        log.info("[finaliza] ClienteInfraRepository - buscaProdutoAtravesId");
        return produtos;
    }


}
