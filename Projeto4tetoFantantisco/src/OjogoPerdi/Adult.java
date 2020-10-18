package OjogoPerdi;

public class Adult extends GallowsGame {

	public Adult(String name, int age) {
		
		super(name,age);
	}
	@Override
	public String arrayWords(int x) 
	{
	
		String[] words = {"fraternidade", "divida","papipaquigrafo","otorrinolaringologista","pneumoultramicroscópicosilicovulcanoconiótico"};
		return words[x];
	}
	@Override
	public String arrayTips(int x) 
	{
	
		String[] tips = {"nós damos de graça.", "todos nós temos.","precisa desenvolver.","estado de espirito.","triste marco da humanidade"};
		return tips[x];
	}
}
