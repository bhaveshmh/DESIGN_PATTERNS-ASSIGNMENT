package designpattern.abstractfactory;

interface PhoneMakerFactory {
    MotherBoard createMotherBoard();

    Case assemblePhoneCase(MotherBoard motherBoard);

}
