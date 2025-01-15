package com.desafio.forohub.domain.topico.validation.update;

import com.desafio.forohub.domain.topico.dto.ActualizarTopicoDTO;

public interface ValidarTopicoActualizado {
    void validate(ActualizarTopicoDTO data);
}