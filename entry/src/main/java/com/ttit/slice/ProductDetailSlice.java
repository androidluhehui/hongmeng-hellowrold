package com.ttit.slice;

import com.ttit.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;

public class ProductDetailSlice extends AbilitySlice {
    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_product_detail_layout);
        Button button = (Button) findComponentById(ResourceTable.Id_btn);
        button.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                present(new ProductListSlice(), new Intent());
            }
        });

        Intent in = new Intent();
        in.setParam("id", 123);
        setResult(in);
    }
}
