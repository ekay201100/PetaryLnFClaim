package com.enriqueed.lostandfound;

public interface OnImageUploadCallback {
    void onSuccess(String imageUrl);

    void onFailure();
}
