package kr.co.sist.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.sist.domain.DeptDomain;
import kr.co.sist.domain.EmpDomain;

public class SelectDAO {
	public SelectDAO() {
		org.apache.ibatis.logging.LogFactory.useLog4JLogging();
	}//SelectDAO
	
	public String selectSingleColumn() {
		String dname="";
		
		//1.Mybatis Handler���
		SqlSession ss=MyBatisHandler.getInstance().getHandler();
		//2.id�� �ش��ϴ� ������ ã�Ƽ� ������ �� ��� ���
		dname=ss.selectOne("kr.co.sist.selectMapper.singleColumn");
		
		return dname;
	}//selectSingleColumn
	
	
	public DeptDomain selectMultiColumn() {
		DeptDomain dd=null;
		//1.Mybatis Handler���
		SqlSession ss=MyBatisHandler.getInstance().getHandler();
		//2.id�� �ش��ϴ� ������ ã�Ƽ� ������ �� ��� ���
		dd=ss.selectOne("kr.co.sist.selectMapper.multiColumn");
		
		return dd;
	}//selectMultiColumn
	
	
	public List<String> selectSingleColumnMultiRow() {
		List<String> list=null;
		//1.Mybatis Handler���
		SqlSession ss=MyBatisHandler.getInstance().getHandler();
		//2.id�� �ش��ϴ� ������ ã�Ƽ� ������ �� ��� ���
		list=ss.selectList("kr.co.sist.selectMapper.singleColumnMultiRow");
		
		return list;
	}//selectMultiColumn
	
	
	public List<EmpDomain> selectMultiColumnMultiRow() {
		List<EmpDomain> list=null;
		//1.Mybatis Handler���
		SqlSession ss=MyBatisHandler.getInstance().getHandler();
		//2.id�� �ش��ϴ� ������ ã�Ƽ� ������ �� ��� ���
		list=ss.selectList("kr.co.sist.selectMapper.multiColumnMultiRow");
		
		return list;
	}//selectMultiColumn
	
	
	public List<EmpDomain> selectGreaterThan(int sal) {
		List<EmpDomain> list=null;
		//1.Mybatis Handler���
		SqlSession ss=MyBatisHandler.getInstance().getHandler();
		//2.id�� �ش��ϴ� ������ ã�Ƽ� ������ �� ��� ���
		list=ss.selectList("kr.co.sist.selectMapper.greaterThan",sal);
		
		return list;
	}//selectMultiColumn
	
	
	public List<EmpDomain> selectLessThan(int sal) {
		List<EmpDomain> list=null;
		//1.Mybatis Handler���
		SqlSession ss=MyBatisHandler.getInstance().getHandler();
		//2.id�� �ش��ϴ� ������ ã�Ƽ� ������ �� ��� ���
		list=ss.selectList("kr.co.sist.selectMapper.lessThan",sal);
		
		return list;
	}//selectMultiColumn
}