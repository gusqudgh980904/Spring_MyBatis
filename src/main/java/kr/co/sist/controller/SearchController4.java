package kr.co.sist.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.sist.domain.ZipcodeDomain;
import kr.co.sist.service.selectService4;
import kr.co.sist.vo.ProcedureInsertVO;

@Controller
public class SearchController4 {
	
	@RequestMapping(value="/select/procedure_insert.do",method = {GET,POST})
	public String useProcedureInsert(ProcedureInsertVO piVO,Model model) {
		int cnt=0;
		if(piVO.getEname()!=null) {//입력값이 들어왔을 때
		selectService4 ss4=new selectService4();
		ss4.addProcedure(piVO);
		cnt=piVO.getRow_cnt();
		}//if
		System.out.println("---------"+piVO);
		
		model.addAttribute("cnt",cnt);
		return "select4/proc_insert";
	}//useDynamicIf
	
	
	   @RequestMapping(value="/select/procedure_select.do", method= {GET,POST})
	   public String useProcedureSelect(@RequestParam(defaultValue = "") String dong, Model model) {
	      
	      if(!"".equals(dong)) { //입력값이 들어왔을 떄
	         selectService4 ss4 = new selectService4();
	         List<ZipcodeDomain> list=ss4.searchProcedure(dong);
	         model.addAttribute("zipcodeList",list);
	      }//end if
	      
	      return "select4/proc_select";
	   }//useProcedureSelect


	
	
}
