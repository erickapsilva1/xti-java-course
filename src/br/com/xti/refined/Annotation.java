package br.com.xti.refined;

import java.io.Serializable;

@Header(
        company = "Universidade XTI",
        project = "System XPTO",
        creationDate = "202.08.17",
        creator = "Erick A. da Silva",
        revision = 2
)

@FixedBugs(errors = {"0001", "0002"})
@SuppressWarnings("serial")
public class Annotation implements Serializable {

    @SuppressWarnings("unused")
    private int x;

    @Deprecated
    public void note(){}

    @Override
    public String toString(){
        return null;
    }

}
