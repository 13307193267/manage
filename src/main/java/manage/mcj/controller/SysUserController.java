package manage.mcj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import manage.mcj.entity.SysUser;
import manage.mcj.service.SysUserService;

@Controller
public class SysUserController {

	@Autowired private SysUserService sUserService;
	
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public @ResponseBody List<SysUser> select(SysUser user){
		List<SysUser> list =  sUserService.SelectUser(user);
		return list;
		
	}
	
//	
//	@RequestMapping(value="/user",method=RequestMethod.POST)
//	public @ResponseBody ModelAndView select(SysUser user){
//		ModelAndView model = new ModelAndView();
//		List<SysUser> list =  sUserService.SelectUser(user);
//		model.addObject(list);
//		return model;
//		
//	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public @ResponseBody String insert(SysUser user){
		SysUser sUser = new SysUser();
		sUser.setAccount(user.getAccount());
		List<SysUser> list =  sUserService.SelectUser(sUser);
		if(list.size() == 0 ){
			sUserService.insert(user);
			return "添加成功";
		}else{
			return "已经存在此用户了";
		}
		 
		
	}
}
