package locadora;

import locadora.dvds.DVD;
import java.time.LocalDate;


public class LocacaoAtiva {
    private Cliente cliente;
    private DVD dvd;
    private LocalDate data;

    public LocacaoAtiva(Cliente cliente, DVD dvd) {
        this.cliente = cliente;
        this.dvd = dvd;
        this.data = LocalDate.now();
        dvd.setDisponivel(false);
    }

    // Getters
    public Cliente getCliente() {
        return cliente;
    }

    public DVD getDVD() {
        return dvd;
    }

    public LocalDate getData() {
        return data;
    }

    public void finalizarLocacao() {
        dvd.setDisponivel(true);
    }
}
