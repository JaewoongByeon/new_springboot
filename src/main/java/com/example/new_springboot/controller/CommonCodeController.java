package com.example.new_springboot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        List<Object> resultList = new ArrayList<Object>();
        Map<String, Object> resultMap = new HashMap<String, Object>();
        if ("view".equals(action)) {
            viewName = viewName + action;
            resultMap = paramMap;
            modelandView.setViewName(viewName);
            modelandView.addObject("resultMap", resultMap);
        } else if ("search".equals(action)) {
            Map<String, Object> data00 = new HashMap<String, Object>();
            data00.put("QUERY", paramMap.get("QUERY"));
            data00.put("RULE", paramMap.get("RULE"));
            Map<String, Object> data01 = new HashMap<String, Object>();
            data01.put("NAME", "name 01");
            data01.put("COMMON_CODE_ID", "490293232849");
            data01.put("DESCRIPTION", "anything DESCRIPTION");
            Map<String, Object> data02 = new HashMap<String, Object>();
            data02.put("NAME", "name 02");
            data02.put("COMMON_CODE_ID", "555514256247");
            data02.put("DESCRIPTION", "anything other DESCRIPTION");
            Map<String, Object> data03 = new HashMap<String, Object>();
            data03.put("NAME", "name 03");
            data03.put("COMMON_CODE_ID", "265425759512");
            data03.put("DESCRIPTION", "anything another DESCRIPTION");
            viewName = viewName + action;
            modelandView.setViewName(viewName);
            resultList.add(data01);
            resultList.add(data02);
            resultList.add(data03);
            modelandView.addObject("resultList1", data00);
            if (data00.get("RULE") == "0") {
                List<Object> searchList = new ArrayList<Object>();
                for (Object a : resultList) {
                    if (((Map<String, Object>) a).get("NAME").toString().contains(data00.get("QUERY").toString())) {
                        searchList.add(a);
                        modelandView.addObject("resultList2", searchList);
                    }
                }
            } else if (data00.get("RULE") == "1") {
                List<Object> searchList = new ArrayList<Object>();
                for (Object a : resultList) {
                    if (((Map<String, Object>) a).get("COMMON_CODE_ID").toString()
                            .contains(data00.get("QUERY").toString())) {
                        searchList.add(a);
                        modelandView.addObject("resultList2", searchList);
                    }
                }
            } else if (data00.get("RULE") == "2") {
                List<Object> searchList = new ArrayList<Object>();
                for (Object a : resultList) {
                    if (((Map<String, Object>) a).get("DESCRIPTION").toString()
                            .contains(data00.get("QUERY").toString())) {
                        searchList.add(a);
                        modelandView.addObject("resultList2", searchList);
                    }
                }
            } else {
                modelandView.addObject("resultList2", resultList);
            }
        }
        return modelandView;
    }
}