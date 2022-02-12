package coders.team.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import coders.common.common.CommandMap;
import coders.team.service.TeamService;

@Controller
public class TeamController {

	@Resource(name = "teamService")
	private TeamService teamService;

	//작업일지 리스트
	@RequestMapping(value = "/Project/Team.do")
	public ModelAndView TeamList(CommandMap commandMap) throws Exception {
		ModelAndView mav = new ModelAndView("/team/PD_list");
		
		List<Map<String, Object>> list = teamService.selectTeamList(commandMap.getMap());

		mav.addObject("list", list);
		return mav;
	}

	//작업일지 작성폼
	@RequestMapping(value = "/Project/Team/Write.do", method = RequestMethod.GET)
	public ModelAndView TeamWriteForm(CommandMap commandMap) throws Exception {
		ModelAndView mav = new ModelAndView("/team/PD_write");

		return mav;
	}

	//작업일지 작성
	@RequestMapping(value = "/project/Team/Write.do", method = RequestMethod.POST)
	public ModelAndView TeamWrite(CommandMap commandMap, HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView("redirect:/team/PD_list");

		commandMap.put("PROJECT_NO", request.getParameter("PROJECT_NO"));
		commandMap.put("PD_TITLE", request.getParameter("PD_TITLE"));
		commandMap.put("USER_NO", request.getParameter("USER_NO"));
		commandMap.put("PD_CONTEXT", request.getParameter("PD_CONTEXT"));
		commandMap.put("PD_ING", request.getParameter("PD_ING"));
		commandMap.put("PD_IMPORT", request.getParameter("PD_IMPORT"));
		commandMap.put("PD_START", request.getParameter("PD_START"));
		commandMap.put("PD_END", request.getParameter("PD_END"));
		
		teamService.insertTeam(commandMap.getMap());
		return mav;
	}

	//작업일지 상세보기
	@RequestMapping(value = "/Project/Team/Detail.do")
	public ModelAndView TeamDetail(CommandMap commandMap, HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView("/team/PD_detail");
		
		Map<String, Object> map = teamService.selectTeamDetail(commandMap.getMap());
		
		commandMap.put("PD_BOARD_NO", request.getParameter("PD_BOARD_NO"));
		
		mav.addObject("map", map);
		

		return mav;

	}

	//작업일지 수정폼
	@RequestMapping(value = "/Project/Team/Modify.do", method = RequestMethod.GET)
	public ModelAndView TeamModifyForm(CommandMap commandMap) throws Exception {
		ModelAndView mav = new ModelAndView("/team/PD_modify");

		Map<String, Object> map = teamService.selectTeamDetail(commandMap.getMap());
		mav.addObject("map", map);
		return mav;
	}

	//작업일지 수정
	@RequestMapping(value = "/Project/Team/Modify.do", method = RequestMethod.POST)
	public ModelAndView TeamModify(CommandMap commandMap, HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView("redirect:/team/PD_detail");

		commandMap.put("PD_TITLE", request.getParameter("PD_TITLE"));
		commandMap.put("PD_CONTEXT", request.getParameter("PD_CONTEXT"));
		commandMap.put("PD_ING", request.getParameter("PD_ING"));
		commandMap.put("PD_IMPORT", request.getParameter("PD_IMPORT"));
		commandMap.put("PD_END", request.getParameter("PD_END"));
		commandMap.put("PD_BOARD_NO", request.getParameter("PD_BOARD_NO"));
		
		teamService.updateTeam(commandMap.getMap());
		return mav;
	}

	//작업일지 삭제
	@RequestMapping(value = "/Project/Team/Delete.do")
	public ModelAndView TeamDelete(CommandMap commandMap, HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView("redirect:/team/PD_list");

		commandMap.put("PD_BOARD_NO", request.getParameter("PD_BOARD_NO"));
		
		teamService.deleteTeam(commandMap.getMap());
		return mav;

	}
	
	//참가자 리스트
	@RequestMapping(value = "/Project/Team/Applicatiom.do")
	public ModelAndView TeamApplicationList(CommandMap commandMap) throws Exception {
		ModelAndView mav = new ModelAndView("team/application");
		
		List<Map<String, Object>> list = teamService.selectApplication(commandMap.getMap());
		List<Map<String, Object>> list1 = teamService.selectMember(commandMap.getMap());
		mav.addObject("list", list);
		mav.addObject("list1", list1);
		return mav;
		
	}
	
	@RequestMapping(value = "/Project/Team/ProjectApp.do")
	public ModelAndView ProjectApp(CommandMap commandMap) throws Exception{
		ModelAndView mav = new ModelAndView("team/application");
		
	
		return mav;
	}
		
	
	
	
	
	

}
