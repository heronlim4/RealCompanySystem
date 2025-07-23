# RealCompanySystem

Projeto final desenvolvido para a disciplina de **Programação Orientada a Objetos**.

## Estudo de Caso: Sistema de Locação de Vídeos

Uma pequena locadora de vídeos precisa de um sistema para controlar o empréstimo de aproximadamente **2.000 DVDs**. O sistema deverá contemplar o controle de filmes, DVDs, clientes e locações ativas.

## Requisitos do Sistema

### Filmes

- Cada filme possui:
  - Um identificador único.
  - Um título.
  - Uma categoria (comédia, drama, aventura, ação etc.).
  - Uma lista de atores principais (opcional).

### DVDs

- Cada DVD:
  - Possui um número de identificação.
  - Está associado a um único filme.
  - Em casos específicos, um filme pode ocupar dois DVDs.
  - Cada DVD contém somente um filme.

### Atores

- Os filmes podem ter atores destacados.
- Para cada ator podem ser armazenadas as seguintes informações:
  - Nome real.
  - Apelido conhecido.
- Nem todos os filmes possuem atores registrados.

### Clientes

- Apenas clientes cadastrados podem alugar DVDs.
- Cada cliente possui:
  - Número de associado (identificador único).
  - Nome e sobrenome.
  - Telefone.
  - Endereço completo.
- Um cliente pode ter vários DVDs alugados simultaneamente.

### Empréstimos

- O sistema deve permitir verificar quais DVDs estão atualmente alugados por cada cliente.
- Registros históricos de locações não são mantidos.

## Status do Projeto

Finalizado.
