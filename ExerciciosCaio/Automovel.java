/*Um automóvel é um veículo movido a um motor, é utilizado para locomoção de passageiros, podendo
transportar objetos. Ele é composto por várias partes principais: o motor, a transmissão, o chassi, a
carroceria e os sistemas elétricos e de freios. O motor é o coração do automóvel, convertendo energia
em movimento. A transmissão controla a potência do motor para as rodas. O chassi é a estrutura que
suporta todo o veículo, enquanto a carroceria é a parte externa do carro que abriga os passageiros.
*/

package ExerciciosCaio;

public class Automovel {
    double motorCilindrada;
    String motorCombustivel;
    double capacidadeCarga;
    int quantPortas;
    int quantMarchas;
    int marchaAtual = 0;
    Motor motor;
    double quantCombustivel = 50;
    boolean freio;

    public void andar(){
        if (marchaAtual == 0) {
            System.out.println("Parado");
        }
        else {
            if (marchaAtual == -1){
                System.out.println("Ré");
            }
            else {
                System.out.println("Pra frente com marcha " + marchaAtual);
            }
        }
    }

    public void frear(){
        if (freio == true)
            System.out.println("Freando");
    }

    public void trocarMarchasPraCima(){
        if (marchaAtual >= -1 && marchaAtual < 6)
            marchaAtual++;
        else
            buzinar();
    }

    public void trocarMarchasPraBaixo(){
        if (marchaAtual > -1 && marchaAtual <= 6)
            marchaAtual--;
        else
            buzinar();
    }

    public void buzinar(){
        System.out.println("Bipbip");
    }

    public void especificacao(){
        motor.peso = 1000;
        motor.tamanhoMetroCubico = 1;
    }

    public void quantCombustivel(){
        if (quantCombustivel >= 50)
            System.out.println("Tanque cheio");
        if (quantCombustivel <= 0)
            System.out.println("Tanque vazio");
    }
}