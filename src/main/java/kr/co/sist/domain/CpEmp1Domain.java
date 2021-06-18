package kr.co.sist.domain;

/**
 * Web Parameter�� �Էµ� �� Spring Framework���� VO�� �⺻�����ڸ� ����Ͽ�
 * ��üȭ�ϰ� setter methodȣ���Ͽ� ���� �־��ְ�, ���� ���� ��ü�� 
 * Controller method�� �־��ش�.
 * @author user
 *
 */
public class CpEmp1Domain {
	private int empno, deptno, sal;
	private String  ename,  job;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
}
