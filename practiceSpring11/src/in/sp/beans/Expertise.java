package in.sp.beans;

import java.util.List;

public class Expertise {
    private List<String> exp;

    public void setExp(List<String> exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "exp=" + exp;
    }
}
