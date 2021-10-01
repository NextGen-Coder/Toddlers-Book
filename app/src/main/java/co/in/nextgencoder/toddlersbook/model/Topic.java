package co.in.nextgencoder.toddlersbook.model;

public class Topic {
    private int primaryImageResId;
    private int secondaryImageResId;
    private int primarySoundResId;
    private int secondarySoundResId;

    public Topic() {
    }

    public Topic(int primaryImageResId, int secondaryImageResId, int primarySoundResId) {
        this.primaryImageResId = primaryImageResId;
        this.secondaryImageResId = secondaryImageResId;
        this.primarySoundResId = primarySoundResId;
    }

    public Topic(int primaryImageResId, int secondaryImageResId, int primarySoundResId, int secondarySoundResId) {
        this.primaryImageResId = primaryImageResId;
        this.secondaryImageResId = secondaryImageResId;
        this.primarySoundResId = primarySoundResId;
        this.secondarySoundResId = secondarySoundResId;
    }

    public int getPrimaryImageResId() {
        return primaryImageResId;
    }

    public void setPrimaryImageResId(int primaryImageResId) {
        this.primaryImageResId = primaryImageResId;
    }

    public int getSecondaryImageResId() {
        return secondaryImageResId;
    }

    public void setSecondaryImageResId(int secondaryImageResId) {
        this.secondaryImageResId = secondaryImageResId;
    }

    public int getPrimarySoundResId() {
        return primarySoundResId;
    }

    public void setPrimarySoundResId(int primarySoundResId) {
        this.primarySoundResId = primarySoundResId;
    }

    public int getSecondarySoundResId() {
        return secondarySoundResId;
    }

    public void setSecondarySoundResId(int secondarySoundResId) {
        this.secondarySoundResId = secondarySoundResId;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "primaryImageResId=" + primaryImageResId +
                ", secondaryImageResId=" + secondaryImageResId +
                ", primarySoundResId=" + primarySoundResId +
                ", secondarySoundResId=" + secondarySoundResId +
                '}';
    }
}
