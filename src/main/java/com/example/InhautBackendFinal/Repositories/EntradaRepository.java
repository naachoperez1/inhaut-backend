package com.example.InhautBackendFinal.Repositories;

import com.example.InhautBackendFinal.Models.Entrada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntradaRepository extends JpaRepository<Entrada, Long> {
}
