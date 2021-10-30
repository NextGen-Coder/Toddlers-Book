package co.in.nextgencoder.toddlersbook.model;

public class Scene {
    
    private int imageId;
    private int soundId;

    public Scene() { }

    public Scene(int imageId, int soundId) {
        this.imageId = imageId;
        this.soundId = soundId;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getSoundId() {
        return soundId;
    }

    public void setSoundId(int soundId) {
        this.soundId = soundId;
    }

    @Override
    public String toString() {
        return "Scene{" +
                "imageId=" + imageId +
                ", soundId=" + soundId +
                '}';
    }
}
