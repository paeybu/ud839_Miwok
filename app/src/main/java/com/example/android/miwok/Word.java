package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;
    private int mSoundResourceId;

    public Word(String defaultTranslation, String miwokTranslation ) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId ) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    public int getSoundResourceId() {
        return mSoundResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int soundResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mSoundResourceId = soundResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
