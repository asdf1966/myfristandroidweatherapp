package com.example.administrator.myfristandroidweatherapp.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/1/9.
 */

public class County extends DataSupport {
    private  int id;
    private  String countyame;
    private  String weatherId;
    private  int cityId;
    public int getId(){
        return  id;
    }

    public  void  setId(int  id){
        this.id=id;
    }
    public  String getCountyame(){
        return  countyame;
    }
    public  void  setCountyame(String countyNmae){
        this.countyame=countyNmae;
    }
    public  String getWeatherId(){
        return  weatherId;
    }
    public  void  setWeatherId(String weatherId){
        this.weatherId =weatherId;
    }
    public int getCityId(){
        return  cityId;
    }

    public  void  setCityId(int  cityId){
        this.cityId=cityId;
    }

}
