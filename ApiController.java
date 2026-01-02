package com.mtdb;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class ApiController {

    @GetMapping("/api/gold")
    public String gold() {
        return new RestTemplate().getForObject(
            "https://api.coingecko.com/api/v3/simple/price?ids=gold&vs_currencies=inr", 
            String.class);
    }

    @GetMapping("/api/silver")
    public String silver() {
        return new RestTemplate().getForObject(
            "https://api.coingecko.com/api/v3/simple/price?ids=silver&vs_currencies=inr", 
            String.class);
    }

    @GetMapping("/api/nifty")
    public String nifty() { return "{\"nifty\":\"22300\"}"; }

    @GetMapping("/api/sensex")
    public String sensex() { return "{\"sensex\":\"74000\"}"; }

    @GetMapping("/api/licnav")
    public String nav() { return "{\"nav\":\"Updated Daily\"}"; }
}
