package com.draper.dao;

import com.draper.BaseTest;
import com.draper.dao.util.Mp3Util;
import com.draper.entity.Music;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;

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
}
