package com.example.InhautBackendFinal.Controllers;

import com.example.InhautBackendFinal.Models.Entrada;
import com.example.InhautBackendFinal.Services.CloudinaryService;
import com.example.InhautBackendFinal.Services.EntradaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;

@RestController
@RequestMapping("api/entradas")
//@CrossOrigin(origins = "*", methods = { GET, PUT, POST, DELETE})
public class EntradaController {
    @Autowired
    private EntradaService entradaService;
    @Autowired
    private CloudinaryService cloudinaryService;

    @GetMapping
    public List<Entrada> getAll(){
        return entradaService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Entrada> getById (@PathVariable Long id){
        return entradaService.getById(id);
    }

    @PostMapping
    public Entrada save (@RequestParam String titulo,
                         @RequestParam String autor,
                         @RequestParam String texto,
                         @RequestParam MultipartFile imagen) throws IOException {

        String imageURL = cloudinaryService.uploadImage(imagen);

        Entrada entrada = new Entrada(titulo,texto,autor,imageURL);


        return entradaService.save(entrada);
    }

    @DeleteMapping("/{id}")
    public void deleteById (@PathVariable Long id){
        entradaService.deleteById(id);
    }
}
