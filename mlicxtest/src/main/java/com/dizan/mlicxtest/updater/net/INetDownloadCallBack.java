package com.dizan.mlicxtest.updater.net;

import java.io.File;

public interface INetDownloadCallBack {

    void success(File apkFile);

    void progress(int progress);

    void failed(Throwable throwable);
}
