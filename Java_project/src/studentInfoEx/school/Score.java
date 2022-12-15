package studentInfoEx.school;

public class Score { //Score 객체를 생성하면 ,Subject  객체에 접근 가능한가요? 네.
	//EX)Score lsyScore = new Score("12",new Subject(), 70)
	//lsyScore(과목 객체). 변수 또는 메서드에 접근.
	int studentId;   //학번
	Subject subject; //과목 (다른 클래스를 가져와서 사용, 포함관계: has A관계)
	int point;      //점수
	
	public Score( int studentId, Subject subject, int point){
		this.studentId = studentId;
		this.subject = subject;
		this.point = point;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String toString(){
		return "�й�:" + studentId + "," + subject.getSubjectName() + ":" + point;
	}
}
