package br.com.desafio.produto.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.desafio.produto.domain.Produtos;

public interface ProdutoDataSpringJPARepository extends JpaRepository<Produtos, UUID> {

	List<Produtos> findAll();
}
