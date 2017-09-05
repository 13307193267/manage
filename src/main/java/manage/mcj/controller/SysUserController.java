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
	
	@RequestMapping(value="/all",method=RequestMethod.POST)
	public @ResponseBody List<SysUser> select(SysUser user){
		List<SysUser> list =  sUserService.SelectUser(user);
		return list;
		
	}
}
