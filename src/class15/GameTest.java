package class15;

import java.util.ArrayList;

public class GameTest
{

	public static void main(String[] args)
	{
		Cyclops cyclops = new Cyclops("∂¿—€æﬁ»À“∂Í›±Ú", 11, 5, 200, "∂§¥∏");
		Dryad dyDryad = new Dryad(" ˜π÷÷”∫≠", 12, 8, 250, 1.5);
		Dryad dryad2 = new Dryad(" ˜π÷≈Ì≤ÆË∫", 15, 9, 280, 1.6);
		
		ArrayList<Monster> monsters = new ArrayList<Monster>();
		monsters.add(cyclops);
		monsters.add(dyDryad);
		monsters.add(dryad2);
		
		for (Monster monster : monsters)
		{
			monster.showInfo();
		}
		System.out.println("************************************************");
		int index = 0;
		while(monsters.size() > 1)
		{
			Monster cur = monsters.get(index);
			Monster enemy = monsters.get( (index + 1) % monsters.size());
			cur.attack(enemy);
			if(enemy.isDeath())
			{
				System.out.println(enemy.name + "±ª" + cur.name + "ªÓªÓ¥ÚÀ¿¡À°£°£°£");
				monsters.remove(enemy);
			}
			index = (index + 1) % monsters.size();
		}
		System.out.println("************************************************");

	}

}
