package co.in.nextgencoder.toddlersbook.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import co.in.nextgencoder.toddlersbook.StoryTimeActivity;
import co.in.nextgencoder.toddlersbook.model.Scene;
import co.in.nextgencoder.toddlersbook.model.Story;
import co.in.nextgencoder.toddlersbook.service.StoryService;


public class StoryServiceImpl implements StoryService {

    @Override
    public Story getStoryScenes(StoryTimeActivity storyTimeActivity, int storyId) {
        List<Scene> sceneList = new ArrayList<>();
        for (int i=0; i < 2; i++) {
            Scene scene = new Scene();

//            int primaryImgResId = storyTimeActivity.getResources().getIdentifier( "story_"+storyId+"_scene_"+i, "drawable", storyTimeActivity.getPackageName());
//            int primarySoundResId = storyTimeActivity.getResources().getIdentifier( "story_"+storyId+"_scene_"+i, "raw", storyTimeActivity.getPackageName());

            int primaryImgResId = storyTimeActivity.getResources().getIdentifier( "class1_alpha_letters_"+i, "drawable", storyTimeActivity.getPackageName());
            int primarySoundResId = storyTimeActivity.getResources().getIdentifier( "class1_alpha_"+i, "raw", storyTimeActivity.getPackageName());

            scene.setImageId( primaryImgResId);
            scene.setSoundId( primarySoundResId);

            sceneList.add( scene);
        }

        return new Story( sceneList);
    }
}
