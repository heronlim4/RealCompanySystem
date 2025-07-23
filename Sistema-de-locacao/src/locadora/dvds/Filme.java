package locadora.dvds;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private int id;
    private String titulo;
    private Categoria categoria;
    private List<Ator> atores = new ArrayList<>();

    public Filme(int id, String titulo, Categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
    }

    // Adicionar ator ao filme
    public void adicionarAtor(Ator ator) {
        atores.add(ator);
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public List<Ator> getAtores() {
        return new ArrayList<>(atores);
    }

    // Equals para comparação em testes
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Filme other = (Filme) obj;
        return id == other.id;
    }
}
