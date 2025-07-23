package locadora.dvds;

import locadora.dvds.Filme;

public class DVD {
    private int numero;
    private Filme filme;
    private boolean disponivel;

    public DVD(int numero, Filme filme) {
        this.numero = numero;
        this.filme = filme;
        this.disponivel = true;
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public Filme getFilme() {
        return filme;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean status) {
        this.disponivel = status;
    }

    // Equals para comparação em testes
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        DVD other = (DVD) obj;
        return numero == other.numero;
    }
}
