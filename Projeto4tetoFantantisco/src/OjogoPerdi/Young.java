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
	
		String[] tips = {"nós damos de graça.", "todos nós temos.","precisa desenvolver.","estado de espirito.","triste marco da humanidade"};
		return tips[x];
	}
}
