package locadora.dvds;

public class Ator {
    private int id;
    private String nomeReal;
    private String apelido;

    public Ator(int id, String nomeReal, String apelido) {
        this.id = id;
        this.nomeReal = nomeReal;
        this.apelido = apelido;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNomeReal() {
        return nomeReal;
    }

    public String getApelido() {
        return apelido;
    }

    public String getNomePublico() {
        return (apelido != null && !apelido.isEmpty()) ? apelido : nomeReal;
    }

    // Equals para comparação em testes
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Ator other = (Ator) obj;
        return id == other.id;
    }
}