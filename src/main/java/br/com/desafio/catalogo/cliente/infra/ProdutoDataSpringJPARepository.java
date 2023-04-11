package br.com.desafio.catalogo.cliente.infra;

import org.hibernate.validator.constraints.UUID;
import br.com.desafio.catalogo.cliente.domain.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProdutoDataSpringJPARepository extends JpaRepository<Produtos, java.util.UUID> {
    Optional<Produtos> findById(UUID idProduto);

    List<Produtos> findAll();
}
