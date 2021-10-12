package model;

import lombok.Data;

@Data
public class Clientes {
    String nomeDoCliente;
    boolean ativo;

    public Clientes(String nomeDoCliente, boolean ativo) {
        this.nomeDoCliente = nomeDoCliente;
        this.ativo = ativo;
    }
}
