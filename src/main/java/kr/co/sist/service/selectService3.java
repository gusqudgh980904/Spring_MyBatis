package kr.co.sist.service;

import java.util.List;

import kr.co.sist.dao.SelectDAO3;
import kr.co.sist.domain.EmpDomain;
import kr.co.sist.vo.DeptVO;
import kr.co.sist.vo.MgrVO;

public class selectService3 {
	

	public List<EmpDomain> searchDynamicIf(MgrVO mVO){
		SelectDAO3 sDAO3=new SelectDAO3();
		List<EmpDomain> list=sDAO3.selectDynamicIf(mVO);
		
		return list;
	}//searchDynamicIf
	
	
	public List<EmpDomain> searchDynamicChoose(DeptVO dVO){
		SelectDAO3 sDAO3=new SelectDAO3();
		List<EmpDomain> list=sDAO3.selectDynamicChoose(dVO);
		
		return list;
	}//searchDynamicChoose
	
	
	public List<String> searchDynamicTrim(int flag){
		SelectDAO3 sDAO3=new SelectDAO3();
		List<String> list=sDAO3.selectDynamicTrim(flag);
		
		return list;
	}//searchDynamicIf
	
	
	public List<EmpDomain> searchDynamicForeach(String[] deptno){
		SelectDAO3 sDAO3=new SelectDAO3();
		
		int[] arr=new int[deptno.length];
		for(int i=0;i<deptno.length;i++) {
			arr[i]=Integer.parseInt(deptno[i]);
		}//for
		
		List<EmpDomain> list=sDAO3.selectDynamicForeach(arr);
		
		return list;
	}//searchDynamicChoose
	
}//class
