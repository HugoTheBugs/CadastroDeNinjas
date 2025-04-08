package Fema.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missao")
public class MissaoController {

    //GET -- Mandar uma requisicao para mostrar as missoes
    @GetMapping("/listar")
    public String listarMissao(){
        return "Missão listada com sucesso";
    }

    //POST -- Mandar uma requisicao para criar as missoes
    @PostMapping("/criar")
    public String criarMissao(){
        return "Missão criada com sucesso";
    }

    //PUT -- Mandar uma requisicao para alterar as missoes
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missão alterada com sucesso";
    }

    //DELETE -- Mandar uma requisicao para deletar as missoes
    @DeleteMapping("/deletar")
    public String deletarmissao(){
        return "Missão deletada com sucesso";
    }
}
