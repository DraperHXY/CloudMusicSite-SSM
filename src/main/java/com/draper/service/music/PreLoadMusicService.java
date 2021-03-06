package com.draper.service.music;

import com.draper.dto.MusicInfo;

import java.util.List;

public interface PreLoadMusicService {

    int getMusicNum();

    String preDownloadImage(String name, String path);

    String preDownloadMusic(String name, String path);

    List<String> preDownloadAllImage(String path);

    List<String> preDownloadAllMusic(String path);

    List<MusicInfo> loadAllMusicInfo();
}
