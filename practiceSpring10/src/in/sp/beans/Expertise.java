package in.sp.beans;

import java.util.List;

public class Expertise {
    private List<String> expertise;

    public void setExpertise(List<String> expertise) {
        this.expertise = expertise;
    }

    @Override
    public String toString() {
        return expertise.toString();
    }
}
