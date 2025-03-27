package br.com.fecaf.model;

import java.util.Scanner;

public class Retangulo {
    public double base, altura, area, perimetro, lado1, lado2;

    // criando objeto scanner, que permite a leitura de entradas do usuário.
    Scanner scanner = new Scanner(System.in);

    // esse  metodo retorna um valor do tipo boolean.
    // nesse caso, ele sempre retorna true, indicando que o cadastro foi realizado com sucesso.
    public boolean cadastrarRetangulo() {
        System.out.println("/***************/");
        System.out.println("/* Cadastrar Retangulo */");
        System.out.println("/***************/");
        System.out.println("Informe a Base: ");
        lado1 = scanner.nextDouble();
        System.out.println("Informe a Altura: ");
        lado2 = scanner.nextDouble();
        System.out.println("Retangulo Cadastrado com Sucesso!");
        System.out.println("/***************/");

        return true;
    }

    // esse metodo calcula a area do retangulo.
    public void calcularArea() {
        System.out.println("/* Calculando Area */");
        area = base * altura;
        System.out.println("A Area é: " + area);
    }

    // esse metodo calcula o perimetro do retangulo, dado o uso de base e altura.
    public void calcularPerimetro () {
        System.out.println("/* Calculando Perimetro */");
        perimetro = base * 2 + altura * 2;
        System.out.println("O perimetro é: " + perimetro);
    }
}