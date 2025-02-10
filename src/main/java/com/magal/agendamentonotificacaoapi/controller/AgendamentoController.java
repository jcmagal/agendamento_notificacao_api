package com.magal.agendamentonotificacaoapi.controller;

import com.magal.agendamentonotificacaoapi.business.services.AgendamentoService;
import com.magal.agendamentonotificacaoapi.controller.dto.in.AgendamentoRecord;
import com.magal.agendamentonotificacaoapi.controller.dto.out.AgendamentoRecordOut;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
