// Define o pacote para a classe FuncionarioDTO
package com.pazzini.animalservice.dto;

// Classe que representa um objeto de transferência de dados (DTO) para informações do funcionário
public class FuncionarioDTO {

    // Atributo que armazena o nome do funcionário
    private String nome;

    // Atributo que armazena a quantidade de animais associados ao funcionário
    private Long quantidadeAnimais;

    // Construtor que recebe o nome e a quantidade de animais ao instanciar o FuncionarioDTO
    public FuncionarioDTO(String nome, Long quantidadeAnimais) {
        this.nome = nome;
        this.quantidadeAnimais = quantidadeAnimais;
    }

    // Método getter para obter o nome do funcionário
    public String getNome() {
        return nome;
    }

    // Método setter para definir o nome do funcionário
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para obter a quantidade de animais associados ao funcionário
    public Long getQuantidadeAnimais() {
        return quantidadeAnimais;
    }

    // Método setter para definir a quantidade de animais associados ao funcionário
    public void setQuantidadeAnimais(Long quantidadeAnimais) {
        this.quantidadeAnimais = quantidadeAnimais;
    }
}
