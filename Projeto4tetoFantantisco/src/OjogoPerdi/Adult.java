package OjogoPerdi;

public class Adult extends GallowsGame {

	public Adult(String name, int difficult) {

		super(name, difficult);
	}

	@Override
	public String arrayWords(int x) {

		String[] words = { "fraternidade", "divida", "papipaquigrafo", "otorrinolaringologista",
				"pneumoultramicroscopicosilicovulcanoconiotico", "boleto", "desempregado", "quintesencia",
				"verossimilhan�a", "transitoriedade" };
		return words[x];
	}

	@Override
	public String arrayTips(int x) {

		String[] tips = { "grupo", "problema", "objeto", "profiss�o", "doen�a", "papel", "fase complicada", "auge",
				"coerente", "dura pouco tempo" };
		return tips[x];
	}
}