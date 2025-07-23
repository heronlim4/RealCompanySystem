import locadora.*;
import locadora.dvds.Ator;
import locadora.dvds.DVD;
import locadora.dvds.Filme;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SistemaLocadora {
    private List<Filme> filmes = new ArrayList<>();
    private List<DVD> dvds = new ArrayList<>();
    private List<Ator> atores = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<LocacaoAtiva> locacoesAtivas = new ArrayList<>();

    // Métodos CRUD
    public void cadastrarFilme(Filme filme) {
        filmes.add(filme);
    }

    public void cadastrarAtor(Ator ator) {
        atores.add(ator);
    }

    public void adicionarDVD(DVD dvd) {
        dvds.add(dvd);
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    // Localizar filmes por ator
    public List<Filme> buscarFilmesPorAtor(Ator ator) {
        return filmes.stream()
                .filter(f -> f.getAtores().contains(ator))
                .collect(Collectors.toList());
    }

    // Realizar locação
    public void alugarDVD(Cliente cliente, DVD dvd) {
        if (!dvd.isDisponivel()) {
            throw new IllegalStateException("DVD já alugado");
        }
        locacoesAtivas.add(new LocacaoAtiva(cliente, dvd));
    }

    // Devolver DVD
    public void devolverDVD(DVD dvd) {
        LocacaoAtiva locacao = locacoesAtivas.stream()
                .filter(loc -> loc.getDVD().equals(dvd))
                .findFirst()
                .orElse(null);

        if (locacao != null) {
            locacao.finalizarLocacao();
            locacoesAtivas.remove(locacao);
        }
    }

    // Getters para testes
    public List<DVD> getDVDsDisponiveis() {
        return dvds.stream()
                .filter(DVD::isDisponivel)
                .collect(Collectors.toList());
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public List<LocacaoAtiva> getLocacoesAtivas() {
        return locacoesAtivas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}
