package com.example.lianfang.entity;

public class FinalGrade extends FinalGradeKey {
    private String semester;

    private Float checkClassAttendance;

    private Float checkHomeaworkAttendance;

    private Float midExam;

    private Float lastExam;

    private Float grades;

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester == null ? null : semester.trim();
    }

    public Float getCheckClassAttendance() {
        return checkClassAttendance;
    }

    public void setCheckClassAttendance(Float checkClassAttendance) {
        this.checkClassAttendance = checkClassAttendance;
    }

    public Float getCheckHomeaworkAttendance() {
        return checkHomeaworkAttendance;
    }

    public void setCheckHomeaworkAttendance(Float checkHomeaworkAttendance) {
        this.checkHomeaworkAttendance = checkHomeaworkAttendance;
    }

    public Float getMidExam() {
        return midExam;
    }

    public void setMidExam(Float midExam) {
        this.midExam = midExam;
    }

    public Float getLastExam() {
        return lastExam;
    }

    public void setLastExam(Float lastExam) {
        this.lastExam = lastExam;
    }

    public Float getGrades() {
        return grades;
    }

    public void setGrades(Float grades) {
        this.grades = grades;
    }
}