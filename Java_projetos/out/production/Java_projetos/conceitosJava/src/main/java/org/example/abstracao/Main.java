package conceitosJava.src.main.java.org.example.abstracao;
/*        Abstração
* Gemini:
* O Conceito no Mundo Real
* Pense num carro:
*
* Para dirigir, você precisa interagir apenas com o volante,
* o acelerador e o freio (a interface abstrata).
*
* Você não precisa saber como a injeção eletrônica calcula a mistura de combustível
* ou como os pistões do motor se movem internamente para conseguir dirigir.
*
* Resumo: Abstração é focar no "O QUE" o objeto faz, e não no "COMO" ele faz.

* Como Aplicar Abstração em Java?
* Em Java, aplicamos o conceito de Abstração principalmente de duas formas:

* 1. Classes Abstratas (abstract class)
    * Uma classe abstrata é uma classe que não pode ser instanciada diretamente com new.
    * Ela serve como um modelo base (uma "planta incompleta") obrigando as classes filhas a
    * implementarem determinados comportamentos.
    * Ela pode ter:
    * Métodos concretos: Um código pronto que todas as filhas herdam.
    * Métodos abstratos (abstract): Métodos sem corpo (sem {}), que obrigam as classes filhas a
    * escreverem suas próprias implementações.
*
* 2. Interfaces (interface)
*
* Uma Interface leva a abstração ao nível máximo. Enquanto uma classe abstrata pode ter estado (atributos)
* e métodos com código pronto, uma interface define um contrato 100% abstrato: ela estabelece o que uma classe deve fazer,
* sem ditar como ela deve fazer.
* Uma grande vantagem da interface em Java é que ela permite simular herança múltipla — uma classe só pode herdar (extends)
* de uma única classe pai, mas pode implementar (implements) múltiplas interfaces.
* */

public class Main {
}
