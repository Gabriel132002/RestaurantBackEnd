package com.project.beack_end_restaurant.view;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.beack_end_restaurant.model.PratoRepository;
import com.project.beack_end_restaurant.model.Pratos;

@Service
public class PratoService {

    @Autowired
    private PratoRepository pratoRepository;

    public void inserirPrato(Pratos pratos){
        pratoRepository.save(pratos);
    }

    public void deletarPrato(Long id_pratos){
        pratoRepository.deleteById(id_pratos);
    }

    public List<Pratos> buscarTodos() {
        return pratoRepository.findAll();
    }

    public Optional<Pratos> buscarPorId(Long id_pratos) {
        return pratoRepository.findById(id_pratos);
    }
    
}
