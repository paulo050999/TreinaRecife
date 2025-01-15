public class Heranca02 {
    public Heranca02() {
        //Construtor

    }

    public static void main(String[] args) {
        Veiculo carro = new Carro();
        carro.acelerar(158);

        Carro novCarro = new Carro();
        novCarro.acelerar();
        Moto novaMoto = new Moto();
        novaMoto.acelerar();

    }
}


//SuperClasse
class Veiculo {
    public void acelerar(double intensidade) {
        System.out.println("Veículo acelerando..." + intensidade);

}

}

//Subclasse

class Carro extends Veiculo {
    public void acelerar() {
        System.out.println("Acelerando o carro.");
    }
}

//SubClasse

class Moto extends Veiculo {
    public void acelerar() {
        System.out.println("Dei o grau!!!");
    }
}