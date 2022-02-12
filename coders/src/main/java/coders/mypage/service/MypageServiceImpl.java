package coders.mypage.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import coders.mypage.dao.MypageDAO;
@Service("MypageService")
public class MypageServiceImpl implements MypageService {
	
	@Resource(name="MypageDAO")
	private MypageDAO mypageDAO;

	@Override
	public Map<String, Object> selectMypageDetail(Map<String, Object> map) throws Exception {
		return mypageDAO.selectMypageDetail(map);
	}

	@Override
	public List<Map<String, Object>> selectProjectList(Map<String, Object> map) throws Exception {
		
		return mypageDAO.selectProjectList(map);
	}

	@Override
	public List<Map<String, Object>> selectWriteList(Map<String, Object> map) throws Exception {
		return mypageDAO.selectWriteList(map);
	}

	@Override
	public List<Map<String, Object>> selectArlimeList(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return mypageDAO.selectArlimeList(map);
	}

	@Override
	public List<Map<String, Object>> selectProjetArList(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return mypageDAO.selectprojectArList(map);
	}
	
	
}

