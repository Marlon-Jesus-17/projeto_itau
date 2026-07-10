package com.marlebas.ItauJava.estatisticas;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "estatistica")
public record EstatisticasProperties (Integer segundos){}
