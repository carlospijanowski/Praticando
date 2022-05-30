package aula_0103_Coleções.alura.colecoes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Curso {

    String nome;
    String instrutor;
    List<Aulas> aulas = new ArrayList<>();

    public int getTempoAulas(){
        return this.aulas.stream().mapToInt(Aulas::getTempoAula).sum();
    }
}
