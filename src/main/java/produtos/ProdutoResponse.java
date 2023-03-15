package produtos;

import jakarta.validation.Valid;
import lombok.Builder;

import java.util.UUID;
@Valid
@Builder
public class ProdutoResponse {
    private UUID id;
}

