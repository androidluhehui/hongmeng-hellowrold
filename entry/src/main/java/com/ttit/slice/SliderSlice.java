package com.ttit.slice;

import com.ttit.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Slider;

public class SliderSlice extends AbilitySlice {
    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_slider_layout);

        Slider slider = (Slider) findComponentById(ResourceTable.Id_slider);
        slider.setValueChangedListener(new Slider.ValueChangedListener() {
            @Override
            public void onProgressUpdated(Slider slider, int i, boolean b) {
                System.out.println(slider.getProgress());
            }

            @Override
            public void onTouchStart(Slider slider) {
                System.out.println("onTouchStart");
            }

            @Override
            public void onTouchEnd(Slider slider) {
                System.out.println("onTouchEnd");
            }
        });
    }
}
