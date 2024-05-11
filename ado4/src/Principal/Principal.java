package Principal;
import Pessoa.Pessoa;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("=-=-=-=-=-=-=-=-=-=-Bem vindo ao calculo do IMC-=-=-=-=-=-=-=-=-=-=");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\n");
        System.out.println("Digite o numero de Pessoas para realizar o calculo do IMC: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        Pessoa[] pessoas = new Pessoa[numero];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Nome: ");
            String nome = scanner.next();
            System.out.println("Altura (em metros): ");
            double altura = scanner.nextDouble();
            System.out.println("Peso (em quilos): ");
            double peso = scanner.nextDouble();
            System.out.println("\n");
            pessoas[i] = new Pessoa();
            pessoas[i].nome = nome;
            pessoas[i].altura = altura;
            pessoas[i].peso = peso;
            pessoas[i].imc = peso / (altura * altura);
        }

        for (Pessoa pessoa : pessoas) {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=Dados=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Nome: " + pessoa.nome);
            System.out.println("Altura: " + pessoa.altura);
            System.out.println("Peso: " + pessoa.peso);
            System.out.printf("IMC: %.2f%n", pessoa.imc);
            if (pessoa.imc < 18.5) {System.out.println("Você está com a classificação: Magreza");}
            else if (pessoa.imc < 25) {System.out.println("Você está com a classificação: Normal");}
            else if (pessoa.imc < 30) {System.out.println("Você está com a classificação: Sobrepeso");}
            else if (pessoa.imc < 35) {System.out.println("Você está com a classificação: Obesidade grau 1");}
            else if (pessoa.imc < 40) {System.out.println("Você está com a classificação: Obesidade grau 2");}
            else {System.out.println("Você está com a classificação: Obesidade grau 3");}
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("\n");
        }
    }
}
