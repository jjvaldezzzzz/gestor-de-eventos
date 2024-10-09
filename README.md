# Sistema de Gestão de Eventos

Este projeto é uma aplicação simples de **Gestão de Eventos** em Java, que permite cadastrar, excluir, buscar e listar eventos, além de importar dados de eventos a partir de um arquivo CSV.

## Funcionalidades

- **Cadastrar Evento**: Permite cadastrar um novo evento fornecendo nome, data, local e capacidade.
- **Excluir Evento**: Permite excluir um evento existente pelo nome.
- **Realizar Inscrição**: Inscreve uma pessoa em um evento, caso haja vagas disponíveis.
- **Buscar Evento**: Busca um evento pelo nome e exibe as informações detalhadas.
- **Listar Eventos**: Exibe todos os eventos cadastrados.
- **Importar CSV**: Permite importar eventos a partir de um arquivo CSV, que será carregado na aplicação.

## Requisitos

- **Java JDK** versão 17 ou superior
- **Maven Apache** para gerenciamento de dependências

## Como rodar o projeto

### Clonando o repositório

1. Faça o download do código-fonte ou clone o repositório.
   ```bash
   git clone https://github.com/jjvaldezzzzz/gestor-de-eventos.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd gestao-eventos
   ```
3. Compilação e execução
Compile o projeto com o seguinte comando:

   ```bash
   javac -d bin src/*.java
   ```
Execute a aplicação com o comando:

   ```bash
   java -cp bin Main
   ```
Importação de Eventos via CSV
Para importar eventos de um arquivo CSV, coloque o arquivo no diretório do projeto e siga estas etapas:

O arquivo CSV deve ter o nome 'Eventos.csv' estar no formato:

   ```bash
   nomeEvento;dataEvento;localEvento;vagas
   ```

No menu principal da aplicação, escolha a opção "6" para importar o CSV.

Estrutura do Projeto
- Main.java: Contém o menu principal da aplicação e gerencia a interação com o usuário.
- Evento.java: Representa um evento com nome, data, local e capacidade.
- Organizador.java: Contém métodos para gerenciar eventos, como cadastrar, excluir, listar, e buscar eventos.
- EventoCSV.java: Responsável pela importação de eventos a partir de um arquivo CSV.
- Exemplo de Uso:
Ao rodar o programa, você verá um menu com opções para cadastrar, excluir, buscar e listar eventos, bem como importar um arquivo CSV com eventos.

Menu:
1. Cadastrar evento
2. Excluir evento
3. Realizar inscrição
4. Buscar evento
5. Listar eventos
6. Importar CSV
0. Sair
Escolha uma opção:
## Contribuindo
Se você deseja contribuir para o projeto, sinta-se à vontade para abrir uma issue ou enviar um pull request com melhorias.
