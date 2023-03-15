package service;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Produtos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID  id;
    @NotBlank
    private String name;
    @NotNull
    private String description;
    @NotNull
    private String preco;

    private LocalDateTime dataDoCadastro;
        public Produtos(ProdutoRequest produtoRequest){
            this.name = produtoRequest.getName();
            this.description = produtoRequest.getDescription();
            this.preco = produtoRequest.getPreco();
            this.dataDoCadastro = LocalDateTime.now();
        }


}
