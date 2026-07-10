package com.marlebas.ItauJava.transacoes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transacao {

    private BigDecimal valor; //BigDecimal - usado para valores com precisão absoluta, como dinheiro, por exemplo
    private OffsetDateTime dataHora; //OffsetDateTime - Armazena data e hora completas incluíndo o fuso horário
}
