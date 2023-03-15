package produtos.infra;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import service.Produtos;

import java.util.UUID;

public interface ProdutoDataSprintJPARepository extends JpaRepository<Produtos, UUID> {

}
