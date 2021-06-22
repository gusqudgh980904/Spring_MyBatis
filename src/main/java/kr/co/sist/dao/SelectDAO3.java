package kr.co.sist.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.sist.domain.EmpDomain;
import kr.co.sist.vo.DeptVO;
import kr.co.sist.vo.MgrVO;
import kr.co.sist.vo.UpdateVO;

public class SelectDAO3 {
	public SelectDAO3() {
		org.apache.ibatis.logging.LogFactory.useLog4JLogging();
	}//SelectDAO2
	
	public List<EmpDomain> selectDynamicIf(MgrVO mVO) {
		List<EmpDomain> list=null;
		
		SqlSession ss=MyBatisHandler.getInstance().getHandler();
		
		list=ss.selectList("kr.co.sist.selectMapper2.dynamic_if",mVO);
		
		if(ss!=null) {ss.close();}//if
		
		return list;
	}//selectTotalCount
	
	
	public List<EmpDomain> selectDynamicChoose(DeptVO dVO) {
		List<EmpDomain> list=null;
		
		SqlSession ss=MyBatisHandler.getInstance().getHandler();
		
		list=ss.selectList("kr.co.sist.selectMapper2.dynamic_choose",dVO);
		
		if(ss!=null) {ss.close();}//if
		
		return list;
		
	}//selectDynamicChoose
	
	
	public List<String> selectDynamicTrim(int flag){//MySQL Parameter 값이 하나라면
		//getter method가 없는 단일형(기본형,String) 또는 VO 모두 사용가능하다
		List<String> list=null;
		
		SqlSession ss=MyBatisHandler.getInstance().getHandler();
		
		list=ss.selectList("kr.co.sist.selectMapper2.dynamic_trim",flag);
		
		if(ss!=null) {ss.close();}//if
		
		return list;
	}//selectDynamicChoose
	
	
	public int updateDynamic(UpdateVO uVO) {
		int cnt=0;
		SqlSession ss=MyBatisHandler.getInstance().getHandler();

		cnt=ss.update("kr.co.sist.selectMapper2.dynamic_trim2",uVO);
		ss.commit();
		
		if(ss!=null) {ss.close();}//if
		return cnt;
	}//updateDynamic
	
	
	public List<EmpDomain> selectDynamicForeach(int[] deptArr){
		List<EmpDomain> list=null;
		
		SqlSession ss=MyBatisHandler.getInstance().getHandler();
		list=ss.selectList("kr.co.sist.selectMapper2.dynamic_foreach_array",deptArr);
		
		if(ss!=null) {ss.close();}//if
		return list;
	}//selectDynamicForeach
	
	
	public List<EmpDomain> selectDynamicForeach(List<Integer> listParam){
		List<EmpDomain> list=null;
		
		SqlSession ss=MyBatisHandler.getInstance().getHandler();
		list=ss.selectList("kr.co.sist.selectMapper2.dynamic_foreach_list",listParam);
		
		if(ss!=null) {ss.close();}//if
		return list;
	}//selectDynamicForeach
	
	
	public static void main(String[] args) {
		SelectDAO3 s=new SelectDAO3();
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		int[] dept= {10,20,30};
		System.out.println(s.selectDynamicForeach(list));
		
	}//main


}//class
