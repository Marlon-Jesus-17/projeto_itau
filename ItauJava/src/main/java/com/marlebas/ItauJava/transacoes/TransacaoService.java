package com.marlebas.ItauJava.transacoes;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Service
public class TransacaoService {

    public void validarTransacao(TransacaoDTO transacaoDTO) {
        //Valor maior ou igual a 0
        if(transacaoDTO.getValor().compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalArgumentException("Erro: Transações devem ter valor maior que zero");
        }

        if(transacaoDTO.getDataHora().isAfter(OffsetDateTime.now())){
            throw new IllegalArgumentException("Erro: Na data de validação");
        }

        if(transacaoDTO.getValor() == null){
            throw new IllegalArgumentException("Erro: É obrigatório informar o valor");
        }

        if (transacaoDTO.getDataHora() == null){
            throw new IllegalArgumentException("Erro: É necessário informar a data e a hora");
        }
    }



}
