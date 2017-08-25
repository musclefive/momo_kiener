package com.vwedcc.service;

import com.vwedcc.model.MeasureData;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Chao.Cui.VWED on 2017/8/5.
 */

public interface MeasureDataService {
    List<MeasureData> getAllMeasureData();
}
