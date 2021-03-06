package java.by.training.parser.domain;

import java.util.ArrayList;
import java.util.List;

public class ComplexDescription {

    private String header;
    private String addition;
    private List<String> complexDescription = new ArrayList<>();

    public List<String> getComplexDescription() {
        return complexDescription;
    }

    public void setComplexDescription(List<String> complexDescription) {
        this.complexDescription = complexDescription;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setDescription(String description){
        this.complexDescription.add(description);
    }

    public String getAddition() {
        return addition;
    }

    public void setAddition(String addition) {
        this.addition = addition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComplexDescription that = (ComplexDescription) o;

        if (header != null ? !header.equals(that.header) : that.header != null) return false;
        if (complexDescription != null ? !complexDescription.equals(that.complexDescription) : that.complexDescription != null)
            return false;
        return addition != null ? addition.equals(that.addition) : that.addition == null;

    }

    @Override
    public int hashCode() {
        int result = header != null ? header.hashCode() : 0;
        result = 31 * result + (complexDescription != null ? complexDescription.hashCode() : 0);
        result = 31 * result + (addition != null ? addition.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ComplexDescription{" +
                "header='" + header + '\'' +
                ", complexDescription=" + complexDescription +
                ", addition=" + addition +
                '}';
    }
}
