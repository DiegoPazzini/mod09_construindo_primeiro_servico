// Define o pacote para a classe Animal
package com.pazzini.animalservice.entity;

// Importa as bibliotecas necessárias
import javax.persistence.*;
import java.sql.Date;

// Classe que representa a entidade Animal no contexto da persistência de dados
@Entity
public class Animal {

    // Identificador único gerado automaticamente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    // Método getter para obter o identificador único do animal
    public Integer getId() {
        return id;
    }

    // Atributo que armazena o nome provisório do animal
    @Column(nullable = false)
    private String nomeProvisorio;

    // Atributo que armazena a idade estimada do animal
    @Column(nullable = false)
    private Integer idadeEstimada;

    // Atributo que armazena a raça do animal
    @Column(nullable = false)
    private String raca;

    // Atributo que armazena a data de entrada do animal no sistema
    @Column(nullable = false)
    private Date dataEntrada;

    // Atributo que armazena a data de adoção do animal
    @Column
    private Date dataAdocao;

    // Atributo que armazena as condições de chegada do animal
    @Column(nullable = false)
    private String condicoesChegada;

    // Relacionamento Many-to-One com a entidade Funcionario
    @ManyToOne
    @JoinColumn()
    private Funcionario funcionario;

    // Atributo que armazena a data de óbito do animal
    @Column
    private Date dataObito;

    // Atributo que armazena o porte do animal
    @Column(nullable = false)
    private String porte;

    // Enumeração que representa os tipos possíveis de animais
    @Enumerated(EnumType.STRING)
    private Tipo tipo;

    // Enumeração dos tipos possíveis de animais (GATO, CACHORRO)
    public enum Tipo {
        GATO,
        CACHORRO
    }

    // Método getter para obter o funcionário associado ao animal
    public Funcionario getFuncionario() {
        return funcionario;
    }

    // Método setter para definir o funcionário associado ao animal
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    // Método getter para obter o tipo do animal
    public Tipo getTipo() {
        return tipo;
    }

    // Método setter para definir o tipo do animal
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    // Métodos getter e setter para os demais atributos da classe
    // (nomeProvisorio, idadeEstimada, raca, dataEntrada, dataAdocao, condicoesChegada, dataObito, porte)
}
