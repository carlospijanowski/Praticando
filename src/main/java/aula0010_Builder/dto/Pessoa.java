package aula0010_Builder.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Pessoa {

    private String nome;
    private String endereco;


}
