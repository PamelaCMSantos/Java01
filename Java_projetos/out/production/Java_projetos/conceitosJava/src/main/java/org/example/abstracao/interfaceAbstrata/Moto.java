package conceitosJava.src.main.java.org.example.abstracao.interfaceAbstrata;

public class Moto extends Veiculo implements Terrestre{
    public Moto(String nome) {
        super(nome);
    }
    @Override
    public void tipoVeiculo() {
        super.tipoVeiculo();
    }
    @Override
    public void darPartida() {
        System.out.println(getNome() + " está dando partida!");
    }
    @Override
    public void frear(){
        System.out.println(getNome() + " está freando!");
    }

}
