package gmsilva.petpar.dto.pet;

import gmsilva.petpar.dto.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name = "pets")
@Entity(name = "Pet")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class pet {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String cpf;
    private LocalDate nascimento;
    private String email;
    private String telefone;

    @Embedded
    private Endereco endereco;

    public pet(DadosCadastroPet dados){
        this.nome = dados.nome();
        this.cpf = dados.cpf();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.endereco = new Endereco(dados.endereco());
        this.nascimento = dados.nascimento();
    }

}
