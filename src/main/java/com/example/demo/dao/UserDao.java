package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import com.example.demo.model.OwnerInfo;
import com.example.demo.model.User;

@Mapper
public interface UserDao {
	@Select({"select * from sct_ownerinfo"})
	@Results({@Result(column ="owner_info_id", property = "id", jdbcType = JdbcType.BIGINT),
		      @Result(column="owner", property = "owner" , jdbcType = JdbcType.VARCHAR)})
	List<OwnerInfo> findAllUser();
}
//AllConfig getOneByConfigKey(String key);
//@Result(column = "FileName", property = "fileName", jdbcType = JdbcType.VARCHAR),
//
//@Results({ @Result(column = "FileId", property = "fileId", jdbcType = JdbcType.BIGINT),
//	@Result(column = "FileName", property = "fileName", jdbcType = JdbcType.VARCHAR),
//	@Result(column = "GroupOwner", property = "groupOwner", jdbcType = JdbcType.VARCHAR),
//	@Result(column = "IsError", property = "isError", jdbcType = JdbcType.INTEGER),
//	@Result(column = "CreateTime", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
//	@Result(column = "LastModified", property = "lastModified", jdbcType = JdbcType.BIGINT),
//	@Result(column = "IsMatch", property = "isMatch", jdbcType = JdbcType.INTEGER) })