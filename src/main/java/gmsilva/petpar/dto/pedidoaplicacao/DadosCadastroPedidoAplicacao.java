package gmsilva.petpar.dto.pedidoaplicacao;

import gmsilva.petpar.dto.pet.DadosCadastroPet;
import gmsilva.petpar.dto.usuario.DadosCadastroUsuario;

public record DadosCadastroPedidoAplicacao(DadosCadastroUsuario donoAtual, DadosCadastroUsuario DonoPotencial, String data, DadosCadastroPet pet, String aplicacao) {
}
