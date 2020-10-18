package OjogoPerdi;

import java.util.*;

public class random {
	public static void main(String agrs[]) throws InterruptedException
	{
		String[] words = {"Amor", "Força","Habilidade","Paz","Guerra"};
		
		int num = (int)(Math.random()*words.length);
		Thread.sleep(1500);
		System.out.println(num);
		
		switch(num)
		{
		case 1:	
			Thread.sleep(1000);
			System.out.println(words[0]);
		break;
		case 2:
			Thread.sleep(1000);
			System.out.println(words[1]);
		break;
		case 3:
			Thread.sleep(1000);
			System.out.println(words[2]);
		break;
		case 4:	
			Thread.sleep(1000);
			System.out.println(words[3]);
		break;
		default:
			Thread.sleep(1000);
			System.out.println(words[4]);
			break;
		}
	}

}

