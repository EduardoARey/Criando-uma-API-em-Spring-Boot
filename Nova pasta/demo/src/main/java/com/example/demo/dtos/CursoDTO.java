package com.example.demo.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CursoDTO {
    
    private Long id;
    private String nome;
    private Integer cargaHoraria;
    private Long categoriaCursoId;

}
