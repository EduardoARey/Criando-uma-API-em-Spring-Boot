package com.example.demo.services;

import com.example.demo.dtos.CategoriaCursoDTO;
import com.example.demo.models.CategoriaCurso;

public interface CategoriaCursoService {
    CategoriaCurso salvar(CategoriaCursoDTO dto);
}