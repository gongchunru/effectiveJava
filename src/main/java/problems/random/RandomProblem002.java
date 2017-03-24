package problems.random;

/**
 * Created by gongchunru on 2016/11/22.
 * Given a text and a string pattern check if pattern exist in the text.
 */
public class RandomProblem002 {
    public static boolean patternExistInText(String text,String pattern){
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i < n-m; i++) {
            int j = 0;
            while (j<m && text.charAt(i+j) == pattern.charAt(j)){
                j++;
            }

            if (j==m) return true;

        }


        return false;
    }


    public static void main(String[] args) {
       boolean b =  patternExistInText("1384189327419234912asifkjasdfaasldkfoqwoerqwerqwreadfhelloqwopeiurqwojfasjdfqeuro","hello");
        System.out.println(b);
    }
}
