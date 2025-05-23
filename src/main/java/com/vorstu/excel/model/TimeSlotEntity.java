package com.vorstu.excel.model;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "time_slot")
public class TimeSlotEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalTime startTime;

    private Long startLongTime;

    private LocalTime endTime;

    private Long endLongTime;

    private String value;

    private Boolean odd;

    @ManyToOne
    @JoinColumn(name = "work_day_id", nullable = false)
    private WorkDayEntity workDay;

    @ManyToOne
    @JoinColumn(name = "group_id", nullable = false)
    private GroupEntity group;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public Long getStartLongTime() {
        return startLongTime;
    }

    public void setStartLongTime(Long startLongTime) {
        this.startLongTime = startLongTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Long getEndLongTime() {
        return endLongTime;
    }

    public void setEndLongTime(Long endLongTime) {
        this.endLongTime = endLongTime;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean getOdd() {
        return odd;
    }

    public void setOdd(Boolean odd) {
        this.odd = odd;
    }

    public WorkDayEntity getWorkDay() {
        return workDay;
    }

    public void setWorkDay(WorkDayEntity workDay) {
        this.workDay = workDay;
    }

    public GroupEntity getGroup() {
        return group;
    }

    public void setGroup(GroupEntity group) {
        this.group = group;
    }

    public TimeSlotEntity() {
    }

    public TimeSlotEntity(LocalTime startTime, LocalTime endTime, String value, Boolean odd, GroupEntity group) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.value = value;
        this.odd = odd;
        this.group = group;
    }
}
