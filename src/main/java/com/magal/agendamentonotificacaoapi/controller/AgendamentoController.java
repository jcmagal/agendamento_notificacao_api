package com.magal.agendamentonotificacaoapi.controller;

import com.magal.agendamentonotificacaoapi.business.services.AgendamentoService;
import com.magal.agendamentonotificacaoapi.controller.dto.in.AgendamentoRecord;
import com.magal.agendamentonotificacaoapi.controller.dto.out.AgendamentoRecordOut;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agendamento")
public class AgendamentoController {

    @Autowired
    private  AgendamentoService agendamentoService;

    @PostMapping
    public ResponseEntity<AgendamentoRecordOut> gravarAgendamento(
            @RequestBody AgendamentoRecord agendamentoRecord) {
        return ResponseEntity.ok(agendamentoService.gravarAgendamento(agendamentoRecord));
    }

    @GetMapping("/{id}")
    public ResponseEntity<AgendamentoRecordOut> getAgendamentoById(
            @PathVariable("id") Long id
    ){
        return ResponseEntity.ok(agendamentoService.buscarAgendamento(id));
    }

}
