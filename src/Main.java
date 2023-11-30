import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Cabeca cabecalho0 = new Cabeca();
        System.out.println("----------------------------------------------------------------------------------------");
        cabecalho0.faculdade = "Faculdade: UNIFAN";
        cabecalho0.nome = "Nome: Iury Rodrigues Correia de Siqueira";
        cabecalho0.materia = "Matéria: Algoritmo e Programação II";
        cabecalho0.professor = "Professor: Brenno Pimenta";
        cabecalho0.escrevaCabecalho();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("RESPONDA COM LETRAS MAIUSCULAS.");
        int acertos = 0;
        Questoes questoes1 = new Questoes();
        questoes1.pergunta = "1) Qual ano de lançamento do jogo CS GO?";
        questoes1.opcaoA = "A) 2000";
        questoes1.opcaoB = "B) 2005";
        questoes1.opcaoC = "C) 2010";
        questoes1.opcaoD = "D) 2012";
        questoes1.opcaoE = "E) 2013";
        questoes1.escrevaQuestoes();
        questoes1.correta = "D";
        System.out.println("Digite a resposta correta");
        String resposta = leia.nextLine();
        if (resposta.equals(questoes1.iscorreta(resposta))) {
        }

        if (resposta.equals(questoes1.correta)) {
            ++acertos;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        Questoes questoes2 = new Questoes();
        questoes2.pergunta = "2) Qual é o desenvolvedor do jogo \"The Witcher 3: Wild Hunt\"?";
        questoes2.opcaoA = "A) Ubisoft";
        questoes2.opcaoB = "B) CD Projekt";
        questoes2.opcaoC = "C) Bethesda";
        questoes2.opcaoD = "D) Rockstar";
        questoes2.opcaoE = "E) Square Enix";
        questoes2.escrevaQuestoes();
        questoes2.correta = "B";
        System.out.println("Digite a resposta correta");
        resposta = leia.nextLine();
        if (resposta.equals(questoes2.iscorreta(resposta))) {
        }

        if (resposta.equals(questoes2.correta)) {
            ++acertos;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        Questoes questoes3 = new Questoes();
        questoes3.pergunta = "3) Em que ano foi lançado o jogo \"Fortnite\"?";
        questoes3.opcaoA = "A) 2016";
        questoes3.opcaoB = "B) 2017";
        questoes3.opcaoC = "C) 2018";
        questoes3.opcaoD = "D) 2019";
        questoes3.opcaoE = "E) 2020";
        questoes3.escrevaQuestoes();
        questoes3.correta = "C";
        System.out.println("Digite a resposta correta");
        resposta = leia.nextLine();
        if (resposta.equals(questoes3.iscorreta(resposta))) {
        }

        if (resposta.equals(questoes3.correta)) {
            ++acertos;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        Questoes questoes4 = new Questoes();
        questoes4.pergunta = "4) Quem é o protagonista do jogo \"Uncharted 4: A Thief's End\"?";
        questoes4.opcaoA = "A) Joel";
        questoes4.opcaoB = "B) Nathan Drake";
        questoes4.opcaoC = "C) Aloy";
        questoes4.opcaoD = "D) Marcus Fenix";
        questoes4.opcaoE = "E) Lara Croft";
        questoes4.escrevaQuestoes();
        questoes4.correta = "B";
        System.out.println("Digite a resposta correta");
        resposta = leia.nextLine();
        if (resposta.equals(questoes4.iscorreta(resposta))) {
        }

        if (resposta.equals(questoes4.correta)) {
            ++acertos;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        Questoes questoes5 = new Questoes();
        questoes5.pergunta = "5) Qual é o nome do planeta em que se passa a maior parte de \"Star Wars: Knights of the Old Republic\"?";
        questoes5.opcaoA = "A) Tatooine";
        questoes5.opcaoB = "B) Endor";
        questoes5.opcaoC = "C) Coruscant";
        questoes5.opcaoD = "D) Hoth";
        questoes5.opcaoE = "E) Taris";
        questoes5.escrevaQuestoes();
        questoes5.correta = "E";
        System.out.println("Digite a resposta correta");
        resposta = leia.nextLine();
        if (resposta.equals(questoes5.iscorreta(resposta))) {
        }

        if (resposta.equals(questoes5.correta)) {
            ++acertos;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        Questoes questoes6 = new Questoes();
        questoes6.pergunta = "6) Qual é o gênero do jogo \"Doom\"?";
        questoes6.opcaoA = "A) Survival Horror";
        questoes6.opcaoB = "B) Ação e Aventura";
        questoes6.opcaoC = "C) Tiro em primeira pessoa (FPS)";
        questoes6.opcaoD = "D) Estratégia em tempo real (RTS)";
        questoes6.opcaoE = "E) RPG";
        questoes6.escrevaQuestoes();
        questoes6.correta = "C";
        System.out.println("Digite a resposta correta");
        resposta = leia.nextLine();
        if (resposta.equals(questoes6.iscorreta(resposta))) {
        }

        if (resposta.equals(questoes6.correta)) {
            ++acertos;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        Questoes questoes7 = new Questoes();
        questoes7.pergunta = "7) Quem é o criador da série de jogos \"Metal Gear Solid\"?";
        questoes7.opcaoA = "A) Hideo Kojima";
        questoes7.opcaoB = "B) Shigeru Miyamoto";
        questoes7.opcaoC = "C) Tim Schafer";
        questoes7.opcaoD = "D) Todd Howard";
        questoes7.opcaoE = "E) Gabe Newell";
        questoes7.escrevaQuestoes();
        questoes7.correta = "A";
        System.out.println("Digite a resposta correta");
        resposta = leia.nextLine();
        if (resposta.equals(questoes7.iscorreta(resposta))) {
        }

        if (resposta.equals(questoes7.correta)) {
            ++acertos;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        Questoes questoes8 = new Questoes();
        questoes8.pergunta = "8) Qual é o nome do protagonista em \"The Legend of Zelda: Ocarina of Time\"?";
        questoes8.opcaoA = "A) Link";
        questoes8.opcaoB = "B) Zelda";
        questoes8.opcaoC = "C) Ganondorf";
        questoes8.opcaoD = "D) Sheik";
        questoes8.opcaoE = "E) Navi";
        questoes8.escrevaQuestoes();
        questoes8.correta = "A";
        System.out.println("Digite a resposta correta");
        resposta = leia.nextLine();
        if (resposta.equals(questoes8.iscorreta(resposta))) {
        }

        if (resposta.equals(questoes8.correta)) {
            ++acertos;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        Questoes questoes9 = new Questoes();
        questoes9.pergunta = "9) Qual é o título completo do jogo \"GTA V\"?";
        questoes9.opcaoA = "A) Grand Theft Auto: Vice City";
        questoes9.opcaoB = "B) Grand Theft Auto: San Andreas";
        questoes9.opcaoC = "C) Grand Theft Auto: Liberty City Stories";
        questoes9.opcaoD = "D) Grand Theft Auto: Vengeance";
        questoes9.opcaoE = "E) Grand Theft Auto V";
        questoes9.escrevaQuestoes();
        questoes9.correta = "E";
        System.out.println("Digite a resposta correta");
        resposta = leia.nextLine();
        if (resposta.equals(questoes9.iscorreta(resposta))) {
        }

        if (resposta.equals(questoes9.correta)) {
            ++acertos;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        Questoes questoes10 = new Questoes();
        questoes10.pergunta = "10) Qual é o estúdio responsável pela série \"Mass Effect\"?";
        questoes10.opcaoA = "A) BioWare";
        questoes10.opcaoB = "B) Blizzard Entertainment";
        questoes10.opcaoC = "C) Naughty Dog";
        questoes10.opcaoD = "D) Obsidian Entertainment";
        questoes10.opcaoE = "E) Bioware Montreal";
        questoes10.escrevaQuestoes();
        questoes10.correta = "A";
        System.out.println("Digite a resposta correta");
        resposta = leia.nextLine();
        if (resposta.equals(questoes10.iscorreta(resposta))) {
        }

        if (resposta.equals(questoes10.correta)) {
            ++acertos;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        Questoes questoes11 = new Questoes();
        questoes11.pergunta = "11) Em \"Minecraft\", como é chamada a dimensão alternativa?";
        questoes11.opcaoA = "A) Nether";
        questoes11.opcaoB = "B) End";
        questoes11.opcaoC = "C) Aether";
        questoes11.opcaoD = "D) Overworld";
        questoes11.opcaoE = "E) Twilight Forest";
        questoes11.escrevaQuestoes();
        questoes11.correta = "B";
        System.out.println("Digite a resposta correta");
        resposta = leia.nextLine();
        if (resposta.equals(questoes11.iscorreta(resposta))) {
        }

        if (resposta.equals(questoes11.correta)) {
            ++acertos;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        Questoes questoes12 = new Questoes();
        questoes12.pergunta = "12) Qual é o nome do protagonista em \"Final Fantasy VII\"?";
        questoes12.opcaoA = "A) Cloud Strife";
        questoes12.opcaoB = "B) Tidus";
        questoes12.opcaoC = "C) Squall Leonhart";
        questoes12.opcaoD = "D) Zidane Tribal";
        questoes12.opcaoE = "E) Lightning";
        questoes12.escrevaQuestoes();
        questoes12.correta = "A";
        System.out.println("Digite a resposta correta");
        resposta = leia.nextLine();
        if (resposta.equals(questoes12.iscorreta(resposta))) {
        }

        if (resposta.equals(questoes12.correta)) {
            ++acertos;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        Questoes questoes13 = new Questoes();
        questoes13.pergunta = "13) Em que ano foi lançado o primeiro jogo da série \"Fallout\"?";
        questoes13.opcaoA = "A) 1994";
        questoes13.opcaoB = "B) 1997";
        questoes13.opcaoC = "C) 2001";
        questoes13.opcaoD = "D) 2005";
        questoes13.opcaoE = "E) 2010";
        questoes13.escrevaQuestoes();
        questoes13.correta = "B";
        System.out.println("Digite a resposta correta");
        resposta = leia.nextLine();
        if (resposta.equals(questoes13.iscorreta(resposta))) {
        }

        if (resposta.equals(questoes13.correta)) {
            ++acertos;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        Questoes questoes14 = new Questoes();
        questoes14.pergunta = "14) Quem é o criador da franquia \"The Elder Scrolls\"?";
        questoes14.opcaoA = "A) Todd Howard";
        questoes14.opcaoB = "B) Hideo Kojima";
        questoes14.opcaoC = "C) Shigeru Miyamoto";
        questoes14.opcaoD = "D) Gabe Newell";
        questoes14.opcaoE = "E) Tim Schafer";
        questoes14.escrevaQuestoes();
        questoes14.correta = "A";
        System.out.println("Digite a resposta correta");
        resposta = leia.nextLine();
        if (resposta.equals(questoes14.iscorreta(resposta))) {
        }

        if (resposta.equals(questoes14.correta)) {
            ++acertos;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        Questoes questoes15 = new Questoes();
        questoes15.pergunta = "15) Qual é o nome do protagonista em \"Red Dead Redemption 2\"?";
        questoes15.opcaoA = "A) Arthur Morgan";
        questoes15.opcaoB = "B) John Marston";
        questoes15.opcaoC = "C) Dutch van der Linde";
        questoes15.opcaoD = "D) Bill Williamson";
        questoes15.opcaoE = "E) avier Escuella";
        questoes15.escrevaQuestoes();
        questoes15.correta = "A";
        System.out.println("Digite a resposta correta");
        resposta = leia.nextLine();
        if (resposta.equals(questoes15.iscorreta(resposta))) {
        }

        if (resposta.equals(questoes15.correta)) {
            ++acertos;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }

        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
