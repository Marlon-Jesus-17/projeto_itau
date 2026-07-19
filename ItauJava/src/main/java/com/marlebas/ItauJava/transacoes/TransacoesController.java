package com.marlebas.ItauJava.transacoes;

import com.marlebas.ItauJava.Docs.TransacaoControllerDoc;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/transacao")
public class TransacoesController implements TransacaoControllerDoc {

    private TransacaoService transacaoService;
    private TransacaoRepository transacaoRepository;

    public TransacoesController(TransacaoService transacaoService, TransacaoRepository transacaoRepository) {
        this.transacaoService = transacaoService;
        this.transacaoRepository = transacaoRepository;
    }

    @PostMapping
    public ResponseEntity adicionar(@Valid @RequestBody TransacaoDTO transacaoDTO) {

        try{
            transacaoService.validarTransacao(transacaoDTO);
            transacaoRepository.salvarDados(transacaoDTO);
            log.info("Transação criada com sucesso");
            return ResponseEntity.status(HttpStatus.CREATED).build();

        }catch (IllegalArgumentException exception){
            log.error("Erro em uma ou mais validações, tente novamente: " + exception.getMessage());
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).build();

        }catch (Exception exception){
            log.error("Erro na composição da requisição, tente novamente: " + exception.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping
    public ResponseEntity deletar(){
        transacaoRepository.deletarDados();
        log.info("Transações deletadas com sucesso");
        return ResponseEntity.ok().build();
    }

}
