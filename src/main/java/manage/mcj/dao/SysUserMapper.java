package manage.mcj.dao;

import java.util.List;


import manage.mcj.entity.SysUser;

public interface SysUserMapper {
	List<SysUser> all(SysUser user);
	
    int deleteByPrimaryKey(Integer id);

    int add(SysUser user);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}