package com.eventostec.api.domain.evento;

import org.springframework.web.multipart.MultipartFile;

public record EventRequestDTO(String title, String description, Long date, String city, String state, Boolean Remote,
        String eventUrl, MultipartFile image) {

}
