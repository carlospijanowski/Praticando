package alura.colecoes;

public class Aulas implements Comparable<Aulas>{

   private String nomeAula;
   private int tempoAula;

    public Aulas (String nomeAula, int tempoAula){
        this.nomeAula = nomeAula;
        this.tempoAula = tempoAula;
    }

    public String getNomeAula() {
        return nomeAula;
    }

    public int getTempoAula() {
        return tempoAula;
    }

    @Override
    public int compareTo(Aulas o) {
        return 0;
    }

    @Override
    public String toString() {

        String retorno = "\nnome da aula :"+nomeAula+"\n e tempo.: "+tempoAula;

        return retorno;
    }
}
