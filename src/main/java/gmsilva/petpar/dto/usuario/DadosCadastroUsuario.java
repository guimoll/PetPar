package gmsilva.petpar.dto.usuario;

import gmsilva.petpar.dto.endereco.DadosCadastroEndereco;

import java.time.LocalDate;

public record DadosCadastroUsuario(String nome, String cpf, LocalDate nascimento, String email, String telefone, DadosCadastroEndereco endereco) {
}
