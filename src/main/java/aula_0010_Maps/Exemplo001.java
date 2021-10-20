package aula_0010_Maps;

import java.util.HashMap;

public class Exemplo001 {



    public HashMap<String, String> getMapa() {
        HashMap<String, String> map = new HashMap<>();
        map.put("AC", "Acre"); map.put("AL", "Alagoas");
        map.put("AP", "Amapá"); map.put("AM", "Amazonas");
        map.put("BA", "Bahia"); map.put("CE", "Ceará");
        map.put("DF", "Distrito Federal"); map.put("ES", "Espírito Santo");
        map.put("GO", "Goiás"); 
        return map; }


    java.util.HashMap<String, String> mapaEstados = getMapa();

}
