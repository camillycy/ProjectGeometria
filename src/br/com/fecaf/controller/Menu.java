package br.com.fecaf.controller;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;
import br.com.fecaf.model.Triangulo;

import java.util.Scanner;

public class Menu {

    // criando objeto scanner, que permite a leitura de entradas do usuário.
    Scanner scanner = new Scanner(System.in);

    //esse metodo é responsável por exibir e controlar o fluxo de interação do usuário com o menu principal
    // e os menus específicos de cada forma geométrica.
    public void executarMenu () {

        //inicializando a variável exit como false, pois, assim, o programa não vai sair e o
        // loop continuará a ser executado.
        boolean exit = false;

        //enquanto o usuário não escolher a opção de sair o programa exibe o
        // menu para o usuário escolher qual operação deseja realizar.
        while (!exit) {
            System.out.println("/*******************/");
            System.out.println("/*    Geometria    */");
            System.out.println("/*******************/");
            System.out.println("/* 1 - Circulo     */");
            System.out.println("/* 2 - Retângulo   */");
            System.out.println("/* 3 - Triângulo   */");
            System.out.println("/* 4 - Sair        */");
            System.out.println("/*******************/");

            System.out.print("Informe a opção desejada: ");
            int optionUser = scanner.nextInt();


            // o switch lida com toda a escolha da opção do menu do programa,ou seja
            // quando o usuário escolhe uma opção no menu
            // o switch irá direcionar o fluxo do programa para a opção correta de acordo com o numero escolhido.
            switch (optionUser) {

                //esse caso se refere ao menu do circulo.
                case 1:

                    boolean exitCirculo = false;
                    Circulo circulo = new Circulo();
                    boolean validaCadastro = false;

                    while (!exitCirculo) {

                        System.out.println("/**************************/");
                        System.out.println("/****     Circulo      ****/");
                        System.out.println("/**************************/");
                        System.out.println("/* 1 - Cadastrar Circulo  */");
                        System.out.println("/* 2 - Calcular Area      */");
                        System.out.println("/* 3 - Calcular Perimetro */");
                        System.out.println("/* 4 - Sair               */");
                        System.out.println("/**************************/");
                        System.out.print("Informe a opção desejada: ");

                        int optionCirculo = scanner.nextInt();

                        // esse switch vai lidar com todas as opções possíveis dentro da opção de círculo.
                        switch (optionCirculo) {
                            case 1:
                                validaCadastro = circulo.cadastrarCirculo();
                                break;
                            case 2:
                                if (validaCadastro) {
                                    circulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Circulo");
                                }
                                break;
                            case 3:
                                if (validaCadastro) {
                                    circulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Circulo");
                                }
                                break;
                            case 4:
                                System.out.println("Saindo do Circulo ...");
                                exitCirculo = true;
                                break;
                            default:
                                System.out.println("Escolha uma Opção Válida !");
                        }

                    }
                    break;

                // esse caso se refere ao menu do retangulo.
                case 2:

                    boolean exitRetangulo = false;
                    Retangulo retangulo = new Retangulo();
                    boolean validaRetangulo = false;

                    while (!exitRetangulo) {
                        System.out.println("/**************************/");
                        System.out.println("/****     Retangulo    ****/");
                        System.out.println("/**************************/");
                        System.out.println("/* 1 - Cadastrar Retangulo  */");
                        System.out.println("/* 2 - Calcular Area      */");
                        System.out.println("/* 3 - Calcular Perimetro */");
                        System.out.println("/* 4 - Sair               */");
                        System.out.println("/**************************/");
                        System.out.print("Informe a opção desejada: ");

                        int optionRetangulo = scanner.nextInt();

                        // esse switch vai lidar com todas as opções possíveis dentro da opção de retangulo.
                        switch (optionRetangulo) {
                            case 1:
                                validaRetangulo = retangulo.cadastrarRetangulo();
                                break;
                            case 2:
                                if (validaRetangulo) {
                                    retangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Retangulo !");
                                }
                                break;
                            case 3:
                                if (validaRetangulo) {
                                    retangulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Retangulo !");
                                }
                                break;
                            case 4:
                                System.out.println("Saindo Retângulo...");
                                exitRetangulo = true;
                                break;
                            default:
                                System.out.println("Escolha uma opção valida...");
                        }
                    }
                    break;

                // esse caso se refere ao menu do triangulo.
                case 3:
                    boolean exitTriangulo = false;
                    Triangulo triangulo = new Triangulo();;
                    boolean validaTriangulo = false;

                    while (!exitTriangulo){
                        System.out.println("/**************************/");
                        System.out.println("/****     Triangulo    ****/");
                        System.out.println("/**************************/");
                        System.out.println("/* 1 - Cadastrar Triangulo  */");
                        System.out.println("/* 2 - Calcular Area      */");
                        System.out.println("/* 3 - Calcular Perimetro */");
                        System.out.println("/* 4 - Verificar tipo do triangulo */");
                        System.out.println("/* 5 - Verificar se é 3, 4, 5*/");
                        System.out.println("/* 6 - Sair                */");
                        System.out.println("/**************************/");
                        System.out.print("Informe a opção desejada: ");

                        int optionTriangulo = scanner.nextInt();

                        // esse switch vai lidar com todas as opções possíveis dentro da opção de triangulo.
                        switch (optionTriangulo) {
                            case 1:
                                validaTriangulo = triangulo.cadastrarTriangulo();
                                break;

                            case 2:
                                if (validaTriangulo){
                                    triangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Triangulo !");
                                }
                                break;
                            case 3:
                                if (validaTriangulo){
                                    triangulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Triangulo !");
                                }
                                break;
                            case 4:
                                if (validaTriangulo){
                                    triangulo.definirTipo();
                                } else {
                                    System.out.println("Cadastre um Triangulo !");
                                }
                                break;
                            case 5:
                                if (validaTriangulo){
                                    triangulo.verificarTria345();
                                } else {
                                    System.out.println("Cadastre um Triangulo !");
                                }
                                break;
                            case 6:
                                System.out.println("Saindo do triangulo...");
                                exitTriangulo = true;
                                break;

                            default:
                                System.out.println("Escolha uma opção valida...");
                                break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Escolheu sair");
                    exit = true;
                    break;
                default:
                    System.out.println("Escolha uma Opção Válida");

            }

        }

    }

}