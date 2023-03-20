package service;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ProdutoListResponse {
    @NotBlank
    private String name;
    @NotNull
    private String description;
    @NotNull
    private String preco;
}
