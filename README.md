## Calculadora-Simples
Um aplicativo de linha de comando em Java para realizar operações básicas (adição, subtração, multiplicação e divisão), com loop interativo até o usuário decidir sair.

## 📌 Visão Geral
Este programa permite ao usuário escolher uma operação matemática, inserir dois números e exibe o resultado. Após cada cálculo, o usuário é questionado se deseja realizar outra operação, até digitar "no", momento em que o programa encerra.

## 🧠 Estrutura do Projeto
less
Copiar
Editar
.
├── Main.java        // Classe principal com interface CLI e fluxo de execução
└── Calculator.java  // Classe com lógica das operações matemáticas
Detalhes das Classes
Main.java:

Pergunta ao usuário qual operação deseja realizar (add, subtract, multiply, divide).

Lê dois números do tipo double.

Realiza operação selecionada e exibe resultado.

Impede divisão por zero com mensagem apropriada.

Repete o ciclo até o usuário responder "no".

Calculator.java:

Possui dois atributos inteiros (num1, num2).

Métodos para operações:

add(), subtract(), multiply()

divide() — lança exceção em caso de divisão por zero.

## 🚀 Como Executar
Clone o repositório:

bash
Copiar
Editar
git clone https://seu-repositorio.git
cd nome-do-repositorio
Compile o código:

bash
Copiar
Editar
javac Main.java Calculator.java
Execute o programa:

bash
Copiar
Editar
java Main
Siga os prompts no terminal para realizar operações.

## 🎯 Exemplo de Uso
vbnet
Copiar
Editar
What operation do you want to perform? (add, subtract, multiply, divide)
> add
Enter the first number:
> 10
Enter the second number:
> 5
Result: 15.0
Do you want to perform another operation? (yes/no)
> yes
What operation do you want to perform? (add, subtract, multiply, divide)
> divide
Enter the first number:
> 8
Enter the second number:
> 0
Cannot divide by zero.
What operation do you want to perform? (add, subtract, multiply, divide)
...

## ✅ Funcionalidades
Executa operações soma, subtração, multiplicação e divisão em números decimais.

Detecta tentativa de divisão por zero e informa o usuário.

Loop interativo que permite realizar múltiplos cálculos até o usuário encerrar.

## 🛠 Possíveis Melhorias Futuras
Tratar exceções de entrada (por exemplo, se o usuário inserir texto onde se espera número).

Suporte a números de ponto flutuante nos métodos da classe Calculator.

Adicionar outras operações (exponenciação, módulo, raiz quadrada, etc.).

Alterar Calculator para operar com double em vez de int, para maior precisão.

Implementar testes unitários com JUnit para validar cada operação. Veja exemplo para JUnit 
GitHub
Reddit
+3
GitHub
+3
GitHub
+3
GitHub
+14
Gist
+14
GitHub
+14
.

Criar interface gráfica básica (Swing ou JavaFX).
