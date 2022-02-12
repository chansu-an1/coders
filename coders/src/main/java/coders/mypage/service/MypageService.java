package coders.mypage.service;

import java.util.List;
import java.util.Map;

public interface MypageService {
	public Map<String, Object> selectMypageDetail(Map<String, Object> map)throws Exception;
	
	public List<Map<String, Object>> selectProjectList(Map<String, Object> map)throws Exception;
	
	public List<Map<String, Object>> selectWriteList(Map<String, Object> map)throws Exception;
	
	public List<Map<String, Object>> selectArlimeList(Map<String, Object> map)throws Exception;
	
	public List<Map<String, Object>> selectProjetArList(Map<String, Object> map)throws Exception;
}
