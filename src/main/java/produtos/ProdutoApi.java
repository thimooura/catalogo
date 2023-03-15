package produtos;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/produto")
public interface ProdutoApi {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    ProdutoResponse postProduto(@RequestBody ProdutoRequest produtoRequest);


}
