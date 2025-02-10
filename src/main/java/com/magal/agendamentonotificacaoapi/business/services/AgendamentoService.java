package com.magal.agendamentonotificacaoapi.business.services;

import com.magal.agendamentonotificacaoapi.business.mappers.IAgendamentoMapper;
import com.magal.agendamentonotificacaoapi.controller.dto.in.AgendamentoRecord;
import com.magal.agendamentonotificacaoapi.controller.dto.out.AgendamentoRecordOut;
import com.magal.agendamentonotificacaoapi.infra.repository.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AgendamentoService {

    private final AgendamentoRepository repository;

    private final IAgendamentoMapper agendamentoMapper;

    public AgendamentoRecordOut gravarAgendamento(AgendamentoRecord agendamento){
        return agendamentoMapper.paraOut(
                repository.save(
                        agendamentoMapper.paraEntity(agendamento)));
    }



}
