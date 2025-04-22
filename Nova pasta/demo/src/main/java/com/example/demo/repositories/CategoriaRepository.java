package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.demo.models.CategoriaCurso;

public interface CategoriaRepository extends JpaRepository<CategoriaCurso, Long>{
    
    @Query("select cc from CategoriaCurso cc left join fetch cc.cursos c where cc.id = :id ")
CategoriaCurso findCategoriaCursoFetchCursos(@Param("id") Long id);

}
