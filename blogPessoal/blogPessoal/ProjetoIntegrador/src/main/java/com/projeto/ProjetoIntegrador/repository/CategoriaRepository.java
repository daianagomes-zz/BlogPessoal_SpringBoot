package com.projeto.ProjetoIntegrador.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.ProjetoIntegrador.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
public List<Categoria> findAllByNomecategContainingIgnoreCase (String nomecateg);

}
