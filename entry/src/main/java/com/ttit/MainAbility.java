package com.ttit;
//liuhaoran
import com.ttit.slice.*;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.TextField;

public class MainAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(ProductListSlice.class.getName());
//        super.setMainRoute(SliderSlice.class.getName());
        //super.setMainRoute(ButtonSlice.class.getName());
      //  addActionRoute("action.slider", SliderSlice.class.getName());

    }
}
