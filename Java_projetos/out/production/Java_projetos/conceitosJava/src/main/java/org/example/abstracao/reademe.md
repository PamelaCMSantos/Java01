# Abstração em Java (Classes Abstratas e Interfaces)

Este projeto apresenta conceitos fundamentais de **Abstração** em Programação Orientada a Objetos (POO) utilizando a linguagem Java, dividindo os exemplos no uso de **Classes Abstratas** e **Interfaces** (incluindo herança múltipla de interfaces).

---

## 🚀 O que este projeto ensina

* **Classes Abstratas (`classeAbstrata`):**
* Definição de superclasses que não podem ser instanciadas diretamente.
* Declaração de métodos abstratos que obrigam as subclasses (`Cachorro`, `Gato`) a implementar seus comportamentos específicos (`fazerSom()`, `mover()`).


* **Interfaces e Herança Múltipla (`interfaceAbstrata`):**
* Contratos de comportamento definidos por interfaces (`Veiculo`, `Terrestre`, `Aereo`).
* Implementação de múltiplas interfaces na mesma classe (ex: `AirCar` implementando tanto comportamentos de veículos terrestres quanto aéreos).
* Modelagem de diferentes classes de veículos (`Aviao`, `Moto`, `AirCar`).



---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (JDK 8 ou superior)

---

## 📁 Estrutura do Projeto

```text
src/
└── main/
    └── java/
        └── abstracao/
            ├── Main.java
            ├── classeAbstrata/
            │   ├── Animal.java
            │   ├── Cachorro.java
            │   ├── Gato.java
            │   └── Main.java
            └── interfaceAbstrata/
                ├── Veiculo.java
                ├── Terrestre.java
                ├── Aereo.java
                ├── Aviao.java
                ├── Moto.java
                ├── AirCar.java
                └── Main.java

```

---

## ⚙️ Divisão dos Módulos

### 1. Classes Abstratas (`abstracao.classeAbstrata`)

Demonstra como modelar uma hierarquia de classes onde a classe base `Animal` serve de modelo para animais concretos como `Cachorro` e `Gato`.

### 2. Interfaces (`abstracao.interfaceAbstrata`)

Demonstra a aplicação de interfaces para definir capacidades. Destaque para a classe `AirCar`, que combina as características de um veículo `Terrestre` e `Aereo`.

---

## 💻 Como Executar

1. **Clone o repositório:**
```bash
git clone <URL_DO_SEU_REPOSITORIO>

```


2. **Navegue até o diretório do projeto:**
```bash
cd <NOME_DO_DIRETORIO>

```


3. **Compile todas as classes Java do projeto:**
```bash
javac src/main/java/abstracao/*.java src/main/java/abstracao/*/*.java

```


4. **Execute as classes principais:**
* Para rodar o exemplo de **Classes Abstratas**:
```bash
java -cp src/main/java abstracao.classeAbstrata.Main

```


* Para rodar o exemplo de **Interfaces**:
```bash
java -cp src/main/java abstracao.interfaceAbstrata.Main

```


* Para rodar a execução geral:
```bash
java -cp src/main/java abstracao.Main

```





---