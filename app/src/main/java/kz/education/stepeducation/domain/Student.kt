package kz.education.stepeducation.domain

import android.os.Parcel
import android.os.Parcelable

class Student : Parcelable{

    var name: String? = ""

    var description: String? = ""

    constructor()

    constructor(parcel: Parcel)  {
        name = parcel.readString()
        description = parcel.readString()
    }

    constructor(name: String?, description: String?){
        this.name = name
        this. description = description
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(description)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Student> {
        override fun createFromParcel(parcel: Parcel): Student {
            return Student(parcel)
        }

        override fun newArray(size: Int): Array<Student?> {
            return arrayOfNulls(size)
        }
    }
}