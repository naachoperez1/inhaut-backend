package com.example.InhautBackendFinal.Models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "entradas")
public class Entrada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private String titulo;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String texto;

    @Column(nullable = false, length = 50)
    private String autor;

    @Column(nullable = false)
    private LocalDate fecha;

//    @Column(name = "imageURL", nullable = false, length = 150)
    @Column(nullable = false, length = 150)
    private String imageURL;

    public Entrada(String titulo, String texto, String autor, String imageURL) {
        this.titulo = titulo;
        this.texto = texto;
        this.autor = autor;
        this.imageURL = imageURL;
    }

    public Entrada(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getImagen() {
        return imageURL;
    }

    public void setImagen(String imageURL) {
        this.imageURL = Entrada.this.imageURL;
    }

    @Override
    public String toString() {
        return "Entrada{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", texto='" + texto + '\'' +
                ", autor='" + autor + '\'' +
                ", fecha=" + fecha +
                ", imageURL=" + imageURL +
                '}';
    }
}
