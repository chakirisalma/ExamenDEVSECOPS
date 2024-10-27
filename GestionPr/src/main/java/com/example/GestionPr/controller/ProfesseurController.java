package com.example.GestionPr.controller;

import com.example.GestionPr.model.Professeur;
import com.example.GestionPr.service.ProfesseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professeurs")
public class ProfesseurController {
    @Autowired
    private final ProfesseurService service;

    public ProfesseurController(ProfesseurService service) {
        this.service = service;
    }

    @GetMapping
    public List<Professeur> getAllProfesseurs() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Professeur getProfesseurById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Professeur createProfesseur(@RequestBody Professeur prof) {
        return service.save(prof);
    }

    @PutMapping("/{id}")
    public Professeur updateProfesseur(@PathVariable Long id, @RequestBody Professeur prof) {
        prof.setId(id);
        return service.save(prof);
    }

    @DeleteMapping("/{id}")
    public void deleteProfesseur(@PathVariable Long id) {
        service.deleteById(id);
    }
}
