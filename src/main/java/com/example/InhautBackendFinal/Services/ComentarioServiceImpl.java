package com.example.InhautBackendFinal.Services;

import com.example.InhautBackendFinal.Models.Comentario;
import com.example.InhautBackendFinal.Repositories.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ComentarioServiceImpl implements ComentarioService{
    @Autowired
    private ComentarioRepository comentarioRepository;
    @Override
    public List<Comentario> findAllByPostId(Long postId) {
        return comentarioRepository.findAllByPostId(postId);
    }

    @Override
    public Comentario save(Comentario comentario) {
        LocalDate ahora = LocalDate.now();
        comentario.setFecha(ahora);

        return comentarioRepository.save(comentario);
    }

    @Override
    public void deleteById(Long id) {
        comentarioRepository.deleteById(id);
    }
}
