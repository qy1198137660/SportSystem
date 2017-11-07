package objects;

public class Coach extends Member{
	
	private String coachId;

	public Coach(String mname, String mIDCrd, String mtelNum) {
		super(mname, mIDCrd, mtelNum);
		// TODO 自动生成的构造函数存根
	}
	public Coach(String mname, String mIDCrd, String mtelNum,String mcoachId) {
		super(mname, mIDCrd, mtelNum);
		this.coachId=mcoachId;
		// TODO 自动生成的构造函数存根
	}
	
	public String getCoachId() {
		return coachId;
	}
	
	public void setCoachId(String mcoachId) {
		this.coachId = mcoachId;
	}

}
