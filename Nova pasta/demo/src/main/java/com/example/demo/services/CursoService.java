package com.example.demo.services;

import java.util.List;
import com.example.demo.dtos.CursoDTO;
import com.example.demo.dtos.DadosCursoDTO;
import com.example.demo.models.Curso;

public interface CursoService {
    Curso salvar(CursoDTO cursoDTO);
    DadosCursoDTO obterCursoPorId(Long id);
    void remover(Long id);
    void editar(Long id, CursoDTO cursoDto);
    List<DadosCursoDTO> obterTodos();
}