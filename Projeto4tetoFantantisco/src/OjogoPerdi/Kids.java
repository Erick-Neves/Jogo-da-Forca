package OjogoPerdi;

public class Kids extends GallowsGame {

	public Kids(String name, int difficult) {
		super(name, difficult);
	}

	@Override
	public String arrayWords(int x) {

		String[] words = { "amor", "forca", "habilidade", "paz", "guerra", "agua", "banana", "sol", "lua", "pizza" };
		return words[x];
	}

	@Override
	public String arrayTips(int x) {

		String[] tips = { "Sentimento.", "jogo.", "precisa desenvolver.", "estado de espirito.", "conflitos",
				"elemeto da natureza", "fruta", "estrela", "redonda", "comida" };
		return tips[x];
	}
}