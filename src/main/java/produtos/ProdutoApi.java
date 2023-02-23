package produtos;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vi/produto")
public interface ProdutoApi {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    ProdutoResponse postProduto(@RequestBody ProdutoRequest produtoRequest);

    abstract ProdutoResponse postProdutoResponse(ProdutoRequest produtoRequest);
}
