## Design Pattern - Command Pattern

### Notes:
- Continuação do: https://github.com/marciodegan/design-pattern-state

#### Nova funcionalidade = Geração de Pedido

- Após aprovado orçamento, deve ser criado um pedido.
- Baseado nesse pedido, vamos executar algumas ações como: simular gravar no bd, enviar um email, notificar outro sistema.
- Da forma como o código foi organizado, se precisássemos, além de executar a geração de pedido através da CLI, também executar através de um formulário web, uma API e/ou mensagens de uma fila, precisaríamos duplicar todo este código em vários lugares.
- Utiliza-se um "CommandHandler" que contém as injecoes, e os métodos de execução;
- Conseguimos ter separação dos dados em si e das dependencias que vao de fato executar o comando.
- Mas estamos separando dados de comportamento. E OO é juntar dados com comportamentos. 
- Estudar Command Handlers em Domain Driven Design e Clean Architecture.
- Um caso de uso em nossa aplicação pode ter várias ações (salvar no banco, enviar e-mail, etc);
- Um caso de uso deve ser extraído para uma classe específica, ao invés de estar no arquivo da CLI, controller ou algo do tipo;
- A técnica de extração do caso de uso para uma classe específica pode ser chamada de padrão Command;
- A diferença do padrão Command da GoF para o padrão que utiliza Command Handler (muito utilizado no padrão de arquitetura Domain Driven Design).

- Com classes menores e mais concisas, é mais fácil encontrar possíveis problemas. Se em algum momento uma das tarefas parar de funcionar, nós sabemos que há uma classe específica para este propósito e podemos começar a depuração por ela.
- A implementação de cada tarefa pode mudar com o tempo e o Command Handler não deve precisar saber disso.
- Mais: https://refactoring.guru/design-patterns/command.