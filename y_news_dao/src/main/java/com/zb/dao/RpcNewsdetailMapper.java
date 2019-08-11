package com.zb.dao;

import com.zb.pojo.Newscomment;
import com.zb.pojo.Newsdetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/*
git config --global user.name 'liangdada123d沙发斯蒂芬斯蒂芬'
 */
@Mapper
public interface RpcNewsdetailMapper {

    public List<Newsdetail> getNewsdetailAll();

    public int delNewsdetailById(@Param("id") Integer id);

    public int delNewscommentByNewsId(@Param("newsId") Integer newsId);

    public int addNewscommentp(@Param("newsId") Integer newsId,
                               @Param("content") String content,
                               @Param("author") String author);
}
