package sample;

public class Execute {
public static void main(String[] args) {
	StackLogic s=new StackLogic();
	s.push(10);
	s.push(20);
	s.push(30);
	s.push(40);
	s.show();
	s.pop();
	s.show();
}
}
