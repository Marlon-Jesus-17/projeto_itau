package com.marlebas.ItauJava;

import org.springframework.stereotype.Repository;

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
}
