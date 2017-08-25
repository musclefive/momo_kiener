package com.vwedcc.controller;

import com.vwedcc.model.MeasureData;
import com.vwedcc.service.MeasureDataService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * Created by Chao.Cui.VWED on 2017/8/5.
 */
@Controller
@RequestMapping("/measure")
public class MeasureDataController {

    private Logger log = Logger.getLogger(MeasureDataController.class);

    //映射访问路径
//    @RequestMapping("/show")
//    public String index(Model model){
//        //Spring MVC会自动实例化一个Model对象用于向视图中传值
//        model.addAttribute("message", "这是通过注解定义的一个控制器中的Action");
//        //返回视图位置
//        return "test_1";
//    }
    @Autowired
    private MeasureDataService measureDataService;

    @ResponseBody
    @RequestMapping("/show")
    public List<MeasureData> showMeasureData(HttpServletRequest request,Model model){
        log.info("query all the measure data");
        List<MeasureData> measureDataList = measureDataService.getAllMeasureData();
        model.addAttribute("measureDataList", measureDataList);
        log.info("end query all the measure data");

        return measureDataList;
    }

}
