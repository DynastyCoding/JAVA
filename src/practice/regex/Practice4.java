package practice.regex;

public class Practice4 {

    private static final String EMAIL_REGEX =
            "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    public boolean isEmail(String email){
        if(email == null || email.isBlank()){
            return false;
        }
        return email.matches(EMAIL_REGEX);
    }

    private static final String PASSWORD_REGEX =
            "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{8,}$";
    public boolean isPassword(String password){
        if(password == null || password.isBlank()){
            return false;
        }
        return password.matches(PASSWORD_REGEX);
    }

    private static final String MOBILE_REGEX =
            "^09(\\d{8}|\\d{2}(-\\d{3}){2})$";
    public boolean isValidMobile(String mobile){
        if(mobile == null || mobile.isBlank()){
            return false;
        }
        return mobile.matches(MOBILE_REGEX);
    }

    private static final String ORDER_REGEX =
            "^ORD\\d{10}$";
    public boolean isValidOrder(String order){
        if(order == null || order.isBlank()){
            return false;
        }
        return order.matches(ORDER_REGEX);
    }

    private static final String ACCOUNT_REGEX =
            "^[a-z0-9]+(_[a-z0-9]+)*$";
    public boolean isValidAccount(String account){
        if(account == null || account.isBlank()){
            return false;
        }
        if(account.length()>20 ||account.length()<3){
            return false;
        }
        return account.matches(ACCOUNT_REGEX);
    }

    private static final String EXPIRY_REGEX =
            "^(0[1-9]|1[0-2])/\\d{2}$";
    public boolean isValidExpiry(String expiry){
        if(expiry == null || expiry.isBlank()){
            return false;
        }
        return expiry.matches(EXPIRY_REGEX);
    }

    private static final String ID_REGEX =
            "^[1-9]\\d*$";
    public boolean isValidId(String id){
        if(id == null || id.isBlank()){
            return false;
        }
        return id.matches(ID_REGEX);
    }

    private static final String DATE_REGEX =
            "^(19\\d{2}|20\\d{2})" +
                    "-(0[1-9]|1[0-2])" +
                    "-(0[1-9]|[1-2][0-9]|3[0-1])$";
    public boolean isValidDate(String date){
        if(date == null || date.isEmpty()){
            return false;
        }
        return date.matches(DATE_REGEX);
    }

    private static final String IP_REGEX =
            "^([1-9]?\\d|1\\d{2}|2[0-4]\\d|25[0-5]\\.){3}([1-9]?\\d|1\\d{2}|2[0-4]\\d|25[0-5])$";
    public boolean isValidIp(String ip){
        if(ip == null || ip.isBlank()){
            return false;
        }
        return ip.matches(IP_REGEX);
    }

    private static final String CARRIER_REGEX =
            "^/[A-Z0-9]{7}$";
    public boolean isCarrier(String carrier){
        if(carrier == null || carrier.isBlank()){
            return false;
        }
        return carrier.matches(CARRIER_REGEX);
    }

}
