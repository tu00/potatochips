package com.potatochips.dao;

import com.potatochips.dto.movieListDto;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface movieListDao {
    List<movieListDto> moviceShow();

    void deleteById(int id);

    void insert(movieListDto movice);

    void updateById(movieListDto movice);
}
