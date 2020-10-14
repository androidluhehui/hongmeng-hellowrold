package com.ttit;

import com.ttit.slice.ButtonSlice;
import com.ttit.slice.ImageSlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;

public class OtherAbility extends Ability {
    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(ImageSlice.class.getName());

//        addActionRoute("action.other.button", ButtonSlice.class.getName());
        //System.out.println("我是OtherAbility");
       // addActionRoute("action.other.image", ImageSlice.class.getName());
    }
}
