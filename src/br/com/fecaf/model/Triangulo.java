package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {
    public double  base,lado2,lado3,altura, area, perimetro;

    // criando objeto scanner, que permite a leitura de entradas do usuário.
    Scanner scanner = new Scanner(System.in);

     // esse metodo permite que o usuário insira as informações sobre o triângulo para fazer o cadastro dele.
    // assim como o retangulo, ele sempre retorna true, indicando que o cadastro foi realizado com sucesso.
    public boolean cadastrarTriangulo(){
        System.out.println("/*******************************/");
        System.out.println("*      Cadastro Triangulo     *");
        System.out.println("/*******************************/");
        System.out.println("Informe o lado 1: ");
        base = scanner.nextDouble();
        System.out.println("Informe o lado 2: ");
        lado2 = scanner.nextDouble();
        System.out.println("Informe o lado 3: ");
        lado3  = scanner.nextInt();
        System.out.println("Informe a altura");
        altura = scanner.nextDouble();
        System.out.println("Triangulo cadastrado com sucesso!");
        System.out.println("/*******************************/");

        return true;
    }

    public void calcularArea (){
        System.out.println("/*******************************/");
        System.out.println("*  Calculando Area    *");
        System.out.println("/*******************************/");

        area = base * altura / 2 ;
        System.out.println("A area é" + area);
        System.out.println("/*******************************/");
    }

    public void calcularPerimetro(){
        System.out.println("/*******************************/");
        System.out.println("*  Calculando Perímetro  *");
        System.out.println("/*******************************/");

        perimetro = base + lado2 + lado3;
        System.out.println("O perímetro é" + perimetro);
        System.out.println("/*******************************/");
    }

    // esse método define o tipo do triângulo, se é escaleno, isosceles ou equilátero.
    public void definirTipo (){
        System.out.println("/*******************************/");
        System.out.println("*       Definindo Tipo        *");
        System.out.println("/*******************************/");

            if (base == lado2 && base == lado3){
            System.out.println("Esse triangulo eh equilatero");
        } else if (base != lado2 && base !=lado3 && lado2 != lado3) {
                System.out.println("Esse triangulo é escaleno");
            } else {
                System.out.println("esse triangulo é isósceles");
    }
        System.out.println("/*******************************/");
    }

    // esse método vai verificar se o triângulo é do tipo 3, 4, 5
    public void verificarTria345() {
        System.out.println("/*******************************/");
        System.out.println("*    Verificando Triângulo    *");
        System.out.println("/*******************************/");

        // verificando três combinações possíveis de lados, já que a ordem dos lados pode variar:
        // (base, lado2, lado3) pode ser (3, 4, 5), (4, 3, 5) ou (5, 3, 4), ou seja, qualquer uma dessas combinações
        // pode ser considerada como um triângulo retângulo 3, 4, 5
        if ((base == 3 && lado2 == 4 && lado3 == 5) || (base == 4 && lado2 == 3 && lado3 == 5) || (base == 5 && lado2 == 3 && lado3 == 4)) {
            System.out.println("Esse é um triângulo retângulo de 3, 4, 5");
        } else {
            System.out.println("Esse triângulo não é um triângulo retângulo 3, 4, 5");
        }
        System.out.println("/*******************************/");
    }
}
