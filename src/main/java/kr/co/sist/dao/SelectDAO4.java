package kr.co.sist.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.co.sist.domain.ZipcodeDomain;
import kr.co.sist.vo.ProcedureInsertVO;

public class SelectDAO4 {
	private ZipcodeDomain zd;



	public SelectDAO4() {
		org.apache.ibatis.logging.LogFactory.useLog4JLogging();
	}//SelectDAO4
	
public void insertProc(ProcedureInsertVO piVO) {
	SqlSession ss=MyBatisHandler.getInstance().getHandler();
	ss.selectOne("kr.co.sist.selectMapper3.insertProc",piVO);//piVO가 MyBatis로 전달되어
	//procedure를 호출하여 실행한 결과를 저장하게된다
	
	
	if(ss!=null) {ss.close();}//if	
	
}//insertProc


public List<ZipcodeDomain> selectProc(String dong){
    List<ZipcodeDomain> list = null;
    
    HashMap<String, Object> map = new HashMap<String, Object>();
    map.put("dong", dong); //입력된 값이 procedure로 전달
    
    SqlSession ss = MyBatisHandler.getInstance().getHandler();
    ss.selectOne("kr.co.sist.selectMapper3.proc_select",map);
    
    List<Map<String,Object>> selectList=(List<Map<String,Object>>)map.get("data");
    list=new ArrayList<ZipcodeDomain>();
    ZipcodeDomain zd = null;
    Map<String,Object> map1=null;
    for(int i=0;i<selectList.size();i++) {
    map1=selectList.get(i);
    zd=new ZipcodeDomain();
    
    zd.setZipcode((String)map1.get("ZIPCODE"));
    zd.setSido((String)map1.get("SIDO"));
    zd.setGugun((String)map1.get("GUGUN"));
    zd.setDong((String)map1.get("DONG"));
    zd.setBunji((String)map1.get("BUNJI"));
    
    list.add(zd);
    }//for
    
    return list;
 }//selectProc



public static void main(String[] args) {
	SelectDAO4 s=new SelectDAO4();
	System.out.println(s.selectProc("역삼1동"));
}//main

}//class
