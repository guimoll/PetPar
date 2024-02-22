package gmsilva.petpar.dto.usuario;

import gmsilva.petpar.dto.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "usuario")
@Entity(name = "Usuario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {
    @Id @GeneratedValue
    private long id;
    private String nome;
    private String cpf;
    private String nascimento;
    private String email;
    private String telefone;

    @Embedded
    private Endereco endereco;

    public Usuario(DadosCadastroUsuario dados){
        this.nome = dados.nome();
        this.cpf = dados.cpf();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.endereco = new Endereco(dados.endereco());
    }

}
