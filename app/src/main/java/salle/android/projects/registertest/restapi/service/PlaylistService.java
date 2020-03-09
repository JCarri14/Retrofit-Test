package salle.android.projects.registertest.restapi.service;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import salle.android.projects.registertest.model.Playlist;
import salle.android.projects.registertest.model.UserRegister;

public interface PlaylistService {
    @POST("playlists")
    Call<Playlist> createPlaylist(@Body Playlist playlist, @Header("Authorization") String token);
}
