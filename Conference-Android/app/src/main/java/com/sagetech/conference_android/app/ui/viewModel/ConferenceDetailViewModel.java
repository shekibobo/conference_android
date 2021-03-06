package com.sagetech.conference_android.app.ui.viewModel;

import com.sagetech.conference_android.app.R;
import com.sagetech.conference_android.app.model.ConferenceData;

/**
 * Created by carlushenry on 4/2/15.
 */
public class ConferenceDetailViewModel {

    private final ConferenceData confData;

    public ConferenceDetailViewModel(ConferenceData confData) {
        this.confData = confData;
    }

    public String getName() {
        return confData.getName();
    }

    public String getDateInformation() {
        return String.format("%s %d - %d %d", "May", 23, 24, 2015);
    }

    public String getFullDescription() {
        return confData.getFullDesc();
    }

    public String getImageUrl() {
        return confData.getImageUrl();
    }

    public String getConferenceContactPerson() {
        return "Mahmoud Ahmadinejad";
    }

}
