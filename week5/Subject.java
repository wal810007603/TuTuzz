package ClassList;

public class Subject {
	private String subjectID;
	private String subjectName;
	
	public Subject(String subjectID, String subjectName) {
		super();
		this.subjectID = subjectID;
		this.subjectName = subjectName;
	}

	public String getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(String subjectID) {
		this.subjectID = subjectID;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String toString() {
		String info;
		info = "¿Î³Ì´úÂë:" + this.subjectID + "\t" + "¿Î³ÌÃû³Æ:" + this.subjectName;
		return info;
	}
	
}
