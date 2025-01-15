package com.desafio.forohub.domain.respuesta.validation.update;

import com.desafio.forohub.domain.respuesta.dto.ActualizarRespuestaDTO;

public interface ValidarRespuestaActualizada {

    void validate(ActualizarRespuestaDTO data, Long respuestaId);
}
