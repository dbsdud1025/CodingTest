import java.util.Arrays;

public class test1220 {
    public static void main(String[] args) {

        Solution Solution = new Solution();

        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
    //                {"hello", "one", "even", "never", "now", "world", "draw"};

        int[] result = Solution.solution(3,words);
        System.out.println(result[0]+","+result[1]); // 결과 : [3,3] or [0,0] / 3번 사람이 자신의 세번째 차례
    }

    static class Solution {
        public int[] solution(int n, String[] words) {
            int[] answer = { 0, 0 };
            String[] temp = new String[words.length];
            Arrays.fill(temp, "");

            for(int i = 0; i < words.length; i++) {
                if((i != 0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)) ||
                        Arrays.asList(temp).contains(words[i])) {
                    answer[0] = i%n + 1; //사람
                    answer[1] = i/n + 1; //차례
                    break;
                } else {
                    temp[i] = words[i];
                }
            }

            return answer;
        }
    }

    /*static class Solution {
        public int[] solution(int n, String[] words) {

            List wordsLst = new ArrayList( Arrays.asList(words));

            int[] answer = {0,0};

            int charae = 1; //차례
            int saram = 0; //사람

            for (int i = 0; i < words.length ; i++){
                if ((i+1) % n != 0){
                    saram ++;

                    answer[0] = saram;
                    answer[1] = charae;
                }else{
                    saram ++;

                    answer[0] = saram;
                    answer[1] = charae;
                    charae ++;
                    saram = 0;
                }

                if(i> 0){
                    if (wordsLst.get(i).toString().charAt(0) != wordsLst.get(i-1).toString().charAt(wordsLst.get(i-1).toString().length()-1)){
                        return answer;
                    }
                }

                for (int j = 0; j < i ; j++){
                    if (wordsLst.get(i).equals(wordsLst.get(j))){
                        return answer;
                    }
                }
            }
            answer[0] = 0;
            answer[1] = 0;
            return answer;
        }
    }*/


   /* public static int solution(String word) {

        String[] aeiou = {"A", "E", "I", "O", "U"};
        int cnt = 0;
        List<String> list = new ArrayList<>();

        for (String a : aeiou){
            cnt = add(list, a, word, cnt);
            cnt = cnt == 0? cnt
            if(add(list, a, word, cnt) ==0){
                cnt++;
                return cnt;
            }else{
                cnt = add(list, a, word, cnt)
            }
            list.add(a);
            for (String b : aeiou){
                list.add(a+b);
                for (String c : aeiou){
                    list.add(a+b+c);
                    for (String d : aeiou){
                        list.add(a+b+c+d);
                        for (String e : aeiou){
                            list.add(a+b+c+d+e);
                        }
                    }
                }
            }
        }

        System.out.println(list);
        int answer = 0;
        return answer;
    }
    public static int add(List<String> list, String word, String text, int cnt) {
        cnt++;
        if (text == word) return 0;
        list.add(word);
        return cnt;
    }*/


//    public static int solution(String str1, String str2) {
//        List<String> s1= new ArrayList<>();
//        for (int i = 0 ; i< str1.length()-1 ; i++){
//            if((!Pattern.matches("^[a-zA-Z]*$", String.valueOf(str1.charAt(i))))
//            || (!Pattern.matches("^[a-zA-Z]*$", String.valueOf(str1.charAt(i+1))))){
//               continue;
//            }
//            String s = str1.charAt(i) +""+ str1.charAt(i+1);
//            s1.add(s.toLowerCase());
//        }
//
//        List<String> s2= new ArrayList<>();
//        for (int j = 0 ; j< str2.length()-1 ; j++){
//            if((!Pattern.matches("^[a-zA-Z]*$", String.valueOf(str2.charAt(j))))
//                    || (!Pattern.matches("^[a-zA-Z]*$", String.valueOf(str2.charAt(j+1))))){
//                continue;
//            }
//            String s = str2.charAt(j) + ""+ str2.charAt(j+1);
//            s2.add(s.toLowerCase());
//        }
//
//        List<String> gList = new ArrayList<>();
//        float sum = s1.size() + s2.size();
//
//        for(String s11 : s1){
//            for(int i = 0 ; i< s2.size(); i++){
//                if(s11.equals(s2.get(i))){
//                    gList.add(s11);
//                    s2.remove(i);
//                    break;
//                }
//            }
//        }
//        float gListSize = gList.size();
//        float hListSize = sum - gListSize;
//
//        System.out.println("gList -> "+ gList);
//        System.out.println("gListSize -> "+ gListSize);
//        System.out.println("hListSize -> "+ hListSize);
//
//        float result = gListSize == 0.0 && hListSize == 0.0 ? 65536 :  (gListSize / hListSize) *  65536;
//        int answer = (int)Math.abs(result);
//        return answer;
//    }

//    public static int solution(int n) {
//        int cnt = 0;
//        if (n % 2 == 1) cnt++;
//        while (n / 2 >= 1){
//            n = n / 2;
//            if( n % 2 == 1) cnt ++;
//        }
//        return cnt;
//    }

//    public static String solution(String[] cards1, String[] cards2, String[] goal) {
//        int cnt = 0;
//        int cnt2 = 0;
//        for (String g : goal){
//
//            if (cards1[cnt].equals(g)){
//                cnt++;
//                continue;
//            }
//
//            if (cards2[cnt2]. equals(g)){
//                cnt2++;
//                continue;
//            }
//
//            return "No";
//        }
//
//        return "Yes";
//    }
//    public static String solution(int[] food) {
//        String answer = "";
//
//        int val = 1;
//        for (int i=1; i < food.length; i++){
//            int valCnt;
//            if(food[i] % 2 != 0){
//                valCnt= (food[i]-1)/2;
//            }else{
//                valCnt = (food[i])/2;
//            }
//            for (int j = 0; j < valCnt; j++){
//                answer= answer+String.valueOf(val);
//            }
//            val ++;
//        }
//        String later = "";
//        for(int s =answer.length()-1; s>=0; s--){
//            later+=answer.charAt(s);
//        }
//
//        answer+="0"+later;
//        return answer;
//    }
}
