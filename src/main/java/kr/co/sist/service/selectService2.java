package kr.co.sist.service;

import java.util.List;

import kr.co.sist.dao.SelectDAO2;
import kr.co.sist.domain.BoardDomain;
import kr.co.sist.domain.EmpDomain;
import kr.co.sist.domain.JoinDomain;
import kr.co.sist.vo.BoardVo;
import kr.co.sist.vo.TableVO;

public class selectService2 {
	
	public int totalCount() {
	SelectDAO2 sd2=new SelectDAO2();
	
	return sd2.selectTotalCount();
	}//totalCount
	
	
	/**
	 * 한 화면에 보여줄 게시물의 수
	 * @return
	 */
	public int pageScale() {
		int pageScale=10;
		
		return pageScale;
	}//pageScale
	
	
	public int totalPage(int totalCount,int pageScale) {
//	      int totalPage = totalCount() / pageScale();
//	      if(totalCount() % pageScale() != 0) {
//	         totalPage++;
//	      }//if
//	      return totalPage;
		int totalPage=0;
		totalPage=(int)Math.ceil(totalCount/(double)pageScale);
		
		return totalPage;
	   }//totalPage
	
	
	/**
	 * 시작번호 구하기
	 * @param currentPage
	 * @param pageScale
	 * @return
	 */
	public int startNum(int currentPage,int pageScale) {
		int startNum=0;
		
		startNum=currentPage*pageScale-pageScale+1;
		
		return startNum;
	}//startNum
	
	
	/**
	 * 끝번호 구하기
	 * @return
	 */
	public int endNum(int startNum,int pageScale) {
		int endNum=0;
		
		endNum=startNum+pageScale-1;
		
		return endNum;
	}//endNum
	
	
	public List<BoardDomain> searchList(BoardVo bVO) {
		SelectDAO2 sd2=new SelectDAO2();
		List<BoardDomain> list=sd2.selectSubQuery(bVO);
		
		return list;
	}//searchList


	public List<JoinDomain> searchJoin(){
		SelectDAO2 sd2=new SelectDAO2();
		List<JoinDomain> list=sd2.selectJoin();
		
		return list;
	}//searchJoin
	
	public List<JoinDomain> searchSubqueryJoin(){
		SelectDAO2 sd2=new SelectDAO2();
		List<JoinDomain> list=sd2.selectSubqueryJoin();
		
		return list;
	}//searchSubqueryJoin
	
	public List<EmpDomain> searchDynamicTable(TableVO tVO){
		SelectDAO2 sd2=new SelectDAO2();
		List<EmpDomain> list=sd2.selectDynamicTable(tVO);
		
		return list;
	}//searchJoin
	
}//class
