package com.potatochips.service;

import com.potatochips.dto.movieListDto;
import com.potatochips.utils.BaseResult;

import java.util.List;

public interface movieListService {
    List<movieListDto> movieShow();

    BaseResult movieDelete(int id);

    BaseResult movieInsert(movieListDto movice);
}
