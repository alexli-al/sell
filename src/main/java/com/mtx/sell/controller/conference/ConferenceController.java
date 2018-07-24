package com.mtx.sell.controller.conference;

import com.mtx.sell.service.ConferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/conf")
public class ConferenceController {

    @Autowired
    private ConferenceService conferenceService;

    @GetMapping("/get/{id}") //634
    public Object getConfById(@PathVariable  Integer id){
        return conferenceService.getConferenceById(id);
    }
}
