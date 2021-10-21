package co.in.nextgencoder.toddlersbook.service;

import co.in.nextgencoder.toddlersbook.PDNActivity;
import co.in.nextgencoder.toddlersbook.PSNActivity;
import co.in.nextgencoder.toddlersbook.model.Course;

public interface TopicService {

    public Course getClass1ABC(PDNActivity pdnActivity, String packageName);

    public Course getClass1abc(PDNActivity pdnActivity, String packageName);

    public Course getClass1Num(PSNActivity psnActivity, String packageName);

    public Course getClass2Fruits(PSNActivity psnActivity, String packageName);

    public Course getClass2Vegies(PSNActivity psnActivity, String packageName);

    public Course getClass2Shapes(PSNActivity psnActivity, String packageName);

    public Course getClass2Arial(PSNActivity psnActivity, String packageName);

    public Course getClass2Domestic(PSNActivity psnActivity, String packageName);

    public Course getClass2Aquatic(PSNActivity psnActivity, String packageName);

    public Course getClass2Wild(PSNActivity psnActivity, String packageName);

    public Course getClass2Colors(PSNActivity psnActivity, String packageName);

}
