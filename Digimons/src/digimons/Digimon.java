package digimons;

public class Digimon {
	
	private String name;
	private int lvl;
	private int attack_points;
	private int health;
	private int attack_times;
	
	public Digimon(String name, int lvl, int attack_points, int health, int attack_times) {
		this.name = name;
		this.lvl = lvl;
		this.attack_points = attack_points;
		this.health = health;
		this.attack_times = attack_times;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public int getAttack_points() {
		return attack_points;
	}

	public void setAttack_points(int attack_points) {
		this.attack_points = attack_points;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAttack_times() {
		return attack_times;
	}

	public void setAttack_times(int attack_times) {
		this.attack_times = attack_times;
	}
}
