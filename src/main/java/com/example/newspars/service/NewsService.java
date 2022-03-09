package com.example.newspars.service;


import com.example.newspars.model.News;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NewsService {

    void save(News news);

    boolean isExist(String newsTitle);

    List<News> getAllNews();

}
