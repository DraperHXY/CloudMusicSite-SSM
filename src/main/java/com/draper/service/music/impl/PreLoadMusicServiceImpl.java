package com.draper.service.music.impl;

import com.draper.dao.MusicDao;
import com.draper.dao.util.DBUtil;
import com.draper.service.music.PreLoadMusicService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class PreLoadMusicServiceImpl implements PreLoadMusicService {

    @Autowired
    private MusicDao musicDao;

    /**
     * 返回歌曲数量
     *
     * @return
     */
    @Override
    public int getMusicNum() {
        return musicDao.queryMusicNum();
    }

    @Override
    public String preDownloadImage(String name, String path) {
        File expectPath = new File(path);
        if (!expectPath.exists())
            expectPath.mkdir();
        path = path + name + ".jpg";
        File file = new File(path);
        if (file.exists())
            return path;

        byte[] imageData = (byte[]) musicDao.queryImageData(name).get("imageData");
        DBUtil.ByteToPath(imageData, path);

        return path;
    }

    @Override
    public String preDownloadMusic(String name, String path) {
        File expectPath = new File(path);
        if (!expectPath.exists())
            expectPath.mkdir();
        path = path + name + ".mp3";
        File file = new File(path);
        if (file.exists())
            return path;

        byte[] musicData = (byte[]) musicDao.queryMusicData(name).get("musicData");
        DBUtil.ByteToPath(musicData, path);

        return path;
    }

    @Override
    public List<String> preDownloadAllImage(String path) {
        List<String> nameList = musicDao.queryAllMusicName();
        List<String> pathList = new ArrayList<>();
        for (String name : nameList) {
            String imagePath = preDownloadImage(name, path);
            pathList.add(imagePath);
        }
        return pathList;
    }

    @Override
    public List<String> preDownloadAllMusic(String path) {
        List<String> nameList = musicDao.queryAllMusicName();
        List<String> pathList = new ArrayList<>();
        for (String name : nameList) {
            String musicPath = preDownloadMusic(name, path);
            pathList.add(musicPath);
        }
        return pathList;
    }


}
