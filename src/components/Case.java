package components;

public abstract class Case {

        private String contentCase;

    public Case(String contentCase) {
        this.contentCase = contentCase;
    }

    @Override
    public String toString() {
        return "Case{" +
                "contentCase='" + this.contentCase + '\'' +
                '}';
    }

    public String getContentCase() {
        return this.contentCase;
    }

    public void setContentCase(String contentCase) {
        this.contentCase = contentCase;
    }

}
