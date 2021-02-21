package cn.roycent.bhsyxx.time.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.Map;

@Service
public class TimeService {

    public Map<String, Object> getTime() {
        Map<String, Object> res = new HashMap<>();
        res.put("code", 200);
        LocalDateTime now = LocalDateTime.now();
        res.put("timeStamp", now.toInstant(ZoneOffset.of("+8")).toEpochMilli());
        res.put("timeFormat", now);
        return res;
    }
}
