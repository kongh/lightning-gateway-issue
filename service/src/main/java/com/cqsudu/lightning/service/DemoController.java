package com.cqsudu.lightning.service;

import com.google.common.collect.Maps;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DemoController {

    @GetMapping(value = "/api/service/test.json")
    public Map<String, String> test() {
        Map<String, String> map = Maps.newHashMap();
        map.put("gateway", "reset connect demo");
        return map;
    }
}
