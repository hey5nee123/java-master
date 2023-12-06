package remind8;

public class Student {
	private String studNo;
	private String studName;
	private int engScore;
	private int matScore;

	Student() {

	}

	Student(String sutdNo, String studName, int engScore, int matScore) {
		this.studNo = studNo;
		this.studName = studName;
		this.engScore = engScore;
		this.matScore = matScore;
	}

	// 메소드
	void showInfo() {
		System.out.println("학생 번호는" + studNo + "이고 이름은" + studName + "이고 영어 점수는" + engScore + "이고 수학 점수는" + matScore);
	}

	// setter
	void setStudNo(String studNo) {
		this.studNo = studNo;
	}

	void setStudName(String studName) {
		this.studName = studName;
	}

	void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	void setMatScore(int matScore) {
		this.matScore = matScore;
	}

	// getter
	String getStudNo() {
		return studNo;
	}

	String getStudName() {
		return studName;
	}

	int getEngScore() {
		return engScore;
	}

	int getMatScore() {
		return matScore;
	}
}
