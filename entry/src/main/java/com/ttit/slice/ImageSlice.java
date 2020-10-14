package com.ttit.slice;

import com.ttit.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.Image;

public class ImageSlice extends AbilitySlice {
    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_image_layout);
        Image img = (Image) findComponentById(ResourceTable.Id_img);
//        img.setClipGravity(Image.GRAVITY_RIGHT);
        img.setScaleMode(Image.ScaleMode.STRETCH);
    }
}
