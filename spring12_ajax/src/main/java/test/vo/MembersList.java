package test.vo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="members") //Maps a class or an enum type to an XML element. 
@XmlAccessorType(XmlAccessType.FIELD)
public class MembersList {	
	private List<MembersVo> list;
	private String grade;
	public void setList(List<MembersVo> list) {
		this.list=list;
	}
	public List<MembersVo> getList(){
		return list;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getGrade() {
		return grade;
	}
}
