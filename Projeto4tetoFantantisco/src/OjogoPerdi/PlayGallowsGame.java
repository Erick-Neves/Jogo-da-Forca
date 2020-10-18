package OjogoPerdi;

import java.util.*;

public class PlayGallowsGame {
	public static void main(String args[]) throws InterruptedException
	{
		Random ram = new Random();
		int x = ram.nextInt(5);
		GallowsGame novoJogo = new GallowsGame("",0);
		novoJogo.setAge();
		novoJogo.setName();
		if(novoJogo.getAge()<=10)
		{
			Kids kid = new Kids(novoJogo.getName(), novoJogo.getAge());
			kid.arrayWords(x);
			kid.arrayTips(x);
			novoJogo.setPalavra(kid.arrayWords(x));
			novoJogo.setDica(kid.arrayTips(x));
			novoJogo.Jogo();
		}
		else if(novoJogo.getAge()>10 && novoJogo.getAge()<=20)
		{
			Young you = new Young(novoJogo.getName(), novoJogo.getAge());
			you.arrayWords(x);
			you.arrayTips(x);
			novoJogo.setPalavra(you.arrayWords(x));
			novoJogo.setDica(you.arrayTips(x));
			novoJogo.Jogo();
		}
		else 
		{
			Adult adu = new Adult(novoJogo.getName(), novoJogo.getAge());
			adu.arrayWords(x);
			adu.arrayTips(x);
			novoJogo.setPalavra(adu.arrayWords(x));
			novoJogo.setDica(adu.arrayTips(x));
			novoJogo.Jogo();
		}
	}
}
