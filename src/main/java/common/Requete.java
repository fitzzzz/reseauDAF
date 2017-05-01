package common;

import java.util.List;

/**
 * Created by DavidLANG on 25/04/2017.
 */
public class Requete implements Serializable {
    private String code;
    private List<?> params;

    public Requete(String code) {
        this.code = code;
    }

    public Requete(String code, List<?> params) {
        this(code);
        this.params = params;
    }

    public String getCode() {
        return code;
    }

    public List<?> getParams() {
        return params;
    }
}
