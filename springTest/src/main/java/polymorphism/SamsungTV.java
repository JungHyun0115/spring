package polymorphism;

public class SamsungTV implements TV {
	private SonySpeaker speaker;
	private int price;
	
	public void initMethod() {
		System.out.println("��ü �ʱ�ȭ �۾� ó��..");
	}

	public void destroyMethod() {
		System.out.println("��ü ���� ���� ó���� ���� ó��...");
	}
	

	public SamsungTV() {
		System.out.println("===> SamsungTV(1) ��ü ����");
	}
	
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("===> SamsungTV(2) ��ü ����");
		this.speaker = speaker;
	}
	
	public SamsungTV(SonySpeaker speaker, int price) {
		System.out.println("===> SamsunTV(3) ��ü ����");
		this.speaker = speaker;
		this.price = price;
	}


	public void powerOn() {
		System.out.println("SamsungTV---���� �Ҵ�. (���� : " + price + ")");
	}

	public void powerOff() {
		System.out.println("SamsungTV---���� ����.");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}
}
