package com.draper.web;

import com.draper.service.music.PreLoadMusicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/*") // url:/模块/资源/{id}/细分
public class IndexController {

    @Autowired
    private PreLoadMusicService preLoadMusicService;

    @RequestMapping(method = RequestMethod.GET)
    private ModelAndView indexPage() {
        int musicNum = preLoadMusicService.getMusicNum();
//        之所以不放入项目中争取数据与程序分离 ../webapps/CloudMusicSite-SSM/load_img/
        preLoadMusicService.preDownloadAllImage("../webapps/load_img/");
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("musicNum", musicNum);
        mav.addObject("musicInfoList", preLoadMusicService.loadAllMusicInfo());
//         index.jsp + model = ModelAndView
        return mav;// WEB-INF/jsp/"index".jsp
    }
}
