// Define o pacote para a interface AnimalRepository
package com.pazzini.animalservice.repository;

// Importa as classes necessárias
import com.pazzini.animalservice.dto.FuncionarioDTO;
import com.pazzini.animalservice.entity.Animal;
import com.pazzini.animalservice.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

// Interface responsável por fornecer métodos de acesso aos dados da entidade Animal
@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    // Consulta customizada para encontrar animais não adotados
    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL ORDER BY a.dataEntrada")
    List<Animal> findNotAdopted();

    // Consulta customizada para encontrar animais adotados
    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NOT NULL")
    List<Animal> findAdopted();

    // Consulta customizada para obter informações sobre a quantidade de animais por funcionário
    @Query("SELECT NEW com.pazzini.animalservice.dto.FuncionarioDTO(F.nome, COUNT(A.id)) " +
            "FROM Funcionario F " +
            "JOIN F.animais A " +
            "WHERE A.dataEntrada BETWEEN current_date() - 365 AND current_date() " +
            "GROUP BY F.nome")
    List<FuncionarioDTO> obterFuncionariosComQuantidadeDeAnimais();
}
