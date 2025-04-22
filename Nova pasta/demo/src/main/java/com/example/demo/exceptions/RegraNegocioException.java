package com.example.demo.exceptions;

public class RegraNegocioException extends RuntimeException{
    public RegraNegocioException(String mensagemErro) {
        super(mensagemErro);
        }
}
