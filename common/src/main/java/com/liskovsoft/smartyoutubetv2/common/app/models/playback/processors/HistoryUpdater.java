package com.liskovsoft.smartyoutubetv2.common.app.models.playback.processors;

import com.liskovsoft.smartyoutubetv2.common.app.models.data.Video;
import com.liskovsoft.smartyoutubetv2.common.app.models.playback.PlayerEventListenerHelper;

public class HistoryUpdater extends PlayerEventListenerHelper {
    public HistoryUpdater() {
        
    }

    @Override
    public void onInit(Video item) {
        // save history
    }

    @Override
    public void onSuggestionItemClicked(Video item) {
        // save history
    }
}
