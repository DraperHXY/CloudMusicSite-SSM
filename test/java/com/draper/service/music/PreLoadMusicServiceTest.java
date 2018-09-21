package com.draper.service.music;

import com.draper.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PreLoadMusicServiceTest extends BaseTest {

    @Autowired
    private PreLoadMusicService preLoadMusicService;

    @Test
    public void testGetMusicNum() {
        System.out.println(preLoadMusicService.getMusicNum());
    }

    @Test
    public void testPreDownloadImage() {
        String name = "Too Bad";
        String path = "src/";
        preLoadMusicService.preDownloadImage(name, path);
    }

    @Test
    public void testPreDownloadMusic() {
        String name = "Too Bad";
        String path = "src/";
        preLoadMusicService.preDownloadMusic(name, path);
    }

    @Test
    public void testQueryAllMusicName() {

    }
}
