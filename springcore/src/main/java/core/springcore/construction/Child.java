package core.springcore.construction;

public class Child {
private String nickName;

public Child(String nickName) {
	super();
	this.nickName = nickName;
}

public Child() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Child [nickName=" + nickName + "]";
}

}
