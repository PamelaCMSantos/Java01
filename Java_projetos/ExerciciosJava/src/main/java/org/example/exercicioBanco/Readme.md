# 🏦 Sistema Bancário em Java - Prática de POO

Este projeto é uma aplicação de console desenvolvida em Java para consolidar os pilares da **Programação Orientada a Objetos (POO)**: Encapsulamento, Herança, Abstração, Polimorfismo e Interfaces.

O sistema simula operações bancárias simples de depósito, saque, consulta de saldo, projeção de rendimentos e cálculo de impostos sobre contas.

---

## 🚀 Conceitos de POO Aplicados

1. **Classe Abstrata (`Conta`)**: Serve como base para todas as contas do sistema. Não pode ser instanciada diretamente e garante o reuso de atributos como `nome` e `saldo`.
2. **Herança (`extends`)**: As classes `ContaCorrente` e `ContaPoupanca` herdam todas as características comuns da classe pai `Conta`.
3. **Interface (`Tributo`)**: Define o contrato `calcularImposto()`, garantindo que apenas produtos financeiros tributáveis (como a `ContaCorrente`) implementem regras de imposto.
4. **Polimorfismo e Type Casting**:
    - Uso do tipo genérico `Conta` para instanciar objetos específicos.
    - Aplicação de **Downcasting** `((ContaPoupanca) conta)` para acessar métodos exclusivos da subclasse.
5. **Tratamento de Exceções (`try-catch`)**: Proteção contra entradas inválidas do usuário via `Scanner` (`InputMismatchException`).

---

## 🛠️ Estrutura do Projeto
src/
└── org/example/
├── Main.java (Interface via Console com menu interativo)
└── exercicioBanco/
├── Conta.java (Classe Abstrata Pai)
├── ContaCorrente.java (Subclasse com regras de impostos)
├── ContaPoupanca.java (Subclasse com projeção de rendimentos)
└── Tributo.java (Interface para tributação)
---

## 🖥️ Como Executar

1. Certifique-se de ter o **JDK 17+** instalado em sua máquina.
2. Clone o repositório ou baixe os arquivos fonte.
3. Abra o projeto na sua IDE de preferência (IntelliJ IDEA, Eclipse, VS Code).
4. Execute a classe `Main.java`.