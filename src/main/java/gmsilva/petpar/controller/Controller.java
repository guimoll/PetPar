package gmsilva.petpar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inicio")
public class Controller {

    @GetMapping
    public String pagina(){
        return "Página inicial do projeto.";
    }


}
