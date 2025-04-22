package com.example.demo.services;

import org.springframework.stereotype.Service;
import com.example.demo.dtos.CategoriaCursoDTO;
import com.example.demo.models.CategoriaCurso;
import com.example.demo.repositories.CategoriaRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoriaCursoServiceImpl implements CategoriaCursoService{
    private final CategoriaRepository categoriaRepository;
    
   
    @Override
    public CategoriaCurso salvar(CategoriaCursoDTO dto) {
        CategoriaCurso categ = new CategoriaCurso();
        categ.setNome(dto.getNome());
        return categoriaRepository.save(categ);
    }                  
}