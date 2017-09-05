package manage.mcj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import manage.mcj.dao.SysUserMapper;
import manage.mcj.entity.SysUser;
import manage.mcj.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService{

	@Autowired private SysUserMapper sUser;
	
	@Override
	public List<SysUser> SelectUser(SysUser user) {
		// TODO Auto-generated method stub
		return sUser.all(user);
	}

	@Override
	public int insert(SysUser user) {
		// TODO Auto-generated method stub
		return sUser.add(user);
	}

}
