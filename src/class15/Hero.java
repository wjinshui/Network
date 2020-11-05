package class15;

public class Hero extends Monster
{

	String skill;
	public Hero(String name, int att, int def, int hp, String skill)
	{
		super(name, att, def, hp);	
		this.skill = skill;
	}
	
	@Override
	void showInfo()
	{	
		super.showInfo();
		System.out.println(" 技能: " + skill);
	}
	
	@Override
	void attack(Monster monster)
	{
		int harm = this.att - monster.def;
		if( harm < 1 )
			harm = 1;
		monster.hp -= harm;
		System.out.println(name + " 使用技能 " + skill + "，对" + monster.name + "造成" + harm + "点伤害" );
		
	}

}
