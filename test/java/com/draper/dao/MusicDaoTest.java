package com.draper.dao;

import com.draper.BaseTest;
import com.draper.dao.util.Mp3Util;
import com.draper.entity.Music;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.sql.ResultSet;
import java.util.List;

public class MusicDaoTest extends BaseTest {

    @Autowired
    private MusicDao musicDao;

    @Test
    public void testInsertMusic() throws Exception {
        Music music = Mp3Util.getMP3Info(new File("test/resource/Imagine Dragons - Demons.mp3"));

        musicDao.insertMusic(
                music.getName(),
                music.getMusicData(),
                music.getSinger(),
                music.getDuration(),
                music.getImageData()
        );
    }

    @Test
    public void testQueryByName() throws Exception {
        Music music = musicDao.queryByName("Too Bad");
        System.out.println(music.getName());
    }

    @Test
    public void testQuerySingerByName() throws Exception {
        System.out.println(musicDao.querySingerByName("Dreaming Alone"));
    }

    @Test
    public void testQueryMusicNum() throws Exception {
        System.out.println(musicDao.queryMusicNum());
    }

    @Test
    public void testQueryAllMusicName() throws Exception {
        List<String> nameList = musicDao.queryAllMusicName();
        for (String s : nameList) {
            System.out.println(s);
        }
    }

}
