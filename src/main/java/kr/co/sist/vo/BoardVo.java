package kr.co.sist.vo;

public class BoardVo {
	private int startNum,endNum;
	
	public BoardVo() {
		super();
	}
	
	//�������� ���� ���� �֤��� ������ �����ڸ� ����ϴ°��� ���ϴ�
	public BoardVo(int startNum, int endNum) {
		super();
		this.startNum = startNum;
		this.endNum = endNum;
	}


	//Framework���� ���� �ְų� ���� ������ setter method�� getter method�� ����Ѵ�
	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public int getEndNum() {
		return endNum;
	}

	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}
	
	
	
}//class
