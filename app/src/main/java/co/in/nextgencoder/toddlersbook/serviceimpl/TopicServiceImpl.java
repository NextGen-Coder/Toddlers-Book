package co.in.nextgencoder.toddlersbook.serviceimpl;

import co.in.nextgencoder.toddlersbook.PDNActivity;
import co.in.nextgencoder.toddlersbook.PSNActivity;
import co.in.nextgencoder.toddlersbook.model.Course;
import co.in.nextgencoder.toddlersbook.model.Topic;
import co.in.nextgencoder.toddlersbook.service.TopicService;

public class TopicServiceImpl implements TopicService {

    private String className;
    private String subjectName;

    @Override
    public Course getClass1ABC( PDNActivity pdnActivity, String packageName) {

        className = "class1";
        subjectName = "alpha";

        Course course = new Course( className, subjectName, 26);

        for (int i = 0; i < 26; i++) {
            int primaryImgResId = pdnActivity.getResources().getIdentifier( "class1_alpha_letters_"+i, "drawable", packageName);
            int secondaryImgResId = pdnActivity.getResources().getIdentifier( "class1_alpha_example_"+i, "drawable", packageName);
            int primarySoundResId = pdnActivity.getResources().getIdentifier( "class1_alpha_"+i, "raw", packageName);

            Topic topic = new Topic( primaryImgResId, secondaryImgResId, primarySoundResId);
            course.getTopics().add( topic);
        }
        return course;
    }


    public Course getClass1abc( PDNActivity pdnActivity, String packageName) {

        className = "class1";
        subjectName = "alphaLow";

        Course course = new Course( className, subjectName, 26);

        for (int i = 0; i < 26; i++) {
            int primaryImgResId = pdnActivity.getResources().getIdentifier( "class1_alpha_letters_low_"+i, "drawable", packageName);
            int secondaryImgResId = pdnActivity.getResources().getIdentifier( "class1_alpha_example_"+i, "drawable", packageName);
            int primarySoundResId = pdnActivity.getResources().getIdentifier( "class1_alpha_"+i, "raw", packageName);

            Topic topic = new Topic( primaryImgResId, secondaryImgResId, primarySoundResId);
            course.getTopics().add( topic);
        }
        return course;
    }

    @Override
    public Course getClass1Num(PSNActivity psnActivity, String packageName) {
        className = "class1";
        subjectName = "123";

        Course course = new Course( className, subjectName, 26);

        for (int i = 0; i < 10; i++) {
            int primaryImgResId = psnActivity.getResources().getIdentifier( "class_nums_"+i, "drawable", packageName);
            int primarySoundResId = psnActivity.getResources().getIdentifier( "class1_num_"+i, "raw", packageName);

            Topic topic = new Topic( primaryImgResId, primarySoundResId);
            course.getTopics().add( topic);
        }
        return course;
    }



    @Override
    public Course getClass2Fruits(PSNActivity psnActivity, String packageName) {

        className = "class2";
        subjectName = "Fruits";

        Course course = new Course( className, subjectName, 10);

        for (int i = 0; i < 10; i++) {
            int primaryImgResId = psnActivity.getResources().getIdentifier( "class2_fruits_"+i, "drawable", packageName);
            int primarySoundResId = psnActivity.getResources().getIdentifier( "class2_fruits_"+i, "raw", packageName);

            Topic topic = new Topic( primaryImgResId, primarySoundResId);
            course.getTopics().add( topic);
        }
        return course;
    }

    @Override
    public Course getClass2Vegies(PSNActivity psnActivity, String packageName) {
        className = "class2";
        subjectName = "Vegies";

        Course course = new Course( className, subjectName, 10);

        for (int i = 0; i < 14; i++) {
            int primaryImgResId = psnActivity.getResources().getIdentifier( "class2_vegies_"+i, "drawable", packageName);
            int primarySoundResId = psnActivity.getResources().getIdentifier( "class2_veggies_"+i, "raw", packageName);

            Topic topic = new Topic( primaryImgResId, primarySoundResId);
            course.getTopics().add( topic);
        }
        return course;
    }

    @Override
    public Course getClass2Shapes(PSNActivity psnActivity, String packageName) {
        className = "class2";
        subjectName = "Shapes";

        Course course = new Course( className, subjectName, 10);

        for (int i = 0; i < 4; i++) {
            int primaryImgResId = psnActivity.getResources().getIdentifier( "class2_shapes_"+i, "drawable", packageName);
            int primarySoundResId = psnActivity.getResources().getIdentifier( "class2_shapes_"+i, "raw", packageName);

            Topic topic = new Topic( primaryImgResId, primarySoundResId);
            course.getTopics().add( topic);
        }
        return course;
    }

    @Override
    public Course getClass2Arial(PSNActivity psnActivity, String packageName) {
        className = "class2";
        subjectName = "Arial";

        Course course = new Course( className, subjectName, 10);

        for (int i = 0; i < 7; i++) {
            int primaryImgResId = psnActivity.getResources().getIdentifier( "class2_animals_arial_"+i, "drawable", packageName);
            int primarySoundResId = psnActivity.getResources().getIdentifier( "class2_aerial_"+i, "raw", packageName);

            Topic topic = new Topic( primaryImgResId, primarySoundResId);
            course.getTopics().add( topic);
        }
        return course;
    }

    @Override
    public Course getClass2Domestic(PSNActivity psnActivity, String packageName) {
        className = "class2";
        subjectName = "Domestic";

        Course course = new Course( className, subjectName, 10);

        for (int i = 0; i < 9; i++) {
            int primaryImgResId = psnActivity.getResources().getIdentifier( "class2_animals_domestic_"+i, "drawable", packageName);
            int primarySoundResId = psnActivity.getResources().getIdentifier( "class2_domestic_"+i, "raw", packageName);

            Topic topic = new Topic( primaryImgResId, primarySoundResId);
            course.getTopics().add( topic);
        }
        return course;
    }

    @Override
    public Course getClass2Aquatic(PSNActivity psnActivity, String packageName) {
        className = "class2";
        subjectName = "Aquatic";

        Course course = new Course( className, subjectName, 10);

        for (int i = 0; i < 8; i++) {
            int primaryImgResId = psnActivity.getResources().getIdentifier( "class2_animals_aquatic_"+i, "drawable", packageName);
            int primarySoundResId = psnActivity.getResources().getIdentifier( "class2_aquatic_"+i, "raw", packageName);

            Topic topic = new Topic( primaryImgResId, primarySoundResId);
            course.getTopics().add( topic);
        }
        return course;
    }

    @Override
    public Course getClass2Wild(PSNActivity psnActivity, String packageName) {
        className = "class2";
        subjectName = "Wild";

        Course course = new Course( className, subjectName, 10);

        for (int i = 0; i < 9; i++) {
            int primaryImgResId = psnActivity.getResources().getIdentifier( "class2_animals_wild_"+i, "drawable", packageName);
            int primarySoundResId = psnActivity.getResources().getIdentifier( "class2_wild_"+i, "raw", packageName);

            Topic topic = new Topic( primaryImgResId, primarySoundResId);
            course.getTopics().add( topic);
        }
        return course;
    }

    @Override
    public Course getClass2Colors(PSNActivity psnActivity, String packageName) {
        className = "class2";
        subjectName = "Color";

        Course course = new Course( className, subjectName, 10);

        for (int i = 0; i < 11; i++) {
            int primaryImgResId = psnActivity.getResources().getIdentifier( "class2_color_"+i, "drawable", packageName);
            int primarySoundResId = psnActivity.getResources().getIdentifier( "class2_colors_"+i, "raw", packageName);

            Topic topic = new Topic( primaryImgResId, primarySoundResId);
            course.getTopics().add( topic);
        }
        return course;
    }

}
