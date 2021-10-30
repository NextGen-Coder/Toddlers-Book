package co.in.nextgencoder.toddlersbook.service;

import co.in.nextgencoder.toddlersbook.StoryTimeActivity;
import co.in.nextgencoder.toddlersbook.model.Story;

public interface StoryService {
        public Story getStoryScenes(StoryTimeActivity storyTimeActivity, int storyId);
}
