package Aula3;

public class Aula3 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Caio Balczarek";
        p1.altura = 1.55;
        p1.peso = 51;
        p1.idade = 21;
    
        Pessoa p2 = new Pessoa();
        p2.nome = "Paula Camilly da Silva";
        p2.altura = 1.60;
        p2.peso = 60;
        p2.idade = 20;
        p2.tipoSanguineo = "A+";
    
        p1.imprimir();
        p2.imprimir();
    }
    
}