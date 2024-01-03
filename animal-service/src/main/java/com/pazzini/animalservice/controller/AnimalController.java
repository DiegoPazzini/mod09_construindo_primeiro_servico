// Define o pacote para a classe AnimalController
package com.pazzini.animalservice.controller;

// Importa as classes necessárias
import com.pazzini.animalservice.dto.FuncionarioDTO;
import com.pazzini.animalservice.entity.Animal;
import com.pazzini.animalservice.entity.Funcionario;
import com.pazzini.animalservice.repository.AnimalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Indica que esta classe é um controlador Spring
@RestController

// Define o mapeamento de URL base para todas as operações neste controlador
@RequestMapping("/animais")
public class AnimalController {

    // Injeta a dependência do AnimalRepository
    private AnimalRepository animalRepository;

    // Construtor que recebe a instância de AnimalRepository por injeção de dependência
    public AnimalController(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    // Mapeia o método HTTP GET para recuperar todos os animais
    @GetMapping
    private List<Animal> findAll() {
        return animalRepository.findAll();
    }

    // Mapeia o método HTTP POST para criar um novo animal
    @PostMapping
    private Animal create(@RequestBody Animal animal) {
        return animalRepository.save(animal);
    }

    // Mapeia o método HTTP GET para recuperar animais não adotados
    @GetMapping("/not-adopted")
    private List<Animal> findNotAdopted() {
        return animalRepository.findNotAdopted();
    }

    // Mapeia o método HTTP GET para recuperar animais adotados
    @GetMapping("/adopted")
    private List<Animal> findAdopted() {
        return animalRepository.findAdopted();
    }

    // Mapeia o método HTTP GET para obter informações sobre a quantidade de animais por funcionário
    @GetMapping("/animais-funcionarios")
    private List<FuncionarioDTO> findAnimaisPorFuncionario() {
        return animalRepository.obterFuncionariosComQuantidadeDeAnimais();
    }
}
