package com.marlebas.ItauJava.Docs;

import com.marlebas.ItauJava.transacoes.TransacaoDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

@Tag(name = "Transações", description = "Endpoints de criação de transações")
public interface TransacaoControllerDoc {

    @Operation(summary = "Cria Transações",
            description = "Recebe uma transação válida e adiciona em uma lista"
    )

    @ApiResponse(
            responseCode = "201",
            description = "Transação criada com sucesso!"
    )

    @ApiResponse(
            responseCode = "422",
            description = "Erro de validação capturado"
    )

    @ApiResponse(
            responseCode = "400",
            description = "Erro inesperado no servidor"
    )

    ResponseEntity<Void> adicionar(@Valid @RequestBody TransacaoDTO transacaoDTO);

    @Operation(summary = "Deleta Transações",
            description = "Limpa toda a lista de transação")


    @ApiResponse(responseCode = "200",
            description = "Transações deletadas com sucesso!")

    ResponseEntity<Void> deletar();
}
