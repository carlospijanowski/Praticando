package aula_0103_Coleções.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Manga {

    private int id;
    private String nome;
    private double preco;
    private int quantidade;

}
