package AtividadeRevisao;

import java.util.Scanner;

import org.jcp.xml.dsig.internal.SignerOutputStream;

public class ExemploRevisao {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        // 1. LER O n
        System.out.println("DIGITE O NUMERO");
        double ndigitado = sc.nextDouble();
        // 2.se n for >10
        if (ndigitado > 10) {
            System.out.println("É maior que 10!");
        } else {// 3. senao >10
            System.out.println("Não é maior que 10!");
        }
    }

    public void exemplo2() {
        // 1. quantidade de horas trabalhada
        System.out.println(" quantidade de horas trabalhada mes");
        int horasTrabalhada = sc.nextInt();
        //2. 
        System.out.println("valor da hora");
        double valorHora = sc.nextDouble();
        //3.
        System.out.println("calculando quantidade de horas extra");
       int horasExtra = horasTrabalhada-200;
       //4.
       double salarioTotal = horasTrabalhada*+horasExtra*valorHora*50/100;
       //5.mostrar
       System.out.println("O Salario Total é R$"+salarioTotal);
        }
        


    }

