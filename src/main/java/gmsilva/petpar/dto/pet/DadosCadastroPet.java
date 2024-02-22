package gmsilva.petpar.dto.pet;

import gmsilva.petpar.dto.usuario.DadosCadastroUsuario;

public record DadosCadastroPet(String nm_nome, String dt_nascimento, String ds_descricao, String ds_especie, char ie_sexo, char ie_adotado, DadosCadastroUsuario dono) {
}
