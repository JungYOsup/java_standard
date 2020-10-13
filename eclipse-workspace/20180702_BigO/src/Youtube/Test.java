package Youtube;
//Big-O란 ? 
//알고리즘의 성능을 수학적으로 표현해주는 표기법
//시간과 공간복잡도를 표현할수 있다.
//알고리즘의 데이터나 사용자의 증가율에 따른 알고리즘의 성능을 예측하는것이 목표
//따라서 상수같은것은 1

//O(1)이란 :입력데이터에 크기에 상관없이 언제나 일정한 시간이 걸리는 알고리즘
//O(n)이란 :입력데이터의 크기에 비례해서 처리시간이 걸리는 알고리즘(n번까지 돌리는 for문)
//O(n^2)이란:입력데이터의 크기에 비례해서 처리시간이 제곱으로 걸리는 알고리즘 (n번까지 돌리는 이중for문) : 면적
//O(nM)이란: 입력데이터의 크기에 비례해서 처리시간이 제곱으로 걸리는 알고리즘 (n for문 안에 m for문 or m for문안에 n for문)
//O(n^3)이란:입력데이터의 크기에 비례해서 처리시간이 세제곱으로 걸리는 알고리즘 (n번까지 돌리는 삼중for문) : 큐빅
//O(2^n)이란:피모나치수열
//O(logn)이란: 이진검색
//O(sqrt(n))

//빅오 표기법에서는 과감하게 상수를 버린다. 예를들어 이중for문이 아닌 for문을 두번돌릴떄 발생하는 빅-O표기법은 O(2n)이다.
//그러나 빅오표기법은 실제 알고리즘이 러닝타임을 측정하기 위한것이 아닌 장기적으로 데이터의 증가에 따른 처리시간의 증가율을 보여주기 위한것이기 때문에 O(n)과 O(2n)은 같다.

public class Test {

}
