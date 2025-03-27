package br.com.fecaf.model;

import java.util.Scanner;

public class Circulo {
    public double raio, area, perimetro;

    // criando objeto scanner, que permite a leitura de entradas do usuário.
    Scanner scanner = new Scanner(System.in);

    // cadastrar um novo circulo.
    //esse metodo solicita que o usuário insira um valor para o raio (scanner) e o armazena na variável raio.
    public boolean cadastrarCirculo () {
        System.out.println("/******************/");
        System.out.println("/* Cadastro Circlo /*");
        System.out.println("/******************/");
        System.out.println("Informar o raio do Circulo: ");
        raio = scanner.nextDouble();
        System.out.println("Circulo Cadastrado com Sucesso!");
        System.out.println("/******************/");
        return true;
    }

    // metodo para calcular area do circulo usando o math.pi. o math pi representa o valor de pi (aproximadamente 3.14159)
    //o math pow eleva o raio ao quadrado.
    public void calcularArea () {
        System.out.println("/* Calculando Area */");
        area = Math.PI * Math.pow (raio, 2);
        System.out.println(area);
    }

    // metodo para calcular o perimetro
    public void calcularPerimetro () {
        System.out.println("/* Calculando o Perimetro */");
        perimetro = 2 * Math.PI * raio;
        System.out.println(perimetro);
    }
}



