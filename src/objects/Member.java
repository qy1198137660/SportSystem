package objects;

public class Member {
	private String name;
	private String IDCard;
	private String telNum;
	public Member(String mname,String mIDCrd,String mtelNum) {
		// TODO �Զ����ɵĹ��캯�����
		this.name=mname;
		this.IDCard=mIDCrd;
		this.telNum=mtelNum;
	}
	public String getIDCard() {
		return IDCard;
	}
	public String getName() {
		return name;
	}
	public String getTelNum() {
		return telNum;
	}
}





