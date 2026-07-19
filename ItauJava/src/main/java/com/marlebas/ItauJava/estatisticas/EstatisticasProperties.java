package com.marlebas.ItauJava.estatisticas;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.NonNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties(prefix = "estatistica")
public record EstatisticasProperties (
        @NotNull
        @Positive
        Integer segundos){}
