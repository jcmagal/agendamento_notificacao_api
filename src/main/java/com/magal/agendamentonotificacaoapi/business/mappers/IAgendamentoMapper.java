package com.magal.agendamentonotificacaoapi.business.mappers;

import com.magal.agendamentonotificacaoapi.controller.dto.in.AgendamentoRecord;
import com.magal.agendamentonotificacaoapi.controller.dto.out.AgendamentoRecordOut;
import com.magal.agendamentonotificacaoapi.infra.entities.Agendamento;
import org.mapstruct.Mapper;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IAgendamentoMapper {

    Agendamento paraEntity(AgendamentoRecord agendamento);
    AgendamentoRecordOut paraOut(Agendamento agendamento);
}
