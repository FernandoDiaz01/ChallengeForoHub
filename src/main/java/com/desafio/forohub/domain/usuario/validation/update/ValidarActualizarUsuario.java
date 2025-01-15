package com.desafio.forohub.domain.usuario.validation.update;

import com.desafio.forohub.domain.usuario.dto.ActualizarUsuarioDTO;

public interface ValidarActualizarUsuario {
    void validate(ActualizarUsuarioDTO data);
}
