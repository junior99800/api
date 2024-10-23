package com.eventostec.api.service;

import org.springframework.stereotype.Service;

import com.eventostec.api.domain.evento.Event;
import com.eventostec.api.domain.evento.EventRequestDTO;

@Service
public class EventService {
    public Event creaEvent(EventRequestDTO data){
    String imgUrl = null;
        if(data.image() != null){
            imgUrl this.uploadImg(data.image());
        }
        Event newEvent = new Event();
        newEvent.setTitle(data.title());
        newEvent.setDescription(data.description());
        newEvent.setEventUrl(data.eventUrl());
        newEvent.setDate(new Date(data.date()));
        newEvent.setImgUrl(imgUrl);

        return newEvent;
    }

    private String uploadImg(MultipartFile multipartFile) {
        return "";
    }
}
