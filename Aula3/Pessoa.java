package Aula3;

public class Pessoa {
    double peso;
    double altura;
    int idade;
    String nome;
    String tipoSanguineo;

    void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
    }
}

