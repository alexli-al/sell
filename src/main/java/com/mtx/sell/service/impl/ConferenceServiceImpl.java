package com.mtx.sell.service.impl;

import com.mtx.sell.connector.ConferenceConnector;
import com.mtx.sell.service.ConferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConferenceServiceImpl implements ConferenceService {

    @Autowired
    ConferenceConnector conferenceConnector;

    @Override
    public Object getConferenceById(Integer id) {
            Object o = conferenceConnector.getConfById(id);
            return o;
    }
}
