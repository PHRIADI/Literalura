package com.aluracursos.Pedro.repository;

import com.aluracursos.Pedro.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    Autor findAutorByNombreIgnoreCase(String nombre);
    List<Autor> findAutorByFechaNacimientoGreaterThan(Integer fechaNacmiento);
}
