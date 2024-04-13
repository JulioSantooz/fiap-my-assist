import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrdemServico {

    LocalDateTime dataEntrega, previsao, dataSaida;
    String defeito, observacoes;
    StatusExecucaoEnum status;
    PrioridadeExecucaoEnum prioridade;
    Cliente cliente;
    Tecnico responsavel;
    Equipamento equipamento;
    List<Servico> servicos;

    //Cliente cliente = new Cliente("Julio Henrique","11 92224-3265", "julio@hotmail.com", "Rua selva aberta", "12368599784", "cpf");
    //Tecnico responsavel = new Tecnico("Adalberto", "1178458821", "adalberto@hotmail.com");
    //Equipamento equipamento = new Equipamento("Macbook", "Pro M2", "ABFD12354", "Notebook");
    //List<Servico> servicos = new ArrayList<>();

    public OrdemServico() {

    }

    public OrdemServico(LocalDateTime dataEntrega, LocalDateTime previsao, LocalDateTime dataSaida, String defeito, String observacoes, StatusExecucaoEnum status, PrioridadeExecucaoEnum escalaPrioridade) {
        this.dataEntrega = dataEntrega;
        this.previsao = previsao;
        this.dataSaida = dataSaida;
        this.defeito = defeito;
        this.observacoes = observacoes;
        this.status = status;
        this.prioridade = prioridade;
    }

}
