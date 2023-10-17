package com.example.exerciciocrud.repositorio;

import com.example.exerciciocrud.entidades.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepositorio extends JpaRepository<Livro, Long> {
}
