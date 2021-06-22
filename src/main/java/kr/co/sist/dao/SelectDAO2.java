package kr.co.sist.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.sist.domain.BoardDomain;
import kr.co.sist.domain.EmpDomain;
import kr.co.sist.domain.JoinDomain;
import kr.co.sist.vo.BoardVo;
import kr.co.sist.vo.TableVO;

public class SelectDAO2 {
	public SelectDAO2() {
		org.apache.ibatis.logging.LogFactory.useLog4JLogging();
	}//SelectDAO2
	
	public int selectTotalCount() {
		int cnt=0;
		
		//1.Mybatis Handler���
		SqlSession ss=MyBatisHandler.getInstance().getHandler();
		//2.id�� �ش��ϴ� ������ ã�Ƽ� ������ �� ��� ���
		cnt=ss.selectOne("kr.co.sist.selectMapper2.selectTotalCount");
		if(ss!=null) {ss.close();}
		return cnt;
	}//selectTotalCount
	
	
	/**
	 * subquery
	 * @param bVO
	 * @return
	 */
	public List<BoardDomain> selectSubQuery(BoardVo bVO) {
		List<BoardDomain> list=null;
		
		//1.Mybatis Handler���
		SqlSession ss=MyBatisHandler.getInstance().getHandler();
		list=ss.selectList("kr.co.sist.selectMapper2.subquery",bVO);
		if(ss!=null) {ss.close();}
		return list;
	}//selectSubQuery
	
	
	public List<JoinDomain> selectJoin(){
		List<JoinDomain> list=null;
		
		//1.Mybatis Handler���
		SqlSession ss=MyBatisHandler.getInstance().getHandler();
		//2.id�� �ش��ϴ� ������ ã�Ƽ� ������ �� ��� ���
		list=ss.selectList("kr.co.sist.selectMapper2.join");
		if(ss!=null) {ss.close();}
		
		return list;
	}//selectJoin
	
	
	public List<JoinDomain> selectSubqueryJoin(){
		List<JoinDomain> list=null;
		
		//1.Mybatis Handler���
		SqlSession ss=MyBatisHandler.getInstance().getHandler();
		//2.id�� �ش��ϴ� ������ ã�Ƽ� ������ �� ��� ���
		list=ss.selectList("kr.co.sist.selectMapper2.subquery_join");
		if(ss!=null) {ss.close();}
		
		return list;
	}//selectSubqueryJoin
	
	
	public List<EmpDomain> selectDynamicTable(TableVO tVO){
		List<EmpDomain> list=null;
		
		//1.Mybatis Handler���
		SqlSession ss=MyBatisHandler.getInstance().getHandler();
		//2.id�� �ش��ϴ� ������ ã�Ƽ� ������ �� ��� ���
		list=ss.selectList("kr.co.sist.selectMapper2.dynamicTab",tVO);
		if(ss!=null) {ss.close();}
		
		return list;
	}//selectDynamicTable
	



}//class
