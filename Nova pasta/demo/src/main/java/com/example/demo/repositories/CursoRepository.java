package com.example.demo.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{
    List<Curso> findByNomeLike(String nome);

}
