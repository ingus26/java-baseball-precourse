# 숫자 야구 게임
1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임

## 기능 목록
1. [x] 숫자 야구게임에서 상대방의 역할을 컴퓨터가 한다. 상대방은 1에서 9까지 서로 다른 임의의 수 3개를 선택한다.

2. 게임 플레이어는 상대방이 생각하고 있는 3개의 숫자를 입력한다.
   - [x] 게임 플레이어가 숫자 3개를 입력한다.
      - 화면 문구 출력: 숫자를 입력해주세요:
   - [x] 게임 플레이어가 입력한 숫자 3개가 화면에 출력된다.
      - 화면 문구 출력: 숫자를 입력해주세요: {게임 플레이어가 입력한 숫자 3개}
      - 게임 플레이어가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시킨 후 애플리케이션은 종료 된다.

3. 상대방의 수와 게임 플레이어의 수를 비교해서 힌트를 출력한다.
   - [x] 힌트를 출력한다.
      - [예] 상대방의 수가 425일 때
         - 123을 입력한 경우, 화면 문구 출력 : 1스트라이크
         - 456을 입력한 경우, 화면 문구 출력 : 1볼 1스트라이크
         - 789를 입력한 경우, 화면 문구 출력 : 낫싱
   - 힌트를 이용해서 게임 플레이어가 상대방의 수를 맞추면 승리한다.
   - 힌트를 구하는 기준
      - 스트라이크 : 같은 수가 같은 자리에 있음
      - 볼 : 다른 자리에 있음
      - 낫싱 : 같은 수가 전혀 없음

4. 게임 플레이어가 1,2,3 과정을 반복해 상대방이 선택한 3개의 숫자를 모두 맞히면(스트라이크) 게임이 종료된다.
   - [x] 화면 문구 출력: 3개의 숫자를 모두 맞히셨습니다! 게임 종료

5. 게임 플레이어는 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다.
   - [x] 화면 문구 출력 : 게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.
      - [x] 게임을 다시 시작하려면 게임 플레이어는 1을 입력한다.
      - [x] 게임을 종료하려면 게임 플레이어는 2를 입력한다.
      - [x] 게임 플레이어가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시킨 후 애플리케이션은 종료 된다.
      -
## 제약 사항
1. [x] JDK 8 버전 사용
2. [x] camp.nextstep.edu.missionutils에서 제공하는 Randoms 및 Console API를 사용하여 구현
   - Random 값 추출은 camp.nextstep.edu.missionutils.Randoms의 pickNumberInRange()를 활용
   - 사용자가 입력하는 값은 camp.nextstep.edu.missionutils.Console의 readLine()을 활용
3. [x] 코드컨벤션 : https://github.com/woowacourse/woowacourse-docs/tree/master/styleguide/java
4. [x] 도메인 로직에 단위 테스트

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)
