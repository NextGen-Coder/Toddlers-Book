package co.in.nextgencoder.toddlersbook.serviceimpl;

import co.in.nextgencoder.toddlersbook.PDNActivity;
import co.in.nextgencoder.toddlersbook.model.Course;
import co.in.nextgencoder.toddlersbook.model.Topic;
import co.in.nextgencoder.toddlersbook.service.TopicService;

public class TopicServiceImpl implements TopicService {

    private String className;
    private String subjectName;
    private String resType;

    @Override
    public Course getClass1ABC( PDNActivity pdnActivity, String packageName) {

        className = "class1";
        subjectName = "alpha";

        Course course = new Course( className, subjectName);

        for (int i = 0; i < 26; i++) {
            int primaryImgResId = pdnActivity.getResources().getIdentifier( className+"_"+subjectName+"_letter_"+i, "drawable", packageName);
            int secondaryImgResId = pdnActivity.getResources().getIdentifier( className+"_"+subjectName+"_example_"+i, "drawable", packageName);
            int primarySoundResId = pdnActivity.getResources().getIdentifier( className+"_"+subjectName+"_"+i, "raw", packageName);
            Topic topic = new Topic( primaryImgResId, secondaryImgResId, primarySoundResId);
            course.getTopics().add( topic);
        }
        return course;
    }
}
