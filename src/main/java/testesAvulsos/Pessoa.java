package testesAvulsos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Pessoa {

    String name;
    String email;

    public Pessoa(){

    }

    public Pessoa(String nome, String emailDaPessoa){
        this.name=nome;
        this.email=emailDaPessoa;
    }


}
