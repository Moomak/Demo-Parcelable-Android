package com.wordpress.moomak.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Moomak on 29/1/2558.
 */
public class TestParcelable implements Parcelable {

    public static final Parcelable.Creator<TestParcelable> CREATOR = new Parcelable.Creator<TestParcelable>() {
        public TestParcelable createFromParcel(Parcel in) {
            return new TestParcelable(in);
        }

        public TestParcelable[] newArray(int size) {
            return new TestParcelable[size];
        }
    };
    String a = "Test";

    public TestParcelable() {

    }

    public TestParcelable(Parcel p) {
        a = p.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(a);
    }
}
