package common;

import java.util.List;

/**
 * Created by DavidLANG on 25/04/2017.
 */
public class Requete {
    private String code;
    private List<Object> params;

    public Requete(String code, List<Object> params) {
        this.code = code;
        this.params = params;
    }

    public String getCode() {
        return code;
    }

    public List<Object> getParams() {
        return params;
    }
}
