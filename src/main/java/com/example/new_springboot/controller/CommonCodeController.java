package com.example.new_springboot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/commonCode")
public class CommonCodeController {
    @RequestMapping(value = "/signup", method = { RequestMethod.GET, RequestMethod.POST })
    public void actionMethod() {
    }

    @RequestMapping(value = "/{action}", method = { RequestMethod.GET, RequestMethod.POST })
    public ModelAndView edit(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelandView) {
        String viewName = "/commonCode/";
        ArrayList<Object> resultList = new ArrayList<Object>();
        Map<String, Object> resultMap = new HashMap<String, Object>();
        if ("view".equals(action)) {
            viewName = viewName + action;
            resultMap = paramMap;
            modelandView.setViewName(viewName);
            modelandView.addObject("resultMap", resultMap);
        } else if ("search".equals(action)) {
            Map<String, Object> data01 = new HashMap<String, Object>();
            data01.put("QUERY", paramMap.get("QUERY"));
            data01.put("RULE", paramMap.get("RULE"));
            Map<String, Object> data02 = new HashMap<String, Object>();
            data02.put("NAME", "name 01");
            data02.put("COMMON_CODE_ID", "490293232849");
            data02.put("DESCRIPTION", "anything DESCRIPTION");
            viewName = viewName + action;
            modelandView.setViewName(viewName);
            resultList.add(data02);
            modelandView.addObject("resultList1", data01);
            modelandView.addObject("resultList2", resultList);
        } else {
            modelandView.setViewName(viewName);
        }
        return modelandView;
    }
}