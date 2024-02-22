package gmsilva.petpar.controller;

import gmsilva.petpar.dto.endereco.DadosCadastroEndereco;
import gmsilva.petpar.dto.usuario.DadosCadastroUsuario;
import gmsilva.petpar.dto.usuario.Usuario;
import gmsilva.petpar.dto.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repo;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroUsuario usuario){
    repo.save(new Usuario(usuario));
    }

}
