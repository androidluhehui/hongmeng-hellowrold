package com.ttit.slice;

import com.ttit.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Clock;
import ohos.agp.components.Component;

public class ClockSlice extends AbilitySlice {
    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_clock_layout);
        Clock clock = (Clock) findComponentById(ResourceTable.Id_clock);
        clock.set24HourModeEnabled(false);
        //自己测试

        Button btn =(Button)findComponentById(ResourceTable.Id_btn);

        btn.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Intent in=new Intent();
                in.setAction("action.other.button");
                startAbility(in);
            }
        });

    }
}
