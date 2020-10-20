package OjogoPerdi;

public class Young extends GallowsGame {
	public Young(String name, int difficult) {
		super(name, difficult);

	}

	@Override
	public String arrayWords(int x) {

		String[] words = { "puberdade", "coxinha", "computador", "youtube", "generation", "skateboard", "camping",
				"biologia", "friends", "instagram" };
		return words[x];
	}

	@Override
	public String arrayTips(int x) {

		String[] tips = { "Fase da vida.", "comida", "máquina", "internet", "Organização TOP", "esporte radical",
				"floresta", "estudo", "amigos", "app" };
		return tips[x];
	}
}