import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner leitor = new  Scanner (System.in);
    //Variavel
    double salarioAtual = 0.0,
           percentual = 0.0,
           valorAumento = 0.0,
           novoSalario = 0.0;
    //entrada de dados
    System.out.println("Salario Atual :");
    salarioAtual = leitor.nextDouble();
    System.out.println("Percentual :");
    percentual = leitor.nextDouble();
    //Processamento 
    valorAumento = salarioAtual * (percentual / 100);
    novoSalario =  salarioAtual + valorAumento; 
    // saida 
    System.out.println("Valor Do Aumento : R$ " + valorAumento);
    System.out.println("Novo Salario : R$ " + novoSalario);

  }
}