package co.in.nextgencoder.toddlersbook.model;

import java.util.Objects;

import co.in.nextgencoder.toddlersbook.OrderedNumbersActivity;
import co.in.nextgencoder.toddlersbook.R;

public class UniqueNumber {

    private int number;
    private int imageId;

    public UniqueNumber() {
        number = -1;
        imageId = R.drawable.empty;
    }

    public UniqueNumber(int number) {
        this.number = number;
    }

    public UniqueNumber(int number, OrderedNumbersActivity activity) {
        imageId = activity.getResources().getIdentifier( "class_nums_"+number, "drawable", activity.getPackageName());
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UniqueNumber that = (UniqueNumber) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "UniqueNumber{" +
                "number=" + number +
                ", imageId=" + imageId +
                '}';
    }
}
