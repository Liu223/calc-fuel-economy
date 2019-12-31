package com.example.fuelconsumptioncalc;

import org.thymeleaf.util.StringUtils;

import javax.ws.rs.FormParam;
import java.io.Serializable;

public class CalcForm implements Serializable {

    public class Error {
        public boolean adEmpty;
    }

    public Error error = new Error();
    //  入力フォームの名前
    @FormParam("kyuyu_ryo")
    public int kyuyuRyo;

    //  入力フォームの名前
    @FormParam("trip_meter_chi")
    public int tripMeterChi;

    public void validateForRegister() {
        error.adEmpty = StringUtils.isEmpty(String.valueOf(kyuyuRyo));

        int checkedKyuyuRyo = kyuyuRyo;
    }
}