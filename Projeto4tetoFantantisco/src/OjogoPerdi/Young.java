package OjogoPerdi;

public class Young extends GallowsGame{
	public Young(String name, int age)
	{
		super(name,age);
	
	}
	@Override
	public String arrayWords(int x) 
	{
	
		String[] words = {"Puberdade", "Coxinha","Computador","Youtube","Generation"};
		return words[x];
	}
	@Override
	public String arrayTips(int x) 
	{
	
		String[] tips = {"n�s damos de gra�a.", "todos n�s temos.","precisa desenvolver.","estado de espirito.","triste marco da humanidade"};
		return tips[x];
	}
}
