# Projeto FiapMarket - Israel Karacsony de Camargo Nunes

## 👨‍🎓 Informações do Aluno

- **Nome:** Israel Karacsony de Camargo Nunes
- **RM:** 563435
- **Turma:** 2CCPG
- **Curso:** Ciências da Computação
- **GitHub:** @Israel-Nunes

---

## 🎯 Descrição do Projeto

Este projeto é o resultado do aprendizado nas aulas 1-9 de Programação Orientada a Objetos, onde desenvolvi o sistema **FiapMarket** (sistema de mercado virtual).  

Durante as aulas foram aplicados conceitos fundamentais da orientação a objetos utilizando Java, como criação de classes, encapsulamento, construtores, associação entre objetos, herança, polimorfismo, classes abstratas e interfaces.  

O projeto foi adaptado para um contexto de mercado, utilizando produtos, alimentos, eletrônicos, pedidos e usuários como domínio principal do sistema.  

Além da implementação técnica, o projeto também serviu para praticar organização de código, estrutura de pacotes e boas práticas de programação orientada a objetos.  

---

## ✅ Checklist de Implementação

- [x] Aula 1 - Classes e Objetos
- [x] Aula 2 - Métodos
- [x] Aula 3 - Encapsulamento
- [x] Aula 4 - Construtores
- [x] Aula 5 - Associação
- [x] Aula 6 - Herança
- [x] Aula 7 - Polimorfismo
- [x] Aula 8 - Classes Abstratas
- [x] Aula 9 - Interfaces

---

## 🤔 Perguntas de Reflexão

### Aula 1 - Classes e Objetos

**Pergunta:** Por que precisamos criar uma classe `Usuario`? Não seria mais fácil apenas criar variáveis soltas no main?

 

Criar uma classe ajuda a organizar melhor as informações e comportamentos do sistema.  
Se usássemos apenas variáveis soltas no main, o código ficaria muito confuso e difícil de manter conforme o sistema crescesse.  
Com a classe `Usuario`, conseguimos representar cada usuário como um objeto completo, contendo nome, email, saldo e métodos próprios.  
Isso facilita muito quando existem muitos usuários cadastrados ao mesmo tempo no sistema.  
Além disso, as classes deixam o código mais reutilizável, organizado e próximo do mundo real.  

---

### Aula 2 - Métodos

**Pergunta:** Por que criar métodos específicos ao invés de alterar atributos diretamente?



Os métodos ajudam a proteger as regras de negócio do sistema.  
Se qualquer programador pudesse alterar o saldo diretamente, seria muito fácil criar erros ou até fraudes dentro do sistema.  
Com métodos específicos, conseguimos validar valores antes de modificar os dados.  
Isso também deixa o código mais seguro e mais fácil de entender.  
Além disso, centralizar regras em métodos evita repetição e facilita futuras alterações no projeto.  

---

### Aula 3 - Encapsulamento

**Pergunta:** Por que é seguro deixar o `get` público, mas perigoso deixar o atributo público?



O getter apenas permite visualizar o valor armazenado sem modificar diretamente o atributo.  
Já deixar o atributo público permitiria que qualquer parte do sistema alterasse os dados sem controle.  
O encapsulamento protege o objeto contra alterações indevidas e mantém a integridade das informações.  
Isso é importante porque alguns atributos precisam seguir regras específicas antes de serem modificados.  
Dessa forma, o sistema fica mais seguro, organizado e confiável.  

---

### Aula 4 - Construtores

**Pergunta:** Por que não devemos gerar getters e setters para tudo automaticamente?



Nem todos os atributos devem ser alterados livremente no sistema.  
Alguns dados representam informações importantes que precisam de validação ou processos específicos antes de serem modificados.  
Criar setters para tudo pode quebrar regras de negócio e facilitar inconsistências no sistema.  
No projeto, alguns atributos foram protegidos justamente para evitar alterações indevidas.  
Isso mostra a importância de pensar na lógica do sistema antes de simplesmente gerar código automático pela IDE.  

---

### Aula 5 - Associação

**Pergunta:** Por que usar objetos completos em vez de apenas Strings?



Utilizar o objeto completo permite acessar todas as informações e comportamentos relacionados àquele objeto.  
Se usássemos apenas uma String com o nome do usuário, não conseguiríamos acessar saldo, pedidos ou outros dados importantes.  
A associação entre objetos deixa o sistema mais conectado e mais próximo da realidade.  
Além disso, facilita futuras expansões do projeto sem precisar mudar toda a estrutura do código.  
Esse conceito também ajuda muito na reutilização de objetos dentro do sistema.  

---

### Aula 6 - Herança

**Pergunta:** Por que a classe filha não acessa diretamente atributos privados da mãe?


Os atributos privados existem para proteger os dados internos da classe mãe.  
Mesmo herdando características da superclasse, a filha ainda precisa respeitar o encapsulamento.  
Isso evita alterações indevidas e mantém o controle das informações dentro da classe original.  
A herança serve para reutilizar comportamentos e atributos, mas sem quebrar a segurança do sistema.  
Dessa forma, o código continua organizado e seguindo boas práticas da orientação a objetos.  

---

### Aula 7 - Polimorfismo

**Pergunta:** Por que o método precisa existir na superclasse?



O polimorfismo funciona através de um contrato definido na superclasse.  
Se o método não existisse na classe mãe, o Java não permitiria chamá-lo usando referências genéricas.  
A superclasse define quais comportamentos todas as subclasses precisam possuir.  
Depois disso, cada classe filha pode implementar sua própria lógica utilizando sobrescrita.  
Isso deixa o sistema flexível e facilita trabalhar com diferentes tipos de objetos de forma padronizada.  

---

### Aula 8 - Classes Abstratas

**Pergunta:** Por que precisamos marcar explicitamente uma classe como abstrata?



O Java não consegue adivinhar sozinho a intenção do programador.  
Mesmo que uma classe represente apenas um conceito genérico, ela continuará podendo ser instanciada se não for marcada como abstrata.  
Ao usar `abstract`, deixamos claro que aquela classe serve apenas como base para outras classes.  
Isso evita criar objetos genéricos sem sentido dentro do sistema.  
Além disso, métodos abstratos obrigam as subclasses a implementarem comportamentos importantes.  

---

### Aula 9 - Interfaces

**Pergunta:** Como as interfaces resolvem o problema da herança múltipla?



As interfaces funcionam como contratos de comportamento e não possuem implementação concreta obrigatória.  
Por isso, uma classe pode implementar várias interfaces ao mesmo tempo sem gerar conflitos de herança.  
Se Java permitisse múltiplas heranças de classes, poderiam existir métodos iguais causando ambiguidades no sistema.  
As interfaces evitam esse problema porque apenas definem assinaturas de métodos.  
Isso deixa o código mais flexível, organizado e fácil de expandir no futuro.  

---

## 🚀 Desafios Técnicos Implementados

### Desafio Pessoal (Seu Projeto)

**Qual foi o domínio que você escolheu para seu projeto pessoal?**

O domínio escolhido foi um sistema de mercado virtual chamado **FiapMarket**.  
O objetivo do projeto foi representar produtos, alimentos, eletrônicos, usuários e pedidos utilizando conceitos de Programação Orientada a Objetos.  
O sistema foi adaptado com base nas aulas do FiapRide, mas aplicado ao contexto de um mercado online.  
Isso ajudou bastante na compreensão prática dos conceitos estudados durante as aulas.  
Também tornou o projeto mais próximo de algo que poderia existir no mundo real.  

---

**Quais classes você criou?**

- Usuario
- Pedido
- Produto
- Alimento
- Eletronico
- Promocional

---

**Qual foi o maior desafio técnico que você enfrentou?**

O maior desafio foi entender como conectar corretamente os conceitos de herança, polimorfismo, classes abstratas e interfaces dentro do mesmo projeto.  
No começo foi difícil visualizar como cada classe deveria se relacionar sem quebrar a lógica do sistema.  
Também precisei adaptar exemplos de veículos para um sistema de mercado, o que exigiu mudanças na estrutura das classes.  
Outro ponto complicado foi entender quando usar herança e quando usar associação entre objetos.  
As interfaces também exigiram bastante atenção para compreender a ideia de contratos de comportamento.  
Com a prática das aulas, consegui organizar melhor o código e aplicar corretamente cada conceito.  
Os testes no `main` ajudaram bastante a visualizar o funcionamento do polimorfismo e das interfaces.  
Além disso, aprendi a importância de pensar na modelagem antes de começar a programar.  
Isso melhorou muito minha organização durante o desenvolvimento do projeto.  
No final, consegui montar um sistema funcional seguindo todos os requisitos das aulas.  

---

## 🎓 Conclusão

### O que você aprendeu nestas 9 aulas?

Durante essas aulas eu aprendi os principais fundamentos da Programação Orientada a Objetos utilizando Java.  
Consegui entender melhor conceitos como classes, objetos, encapsulamento, construtores, herança e polimorfismo.  
Também aprendi a diferença entre classes abstratas e interfaces e quando utilizar cada uma delas.  
Além da parte técnica, aprendi a importância da organização e da modelagem correta do sistema antes da implementação.  
Esses conhecimentos serão muito importantes para projetos maiores no futuro e para minha evolução como programador.  

---

### Qual conceito foi mais difícil de entender?

O conceito mais difícil foi o de polimorfismo junto com classes abstratas e interfaces.  
No começo eu tinha dificuldade para entender como o Java escolhia qual método executar em cada objeto.  
Também foi complicado diferenciar quando usar herança e quando usar interface.  
Com os exemplos práticos das aulas e os testes feitos no `main`, consegui compreender melhor o funcionamento.  
Depois de praticar bastante, esses conceitos começaram a fazer mais sentido no projeto.  

---

### O que você melhoraria no seu projeto se pudesse refazer?

Se eu pudesse refazer o projeto, organizaria melhor algumas classes desde o início para evitar alterações posteriores.  
Também adicionaria mais funcionalidades ao sistema, como estoque, carrinho de compras e métodos de pagamento.  
Outra melhoria seria criar mais validações para evitar dados inválidos sendo cadastrados.  
Além disso, eu melhoraria a estrutura dos testes para deixar o sistema mais completo e fácil de manter.  
Mesmo assim, o projeto foi muito importante para consolidar meu aprendizado em orientação a objetos.  