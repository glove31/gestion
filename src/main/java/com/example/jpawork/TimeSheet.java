package com.example.jpawork;
import javax.persistence.*;
import java.sql.Time;

@Entity
public class TimeSheet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String activity;
    private Time startTime;
    private Time endTime;
    private Boolean isAdditionalHour;

    @ManyToOne
    private Project project;

    @ManyToOne
    private User user;

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public Boolean getAdditionalHour() {
        return isAdditionalHour;
    }

    public void setAdditionalHour(Boolean additionalHour) {
        isAdditionalHour = additionalHour;
    }
}
