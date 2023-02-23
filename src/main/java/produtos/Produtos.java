package produtos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
    private UUID  Id;
    @NotBlank
    private String name;
    @NotNull
    private String description;
    @NotNull
    private String price;

    private LocalDateTime dataDoCadastro;


    public Produtos(String id, String name, String description, String price) {
        this.Id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.price = price;
        this.dataDoCadastro = LocalDateTime.now();
    }
}
