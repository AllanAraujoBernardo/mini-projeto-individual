package com.sptech.projetoindividual;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitorNumero = new Scanner(System.in);
        Metodos metodo = new Metodos();

        // Flag para manter loop
        Boolean continuarRodando = true;

        // Mensagem inicial
        System.out.println("\nBEM-VINDO AO 'MEaU' PROJETO INDIVIDUAL ^_");

        do {
            // Menu
            System.out.println("\n\nMENU"
                    + "\n\n1 - Calculando gasto com ração"
                    + "\n2 - Quantos gatos você tem?"
                    + "\n3 - Meu gato em ASCII art"
                    + "\n4 - Sair"
                    + "\n5 - Bônus: joguin singelo (forca)"
                    + "\n\nDigite o número da opção desejada:");
            // Seleção do Menu
            Integer numeroDigitado = leitorNumero.nextInt();

            // Switch Case das Opções do Menu
            switch (numeroDigitado) {
                case 1:
                    // Gasto com Ração
                    // Requisição de Quantidade de Dias
                    System.out.println("Descubra a verdade, "
                            + "quanto custa manter esses amores de barriga cheia?"
                            + "\nDigite uma quantidade de dias:");
                    Integer diasRacao = leitorNumero.nextInt();
                    // Resposta
                    System.out.println(String.format(
                            "\nEm %d dias eu gasto R$%.2f com ração ;-;",
                            diasRacao, metodo.calcularGastoRacao(diasRacao)));
                    break;
                case 2:
                    // Comparar Gatos
                    // Requisição de Quantidade de Gatos do Usuário
                    System.out.println("Vamos ver quem tem mais gatos?"
                            + "\nDigite o número de gatos que você tem:");
                    Integer gatosUsuario = leitorNumero.nextInt();
                    // Resposta
                    metodo.compararGatos(gatosUsuario);
                    break;
                case 3:
                    // Exibir ASCII art do meu gato
                    metodo.exibirGato();
                    break;
                case 4:
                    // Agradecimento e fim do programa
                    System.out.println("\nObrigadão pela visita, até logo!");
                    continuarRodando = false;
                    break;
                case 5:
                    // Pontuações
                    Integer totalDerrotas = 0;
                    Integer totalVitorias = 0;
                    // Validação de final de jogo
                    Boolean continuarJogo = true;
                    Boolean ganhou = false;

                    while (continuarJogo) {
                        ganhou = false;
                        // Apresentação do Jogo da Forca
                        System.out.println(
                                "\n\nDescubra o nome dos meus gatos"
                                + "\n\nREGRAS:"
                                + "\nVocê só pode errar 5 vezes"
                                + "\nUse apenas letras MAIÚSCULAS"
                                + "\nDivirta-se e perdoe a falta de criatividade ^_");

                        //DADOS
                        // Definição da Fase
                        Integer faseAleatoria = ThreadLocalRandom.current().nextInt(1, 4);
                        // Contagem de Erros
                        Integer quantidadeErros = 0;
                        // Letras da Fase
                        String primeiraLetra = "_";
                        String segundaLetra = "_";
                        String terceiraLetra = "_";
                        String quartaLetra = "_";
                        String quintaLetra = "_";
                        String sextaLetra = "_";
                        String setimaLetra = "_";
                        String oitavaLetra = "_";

                        if (faseAleatoria == 1) {
                            setimaLetra = "";
                            oitavaLetra = "";
                        }

                        // Início do jogo
                        System.out.println("\n" + metodo.definirFase(faseAleatoria));

                        while (quantidadeErros < 5 && ganhou == false) {                            
                            metodo.exibirErro(quantidadeErros);
                            
                            String palavraAtual = String.format(
                                    "\n%s%s%s%s%s%s%s%s",
                                    primeiraLetra, segundaLetra, terceiraLetra,
                                    quartaLetra, quintaLetra, sextaLetra,
                                    setimaLetra, oitavaLetra);
                            
                            System.out.println(palavraAtual);

                            System.out.println("Digite uma letra");
                            String letraDigitada = leitorTexto.nextLine();

                            switch (faseAleatoria) {
                                case 1:
                                switch (letraDigitada) {
                                    case "C":
                                        primeiraLetra = "C";
                                        break;
                                    case "O":
                                        segundaLetra = "O";
                                        terceiraLetra = "O";
                                        break;
                                    case "K":
                                        quartaLetra = "K";
                                        break;
                                    case "I":
                                        quintaLetra = "I";
                                        break;
                                    case "E":
                                        sextaLetra = "E";
                                        break;
                                    default:
                                        quantidadeErros++;                                       
                                        break;
                                }
                                    if (primeiraLetra.equals("C") && 
                                        segundaLetra.equals("O") &&
                                        terceiraLetra.equals("O") &&
                                        quartaLetra.equals("K") &&
                                        quintaLetra.equals("I") &&
                                        sextaLetra.equals("E")) {
                                        
                                        totalVitorias++;
                                        ganhou = true;
                                    }                                                                 
                                    
                                    break;

                                case 2:
                                switch (letraDigitada) {
                                    case "M":
                                        primeiraLetra = "M";
                                        break;
                                    case "A":
                                        segundaLetra = "Ã";
                                        oitavaLetra = "A";
                                        break;
                                    case "E":
                                        terceiraLetra = "E";
                                        break;
                                    case "Z":
                                        quartaLetra = "Z";
                                        break;
                                    case "I":
                                        quintaLetra = "I";
                                        break;
                                    case "N":
                                        sextaLetra = "N";
                                        break;
                                    case "H":
                                        setimaLetra = "H";
                                        break;
                                    default:
                                        quantidadeErros++;
                                        break;
                                }
                                    
                                    if (primeiraLetra.equals("M") && 
                                        segundaLetra.equals("Ã") &&
                                        terceiraLetra.equals("E") &&
                                        quartaLetra.equals("Z") &&
                                        quintaLetra.equals("I") &&
                                        sextaLetra.equals("N") &&
                                        setimaLetra.equals("H") &&
                                        oitavaLetra.equals("A")){
                                        
                                        totalVitorias++;
                                        ganhou = true;
                                    }
                                    
                                    break;

                                case 3:                                    
                                switch (letraDigitada) {
                                    case "P":
                                        primeiraLetra = "P";
                                        break;
                                    case "R":
                                        segundaLetra = "R";
                                        break;
                                    case "E":
                                        terceiraLetra = "E";
                                        break;
                                    case "T":
                                        quartaLetra = "T";
                                        break;
                                    case "I":
                                        quintaLetra = "I";
                                        break;
                                    case "N":
                                        sextaLetra = "N";
                                        break;
                                    case "H":
                                        setimaLetra = "H";
                                        break;
                                    case "A":
                                        oitavaLetra = "A";
                                        break;
                                    default:
                                        quantidadeErros++;
                                        break;
                                }
                                    
                                    if (primeiraLetra.equals("P") && 
                                        segundaLetra.equals("R") &&
                                        terceiraLetra.equals("E") &&
                                        quartaLetra.equals("T") &&
                                        quintaLetra.equals("I") &&
                                        sextaLetra.equals("N") &&
                                        setimaLetra.equals("H") &&
                                        oitavaLetra.equals("A")){
                                        
                                        totalVitorias++;
                                        ganhou = true;
                                    }
                                        
                                    break;

                            }
                        } 
                        
                        // Validar Resultado
                        if (ganhou == true){
                            System.out.println(String.format(
                                    "\nParabéns, você ganhou %d vezes",
                                    totalVitorias));
                            
                            
                        }
                        
                        if (quantidadeErros == 5) {
                            metodo.exibirErro(quantidadeErros);
                            totalDerrotas++;
                            System.out.println(String.format(
                                    "\nVocê perdeu %d vezes",
                                    totalDerrotas));
                        }                        
                        
                        // Validar Permanência
                            System.out.println(
                                    "\nDeseja tentar novamente? (Y/N)");
                                    
                            String continuar = leitorTexto.nextLine();
                            while (!continuar.equals("N") && !continuar.equals("Y")) {
                                System.out.println("\nResposta Inválida"
                                        + "\nDeseja tentar novamente? (Y/N)");
                                continuar = leitorTexto.nextLine();
                            }
                            if (continuar.equals("N")) {
                                continuarJogo = false;
                            }
                    }

                    break;
                
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
            }
        } while (continuarRodando);
    }
}
