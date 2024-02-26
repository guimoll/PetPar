package gmsilva.petpar.dto.pet;

import gmsilva.petpar.dto.usuario.DadosCadastroUsuario;

import java.time.LocalDate;

public record DadosCadastroPet(String nome, LocalDate nascimento, String descricao, String especie, char sexo, char adotado, DadosCadastroUsuario dono) {
}
