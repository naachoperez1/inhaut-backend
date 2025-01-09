package com.example.InhautBackendFinal.Models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "comentarios")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long postId;

    @Column(nullable = false, length = 100)
    private String autor;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String texto;

    @Column(nullable = false)
    private LocalDate fecha;

    public Comentario(){}

    public Comentario(Long postId, String autor, String texto){
        this.postId = postId;
        this.autor = autor;
        this.texto = texto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Comentario{" +
                "id=" + id +
                ", postId=" + postId +
                ", autor='" + autor + '\'' +
                ", texto='" + texto + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
