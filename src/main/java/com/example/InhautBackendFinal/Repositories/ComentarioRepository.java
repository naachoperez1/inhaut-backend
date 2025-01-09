package com.example.InhautBackendFinal.Repositories;

import com.example.InhautBackendFinal.Models.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario,Long> {
     List<Comentario> findAllByPostId(Long id);
}
