
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import locadora.dvds.*;
import locadora.*;

class TesteLocadora {

    private SistemaLocadora sistema;
    private Filme filme1, filme2;
    private DVD dvd1, dvd2, dvd3;
    private Cliente cliente1;
    private Ator ator1, ator2;

    @BeforeEach
    void setUp() {
        sistema = new SistemaLocadora();

        // Criar atores
        ator1 = new Ator(1, "Thomas Mapother", "Tom Cruise");
        ator2 = new Ator(2, "Margarita Cansino", "Rita Hayworth");
        sistema.cadastrarAtor(ator1);
        sistema.cadastrarAtor(ator2);

        // Criar filmes
        filme1 = new Filme(1, "Top Gun", Categoria.ACAO);
        filme2 = new Filme(2, "Gilda", Categoria.DRAMA);

        filme1.adicionarAtor(ator1);
        filme2.adicionarAtor(ator2);

        sistema.cadastrarFilme(filme1);
        sistema.cadastrarFilme(filme2);

        // Criar DVDs
        dvd1 = new DVD(101, filme1);
        dvd2 = new DVD(102, filme1); // Segundo DVD para o mesmo filme
        dvd3 = new DVD(201, filme2);

        sistema.adicionarDVD(dvd1);
        sistema.adicionarDVD(dvd2);
        sistema.adicionarDVD(dvd3);

        // Criar cliente
        cliente1 = new Cliente(
                1001,
                "Carlos",
                "Silva",
                "11-99999-8888",
                "Av. Paulista, 1000"
        );
        sistema.cadastrarCliente(cliente1);
    }

    @Test
    void testCadastroFilme() {
        assertEquals(2, sistema.getFilmes().size());
        assertTrue(sistema.getFilmes().contains(filme1));
    }

    @Test
    void testBuscaFilmesPorAtor() {
        List<Filme> filmesTomCruise = sistema.buscarFilmesPorAtor(ator1);
        assertEquals(1, filmesTomCruise.size());
        assertTrue(filmesTomCruise.contains(filme1));
    }

    @Test
    void testLocacaoDVD() {
        sistema.alugarDVD(cliente1, dvd1);

        assertFalse(dvd1.isDisponivel());
        assertEquals(1, sistema.getLocacoesAtivas().size());
        assertEquals(cliente1, sistema.getLocacoesAtivas().get(0).getCliente());
    }

    @Test
    void testEqualsFilme() {
        Filme filmeCopia = new Filme(1, "Top Gun", Categoria.ACAO);
        assertEquals(filme1, filmeCopia);
    }

    @Test
    void testEqualsDVD() {
        DVD dvdCopia = new DVD(101, filme1);
        assertEquals(dvd1, dvdCopia);
    }
}
