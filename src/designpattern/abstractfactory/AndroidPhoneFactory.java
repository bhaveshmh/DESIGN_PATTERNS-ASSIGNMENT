package designpattern.abstractfactory;

public class AndroidPhoneFactory implements PhoneMakerFactory {
    public MotherBoard createMotherBoard() {
        MotherBoard androidMotherBoard = new AndroidMotherBoard();
        androidMotherBoard.attachBattery(new Battery());
        androidMotherBoard.attachProcessor(new AndroidProcessor());

        return androidMotherBoard;
    }

    public Case assemblePhoneCase(MotherBoard motherBoard) {
        Case phoneCase = new AndroidCase();
        phoneCase.attachScreen(new AndroidScreen());
        phoneCase.attachMotherBoard(motherBoard);

        return phoneCase;
    }

}
