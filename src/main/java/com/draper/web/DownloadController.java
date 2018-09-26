package com.draper.web;

import com.draper.service.music.UserDownloadMusicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.*;

@Controller
@RequestMapping("/download")
public class DownloadController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserDownloadMusicService userDownloadMusicService;

    @RequestMapping(value = "/music/{musicName}", method = RequestMethod.GET)
    private ResponseEntity<byte[]> downloadMusic(@PathVariable String musicName) throws IOException {
        //将音乐下载到指定位置
        String path = userDownloadMusicService.downloadMusic(musicName, "../webapps/load_music/");

        //获取输入流读入下载数据
        File file = new File(path);
        byte[] body = null;
        InputStream inputStream = new FileInputStream(file);
        long length = inputStream.available();
        body = new byte[(int) length];
        inputStream.read(body);

        //设置响应头
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.valueOf("application/audio"));
        httpHeaders.setContentLength(length);
        httpHeaders.add("Content-Disposition", "attachment; filename=" + musicName + ".mp3");

        HttpStatus statusCode = HttpStatus.OK;

        ResponseEntity<byte[]> entity = new ResponseEntity<>(body, httpHeaders, statusCode);
        return entity;
    }

}
