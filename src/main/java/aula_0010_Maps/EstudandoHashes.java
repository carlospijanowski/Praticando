package aula_0010_Maps;

import model.Clientes;

import java.util.HashMap;

public class EstudandoHashes {

    public static void main(String[] args) {

        Clientes clientes = new Clientes("Carlos",true);

        HashMap<Integer, Object> stringObjectHashMap = new HashMap<>();
        stringObjectHashMap.put(1,clientes.getNomeDoCliente());
        stringObjectHashMap.put(2,"Tatiana");
        Object resultado = stringObjectHashMap.get(1);
        System.out.printf(resultado.toString());


    }

}
