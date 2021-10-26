package co.in.nextgencoder.toddlersbook.model;

import java.util.List;

import co.in.nextgencoder.toddlersbook.model.Option;

public class Question {

    private int imageId;
    private List<Option>options;
    private int answer;

    public Question() { }

    public Question(int imageId, List<Option> options, int answer) {
        this.imageId = imageId;
        this.options = options;
        this.answer = answer;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "imageId=" + imageId +
                ", options=" + options +
                '}';
    }
}