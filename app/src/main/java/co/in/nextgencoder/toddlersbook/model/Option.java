package co.in.nextgencoder.toddlersbook.model;

public class Option {
    private int imageId;
    private Boolean isCorrect;

    public Option(int imageId, Boolean isCorrect) {
        this.imageId = imageId;
        this.isCorrect = isCorrect;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public Boolean getCorrect() {
        return isCorrect;
    }

    public void setCorrect(Boolean correct) {
        isCorrect = correct;
    }

    @Override
    public String toString() {
        return "Option{" +
                "imageId=" + imageId +
                ", isCorrect=" + isCorrect +
                '}';
    }
}
