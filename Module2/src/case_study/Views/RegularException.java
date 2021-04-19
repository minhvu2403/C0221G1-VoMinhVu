package case_study.Views;

import java.util.regex.Pattern;

public class RegularException {
    private static Pattern pattern;
//    private  static  Mathcher mathcher;

    private static final String REGEX_ID_VILLA = "SVVL-\\d{4}";
    private static final String REGEX_ID_HOUSE = "SVHO-\\d{4}";
    private static final String REGEX_ID_ROOM = "SVRO-\\d{4}";
    private static final String REGEX_NAME = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
    private static final String REGEX_AREA = "^([3][0]\\.\\d+)|([3][1-9]\\.?\\d*)|([4-9]\\d\\.?\\d*)|(\\d{3,}\\.?\\d*)$";
    private static final String REGEX_COST = "^[1-9]\\d*$";
    private static final String REGEX_AMOUNT_OF_PEOPLE = "^[1-9]|[1]\\d$";
    private static final String REGEX_RENT_TYPE = "^(hours|day|week|month|year|Hours|Day|Week|Month|Year)$";
    private static final String REGEX_NUMBER_FLOOR = "^[1-9]$";
    private static final String REGEX_DATE_OF_BIRTH = "^([0][1-9]|[12][0-9]|[3][01])/([0][1-9]|[1][012])/([2][0][0]([012])|[1][9]\\d{2})$";
    private static final String REGEX_SEX = "^(male|female|Male|Female)$";
    private static final String REGEX_ID_CARD = "^\\d{9}$";
    private static final String REGEX_NUMBER_PHONE = "^\\d{10}$";
    private static final String REGEX_EMAIL = "^\\w{3,}(\\.?\\w+)*@[a-z]{2,7}(.[a-z]{2,5}){1,3}$";
    private static final String REGEX_CUSTOMER_TYPE = "^(member|sliver|gold|platinum|diamond|Member|Sliver|Gold|Platinum|Diamond)$";
    private static final String REGEX_SERVICE = "^(massage|karaoke|food|drink|car|Massage|Karaoke|Food|Drink|Car)$";
    private static final String REGEX_CONTRACT_VILLA = "^\\d{3}/\\d{2}/\\d{2}-(HDVL)$";
    private static final String REGEX_CONTRACT_HOUSE = "^\\d{3}/\\d{2}/\\d{2}-(HDHO)$";
    private static final String REGEX_CONTRACT_ROOM = "^\\d{3}/\\d{2}/\\d{2}-(HDRO)$";
    private static final String REGEX_DAY_CONTRACT = "^([0][1-9]|[12][0-9]|[3][01])/([0][1-9]|[1][012])/([2][0][2]\\d)$";
    private static final String REGEX_ID_EMPLOYEE = "^EP-\\d{4}$";
    private static final String REGEX_LEVEL = "^(Junior|Senior|Supervisor|Leader|Manager|junior|senior|supervisor|leader|manager)$";
    private static final String REGEX_POSITION = "^(receptionist|Receptionist|Serve|serve|expert|Expert|monitoring|Monitoring|Manage|manage|Manager|manager)$";
    private static final String REGEX_DEPARTMENT = "^(Sale|sale|Marketing|marketing|administrative|Administrative|Serve|serve|manage|Manage)$";
}
