package com.draper.service.music.impl;

import com.draper.dao.MusicDao;
import com.draper.service.music.PreLoadMusicService;
import com.draper.service.music.UserDownloadMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDownloadMusicServiceImpl implements UserDownloadMusicService {

    @Autowired
    private PreLoadMusicService preLoadMusicService;

    @Override
    public String downloadMusic(String name, String path) {
        path = preLoadMusicService.preDownloadMusic(name, path);
        return path;
    }
}
