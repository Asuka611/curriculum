package check;

import constants.Constants;

public class Main {
	private String lastName = "石渡";  // プライベートフィールド lastName の初期化
    private String firstName = "あす香"; // プライベートフィールド firstName の初期化

    private void printName(String lastName, String firstName) {
        String printName = lastName + firstName;
        System.out.println("printNameメソッド →  " + printName);
    }

    public static void main(String[] args) {
        Main mainInstance = new Main();
        Pet myPet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
        RobotPet myRobotPet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);


        // メソッド呼び出し
        mainInstance.printName(mainInstance.lastName, mainInstance.firstName);
        myPet.introduce();       // ペットの情報を表示
        myRobotPet.introduce();  // ロボットペットの情報を表示

    }


	}

