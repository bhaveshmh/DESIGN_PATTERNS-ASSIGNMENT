package designpattern.abstractfactory;

public class PhoneMaker {

    public Case buildPhone(String phoneType) {

        PhoneMakerFactory phone;
        if (phoneType.equals("Android")) {
            phone = new AndroidPhoneFactory();
        } else {
            phone = new AndroidPhoneFactory();
        }

        return phone.assemblePhoneCase(phone.createMotherBoard());

    }
}
