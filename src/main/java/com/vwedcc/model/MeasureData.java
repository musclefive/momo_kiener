package com.vwedcc.model;

import java.util.Date;

/**
 * Created by Chao.Cui.VWED on 2017/8/5.
 */
public class MeasureData {
    private int ID;
    private String  PartNumber;
    private String Station;
    private String Variety;
    private Date   Date;
    private Boolean Ok;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPartNumber() {
        return PartNumber;
    }

    public void setPartNumber(String partNumber) {
        PartNumber = partNumber;
    }

    public String getStation() {
        return Station;
    }

    public void setStation(String station) {
        Station = station;
    }

    public String getVariety() {
        return Variety;
    }

    public void setVariety(String variety) {
        Variety = variety;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public Boolean getOk() {
        return Ok;
    }

    public void setOk(Boolean ok) {
        Ok = ok;
    }
}
