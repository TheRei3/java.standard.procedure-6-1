package ex6no1;

public class ex6no1 {  // 235p
	String Color;
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
	
	public static void main(String[] args) {
		ex6no1 tv ;
		tv = new ex6no1();
		tv.channel = 7;
		tv.channelDown();
		System.out.println("현재 채널은 "+tv.channel+" 입니다.");
	}

}
