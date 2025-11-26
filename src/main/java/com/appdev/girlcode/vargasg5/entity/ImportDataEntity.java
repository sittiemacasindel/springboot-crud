package com.appdev.girlcode.vargasg5.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "import_data_table")
public class ImportDataEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dataId;

    @Column(name = "number_column")
    private Integer number;
    
    @Column(name = "offering_dept")
    private String offeringDept;

    @Column(name = "subject")
    private String subject;

    @Column(name = "subject_title")
    private String subjectTitle;

    @Column(name = "credited_units")
    private Integer creditedUnits;

    @Column(name = "section")
    private String section;

    @Column(name = "schedule", columnDefinition = "TEXT")
    private String schedule;

    @Column(name = "room")
    private String room;

    @Column(name = "total_slots")
    private Integer totalSlots;

    @Column(name = "enrolled")
    private Integer enrolled;

    @Column(name = "assessed")
    private Integer assessed;

    @Column(name = "is_closed")
    private String isClosed;

    // Constructors
    public ImportDataEntity() {
    }

    public ImportDataEntity(Integer number, String offeringDept, String subject, String subjectTitle,
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
    public Long getDataId() {
        return dataId;
    }

    public void setDataId(Long dataId) {
        this.dataId = dataId;
    }

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
