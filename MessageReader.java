package SalarySlip;

import java.util.Locale;
import java.util.ResourceBundle;

public class MessageReader {

    ResourceBundle bundle ;

    MessageReader() {
        Locale locale = new Locale("en","US");
        bundle = ResourceBundle.getBundle("messages", locale);
    }

    public String getMessage(String key) {
        return bundle.getString(key);
    }

    
}
