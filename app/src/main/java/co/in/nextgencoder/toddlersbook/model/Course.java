package co.in.nextgencoder.toddlersbook.model;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String className;
    private String subjectName;
    private List<Topic> topics;
    private int size;

    public Course() { }

    public Course(String className, String subjectName, int size) {
        this.className = className;
        this.subjectName = subjectName;
        topics = new ArrayList<>();
        this.size = size;
    }

    public Course(String className, String subjectName, List<Topic> topics, int size) {
        this.className = className;
        this.subjectName = subjectName;
        this.topics = topics;
        this.size = size;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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
