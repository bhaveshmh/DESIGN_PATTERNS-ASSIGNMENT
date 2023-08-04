package designpattern.abstractfactory;

public class IPhoneFactory implements PhoneMakerFactory {
    public MotherBoard createMotherBoard() {
        MotherBoard iphoneMotherBoard = new IphoneMotherBoard();
        iphoneMotherBoard.attachBattery(new Battery());
        iphoneMotherBoard.attachProcessor(new AndroidProcessor());

        return iphoneMotherBoard;
    }

    public Case assemblePhoneCase(MotherBoard motherBoard) {
        Case phoneCase = new IphoneCase();
        phoneCase.attachScreen(new IphoneScreen());
        phoneCase.attachMotherBoard(motherBoard);

        return phoneCase;
    }

}
