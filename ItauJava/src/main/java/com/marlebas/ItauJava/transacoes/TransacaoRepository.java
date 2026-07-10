package com.marlebas.ItauJava.transacoes;

import com.marlebas.ItauJava.estatisticas.EstatisticaDTO;
import org.springframework.stereotype.Repository;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TransacaoRepository {

    List<TransacaoDTO> listaDetransacao = new ArrayList<>();

    //salvar os dados em yma lista
    public void salvarDados( TransacaoDTO transacaoDTO) {

        listaDetransacao.add(transacaoDTO);

    }

    //apagar a lista após 60 segundos
    public void limparDados() {}

    //apagar todas as transações da lista
    public void deletarDados() {
        listaDetransacao.clear();
    }

    public EstatisticaDTO estatistica(OffsetDateTime horaInicial){

        if(listaDetransacao.isEmpty()){
            return new EstatisticaDTO(0L,0.0,0.0,0.0,0.0);
        }

        final var summary = listaDetransacao.stream()
                .filter(t -> t.getDataHora().isAfter(horaInicial) || t.getDataHora().isEqual(horaInicial))
                .mapToDouble(t -> t.getValor().doubleValue())
                .summaryStatistics();

        return new EstatisticaDTO(
                summary.getCount(),
                summary.getAverage(),
                summary.getMax(),
                summary.getMin(),
                summary.getSum());
    }
}
