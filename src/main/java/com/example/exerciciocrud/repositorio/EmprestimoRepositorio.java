package com.example.exerciciocrud.repositorio;

import com.example.exerciciocrud.entidades.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprestimoRepositorio extends JpaRepository<Emprestimo, Long> {
}
