package class15;

public class Monster
{
	String name;
	int att, def, hp;	
	
	
	public Monster(String name, int att, int def, int hp)
	{
		super();
		this.name = name;
		this.att = att;
		this.def = def;
		this.hp = hp;
	}

	void showInfo()
	{
		System.out.print("怪物名称：" + name + " 血量: " + hp + " 攻击力:" + att + " 防御力：" + def);
	}
	
	boolean isDeath()
	{		
		return hp <= 0;
	}
	
	void attack(Monster monster)
	{
		int harm = this.att - monster.def;
		if( harm < 1 )
			harm = 1;
		monster.hp -= harm;
	}
}
