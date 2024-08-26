package AdivinhePalavras;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {

	private static final List<String> PALAVRAS = Arrays.asList("UVA", "MORANGO", "LUCAS", "MOTO", "COMPUTADOR", "JOGO",
			"MICROFONE", "CHINELO", "FERRO", "JOANINHA", "ABACATE", "ESTRELA", "CARRO", "CACHORRO",
			"JANELA", "FUTEBOL", "PROGRAMADOR", "AVIÃO", "MEDITAÇÃO", "TELEVISÃO", "FESTIVAL", "PLANETA", "CINEMA",
			"JARDIM", "FÓSSEIS", "INSTRUMENTO", "CIÊNCIA");

	private Scanner scanner;
	private static String palavraCorreta;
	private static int numPalavraCorreta;
	private char primeiraLetra;
	private char ultimaLetra;
	private int tentativas = 5;

	public Game() {
		palavraCorreta = gerarPalavraAleatoria();
		numPalavraCorreta = gerarSizePalavra();

		int ultimoIndice = palavraCorreta.length() - 1;

		primeiraLetra = palavraCorreta.charAt(0);
		ultimaLetra = palavraCorreta.charAt(ultimoIndice);
	}

	private void fornecerDica() {
		System.out.println("Dica: " + Dicas.obterDica(palavraCorreta));
	}

	private static String gerarPalavraAleatoria() {
		Random random = new Random();
		int index = random.nextInt(PALAVRAS.size());
		return PALAVRAS.get(index);
	}

	private static int gerarSizePalavra() {
		int index = palavraCorreta.length(); // length() para obter o tamanho da palavra;
		return index;
	}

	public void Start() {
		// System.out.println("Palavra correta é: " + palavraCorreta);

		System.out.println(String.format(
				"Tente adivinhar a palavra correta. A palavra tem %d letras, começa com '%c' e termina com '%c'.",
				numPalavraCorreta, primeiraLetra, ultimaLetra));
		System.out.println("(ou digite 'dica' para uma dica e custa 1 tentativa)\n");

		scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Tentativa " + tentativas + ":");
			String entrada = scanner.nextLine();
			
			if (entrada.equalsIgnoreCase(palavraCorreta)) {
				System.out.println("Parabéns! a palavra correta era: " + palavraCorreta + " e acertou faltando "
						+ (tentativas - 1) + " tentativas.");
				break;
			} else if (entrada.equalsIgnoreCase("dica")) {
				tentativas--;
				fornecerDica();
			} else {
				if (tentativas == 1) {
					System.out.print("Game over! A palavra correta era: " + palavraCorreta);
					break;
				} else {
					tentativas--;
					System.out.println("Errado tente novamente");
				}
			}
		}

		scanner.close();
	}
}
