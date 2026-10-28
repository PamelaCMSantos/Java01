package conceitosJava.src.main.java.org.example.abstracao.interfaceAbstrata;
/* Gemini:
* AirCar (da Klein Vision): Um carro esportivo que se transforma
* em um avião turboélice com o apertar de um botão, usando motor BMW 1.6 e
* precisando de uma pista para decolar
* */
// Adicionei o AirCar para exibir como um seria uma classe que implementa duas (ou mais)
// interfaces diferentes

public class AirCar extends Veiculo implements Aereo, Terrestre {
    public AirCar(String nome) {
        super(nome);
    }
    @Override
    public void tipoVeiculo() {
        super.tipoVeiculo();
    }
    //Todos os metodos devem ser implementados, das duas interfaces (ou quantas mais forem implementadas)
    @Override
    public void darPartida() {
        System.out.println("afivele os cintos, o " + getNome() + " está dando partida neste momento!");
    }
    @Override
    public void frear(){
        System.out.println(getNome() + " está freando neste momento!");
    }
    @Override
    public void decolar(){
        System.out.println("Mantenha os cintos afivelados, o" + getNome() + " está decolando!");
    }
    @Override
    public void pousar(){
        System.out.println(getNome() + " está pousando!");

    }
}
