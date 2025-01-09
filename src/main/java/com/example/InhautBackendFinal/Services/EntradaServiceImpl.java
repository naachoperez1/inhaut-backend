package com.example.InhautBackendFinal.Services;

import com.example.InhautBackendFinal.Models.Entrada;
import com.example.InhautBackendFinal.Repositories.EntradaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EntradaServiceImpl implements EntradaService{
    @Autowired
    private EntradaRepository entradaRepository;

    @Override
    public List<Entrada> getAll() {
        return entradaRepository.findAll();
    }

    @Override
    public Optional<Entrada> getById(Long id) {
        return entradaRepository.findById(id);
    }

    @Override
    public Entrada save(Entrada entrada) {
        LocalDate ahora = LocalDate.now();
        entrada.setFecha(ahora);

        return entradaRepository.save(entrada);
    }

    @Override
    public void deleteById(Long id) {
        entradaRepository.deleteById(id);
    }
}
