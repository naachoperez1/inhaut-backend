package com.example.InhautBackendFinal.Controllers;

import com.example.InhautBackendFinal.Models.Comentario;
import com.example.InhautBackendFinal.Services.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/comentarios")
public class ComentarioController {
    @Autowired
    private ComentarioService comentarioService;

    @GetMapping("/{postId}")
    public List<Comentario> findAllByPostId (@PathVariable Long postId){
        return comentarioService.findAllByPostId(postId);
    }

    @PostMapping
    public Comentario save (@RequestBody Comentario comentario){
        return comentarioService.save(comentario);
    }

    @DeleteMapping("/{id}")
    public void deleteById (@PathVariable Long id){
        comentarioService.deleteById(id);
    }
}
