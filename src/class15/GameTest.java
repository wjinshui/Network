package class15;

import java.util.ArrayList;

public class GameTest
{

	public static void main(String[] args)
	{
		Cyclops cyclops = new Cyclops("独眼巨人叶贻彬", 11, 5, 200, "钉锤");
		Dryad dyDryad = new Dryad("树怪钟涵", 12, 8, 250, 1.5);
		Dryad dryad2 = new Dryad("树怪彭伯韬", 15, 9, 280, 1.6);
		Hero hero = new Hero("大天使王老师", 10000, 10000, 10000, " 恕瑞玛的传承 ");
		ArrayList<Monster> monsters = new ArrayList<Monster>();
		monsters.add(cyclops);
		monsters.add(dyDryad);
		monsters.add(dryad2);
		monsters.add(hero);
		
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
				System.out.println(enemy.name + "被" + cur.name + "活活打死了。。。");
				monsters.remove(enemy);
			}
			index = (index + 1) % monsters.size();
		}
		System.out.println("************************************************");
		System.out.println("胜利者是:");
		monsters.get(0).showInfo();

	}

}
