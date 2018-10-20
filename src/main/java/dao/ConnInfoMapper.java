package dao;

import entity.ConnInfo;

public interface ConnInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(ConnInfo record);

    int insertSelective(ConnInfo record);

    ConnInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ConnInfo record);

    int updateByPrimaryKey(ConnInfo record);
}