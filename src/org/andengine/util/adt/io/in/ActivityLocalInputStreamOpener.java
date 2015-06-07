package org.andengine.util.adt.io.in;

import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;

public class ActivityLocalInputStreamOpener implements IInputStreamOpener {
    private final Activity activity;
    private final String localUrl;

    public ActivityLocalInputStreamOpener(final Activity activity, final String localUrl) {
        this.activity = activity;
        this.localUrl = localUrl;
    }

    @Override
    public InputStream open() throws IOException {
        return activity.openFileInput(localUrl);
    }

    public void delete() throws IOException {
        activity.deleteFile(localUrl);
    }

    public String getLocalUrl() {
        return localUrl;
    }


}