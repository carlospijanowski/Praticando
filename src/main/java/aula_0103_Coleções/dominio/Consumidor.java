package aula_0103_Coleções.dominio;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.concurrent.ThreadLocalRandom;

@ToString
@EqualsAndHashCode
public class Consumidor {

    private Long id;
    private String nome;

    public Consumidor(String nome) {
        this.id = ThreadLocalRandom.current().nextLong(0, 100_000);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
