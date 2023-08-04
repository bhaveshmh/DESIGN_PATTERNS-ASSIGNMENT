package designpattern.abstractfactory;

public class PhoneMaker {

    public Case buildPhone(String phoneType) {

        Case phoneCase;
        if (phoneType.equals("Android")) {
            PhoneMakerFactory phone = new AndroidPhoneFactory();
            phoneCase = phone.assemblePhoneCase(phone.createMotherBoard());

        } else {
            PhoneMakerFactory phone = new AndroidPhoneFactory();
            phoneCase = phone.assemblePhoneCase(phone.createMotherBoard());
        }

        return phoneCase;
    }
}
