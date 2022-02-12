package coders.mypage.dao;

import java.util.List;
import java.util.Map;

import org.springframework.expression.spel.ast.OperatorBetween;
import org.springframework.stereotype.Repository;
import coders.common.dao.AbstractDAO;

@Repository("MypageDAO")
public class MypageDAO extends AbstractDAO{
	
	//내정보 보기
	@SuppressWarnings("unchecked")
	public Map<String, Object> selectMypageDetail(Map<String, Object> map)throws Exception{
		return(Map<String, Object>) selectOne("user.selectMypageDetail", map);
	}
	//참여 프로젝트 리스트
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectProjectList(Map<String, Object> map)throws Exception{
		return(List<Map<String, Object>>)selectList("user.selectProjectList", map);
	}
	
	//작성글 리스트
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectWriteList(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectList("user.selectWriteList", map);
	}
	
	//작성글 알림 리스트
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectArlimeList(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectList("user.selectArlimeList", map);
	} 
	//프로젝트 알림 리스트
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectprojectArList(Map<String, Object> map) throws Exception{
		return (List<Map<String,Object>>)selectList("user.selectProjectArList", map);
	}

}
