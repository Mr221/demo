package com.example.demo.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.DemoModel.User;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.Map;

@Service
public class DemoServiceImp implements DemoService {

    private Map map = new HashMap();

    @Override
    public String getID() {
        return null;
    }

    @Override
    public String getName(String ID) {
        return null;
    }

    @Override
    public String saveUser(String body) {
        if (!CollectionUtils.isEmpty(map)) {
            map.put("1", "直接返回");
            return JSONObject.toJSONString(map);
        }
        synchronized (this) {
            if (!CollectionUtils.isEmpty(map)) {
                map.put("2", "synchronized返回");
                return JSONObject.toJSONString(map);
            }
            map.put("3", body);
            return JSONObject.toJSONString(map);
        }
    }
}
