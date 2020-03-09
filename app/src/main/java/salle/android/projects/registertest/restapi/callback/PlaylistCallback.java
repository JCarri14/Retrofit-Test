package salle.android.projects.registertest.restapi.callback;

import salle.android.projects.registertest.model.Playlist;

public interface PlaylistCallback {

    void onPlaylistCreated(Playlist playlist);
    void onPlaylistFailure(Throwable throwable);
}
