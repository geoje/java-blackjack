# 🃏 우테코 레벨1 - 블랙잭

우테코 레벨 1 블랙잭은 게임에 참여할 사람들을 입력받아 딜러와 대결하는 프로그램 입니다.

---

## 📝 기능 요구 사항

### 플레이어

- [x] 플레이어는 여러명일 수 있다.
- [x] 플레이어 이름은 공백일 수 없다.
- [x] 쉼표 기준으로 이름을 분리할 수 있다.
- [x] 플레이어 수는 최소 1명 이상이다.
- [x] 플레이어 이름은 중복되어선 안된다.

### 카드

- [x] 숫자 계산은 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A로 구성된다.
- [x] 문양은 스페이드, 다이아몬드, 하트, 클로버로 구성된다.
- [x] A는 1 또는 11로 계산한다.
- [x] J, Q, K는 각각 10으로 계산한다.

### 게임

- [x] 게임 시작 시 인원 당 받는 덱의 수는 2장이다.
- [x] 덱은 랜덤으로 생성된다.
- 진행 조건
    - [x] 한 플레이어가 더이상 카드를 받지 않거나 21을 초과하면 다음 플레이어로 턴이 넘어간다.
    - [x] 카드의 합이 21을 넘지 않을 경우 얼마든지 카드를 뽑을 수 있다.
    - [x] 딜러의 카드 합이 16이하이면 1장을 추가로 받고, 17이상이면 받지 않는다.
- 종료 조건
    - [x] 플레이어가 bust 된다.
    - [x] 플레이어가 블랙잭이 된다.
    - [x] 플레이어가 N을 입력한다.
- 승리 조건
    - [x] 두 장의 카드 숫자를 합쳐 21을 초과하지 않으면서 21에 가깝게 만들면 이긴다.
    - [x] 플레이어는 자신의 숫자 합이 딜러의 숫자의 합보다 크면 승리한다.
    - [x] 플레이어는 자신의 숫자 합이 21을 초과할 경우 패배한다.
    - [x] 딜러의 합과 플레이어의 합이 같으면 무승부이다.
    - [x] 플레이어의 첫 두개의 카드의 합이 21이면 승리한다.

###  

## 📋 프로젝트 구조

### 📦 패키지

<table>
    <tr>
        <th>Package</th>
        <th>Class</th>
        <th>Description</th>
    </tr>
    <tr>
        <td>
            <img src="https://raw.githubusercontent.com/mallowigi/iconGenerator/master/assets/icons/folders/controllers.svg?sanitize=true"/>
            <b> controller</b>
        </td>
        <td><b>BlackjackController</b></td>
        <td>입력을 받아 계산하고 출력 해주는 전체 진행 담당 컨트롤러</td>
    </tr>
    <tr>
        <td rowspan="5">
            <img src="https://raw.githubusercontent.com/mallowigi/iconGenerator/master/assets/icons/folders/home.svg?sanitize=true"/>
            <b> domain / card</b>
        </td>
        <td><b>Card</b></td>
        <td>모든 트럼프 카드가 있는 상수</td>
    </tr>
    <tr>
        <td><b>CardPicker</b></td>
        <td>모든 카드를 한장 씩 가지며 랜덤하게 뽑는 일급 컬렉션</td>
    </tr>
    <tr>
        <td><b>Cards</b></td>
        <td>카드를 여러 장 가지고 있는 일글 컬렉션</td>
    </tr>
    <tr>
        <td><b>CardScore</b></td>
        <td>카드 점수에 대한 상수</td>
    </tr>
    <tr>
        <td><b>CardSymbol</b></td>
        <td>카드 문양에 대한 상수</td>
    </tr>
    <tr>
        <td rowspan="3">
            <img src="https://raw.githubusercontent.com/mallowigi/iconGenerator/master/assets/icons/folders/home.svg?sanitize=true"/>
            <b> domain / game</b>
        </td>
        <td><b>GameResult</b></td>
        <td>승패에 대한 상수</td>
    </tr>
    <tr>
        <td><b>GameResults</b></td>
        <td>플레이어들의 승패를 모두 가지는 일급컬렉션</td>
    </tr>
    <tr>
        <td><b>Referee</b></td>
        <td>승패를 결정해주는 심판 클래스</td>
    </tr>
    <tr>
        <td rowspan="4">
            <img src="https://raw.githubusercontent.com/mallowigi/iconGenerator/master/assets/icons/folders/home.svg?sanitize=true"/>
            <b> domain / gamer</b>
        </td>
        <td><b>Dealer</b></td>
        <td>딜러 클래스</td>
    </tr>
    <tr>
        <td><b>Gamer</b></td>
        <td>게임 참여자 추상 클래스</td>
    </tr>
    <tr>
        <td><b>Player</b></td>
        <td>플레이어 클래스</td>
    </tr>
    <tr>
        <td><b>Players</b></td>
        <td>참여하는 모든 플레이어를 가지는 일급컬렉션</td>
    </tr>
    <tr>
        <td rowspan="6">
            <img src="https://raw.githubusercontent.com/mallowigi/iconGenerator/master/assets/icons/folders/views.svg?sanitize=true"/>
            <b> view</b>
        </td>
        <td><b>CardScoreName</b></td>
        <td>카드 점수를 출력 문구로 변환해주는 상수</td>
    </tr>
    <tr>
        <td><b>CardSymbolName</b></td>
        <td>카드 문양을 출력 문구로 변환해주는 상수</td>
    </tr>
    <tr>
        <td><b>GameResultName</b></td>
        <td>승패 결과를 출력 문구로 변환해주는 상수</td>
    </tr>
    <tr>
        <td><b>InputView</b></td>
        <td>전체적인 출력을 담당하는 뷰</td>
    </tr>
    <tr>
        <td><b>OutputView</b></td>
        <td>전체적인 입력을 담당하는 뷰</td>
    </tr>
    <tr>
        <td><b>PlayerCommand</b></td>
        <td>사용자의 입력 명령어 상수</td>
    </tr>
</table>

---

## 🤔 고민했던 사항 `step1`

### 🙋‍♂️ 추상화를 이렇게 하는게 맞는가?

게임 참여자에 해당하는 딜러와 플레이어는 중복되는 코드가 많아 `abstract class` 로 생성하였습니다.

사실상 `Gamer` 라는 추상 클래스에 플레이어에 해당하는 모든 구현이 들어간 상태이고 `Player` 는 단순히 상속만 받아 사용하는 방식으로 이번 과제를 진행했습니다.

이후에 `Dealer` 는 `첫번째 카드를 반환` 하는 기능과 `딜러 규칙에 따라 카들르 뽑을 수 있는지` 에 해당하는 부분만 특별히 구현되었습니다.

이럴 경우 `Gamer` 가 그냥 `Player`가 되며 `Dealer` 는 `Player`를 상속받아 사용하면 결국 똑같은 것 아닐까? 라는 생각을 했습니다.

1. 현재 방식처럼 `abstract class` 를 사용하여 구현한 것
2. `Player` 를 구현하고 이를 `extand` 받아 `Dealer` 를 구현하는 것

이 두가지 방법 중 첫번 째를 선택한 이번 구현이 잘 한 것인지 궁금합니다!

그리고 2번 방식으로 하면 좋지 않은 것인지도 알고 싶습니다!
