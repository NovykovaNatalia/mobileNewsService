package com.natlight.mobileNewsService.model;

import sun.util.calendar.BaseCalendar;

import java.awt.*;
import lombok.Data;

@Data
public class ArticleDTO {
    private Long id;
    private String title;
    private String body;
    private String author;
    private BaseCalendar.Date Date;
    private Image image;
}
