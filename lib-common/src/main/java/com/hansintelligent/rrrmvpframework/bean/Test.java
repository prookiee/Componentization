package com.hansintelligent.rrrmvpframework.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by brin on 2018/6/30.
 */

public class Test implements Parcelable {

    protected String name;
    protected String age;

    public Test() {
    }

    public static final Creator<Test> CREATOR = new Creator<Test>() {
        @Override
        public Test createFromParcel(Parcel in) {
            return new Test(in);
        }

        @Override
        public Test[] newArray(int size) {
            return new Test[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.age);
    }

    protected Test(Parcel in) {
        this.name = in.readString();
        this.age = in.readString();
    }

}
