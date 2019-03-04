package com.potatochips.dto;

import lombok.Data;

@Data
public class movieListDto {
    private int id;
    private String name;
    private String type;
    private String nation;
    private String language;
    private String filmlength;
    private double score;
    private String linktodouban;
    private String picture;
}
