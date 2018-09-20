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

//    @Test
//    public void testQueryById() throws Exception {
//        long bookId = 1000;
//        Book book = bookDao.queryById(bookId);
//        System.out.println(book);
//    }

    @Test
    public void testInsert() throws Exception {
        Music music = Mp3Util.getMP3Info(new File("test/resource/Imagine Dragons - Demons.mp3"));

        musicDao.insert(
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

    public static void main(String[] args) {
        File file = new File("Imagine Dragons - Demons.mp3");
        System.out.println(file.getPath());
    }

}
