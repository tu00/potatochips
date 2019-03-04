package com.potatochips.controller;

import com.potatochips.dto.movieListDto;
import com.potatochips.service.movieListService;
import com.potatochips.utils.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "movielist")
public class movieListShowController {
    @Autowired
    private movieListService listService;


    @RequestMapping(value = "show",method = RequestMethod.GET)
    public List<movieListDto> show(){
        List<movieListDto> moviceList = listService.movieShow();
        return moviceList;
    }

    @RequestMapping(value = "delete",method = RequestMethod.DELETE)
    public BaseResult delete(int id){
        BaseResult result = listService.movieDelete(id);
        return result;
    }

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public BaseResult insert(movieListDto movice){
        BaseResult result = listService.movieInsert(movice);
        return result;
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    public BaseResult update(movieListDto movice){
        BaseResult result = listService.movieInsert(movice);
        return result;
    }
}
