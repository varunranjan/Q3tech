package core.springcore.construction;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
private int salary;
private List<String> mobiles;
private Set<String> address;
private Map<String, Integer> skill;
private Child c;
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
public Emp(int salary, List<String> mobiles, Set<String> address, Map<String, Integer> skill, Child c) {
	super();
	this.salary = salary;
	this.mobiles = mobiles;
	this.address = address;
	this.skill = skill;
	this.c = c;
}
@Override
public String toString() {
	return "Emp [salary=" + salary + ", mobiles=" + mobiles + ", address=" + address + ", skill=" + skill + ", c=" + c
			+ "]";
}

}
