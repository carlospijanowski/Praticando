package aula0003_streams.testeParaAplicarNaOrange.service;

import aula0003_streams.testeParaAplicarNaOrange.model.Teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteService {

    public static void main(String[] args) {

        List<Teste> lista = new TesteService().getTeste();
//        lista.stream().forEach( numeros-> System.out.println(lista.ge ));



//        lista.stream().reduce((teste -> System.out.println(teste.getNome()+"\n"+teste.getNumero())));


        //fazer uma lista de Teste
        List<Teste> novaLista = new ArrayList<>();
        //nessa lista de teste, popular com o stream
        novaLista.stream().forEach((teste -> System.out.println(novaLista.add(teste))));
    }

    public List<Teste> getTeste(){

        Teste teste1 = new Teste();
        teste1.setNome("Carlos");
        teste1.setNumero(43);

        Teste teste2 = new Teste();
        teste2.setNome("tATIANA");
        teste2.setNumero(41);

        return Arrays.asList(teste1,teste2);
    }

}
