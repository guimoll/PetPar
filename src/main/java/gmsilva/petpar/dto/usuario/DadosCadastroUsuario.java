package gmsilva.petpar.dto.usuario;

import gmsilva.petpar.dto.endereco.DadosCadastroEndereco;

public record DadosCadastroUsuario(String nm_nome, String nr_cpf, String dt_nascimento, String ds_email, String nr_telefone, DadosCadastroEndereco endereco) {
}
