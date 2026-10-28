package conceitosJava.src.main.java.org.example.abstracao.interfaceAbstrata;

public class Main {
    public static void main(String[] args) {
        Moto moto = new Moto("BIS");
        Aviao aviao = new Aviao("Boing");
        AirCar carroHibrido = new AirCar("AirCar"); // Gato não implementa Adestravel
        System.out.println("--- Moto ---");
        moto.darPartida();
        moto.frear();
        moto.tipoVeiculo();
        System.out.println("--- Avião ---");
        aviao.decolar();
        aviao.pousar();
        aviao.tipoVeiculo();
        System.out.println("--- Carro Hibrido ---");
        carroHibrido.darPartida();
        carroHibrido.frear();
        carroHibrido.decolar();
        carroHibrido.pousar();
        carroHibrido.tipoVeiculo();




    }
}
