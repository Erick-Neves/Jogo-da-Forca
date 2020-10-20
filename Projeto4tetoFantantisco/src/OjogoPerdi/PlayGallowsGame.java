package OjogoPerdi;

import java.util.*;

public class PlayGallowsGame {

	public static void main(String args[]) throws InterruptedException {
		Random ram = new Random();
		int x = ram.nextInt(10);
		GallowsGame novoJogo = new GallowsGame("", 0);
		novoJogo.setName();

		do {
			novoJogo.setDifficult();
			switch (novoJogo.getDifficult()) {
			case 0:
				System.out.println("Jogo Finalizado");
				break;

			case 1:
				Kids kid = new Kids(novoJogo.getName(), novoJogo.getDifficult());
				kid.arrayWords(x);
				kid.arrayTips(x);
				novoJogo.setPalavra(kid.arrayWords(x));
				novoJogo.setDica(kid.arrayTips(x));
				novoJogo.Jogo();
				break;
			case 2:
				Young you = new Young(novoJogo.getName(), novoJogo.getDifficult());
				you.arrayWords(x);
				you.arrayTips(x);
				novoJogo.setPalavra(you.arrayWords(x));
				novoJogo.setDica(you.arrayTips(x));
				novoJogo.Jogo();
				break;
			case 3:
				Adult adu = new Adult(novoJogo.getName(), novoJogo.getDifficult());
				adu.arrayWords(x);
				adu.arrayTips(x);
				novoJogo.setPalavra(adu.arrayWords(x));
				novoJogo.setDica(adu.arrayTips(x));
				novoJogo.Jogo();
				break;
			default:
				System.out.println("Opção inválida");
			}
		} while (novoJogo.getDifficult() != 0);
	}
}