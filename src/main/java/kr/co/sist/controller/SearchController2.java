package kr.co.sist.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.sist.domain.BoardDomain;
import kr.co.sist.domain.EmpDomain;
import kr.co.sist.domain.JoinDomain;
import kr.co.sist.service.selectService2;
import kr.co.sist.vo.BoardVo;
import kr.co.sist.vo.TableVO;

@Controller
public class SearchController2 {
	
	@RequestMapping(value="/select/subquery.do",method = {GET,POST})
	public String selectMenu(@RequestParam(defaultValue = "1")int currentPage,Model model) {

		selectService2 ss2=new selectService2();
		int cnt=ss2.totalCount();//��ü�Խù��Ǽ�
		int pageScale=ss2.pageScale();//�� ȭ�鿡 ������ �Խù��� ��
		int totalPage=ss2.totalPage(cnt,pageScale);//�� ������ ��
		int startNum=ss2.startNum(currentPage,pageScale);//������ ���� ��ȣ
		int endNum=ss2.endNum(startNum,pageScale);//������ �� ��ȣ
		
		BoardVo bVO=new BoardVo(startNum,endNum);
		List<BoardDomain> list=ss2.searchList(bVO);
		
		model.addAttribute("totalCnt",cnt);
		model.addAttribute("pageScale",pageScale);
		model.addAttribute("totalPage",totalPage);
		model.addAttribute("startNum",startNum);
		model.addAttribute("endNum",endNum);
		model.addAttribute("boardList",list);
		
		return "select2/subquery";
	}//selectMenu
	
	
	@RequestMapping(value = "/select/join.do",method = {GET,POST})
	   public String searchJoin(Model model) {
	      
	      selectService2 ss2 = new selectService2();
	      List<JoinDomain> listJd = ss2.searchJoin();
	      
	      model.addAttribute("empList", listJd);
	      return "select2/join";
	   }//searchJoin
	
	@RequestMapping(value = "/select/subquery_join.do",method = {GET,POST})
	public String searchSubqueryJoin(Model model) {
		
		selectService2 ss2 = new selectService2();
		List<JoinDomain> listJd = ss2.searchSubqueryJoin();
		
		model.addAttribute("empList", listJd);
		return "select2/join";
	}//searchSubqueryJoin
	
	
	
	@RequestMapping(value = "/select/dynamicTable.do",method = {GET,POST})
	public String searchDynamicTable(TableVO tVO,Model model) {
		if(tVO.getLoc()==null) {
			tVO.setLoc("emp");
		}//if
		selectService2 ss2 = new selectService2();
		List<EmpDomain> ed=ss2.searchDynamicTable(tVO);
		model.addAttribute("empList",ed);
		
		return "select2/dynamic_table";
	}//searchSubqueryJoin
	
	
	
}
