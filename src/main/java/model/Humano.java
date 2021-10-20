package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Humano {

    String raca;

    public class Homem extends Humano {

        public void main(String[] args) {
            Homem homem = new Homem();
            homem.raca = "Bravo";
        }

    }

}
