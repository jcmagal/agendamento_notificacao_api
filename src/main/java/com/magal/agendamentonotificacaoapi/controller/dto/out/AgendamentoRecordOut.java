package com.magal.agendamentonotificacaoapi.controller.dto.out;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.magal.agendamentonotificacaoapi.infra.enums.StatusNotificacaoEnum;

import java.time.LocalDateTime;

public record AgendamentoRecordOut(
        Long id,
        String emailDestinatario, String telefoneDestinatario,
        String mensagem,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
        LocalDateTime dataHoraEnvio,
        StatusNotificacaoEnum statusNotificacao) {
}
