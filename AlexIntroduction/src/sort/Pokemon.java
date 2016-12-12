package sort;

public class Pokemon {
	private boolean poisoned;
	private int hp;
	private int level;
	private String name;
	
	public Pokemon(String name,int level ) {
		hp = 100;
		this.poisoned = false;
		this.name = name;
		this.level = level;
	}
	public void iChooseYou(){
		System.out.println(name+", "+name+"!");
	}
	
	public void lapse(){
		if(poisoned){
			hp=hp-15;
		}
	}
	public void attack(Pokemon target, Attack attack){
		if(Math.random() < .9){
			attack.attack(target);
			System.out.println("The attack hit");
			
		}else{
			System.out.println("The attack missed");
		}
	}
	
	public int getHP(){
		return hp;
	}
	public int getLevel(){
		return level;
	}
	public String getName(){
		return name;
	}
	public void setHp(int newHP) {
		// TODO Auto-generated method stub
		
	}
	public void setPoisoned(boolean b) {
		// TODO Auto-generated method stub
		this,poisoned = b;
		
	}
}
