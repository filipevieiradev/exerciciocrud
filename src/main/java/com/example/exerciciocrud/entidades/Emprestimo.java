package com.example.exerciciocrud.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "emprestimos")

public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private int livro_id;
    @Column(nullable = false)
    private String data_emprestimo;
    @Column(nullable = false)
    private String data_devolucao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getLivro_id() {
        return livro_id;
    }

    public void setLivro_id(int livro_id) {
        this.livro_id = livro_id;
    }

    public String getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(String data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public String getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(String data_devolucao) {
        this.data_devolucao = data_devolucao;
    }
}
