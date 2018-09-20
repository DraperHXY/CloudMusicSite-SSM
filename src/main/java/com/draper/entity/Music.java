package com.draper.entity;

import java.sql.Blob;

public class Music {

    private String name;//歌曲名字
    private Blob musicData;//歌曲
    private String singer;//歌手名字
    private Integer duration;//时长（秒）
    private Blob imageData;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Blob getMusicData() {
        return musicData;
    }

    public void setMusicData(Blob musicData) {
        this.musicData = musicData;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Blob getImageData() {
        return imageData;
    }

    public void setImageData(Blob imageData) {
        this.imageData = imageData;
    }

    @Override
    public String toString() {
        return "name:" + name + ",singer:" + singer + ",duration:" + duration;
    }

    /**
     * 返回hh:MM:ss形式
     *
     * @return
     */
    public String getDurationFormat() {
        if (duration / 60 >= 60) {
            return String.format("%02d", duration / 3600) + String.format("%02d", (duration % 3600) / 60) + ":" + String.format("%02d", duration % 60);
        } else {
            return "00:" + String.format("%02d", duration / 60) + ":" + String.format("%02d", duration % 60);
        }
    }
}
