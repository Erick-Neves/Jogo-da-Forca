package OjogoPerdi;

public class Kids extends GallowsGame {
	
	public Kids(String name, int age)
	{
		super(name,age);
	}
	@Override
	public String arrayWords(int x) 
	{
	
		String[] words = {"amor", "forca","habilidade","paz","guerra"};
		return words[x];
	}
	@Override
	public String arrayTips(int x) 
	{
	
		String[] tips = {"n�s damos de gra�a.", "todos n�s temos.","precisa desenvolver.","estado de espirito.","triste marco da humanidade"};
		return tips[x];
	}
}

