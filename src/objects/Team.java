package objects;

import java.awt.Image;
import java.sql.Connection;

public class Team {
	private String name;
	private String teamId;
	private String password;
	private int teamgrade;
	private Image[] attachment;
	
	public Team(String id) {
		// TODO 自动生成的构造函数存根
		this.teamId=id;
	}
	
	
	public String getName() {
		return this.name;
	}
	public String getTeamId() {
		return this.teamId;
	}
	public String getPassword() {
		return this.password;
	}
	public int getTeamgrade() {
		return this.teamgrade;
	}
	
	public void setTeamgrade(int grade) {
		this.teamgrade=grade;
	}
//	检测登陆
	public boolean checkPasswdByServer(String passwdFromInput){
		this.password=server.SConnection.post(this.teamId);
		if(this.password.equals(passwdFromInput))
			return true;
		return false;
	} 
	public boolean checkPasswdByDB(String passwdFromInput){
		this.password=db.SMySQL.Search(this.teamId);
		if(this.password.equals(passwdFromInput))
			return true;
		return false;
	} 
//	上传附件
	public void getAttachment() {
		
	}
}
