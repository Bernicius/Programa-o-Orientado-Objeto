// Classe pai Animal
public class Animal {
    public void fazerSom() {
        System.out.println("O animal faz um som");
    }
}

// Classe filha Cachorro que sobrescreve o método fazerSom
public class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O cachorro late");
    }
}

// Classe filha Gato que sobrescreve o método fazerSom
public class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O gato mia");
    }
}

// Classe principal para testar a sobrescrita de métodos
public class TesteSobrescrita {
    public static void main(String[] args) {
        Animal meuAnimal = new Animal();
        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();

        meuAnimal.fazerSom(); // Saída: O animal faz um som
        meuCachorro.fazerSom(); // Saída: O cachorro late
        meuGato.fazerSom(); // Saída: O gato mia
    }
}
