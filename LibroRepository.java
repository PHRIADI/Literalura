package com.aluracursos.Pedro.repository;

import com.aluracursos.Pedro.model.Idioma;
import com.aluracursos.Pedro.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibroRepository extends JpaRepository<Libro, Long> {
    Libro findLibroByTitulo(String nombre);
    List<Libro> findLibroByIdioma(Idioma idioma);
}
