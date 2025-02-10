package com.magal.agendamentonotificacaoapi.infra.repository;

import com.magal.agendamentonotificacaoapi.infra.entities.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, String> {
}
