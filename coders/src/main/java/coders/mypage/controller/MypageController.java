package coders.mypage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import coders.common.common.CommandMap;
import coders.mypage.service.MypageService;

import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.mail.Session;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class MypageController {
	
	@Autowired
	private MypageService mypageService; 
	
	@RequestMapping(value = "/Mypage.do" )
	public ModelAndView mypage(HttpSession session,HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		Map<String, Object> mapor = new HashMap<String, Object>();
		String user_no = request.getParameter("USER_NO");
		mav.setViewName("mypage/mypagedetail");
		if(request.equals(session.getAttribute("USER_NO"))) {
			mapor.put("USER_NO", user_no);
			Map<String, Object> map = mypageService.selectMypageDetail(mapor);
			mav.addObject("map",map);
			mav.addObject("CHECK","N");
			return mav;
		}
		mapor.put("USER_NO", user_no);
		Map<String, Object> map = mypageService.selectMypageDetail(mapor);
		mav.addObject("map",map);
		mav.addObject("CHECK","Y");
		return mav;
	}
	//유저 상세정보
	@RequestMapping(value = "/Mypage/MypageDetail.do")
	public ModelAndView mypageDetail(HttpSession session) throws Exception {
		ModelAndView mav = new ModelAndView();
		Map<String, Object> mapor = new HashMap<String, Object>();
		mapor.put("USER_NO", "1");
		Map<String, Object> map = mypageService.selectMypageDetail(mapor);
		mav.addObject("map",map);
		mav.setViewName("/mypage/mypagedetail");
		return mav;
	}
	@RequestMapping(value = "/Mypage/Modify.do",method = RequestMethod.GET)
public ModelAndView mypageModifyForm() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/mypage/mypage_modify");
		return mav;
	
	}
	@RequestMapping(value = "/Mypage/Modify.do",method = RequestMethod.POST )
public ModelAndView mypageModify() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/Mypage.do");
		return mav;
}
	@RequestMapping(value = "/Mypage/Follow.do")
public ModelAndView followList(HttpSession session) {
		Map<String, Object> mapor = new HashMap<String, Object>();
		mapor.put("user_no", 1);
		ModelAndView mav = new ModelAndView("/mypage/follow");
		return mav;
}
	@RequestMapping(value = "/Mypage/ProjectList.do")
public ModelAndView projectList(HttpSession session)throws Exception {
		ModelAndView mav = new ModelAndView();
		Map<String, Object> mapor = new HashMap<String, Object>();
		mapor.put("USER_NO", 1);
		List<Map<String, Object>> list = mypageService.selectProjectList(mapor);
		mav.addObject("list",list);
		mav.setViewName("/mypage/myProject");
		return mav;
}
	@RequestMapping(value = "/Mypage/WriteList.do")
public ModelAndView writeList(HttpSession session)throws Exception {
		ModelAndView mav = new ModelAndView();
		Map<String, Object> mapor = new HashMap<String, Object>();
		mapor.put("USER_NO", 1);
		List<Map<String, Object>> list = mypageService.selectWriteList(mapor);
		mav.addObject("list",list);
		mav.setViewName("/mypage/myWrite");
		return mav;
}
	@RequestMapping(value = "/Mypage/UserDelete.do")
public ModelAndView mypageDelete() {
		ModelAndView mav = new ModelAndView();
		Map<String, Object> mapor = new HashMap<String, Object>();
		mapor.put("USER_NO", 1);
		mav.setViewName("resultType=/userDelete");
		return mav;
}
	@RequestMapping(value = "/Mypage/Notification.do")
public ModelAndView selectArlimeList(HttpSession session) {
		ModelAndView mav = new ModelAndView();
		Map<String, Object> mapor = new HashMap<String, Object>();
		mapor.put("user_no", 1);
		mav.setViewName("/mypage/Notification");
		return mav;
}
	@RequestMapping(value = "/Mypage/ProjectNot")
	public ModelAndView selectProjetArList(HttpSession session) {
		ModelAndView mav = new ModelAndView();
		Map<String, Object> mapor = new HashMap<String, Object>();
		mapor.put("user_no", 1);
		mav.setViewName("/mypage/ProjectNot");
		return mav;
		
	}

}
