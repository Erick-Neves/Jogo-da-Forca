package OjogoPerdi;

public class Adult extends GallowsGame {

	public Adult(String name, int difficult) {

		super(name, difficult);
	}

	@Override
	public String arrayWords(int x) {

		String[] words = { "fraternidade", "divida", "papipaquigrafo", "otorrinolaringologista",
				"pneumoultramicroscopicosilicovulcanoconiotico", "boleto", "desempregado", "quintesencia",
				"verossimilhança", "transitoriedade" };
		return words[x];
	}

	@Override
	public String arrayTips(int x) {

		String[] tips = { "grupo", "problema", "objeto", "profissão", "doença", "papel", "fase complicada", "auge",
				"coerente", "dura pouco tempo" };
		return tips[x];
	}
}