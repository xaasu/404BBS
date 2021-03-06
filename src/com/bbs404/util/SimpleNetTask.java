package com.bbs404.util;

import android.content.Context;
import com.bbs404.R;

public abstract class SimpleNetTask extends NetAsyncTask {
    protected SimpleNetTask(Context cxt) {
        super(cxt);
    }

    protected SimpleNetTask(Context cxt, boolean openDialog) {
        super(cxt, openDialog);
    }


    @Override
    protected void onPost(Exception e) {
        if (e != null) {
            e.printStackTrace();
            Utils.toast(ctx, R.string.pleaseCheckNetwork);
        } else {
            onSucceed();
        }
    }

    protected abstract void doInBack() throws Exception;

    protected abstract void onSucceed();
}
