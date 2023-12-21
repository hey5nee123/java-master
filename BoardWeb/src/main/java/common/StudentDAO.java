package common;
//저장공간: Oracle DB.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//추가/수성/삭제/목록/단건조회
public class StudentDAO {
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;

	Connection getConn() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, "dev", "dev");
			System.out.println("연결 성공!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	// 목록.
	public List<Student> getStudentList() {
		getConn();
		List<Student> students = new ArrayList<>();
		String sql = "select * from student order by 1";

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Student student = new Student();
				student.setStudNo(rs.getString("student_number"));
				student.setStudName(rs.getString("student_name"));
				student.setEngScore(rs.getInt("eng_score"));
				student.setMatScore(rs.getInt("mat_score"));

				students.add(student); // 추가함

				// 배열의 빈곳에 한건 저장.
				/**
				 * for (int i = 0; i < students.length; i++) { if (students[i] == null) {
				 * students[i] = student; break; // for 반복문 종료. } }
				 */
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return students;
	} // end of getStudentList().

//추가.
	public boolean addStudent(Student std) {
		getConn();
		String sql = "insert into student values(?,?,?,?) ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, std.getStudNo());
			psmt.setString(2, std.getStudName());
			psmt.setInt(3, std.getEngScore());
			psmt.setInt(4, std.getMatScore());

			int r = psmt.executeUpdate();
			if (r == 1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public Student getStudnet(String sno) {
		getConn();

		String sql = "select * from student where student_number= ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, sno);
			rs = psmt.executeQuery();
			if (rs.next()) {
				Student student = new Student();
				student.setStudNo(rs.getString("student_number"));
				student.setStudName(rs.getString("student_name"));
				student.setEngScore(rs.getInt("eng_score"));
				student.setMatScore(rs.getInt("mat_score"));
				return student;

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null; // 조회된 값이 없으면 null 반환
	}

	// 수정
	public boolean modifyStudent(String no, int eng, int mat) {
		getConn();
		String sql = "UPDATE student\r\n" //
				+ "SET    eng_score = ?,\r\n" //
				+ "       mat_score = ?\r\n"//
				+ "WHERE  student_number=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, eng);
			psmt.setInt(2, mat);
			psmt.setString(3, no);
			int r = psmt.executeUpdate();
			if (r > 0) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

	public boolean removeStudent(String name) {
		getConn();
		String sql = "DELETE FROM student \r\n" + "WHERE student_name=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			int r = psmt.executeUpdate();
			if (r > 0) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
