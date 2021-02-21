package cn.roycent.bhsyxx.time.controller;

import cn.roycent.bhsyxx.time.service.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Map;

@RestController
public class TimeController {

    private TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("/time")
    public Mono<Map<String, Object>> getTime() {
        return Mono.just(timeService.getTime());
    }
}
