package objects;

public class Member {
	private String name;
	private String IDCard;
	private String telNum;
	public Member(String mname,String mIDCrd,String mtelNum) {
		// TODO 自动生成的构造函数存根
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





