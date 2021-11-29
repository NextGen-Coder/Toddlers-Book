package co.in.nextgencoder.toddlersbook.model;

import java.util.ArrayList;
import java.util.List;

public class Story {

    private List<Scene> scenes;

    public Story() {
        scenes = new ArrayList<>();
    }

    public Story(List<Scene> scenes) {
        this.scenes = scenes;
    }

    public List<Scene> getScenes() {
        return scenes;
    }

    public void setScenes(List<Scene> scenes) {
        this.scenes = scenes;
    }

    @Override
    public String toString() {
        return "Story{" +
                "scenes=" + scenes +
                '}';
    }
}