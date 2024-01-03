// Define o pacote para a classe Funcionario
package com.pazzini.animalservice.entity;

// Importa as bibliotecas necessárias
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

// Classe que representa a entidade Funcionario no contexto da persistência de dados
@Entity
public class Funcionario {

    // Identificador único gerado automaticamente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    // Atributo que armazena o nome do funcionário
    @Column(nullable = false)
    private String nome;

    // Anotação para ignorar a serialização dos animais ao converter o Funcionario para JSON
    @JsonIgnore
    @OneToMany(mappedBy = "funcionario")
    private List<Animal> animais = new ArrayList<>();

    // Método getter para obter o identificador único do funcionário
    public Integer getId() {
        return id;
    }

    // Método setter para definir o identificador único do funcionário
    public void setId(Integer id) {
        this.id = id;
    }

    // Método para adicionar um animal à lista de animais associados ao funcionário
    public void addAnimal(Animal animal) {
        animais.add(animal);
        animal.setFuncionario(this);
    }

    // Método getter para obter o nome do funcionário
    public String getNome() {
        return nome;
    }

    // Método setter para definir o nome do funcionário
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para obter a lista de animais associados ao funcionário
    public List<Animal> getAnimais() {
        return animais;
    }

    // Método setter para definir a lista de animais associados ao funcionário
    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }
}
