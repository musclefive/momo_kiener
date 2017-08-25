package com.vwedcc.dao;

import com.vwedcc.model.MeasureData;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Chao.Cui.VWED on 2017/8/5.
 */
@Repository
public interface MeasureDataDAO {

    MeasureData selectMeasureDataById(@Param("ID") Long ID);

    List<MeasureData> selectAllMeasureData();
}
