
import java.util.Scanner;

public class des4 {
  public static void main(String[] args) {

    int suspeito = 0;
    int pessoa1, pessoa2, pessoa3, pessoa4, pessoa5;

    Scanner sc = new Scanner(System.in);
    System.out.println("Telefonou para a vítima? (1)- Sim (2)- Não");
    pessoa1 = sc.nextInt();

    if (pessoa1 == 1) {
      ++suspeito;
    }

    Scanner sc2 = new Scanner(System.in);
    System.out.println("Esteve no local do crime? [1]- Sim [2]- Não");
    pessoa2 = sc2.nextInt();

    if (pessoa2 == 1) {
      ++suspeito;
    }

    Scanner sc3 = new Scanner(System.in);
    System.out.println("Mora perto da vítima? [1]- Sim [2]- Não");
    pessoa3 = sc3.nextInt();

    if (pessoa3 == 1) {
      ++suspeito;
    }

    Scanner sc4 = new Scanner(System.in);
    System.out.println("Devia para a vítima? [1]- Sim [2]- Não");
    pessoa4 = sc4.nextInt();

    if (pessoa4 == 1) {
      ++suspeito;
    }

    Scanner sc5 = new Scanner(System.in);
    System.out.println("Já trabalhou com a vítima? [1]- Sim [2]- Não");
    pessoa5 = sc5.nextInt();

    if (pessoa5 == 1) {
      ++suspeito;
    }
      

    if (suspeito == 2) {
      System.out.println("Suspeito");
    }

    else if (suspeito == 3 || suspeito == 4) {
      System.out.println("Cúmplice");
    }

    else if (suspeito == 5) {
      System.out.println("Assassino");
    }

    else {
      System.out.println("Inocente");
    }

    sc.close();
    sc2.close();
    sc3.close();
    sc4.close();
    sc5.close();
    
  }

  
}

