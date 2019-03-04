package com.potatochips.serviceimpl;

import com.potatochips.dao.movieListDao;
import com.potatochips.dto.movieListDto;
import com.potatochips.service.movieListService;
import com.potatochips.utils.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class movieListServiceimpl implements movieListService {
    @Autowired
    private movieListDao listDao;
    public List<movieListDto> movieShow() {
        List<movieListDto> moviceList = listDao.moviceShow();
        return moviceList;

    }

    public BaseResult movieDelete(int id) {
        if (id !=0) {
            listDao.deleteById(id);
            BaseResult result = BaseResult.success("删除成功");
            return result;
        }else{
            return BaseResult.fail("删除对象不能为空");
        }
    }

    public BaseResult movieInsert(movieListDto movice) {
        if (movice.getId()==0){
            listDao.insert(movice);
            return BaseResult.success("添加成功");
        }else{
            listDao.updateById(movice);
            return BaseResult.success("修改成功");
        }

    }
}
