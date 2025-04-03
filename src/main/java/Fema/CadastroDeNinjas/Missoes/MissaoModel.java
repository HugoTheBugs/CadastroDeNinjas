package Fema.CadastroDeNinjas.Missoes;

import Fema.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missao")
@NoArgsConstructor
@AllArgsConstructor
@Data //Cria todos os getters e setters
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    // @OneToMany - Uma missao pode ter varios ninjas!
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

}