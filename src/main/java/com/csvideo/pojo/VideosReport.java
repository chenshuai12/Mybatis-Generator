package com.csvideo.pojo;

public class VideosReport {
    private String videoReportId;

    private String dealVedeoId;

    private String userId;

    private String cause;

    private String date;

    public String getVideoReportId() {
        return videoReportId;
    }

    public void setVideoReportId(String videoReportId) {
        this.videoReportId = videoReportId == null ? null : videoReportId.trim();
    }

    public String getDealVedeoId() {
        return dealVedeoId;
    }

    public void setDealVedeoId(String dealVedeoId) {
        this.dealVedeoId = dealVedeoId == null ? null : dealVedeoId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause == null ? null : cause.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }
}