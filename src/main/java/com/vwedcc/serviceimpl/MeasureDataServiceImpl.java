package com.vwedcc.serviceimpl;

import com.vwedcc.dao.MeasureDataDAO;
import com.vwedcc.model.MeasureData;
import com.vwedcc.service.MeasureDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Chao.Cui.VWED on 2017/8/16.
 */
@Service
public class MeasureDataServiceImpl implements MeasureDataService{
    @Resource
    private MeasureDataDAO measureDataDAO;

    public List<MeasureData> getAllMeasureData() {
        return measureDataDAO.selectAllMeasureData();
    }
}
