package com.mtx.sell.connector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component(value  ="conference_connector")
public class ConferenceConnector {

    @Autowired
    private RestTemplate restTemplate;

    public Object getConfById(Integer id){
        String url = "http://localhost:9898/sj/conference/getConfSettings";
        Object o = restTemplate.getForObject(url, Object.class);
        return o;
    }
}
