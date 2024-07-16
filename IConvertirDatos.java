package com.aluracursos.Pedro.service;

public interface IConvertirDatos {

    <T> T convertirDatos(String json, Class<T> clase);
}
