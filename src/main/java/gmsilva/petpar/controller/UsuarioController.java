package gmsilva.petpar.controller;

import gmsilva.petpar.dto.endereco.DadosCadastroEndereco;
import gmsilva.petpar.dto.usuario.DadosCadastroUsuario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroUsuario usuario){
        System.out.println(usuario);
    }

}
