package manage.mcj.service;

import java.util.List;

import manage.mcj.entity.SysUser;

public interface SysUserService {

	List<SysUser> SelectUser(SysUser user);
}
