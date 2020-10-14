package com.ttit.slice;

import com.ttit.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.TickTimer;


public class TickTimerSlice extends AbilitySlice {

    private boolean isRunning = false;

    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ticktimer_layout);
        TickTimer tickTimer = (TickTimer) findComponentById(ResourceTable.Id_tickTimer);
        tickTimer.start();
        isRunning = true;

        tickTimer.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                if (isRunning) {
                    tickTimer.stop();
                } else {
                    tickTimer.start();
                }
                isRunning = !isRunning;
            }
        });
    }
}
