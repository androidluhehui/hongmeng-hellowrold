package com.ttit.slice;

import com.ttit.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;

public class ButtonSlice extends AbilitySlice {
    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_button_layout);

        Button button = (Button) findComponentById(ResourceTable.Id_btn);
        button.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                System.out.println("点击按钮！！！");
            }
        });
    }
}
