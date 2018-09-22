package com.draper.dao;

import com.draper.entity.Music;
import org.apache.ibatis.annotations.Param;

import java.io.File;
import java.sql.Blob;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

public interface MusicDao {

    void insertMusic(@Param("name") String name, @Param("musicData") Blob musicData, @Param("singer") String singer, @Param("duration") int duration, @Param("imageData") Blob imageData);

    Music queryByName(@Param("name") String name);

    String querySingerByName(@Param("name") String name);

    int queryMusicNum();

    Map queryMusicData(@Param("name") String name);

    Map queryImageData(@Param("name") String name);

    List<String> queryAllMusicName();

    List<String> findMusicNameList();
}
