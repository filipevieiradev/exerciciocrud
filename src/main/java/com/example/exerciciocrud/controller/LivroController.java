package com.example.exerciciocrud.controller;

import com.example.exerciciocrud.entidades.Livro;
import com.example.exerciciocrud.repositorio.LivroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/livro")
public class LivroController {

    @Autowired
    LivroRepositorio livroRepositorio;

    @PostMapping("/salvar")
    public void salvarLivro(@RequestBody Livro livro){

        livroRepositorio.save(livro);
    }

    @GetMapping("/buscar/{id}")
    public Optional<Livro> buscarporId(@PathVariable Long id){

        return livroRepositorio.findById(id);
    }


}
