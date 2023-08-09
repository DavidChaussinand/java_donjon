package components;

public class CaseEmpty extends Case{


    private String CaseEmpty;


    public CaseEmpty(String contentCase, String caseEmpty) {
        super(contentCase);
        CaseEmpty = caseEmpty;
    }


    @Override
    public String toString() {
        return "CaseEmpty{" +
                "contentCase = " + this.getContentCase() +
                "CaseEmpty='" + this.CaseEmpty + '\'' +
                '}';
    }



    public String getCaseEmpty() {
        return this.CaseEmpty;
    }

    public void setCaseEmpty(String caseEmpty) {
        this.CaseEmpty = caseEmpty;
    }


}
