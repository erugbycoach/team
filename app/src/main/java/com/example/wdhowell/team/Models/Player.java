package com.example.wdhowell.team.Models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by wdhow on 11/16/2017.
 */

public class Player extends Object implements Parcelable {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("fname")
    @Expose
    private String fName;
    @SerializedName("lname")
    private String lName;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("weight")
    @Expose
    private Integer weight;
    @SerializedName("kicker")
    @Expose
    private Boolean isKicker;
    @SerializedName("captain")
    @Expose
    private Boolean isCaptain;
    @SerializedName("player_image")
    @Expose
    private String playerImage;

    public static final Creator<Player> CREATOR = new Creator<Player>() {
        @Override
        public Player createFromParcel(Parcel in) {
            Player instance = new Player();
            instance.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.fName = ((String) in.readValue((String.class.getClassLoader())));
            instance.lName = ((String) in.readValue((String.class.getClassLoader())));
            instance.height = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.weight = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.isKicker = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            instance.isCaptain = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            instance.playerImage = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        @Override
        public Player[] newArray(int size) {
            return new Player[size];
        }
    };

        //Setters and Getters


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Boolean getKicker() {
        return isKicker;
    }

    public void setKicker(Boolean kicker) {
        isKicker = kicker;
    }

    public Boolean getCaptain() {
        return isCaptain;
    }

    public void setCaptain(Boolean captain) {
        isCaptain = captain;
    }

    public String getPlayerImage() {
        return playerImage;
    }

    public void setPlayerImage(String playerImage) {
        this.playerImage = playerImage;
    }

    @Override
    public void writeToParcel(Parcel dest, int i) {
        dest.writeValue(id);
        dest.writeValue(fName);
        dest.writeValue(lName);
        dest.writeValue(height);
        dest.writeValue(weight);
        dest.writeValue(isKicker);
        dest.writeValue(isCaptain);
        dest.writeValue(playerImage);
    }

    @Override
    public int describeContents() {
        return 0;
    }
}
