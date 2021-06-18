package kr.co.sist.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.sist.domain.CpEmp1Domain;
import kr.co.sist.vo.CpEmp1VO;

public class ExamDAO {
	public ExamDAO() {
		org.apache.ibatis.logging.LogFactory.useLog4JLogging();
	}
	public int insertOne(int data) {
		int rowCnt = 0;
		//MyBatis Handler ���
		SqlSession ss = MyBatisHandler.getInstance().getHandler();
		
		rowCnt = ss.insert("kr.co.sist.examMapper.insertOne", data);
		if(rowCnt == 1) {
			ss.commit();
		}
		
		if(ss != null ) { ss.close(); }
		return rowCnt;
	}
	
	public int insertCpEmp1(CpEmp1VO cVO) {
		int rowCnt = 0;
		//MyBatis Handler ���
		SqlSession ss = MyBatisHandler.getInstance().getHandler();
		
		//insert �۾� ����
		rowCnt = ss.insert("kr.co.sist.examMapper.insertCpEmp1", cVO);
		if(rowCnt == 1) {
			ss.commit();
		}
		
		if(ss != null ) { ss.close(); }
		return rowCnt;
	}
	
	public int updateCpEmp1(CpEmp1VO ceVO) {
		int rowCnt = 0;
		//MyBatis Handler ���
		SqlSession ss = MyBatisHandler.getInstance().getHandler();
		
		//insert �۾� ����
		rowCnt = ss.update("kr.co.sist.examMapper.updateCpEmp1", ceVO);
		if(rowCnt == 1) {
			ss.commit();
		}
		
		if(ss != null ) { ss.close(); }
		return rowCnt;
	}//updateCpEmp1
	
	public int deleteCpEmp2(int empno) {
		int rowCnt = 0;
		//MyBatis Handler ���
		SqlSession ss = MyBatisHandler.getInstance().getHandler();
		
		//insert �۾� ����
		rowCnt = ss.update("kr.co.sist.examMapper.deleteCpEmp2", empno);
		if(rowCnt == 1) {
			ss.commit();
		}
		
		if(ss != null ) { ss.close(); }
		return rowCnt;
	}//deleteCpEmp2
	
	public CpEmp1Domain selectCpEmp1() {
		//MyBatis Handler ���
		SqlSession ss = MyBatisHandler.getInstance().getHandler();
		
		//select�۾� ����
		CpEmp1Domain ce1 = ss.selectOne("kr.co.sist.examMapper.selectData");
		
		if(ss != null ) { ss.close(); }
		return ce1;
	}
	
	public int modifyCpEmp1(CpEmp1VO ceVO) {
		int rowCnt = 0;
		//MyBatis Handler ���
		SqlSession ss = MyBatisHandler.getInstance().getHandler();
		//insert �۾� ����
		rowCnt = ss.update("kr.co.sist.examMapper.insertCpEmp1", ceVO);
		if(rowCnt == 1) {
			ss.commit();
		}
		
		if(ss != null ) { ss.close(); }
		return rowCnt;
	}
	
	public List<Integer> selectCpEmp2() {
		//MyBatis Handler ���
		SqlSession ss = MyBatisHandler.getInstance().getHandler();
		
		//select�۾� ����
		List<Integer> list = ss.selectList("kr.co.sist.examMapper.selectCpEmp2");
		
		if(ss != null ) { ss.close(); }
		return list;
	}
}
