package com.ttit.slice;

import com.ttit.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;

public class ProductListSlice extends AbilitySlice {
    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_product_list_layout);
        Button button = (Button) findComponentById(ResourceTable.Id_btn);
        Button button2 = (Button) findComponentById(ResourceTable.Id_btn2);
        Button button3 = (Button) findComponentById(ResourceTable.Id_btn3);
        button.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                present(new ProductDetailSlice(), new Intent());
            }
        });
        button2.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                presentForResult(new ProductDetailSlice(), new Intent(), 0);
            }
        });
        button3.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Intent in = new Intent();
                in.setAction("action.other.button");
                startAbility(in);
            }
        });
    }

    @Override
    protected void onResult(int requestCode, Intent resultIntent) {
        if (requestCode == 0) {
            int id = resultIntent.getIntParam("id", -1);
            System.out.println("回传会的数据：id =" + id);
        }
    }
}
