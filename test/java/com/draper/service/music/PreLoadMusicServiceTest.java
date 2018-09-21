package com.draper.service.music;

import com.draper.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
        String path = "img/";
        preLoadMusicService.preDownloadImage(name, path);
    }

    @Test
    public void testPreDownloadMusic() {
        String name = "Too Bad";
        String path = "mp3/";
        preLoadMusicService.preDownloadMusic(name, path);
    }

    @Test
    public void testPreDownloadAllImage() {
        List<String> pathList = preLoadMusicService.preDownloadAllImage("img/");
        for (String s : pathList) {
            System.out.println(s);
        }
    }

    @Test
    public void testPreDownloadAllMusic() {
        List<String> pathList = preLoadMusicService.preDownloadAllMusic("mp3/");
        for (String s : pathList) {
            System.out.println(s);
        }
    }
}
