package gmsilva.petpar.dto.usuario;

import gmsilva.petpar.dto.endereco.DadosCadastroEndereco;

public record DadosCadastroUsuario(String nome, String cpf, String nascimento, String email, String telefone, DadosCadastroEndereco endereco) {
}
