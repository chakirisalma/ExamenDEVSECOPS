package com.example.GestionPr.service;

import com.example.GestionPr.model.Professeur;
import com.example.GestionPr.repository.ProfesseurRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesseurService {
    private final ProfesseurRepository repository;

    public ProfesseurService(ProfesseurRepository repository) {
        this.repository = repository;
    }

    public List<Professeur> findAll() { return repository.findAll(); }
    public Professeur findById(Long id) { return repository.findById(id).orElse(null); }
    public Professeur save(Professeur prof) { return repository.save(prof); }
    public void deleteById(Long id) { repository.deleteById(id); }
}
