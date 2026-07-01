package com.marlebas.ItauJava.estatisticas;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estatisticas")
public class EstatisticasController {

// criar rota de estatistica e uma lógica para trabalhar com os dados
    @GetMapping
    public ResponseEntity listarEstatisticas() {

        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
