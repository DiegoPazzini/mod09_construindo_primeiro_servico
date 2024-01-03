# mod09_construindo_primeiro_servico

Este projeto, denominado "Animal Service", é uma aplicação Spring Boot destinada ao gerenciamento de animais e funcionários em um contexto de abrigo ou serviço relacionado a animais. O código está estruturado em pacotes que abrangem entidades, DTOs (Objetos de Transferência de Dados), repositórios e controladores. Abaixo estão os principais componentes do projeto:

Entidades:

Animal: Representa os animais no sistema, com atributos como nome provisório, idade estimada, raça, data de entrada, data de adoção, condições de chegada, porte, e tipo (gato ou cachorro).
Funcionario: Representa os funcionários envolvidos no serviço, com atributos como nome e uma lista de animais associados.
DTO (Data Transfer Object):

FuncionarioDTO: Um DTO utilizado para transferir informações simplificadas sobre funcionários, incluindo o nome do funcionário e a quantidade de animais associados.
Repositórios:

AnimalRepository: Estende o JpaRepository do Spring Data JPA e fornece métodos para acessar dados relacionados aos animais, incluindo consultas personalizadas para encontrar animais não adotados, animais adotados e obter informações sobre a quantidade de animais por funcionário.
Controladores:

AnimalController: Fornece endpoints REST para realizar operações relacionadas a animais, como obter todos os animais, criar um novo animal, encontrar animais não adotados, animais adotados e obter informações sobre a quantidade de animais por funcionário.
Aplicação Principal:

AnimalServiceApplication: A classe principal da aplicação Spring Boot, contendo o método main para iniciar a aplicação.
Testes:

AnimalServiceApplicationTests: Um teste de integração vazio que verifica se o contexto da aplicação é carregado com sucesso.
Este projeto é configurado para ser executado como uma aplicação Spring Boot e pode ser utilizado como base para o desenvolvimento de sistemas relacionados à gestão de animais em abrigos ou serviços similares.

## Skills utilizadas:
<div style="display: inline_block"><br>
   <img align="center" alt="Spring" height="50" width="50" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/spring/spring-original.svg">
  <img align="center" alt="Spring" height="60" width="60" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg">
