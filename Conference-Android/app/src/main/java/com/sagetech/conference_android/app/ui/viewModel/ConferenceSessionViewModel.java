package com.sagetech.conference_android.app.ui.viewModel;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by carlushenry on 3/15/15.
 */
public class ConferenceSessionViewModel {
    private static final SimpleDateFormat DAY_FORMATTER = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.US);
    private static final SimpleDateFormat TIME_FORMATTER = new SimpleDateFormat("h:mm a", Locale.US);


    private Long id;
    private String title;
    private String room;
    private Date startDttm;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDay() {
        return DAY_FORMATTER.format(startDttm);
    }

    public String getTime() {
        return TIME_FORMATTER.format(startDttm);
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setStartDttm(Date startDttm) {
        this.startDttm = startDttm;
    }

}
