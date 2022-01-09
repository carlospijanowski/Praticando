package aula_0010_Maps;

import model.Clientes;

import javax.swing.*;
import java.util.HashMap;

public class EstudandoHashes {

    public static void main(String[] args) {

        Clientes clientes = new Clientes("Carlos",true);

        HashMap<Integer, Clientes> stringObjectHashMap = new HashMap<>();
        stringObjectHashMap.put(1,clientes);
//        stringObjectHashMap.put(2,"Tatiana");
        Object resultado = stringObjectHashMap.get(1);

        JOptionPane.showMessageDialog(null,resultado.toString());

        System.out.printf(resultado.toString());

    }

}
