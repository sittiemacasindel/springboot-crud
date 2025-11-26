package com.appdev.girlcode.vargasg5.dto;

public class ImportDataDTO {
    
    private Integer number;
    private String offeringDept;
    private String subject;
    private String subjectTitle;
    private Integer creditedUnits;
    private String section;
    private String schedule;
    private String room;
    private Integer totalSlots;
    private Integer enrolled;
    private Integer assessed;
    private String isClosed;

    // Constructors
    public ImportDataDTO() {
    }

    public ImportDataDTO(Integer number, String offeringDept, String subject, String subjectTitle, 
                         Integer creditedUnits, String section, String schedule, String room, 
                         Integer totalSlots, Integer enrolled, Integer assessed, String isClosed) {
        this.number = number;
        this.offeringDept = offeringDept;
        this.subject = subject;
        this.subjectTitle = subjectTitle;
        this.creditedUnits = creditedUnits;
        this.section = section;
        this.schedule = schedule;
        this.room = room;
        this.totalSlots = totalSlots;
        this.enrolled = enrolled;
        this.assessed = assessed;
        this.isClosed = isClosed;
    }

    // Getters and Setters
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getOfferingDept() {
        return offeringDept;
    }

    public void setOfferingDept(String offeringDept) {
        this.offeringDept = offeringDept;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubjectTitle() {
        return subjectTitle;
    }

    public void setSubjectTitle(String subjectTitle) {
        this.subjectTitle = subjectTitle;
    }

    public Integer getCreditedUnits() {
        return creditedUnits;
    }

    public void setCreditedUnits(Integer creditedUnits) {
        this.creditedUnits = creditedUnits;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Integer getTotalSlots() {
        return totalSlots;
    }

    public void setTotalSlots(Integer totalSlots) {
        this.totalSlots = totalSlots;
    }

    public Integer getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(Integer enrolled) {
        this.enrolled = enrolled;
    }

    public Integer getAssessed() {
        return assessed;
    }

    public void setAssessed(Integer assessed) {
        this.assessed = assessed;
    }

    public String getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(String isClosed) {
        this.isClosed = isClosed;
    }
}
