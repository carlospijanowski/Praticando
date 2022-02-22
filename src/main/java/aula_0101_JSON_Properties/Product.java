package aula_0101_JSON_Properties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    Integer id;
    LocalDateTime time;
    String name;
    String memoria;
    String condicao;

}
