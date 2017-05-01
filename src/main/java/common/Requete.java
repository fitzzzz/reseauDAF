package common;

import java.io.Serializable;
import java.util.List;

/**
 * Created by DavidLANG on 25/04/2017.
 */
public class Requete implements Serializable {
    protected String code;
    protected List<Object> params;

    public Requete(String code) {
        this.code = code;
    }

    public Requete(String code, List<Object> params) {
        this(code);
        this.params = params;
    }

    public String getCode() {
        return code;
    }

    public List<Object> getParams() {
        return params;
    }
}
