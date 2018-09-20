package com.draper.dao.util;

import com.draper.entity.Music;
import org.junit.Test;

import java.io.File;

public class Mp3UtilTest {

    @Test
    public void testGetMP3Info() {
        Music music = Mp3Util.getMP3Info(new File("test/resource/Imagine Dragons - Demons.mp3"));
        System.out.println(music.getName());
    }
}
