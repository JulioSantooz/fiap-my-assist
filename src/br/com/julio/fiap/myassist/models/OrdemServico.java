package br.com.julio.fiap.myassist.models;

import br.com.julio.fiap.myassist.enums.PrioridadeExecucaoEnum;
import br.com.julio.fiap.myassist.enums.StatusExecucaoEnum;
import br.com.fiap_julio.models.*;

import java.time.LocalDateTime;
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

    //br.com.fiap_julio.models.Cliente cliente = new br.com.fiap_julio.models.Cliente("Julio Henrique","11 92224-3265", "julio@hotmail.com", "Rua selva aberta", "12368599784", "cpf");
    //br.com.fiap_julio.models.Tecnico responsavel = new br.com.fiap_julio.models.Tecnico("Adalberto", "1178458821", "adalberto@hotmail.com");
    //br.com.fiap_julio.models.Equipamento equipamento = new br.com.fiap_julio.models.Equipamento("Macbook", "Pro M2", "ABFD12354", "Notebook");
    //List<br.com.fiap_julio.models.Servico> servicos = new ArrayList<>();

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
