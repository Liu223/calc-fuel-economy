package com.example.fuelconsumptioncalc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalcController {
    //    入力
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView sed(@RequestParam("kyuyuRyo") int kyuyuRyo, @RequestParam("tripMeterChi") int tripMeterChi, ModelAndView mav) {
        CalcService calcService = new CalcService();
        int result = calcService.calc(kyuyuRyo, tripMeterChi);

        mav.setViewName("index");

        //計算結果
        mav.addObject("msgResult", "燃費は【" + result + "】km/Lです");
        mav.addObject("valueKyuyuRyo", kyuyuRyo);
        //  トリップメーター値
        mav.addObject("msgTripMeterChi");
        mav.addObject("valueTripMeterChi", tripMeterChi);

        return mav;
    }

    //  出力
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(ModelAndView mav) {

        mav.setViewName("index");
        //  給油量
        mav.addObject("msgResult", "<--ここに燃費を表示します-->");

        return mav;
    }
}
