package locadora;

public class Cliente {
    private int nAssociado;
    private String nome;
    private String sobrenome;
    private String telefone;
    private String endereco;

    public Cliente(int nAssociado, String nome, String sobrenome,
                   String telefone, String endereco) {
        this.nAssociado = nAssociado;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    // Getters
    public int getNAssociado() {
        return nAssociado;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    // Equals para comparação em testes
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cliente other = (Cliente) obj;
        return nAssociado == other.nAssociado;
    }
}
