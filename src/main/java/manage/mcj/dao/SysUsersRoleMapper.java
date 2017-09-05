package manage.mcj.dao;

import manage.mcj.entity.SysUsersRole;

public interface SysUsersRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUsersRole record);

    int insertSelective(SysUsersRole record);

    SysUsersRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUsersRole record);

    int updateByPrimaryKey(SysUsersRole record);
}