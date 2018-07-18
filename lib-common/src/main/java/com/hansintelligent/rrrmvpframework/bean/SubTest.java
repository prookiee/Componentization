package com.hansintelligent.rrrmvpframework.bean;

import android.os.Parcel;

/**
 * Created by brin on 2018/7/3.
 */

public class SubTest extends Test {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.name);
        dest.writeString(this.age);
    }

    public SubTest() {
    }

    protected SubTest(Parcel in) {
        super(in);
        this.name = in.readString();
        this.age = in.readString();
    }

    public static final Creator<SubTest> CREATOR = new Creator<SubTest>() {
        @Override
        public SubTest createFromParcel(Parcel source) {
            return new SubTest(source);
        }

        @Override
        public SubTest[] newArray(int size) {
            return new SubTest[size];
        }
    };
}
