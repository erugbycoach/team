package com.example.wdhowell.team.Services;

import com.example.wdhowell.team.Models.Player;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by wdhow on 11/16/2017.
 */

public interface APIInterface {
    @GET("/json/player.json")
    Call<List<Player>> getPlayers();
}
