package com.example.InhautBackendFinal.Services;

import com.example.InhautBackendFinal.Models.Comentario;

import java.util.List;

public interface ComentarioService {
    List<Comentario> findAllByPostId(Long postId);
    Comentario save (Comentario comentario);
    void deleteById(Long id);
}
