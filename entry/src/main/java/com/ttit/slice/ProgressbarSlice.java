package com.ttit.slice;

import com.ttit.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.ProgressBar;

public class ProgressbarSlice extends AbilitySlice {

    private int progress = 0;

    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_progressbar_layout);

        ProgressBar progressBar = (ProgressBar) findComponentById(ResourceTable.Id_progressbar);
        progressBar.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                progress += 10;
                progressBar.setProgressValue(progress);
            }
        });

    }
}
