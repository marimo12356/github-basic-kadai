package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

   
    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("自分のじゃんけんの手を入力しましょう");
            System.out.println("グーはrockのrを入力しましょう");
            System.out.println("チョキはscissorsのsを入力しましょう");
            System.out.println("パーはpaperのpを入力しましょう");

            String input = scanner.next();

            
            if (input.equals("r") || input.equals("s") || input.equals("p")) {
                return input;
            } else {
                System.out.println("エラー：r, s, pのいずれかを入力してください。");
            }
        }
    }

    
    public String getRandom() {
        String[] opponentHands = {"r", "s", "p"};
        // 0～2の乱数を生成 (Math.floor(Math.random() * 3))
        int randomIndex = (int) Math.floor(Math.random() * 3);
        return opponentHands[randomIndex];
    }

  
    public void playGame() {
        
        String me = getMyChoice();
        String you = getRandom();

       
        HashMap<String, String> handMap = new HashMap<>();
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");

        System.out.println("自分の手は" + handMap.get(me) + ",対戦相手の手は" + handMap.get(you));

        
        if (me.equals(you)) {
            System.out.println("あいこです");
        } else if ((me.equals("r") && you.equals("s")) || 
                   (me.equals("s") && you.equals("p")) || 
                   (me.equals("p") && you.equals("r"))) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}
