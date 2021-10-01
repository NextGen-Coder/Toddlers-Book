package co.in.nextgencoder.toddlersbook.model;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String className;
    private String subjectName;
    private List<Topic> topics;

    public Course() { }

    public Course(String className, String subjectName) {
        this.className = className;
        this.subjectName = subjectName;
        topics = new ArrayList<>();
    }

    public Course(String className, String subjectName, List<Topic> topics) {
        this.className = className;
        this.subjectName = subjectName;
        this.topics = topics;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    @Override
    public String toString() {
        return "Course{" +
                "className='" + className + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", topics=" + topics +
                '}';
    }
}
