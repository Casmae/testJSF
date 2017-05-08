package tp1;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Bonjour {
    private String bonjour = "Bonjour, il est : ";

    public String getBonjour() {
        return bonjour;
    }

    public void setBonjour(String bonjour) {
        this.bonjour = bonjour;
    }

    public String getMessage() {
        return bonjour + " " + new SimpleDateFormat("HH:mm:ss").format(new Date());
    }

}