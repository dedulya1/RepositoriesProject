package com.repositories.git.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GitDTO {
    private String name;
    private String html_url;
    private String description;
}