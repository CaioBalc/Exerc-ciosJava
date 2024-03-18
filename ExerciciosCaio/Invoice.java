package ExerciciosCaio;

public class Invoice {
    int numero;
    String descricao;
    double quantidade;
    double precoUnit;

    public void print(){
        System.out.println("Numero: " + numero);
        System.out.println("Descricao: " + descricao);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço Unitário: " + precoUnit);
    }
}
