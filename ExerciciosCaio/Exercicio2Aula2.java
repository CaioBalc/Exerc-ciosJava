package ExerciciosCaio;

public class Exercicio2Aula2 {
    public static void main(String[] args) {
        Invoice i1 = new Invoice();
        i1.descricao = "Bloco de Notas";
        i1.quantidade = 3;
        i1.precoUnit = 12.75;
        i1.numero = 1;

        i1.print();

        Invoice i2 = new Invoice();
        i2.descricao = "Calculadora Científica";
        i2.quantidade = 2;
        i2.precoUnit = 129.99;
        i2.numero = 5;

        i2.print();
    }
}
