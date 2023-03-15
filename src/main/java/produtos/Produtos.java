package produtos;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
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


    public Produtos(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.preco = preco;
        this.dataDoCadastro = LocalDateTime.now();
    }



}
