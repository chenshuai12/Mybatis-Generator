package com.csvideo.pojo;

public class UserReport {
    private String userReportId;

    private String dealUserId;

    private String userId;

    private String cause;

    private String date;

    public String getUserReportId() {
        return userReportId;
    }

    public void setUserReportId(String userReportId) {
        this.userReportId = userReportId == null ? null : userReportId.trim();
    }

    public String getDealUserId() {
        return dealUserId;
    }

    public void setDealUserId(String dealUserId) {
        this.dealUserId = dealUserId == null ? null : dealUserId.trim();
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