package OjogoPerdi;

import java.util.*;

public class GallowsGame {
	//atributos
	Scanner ler = new Scanner(System.in);
	private boolean acertou = false;
	private int score = 0;
	private String name;
	private int age;
	private int quantidade;
	private int contaErro = 0;
	private String senha;
	private String tenta;
	private String boneco = "\0";
	private String palavra = "forca";
	private String dica = "te mata com uma corda.";
	private String apresentaPalavra = "\0";
	//construtor
	public GallowsGame(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	//métodos
	public void Ranking()
	{
		this.score = this.quantidade - this.contaErro;
		this.score *= 20;
		System.out.println(name+ " você fez " + score + " pontos!");
		System.exit(0);
	}
	
	public void Jogo()
	{
		System.out.println("========================================");
		System.out.println("/            JOGO DA FORCA             /");
		System.out.println("========================================");
		System.out.println("Dica: " + dica);
		//conta a quantidade de caracteres, e imprime _______.
		char formaPalavra[] = new char[palavra.length()];
		for(int i=0; i<palavra.length(); i++)
		{
			formaPalavra[i] = '_';
			this.apresentaPalavra+= formaPalavra[i]+" ";
		}
		//Tentativas, quantidade de letras da palavra + 5 erros possiveis
		for(int c=0; c<palavra.length()+5; c++)
		{
			this.acertou = false;
			System.out.println("Tentativa: "+ (c+1) + " de " + (palavra.length()+5) + "\n" + this.apresentaPalavra + "\nDigite a letra: ");
			this.senha = ler.nextLine();
			this.apresentaPalavra = "\0";
			for(int j=0; j<palavra.length(); j++)
			{
				this.tenta = palavra.substring(j,j+1);
				if(this.senha.trim().equals(tenta))
				{
					this.acertou = true;
					this.quantidade++;
					formaPalavra[j] = senha.charAt(0);
					this.apresentaPalavra = apresentaPalavra + formaPalavra[j] + " ";
					if(quantidade == palavra.length())
					{
						System.out.println("========================================");
						System.out.println("/           VOCÊ GANHOOOOOOOU          /");
						System.out.println("========================================");
						System.out.println("A palavra era: " + this.palavra);
						Ranking();
						System.exit(0);
					}
				}
				else
				{
					this.apresentaPalavra += formaPalavra[j] + " ";
				}
			}
			if(this.acertou == false)
			{
				this.contaErro++;
				this.boneco = "\0";
				switch(contaErro)
				{
					case 1: boneco = "  __ O \n";
							boneco += "|     \n";
							boneco += "|     \n";
							boneco += "|     \n";
							break;
					case 2: boneco = "  __ O \n";
							boneco += "|    | \n";
							boneco += "|     \n";
							boneco += "|     \n";
					break;
					case 3: boneco = "  __ O \n";
							boneco += "|   -|-\n";
							boneco += "|     \n";
							boneco += "|     \n";
					break;
					case 4: boneco = "  __ O \n";
							boneco += "|   -|-\n";
							boneco += "|   /  \n";
							boneco += "|     \n";
					break;
					case 5: boneco = "  __ O \n";
							boneco += "|   -|-\n";
							boneco += "|   / /\n";
							boneco += "|     \n";
					break;
				}
				System.out.println(this.boneco + "\nVocê ERROU! " + this.contaErro + " vez(es)");
				if(contaErro>=5)
				{
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

	public void setName() {
		Scanner read = new Scanner (System.in);	
		System.out.println("Qual seu nome? ");
		name = read.nextLine();
	}

	public int getAge() {
		return age;
	}

	public void setAge() {
		Scanner read = new Scanner (System.in);	
		System.out.println("Qual sua idade? ");
		age = read.nextInt(); 
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

	public String arrayWords(int x) {
		String[] words = {" ", " "," "," "," "};
		return words[x];
	}
	public String arrayTips(int x) {
		String[] tips = {" ", " "," "," "," "};
		return tips[x];
	}

	public String getDica() {
		return dica;
	}

	public void setDica(String dica) {
		this.dica = dica;
	}

	
}