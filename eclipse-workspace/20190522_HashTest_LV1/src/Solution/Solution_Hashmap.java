package Solution;
import java.util.HashMap;
//getOrDefault()
//일부의 경우에, 우리가 찾는 key를 가지지 않는 map이 있을 수 있다. 그러나 여전히 value를 가지기 원하고 map이 변경되지 않기를 원하는 경우가 있다. 이런 경우에 getOrDefault() 메소드를 사용할 수 있는데, 매우 유용하다.
//key 값이 없다면 입력시 설정한 default 값을 반환

//get()
//이제, 가격을 알기 위하여 map에서 key(상품의 이름)이 사용한다. get () 메소드를 사용한다.

//put()
//add-value 

//편의점 물량같은것을 같이 쌓아 놓을때 좋은 코드가 되겠다.

class Solution_Hashmap {
	
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>(); //
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1); //("키","value")
        for (String player : completion) hm.put(player, hm.get(player) - 1); //

        for (String key : hm.keySet()) { //keyset(); 모든 key를 프린트 하는 방법
            if (hm.get(key) != 0){ //get() = get value
                answer = key;
            }
        }
        return answer;
    }
}
