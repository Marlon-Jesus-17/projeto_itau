package com.marlebas.ItauJava.transacoes;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransacaoDTO {

    @NotNull(message = "O valor da transação não pode ser nulo")
    @Positive(message = "O valor da transação deve ser maior ou igual a zero")
    private BigDecimal valor;

    @NotNull(message = "A data não pode ser nula")
    @PastOrPresent
    private OffsetDateTime dataHora;
}
