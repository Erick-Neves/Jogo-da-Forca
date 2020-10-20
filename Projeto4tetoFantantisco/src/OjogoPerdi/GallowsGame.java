package OjogoPerdi;

import java.util.*;

public class GallowsGame {
	// atributos
	Scanner ler = new Scanner(System.in);
	private boolean acertou = false;
	private int score = 0;
	private String name;
	private int difficult;
	private int quantidade;
	private int contaErro = 0;
	private String letraJogador;
	private String letraPalavra;
	private String boneco = "\0";
	private String palavra = "forca";
	private String dica = "te mata com uma corda.";
	private String apresentaPalavra = "\0";

	// construtor
	public GallowsGame(String name, int difficult) {
		super();
		this.name = name;
		this.difficult = difficult;
	}

	// método para registrar a pontuação
	public void Ranking() {
		if(contaErro >= 5) {
			this.score = 0;
		} else {
		this.score = (this.quantidade * palavra.length()) - this.contaErro;
		this.score *= 10;
		}
		System.out.println(name + " você fez " + score + " pontos!");
		/*ArrayList scoreBoard = new ArrayList();
		
		 * if (scoreBoard.size() <= 10) { scoreBoard.add(name); }
		 */
		System.exit(0);
	}

	public void RankingInfo() {

	}

	// método com as principais funcionalidades do jogo
	public void Jogo() {
		System.out.println("========================================");
		System.out.println("/            JOGO DA FORCA             /");
		System.out.println("========================================");
		System.out.println("Dica: " + dica);
		// conta a quantidade de caracteres, e no lugar dos caracteres, imprime um
		// "_"(underline)
		char formaPalavra[] = new char[palavra.length()];
		for (int i = 0; i < palavra.length(); i++) {
			formaPalavra[i] = '_';
			this.apresentaPalavra += formaPalavra[i] + " ";// usado para colocar um espaço entre os caracteres(estética)
		}
		// Tentativas, quantidade de letras da palavra
		for (int c = 0; c < palavra.length() + 5; c++) {
			this.acertou = false;
			System.out.println("A palavra tem " + (palavra.length()) + " letras " + "\n" + this.apresentaPalavra
					+ "\nDigite uma letra: ");
			this.letraJogador = ler.nextLine();
			this.apresentaPalavra = "\0";
			for (int j = 0; j < palavra.length(); j++) {

				this.letraPalavra = palavra.substring(j, j + 1);
				if (this.letraJogador.trim().equals(letraPalavra)) {
					this.acertou = true;
					this.quantidade++; 
					formaPalavra[j] = letraJogador.charAt(0);
					this.apresentaPalavra = apresentaPalavra + formaPalavra[j] + " ";
					if(quantidade == palavra.length())
					{
						System.out.println("========================================");
						System.out.println("/           VOCÊ GANHOOOOOOOU          /");
						System.out.println("========================================");
						System.out.println("A palavra era: " + this.palavra.toUpperCase());
						Ranking();
						System.exit(0);
					}
					/*if (this.apresentaPalavra.contains(Character.toString('_'))) {
						System.out.println("========================================");
						System.out.println("/           VOCÊ GANHOOOOOOOU          /");
						System.out.println("========================================");
						System.out.println("A palavra era: " + this.palavra.toUpperCase());
						Ranking();
						System.exit(0);
					}*/
				} else {
					this.apresentaPalavra += formaPalavra[j] + " ";
				}
			}
			
			
			if (this.acertou == false) {
				this.contaErro++;
				this.boneco = "\0";
				switch (contaErro) {
				case 1:
					boneco = "  __ O \n";
					boneco += "|     \n";
					boneco += "|     \n";
					boneco += "|     \n";
					break;
				case 2:
					boneco = "  __ O \n";
					boneco += "|    | \n";
					boneco += "|     \n";
					boneco += "|     \n";
					break;
				case 3:
					boneco = "  __ O \n";
					boneco += "|   -|-\n";
					boneco += "|     \n";
					boneco += "|     \n";
					break;
				case 4:
					boneco = "  __ O \n";
					boneco += "|   -|-\n";
					boneco += "|   /  \n";
					boneco += "|     \n";
					break;
				case 5:
					boneco = "  __ O \n";
					boneco += "|   -|-\n";
					boneco += "|   / \\\n";
					boneco += "|     \n";
					break;
				}
				System.out.println(this.boneco + "\nVocê ERROU! " + this.contaErro + " vez(es)");
				if (contaErro >= 5) {
					System.out.println("VOCÊ PERDEU! FIM DE JOGO!");
					Ranking();
					System.exit(0);
				}

			}
		}
	}
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	// método para registrar o nome do jogador
	public void setName() {
		Scanner read = new Scanner(System.in);
		System.out.println("Qual seu nome? ");
		name = read.nextLine();
	}

	public int getDifficult() {
		return difficult;
	}

	// método para o jogador selecionar a dificuldade do jogo
	public void setDifficult() {
		Scanner read = new Scanner(System.in);
		System.out.println("Selecione a dificuldade do jogo: ");
		System.out.println("[1] - Fácil" + "\n[2] - Médio" + "\n[3] - Difícil" + "\n[0] - Sair do Jogo");
		difficult = read.nextInt();
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

	public String arrayWords(int x) {
		String[] words = { " por enquanto está sem nada", " ", " ", " ", " " };
		return words[x];
	}

	public String arrayTips(int x) {
		String[] tips = { " ", " ", " ", " ", " " };
		return tips[x];
	}

	public String getDica() {
		return dica;
	}

	public void setDica(String dica) {
		this.dica = dica;
	}

}