package com.magal.agendamentonotificacaoapi.infra;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}
