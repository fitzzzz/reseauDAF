package common;

import java.io.Serializable;
import java.util.List;

/**
 * Created by DavidLANG on 25/04/2017.
 */
public class Requete {
    private String code;
    private List<?extends Serializable> params;

    public Requete(String code, List<?extends Serializable> params) {
        this.code = code;
        this.params = params;
    }

    public String getCode() {
        return code;
    }

    public List<? extends Serializable> getParams() {
        return params;
    }
}
