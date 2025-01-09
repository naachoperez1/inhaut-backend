package com.example.InhautBackendFinal.Services;

import com.example.InhautBackendFinal.Models.Entrada;

import java.util.List;
import java.util.Optional;

public interface EntradaService {
    public List<Entrada> getAll ();
    public Optional<Entrada> getById (Long id);
    public Entrada save (Entrada entrada);
    public void deleteById (Long id);
}
