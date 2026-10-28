# 🐾 Estudo Prático de POO em Java: Polimorfismo e Herança

Este projeto é um exemplo prático desenvolvido para demonstrar os conceitos fundamentais da **Programação Orientada a Objetos (POO)** em Java, focando principalmente nos pilares de **Herança**, **Polimorfismo**, **Encapsulamento** e **Casting de Objetos**.

---

## 📌 Conceitos Demonstrados no Projeto

### 1. Herança (`extends`)
A herança estabelece uma relação de *"é um"*. A classe base `Animal` atua como **superclasse** (classe pai), enquanto `Cachorro` e `Gato` são **subclasses** (classes filhas) que herdam seus atributos e métodos.

```java
public class Cachorro extends Animal { ... }
```

### 2. Polimorfismo e Sobrescrita de Métodos (`@Override`)
O polimorfismo permite que o mesmo método invocado produza comportamentos diferentes dependendo da subclasse real do objeto em tempo de execução:

* Chamada genérica: `animal.emitirSom()`
* Resultado em `Cachorro`: `"O cachorro faz: Au Au!"`
* Resultado em `Gato`: `"O Gato faz: Miau Miau!"`

### 3. Modificador de Acesso `protected` e a palavra-chave `super`
* O método `mensagem()` na classe `Animal` possui visibilidade `protected`, permitindo que apenas a própria classe pai e suas subclasses tenham acesso a ele.
* A palavra-chave `super.mensagem()` é utilizada nas subclasses para acessar a implementação da classe pai.

### 4. Type Casting (Downcasting) e `instanceof`
No código, uma referência do tipo pai (`Animal`) é utilizada para armazenar uma instância do tipo filho (`Gato`). Para acessar métodos específicos do `Gato`, realizamos o **Type Casting**:

```java
Animal meuAnimal2 = new Gato();

// Casting explícito para acessar métodos exclusivos da subclasse
((Gato) meuAnimal2).raca(raca2);
```

Dentro do laço de repetição, utiliza-se o operador **`instanceof`** para verificar com segurança o tipo real do objeto antes de realizar a conversão de tipo (downcasting):

```java
if (animal instanceof Cachorro) {
    Cachorro dog = (Cachorro) animal;
    System.out.println("-> Este animal é um Cachorro.");
}
```

---

## 🗂️ Estrutura do Pacote

```text
conceitosJava
└── src
    └── main
        └── java
            └── org
                └── example
                    └── polimorfismo
                        ├── Animal.java    # Classe Pai (Superclasse)
                        ├── Cachorro.java  # Subclasse
                        ├── Gato.java      # Subclasse
                        └── Main.java      # Execução e testes do programa
```

---

## 💻 Como Executar o Projeto

### Pré-requisitos
* **Java JDK 11** ou superior instalado.
* IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code) ou terminal.

### Passos para execução
1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```
2. Abra o projeto na sua IDE.
3. Navegue até o arquivo `Main.java` no caminho `conceitosJava/src/main/java/org/example/polimorfismo/Main.java`.
4. Execute a classe `Main`.
5. Insira os dados das raças solicitadas via terminal quando o programa solicitar.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java
* **Entrada de Dados:** `java.util.Scanner`
* **Coleções:** `java.util.ArrayList` e `java.util.List`