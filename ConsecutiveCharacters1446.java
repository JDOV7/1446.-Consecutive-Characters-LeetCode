package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConsecutiveCharacters1446 {

    public void ConsecutiveCharacters1446() {
        String s = "leetcode";
        int iMaximun = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            String splites[] = s.split("[^" + i + "]+");
            for (String splite : splites) {
                if (!(splite.equals(""))) {
                    if (splite.length() > iMaximun) {
                        iMaximun = splite.length();
                    }
                }
            }
        }
        System.out.println(iMaximun);
    }
}
