package com.project.beack_end_restaurant.config;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.beack_end_restaurant.model.Pratos;
import com.project.beack_end_restaurant.view.PratoService;

@RestController
@RequestMapping("/pratos")
public class MyController {

    @Autowired
    PratoService pratoService;

    @PostMapping
    public ResponseEntity<String> inserirPrato(@RequestBody Pratos prato) {
        try {
            pratoService.inserirPrato(prato);
            return ResponseEntity.ok("Prato inserido com sucesso!");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao inserir prato no banco de dados.");
        }
    }

    @DeleteMapping("/{id_pratos}")
    public ResponseEntity<String> deletarPrato(@PathVariable Long id_pratos) {
        try {
            pratoService.deletarPrato(id_pratos);
            return ResponseEntity.ok("Prato deletado com sucesso!");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao deletar prato no banco de dados.");
        }
    }

    @GetMapping
    public ResponseEntity<List<Pratos>> buscarTodos() {
        List<Pratos> pratos = pratoService.buscarTodos();
        return ResponseEntity.ok(pratos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pratos> buscarPratoPorId(@PathVariable Long id) {
        Optional<Pratos> prato = pratoService.buscarPorId(id);
        if (prato.isPresent()) {
            return ResponseEntity.ok(prato.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
