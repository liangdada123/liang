package com.zb.service;

import com.zb.pojo.Newsdetail;

import java.util.List;

public interface RpcNewsdetailService {

    public List<Newsdetail> getNewsdetailAll();

    public int delNewsdetailById(Integer id);

    public int delNewscommentByNewsId(Integer newsId);

    public int addNewscommentp(Integer newsId,
                               String content,
                               String author);
}
