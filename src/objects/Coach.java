package objects;

public class Coach extends Member{
	
	private String coachId;

	public Coach(String mname, String mIDCrd, String mtelNum) {
		super(mname, mIDCrd, mtelNum);
		// TODO �Զ����ɵĹ��캯�����
	}
	public Coach(String mname, String mIDCrd, String mtelNum,String mcoachId) {
		super(mname, mIDCrd, mtelNum);
		this.coachId=mcoachId;
		// TODO �Զ����ɵĹ��캯�����
	}
	
	public String getCoachId() {
		return coachId;
	}
	
	public void setCoachId(String mcoachId) {
		this.coachId = mcoachId;
	}

}
