# 01 React



## 1. 학습 내용

### A. **SPA(Single Page Application)이란?**

* **전통적인 방식**

  최초에 서버로 부터 HTML을 전달 받고 페이지의 변경이 필요할 때 다시 서버에 요청하여 HTML을 전달 받는데, 이 과정에서 페이지를 처음부터 다시 loading하게 됨

* **SPA**

  최초에 서버로 부터 HTML을 전달 받고 페이지의 변경이 필요할 때 변경이 필요한 부분을 JSON(JavaScript Object Notation)으로 전달 받는데, 이때 페이지에서 변경된 부분만 계산하여 다시 그리게 됨

![image-20220801182402648](C:\Users\chanc\AppData\Roaming\Typora\typora-user-images\image-20220801182402648.png)



### B. React

> 사용자 인터페이스를 만들기 위한 JavaScript 라이브러리

* **Component**

  React에서 서비스를 개발하는 데 있어 독립적인 단위로 쪼개어 구현

* **Virtual DOM**

  가상적인 표현을 메모리에 저장하고 ReactDOM과 같은 라이브러리에 의해 실제 DOM과 동기화하는 프로그래밍 개념

* **JSX**

  JavaScript 내에서 UI를 작성하기 위해 개발자에게 익숙한 환경을 제공하여 HTML과 유사함



### C. React의 장점

* **생산성 & 재사용성**

  Component와 Hook을 활용하여 작은 단위의 독립적인 요소로 개발하여 개발자의 생산성과 코드의 재사용성을 높임

- **풍부한 자료 & 라이브러리**

  React는 전 세계적으로 활발하게 커뮤니티 활동이 이뤄지고 있어 방대한 자료와 편리한 오픈소스라이브러리 등이 공유되고 있음

- **다양한 사용처**

  단순한 웹 애플리케이션 뿐만 아니라 React문법을 React-Native에 적용하여 안드로이드 및 iOS 애플리케이션 등을 개발하는데 활용할 수 있음



## 2. 보충 내용

### A. Component

* **Compinent란?**

  * App을 이루는 최소 단위로 Props나 State와 같은 데이터를 입력받아 DOM Node를 생성

* **Props와 State란?**

  * Component는 두 가지 인스턴스 속성으로 Props와 State를 가짐
  * **props는** 부모 Component가 자식 Component에게 주는 값으로 어떠한 값을 Component에 전달해 줘야 할때 사용하며 할당된 후 Component 내부에서 값을 변경할 수 없음
  * **State는** Component 내부에서 선언하며 내부에서 값을 변경할 수 있으며, 동적인 데이터를 다룰 땐 State를 사용함

* **Component의 LifeCycle**

  * Component는 여러 종류의 Lifecycle method를 가지는데, 이러한 method를 활용하여 특정 시점에 코드가 실행되도록 설정할 수 있음

  * **마운트** 

    Component의 인스턴스가 생성되어 DOM에 삽입될 때 순서대로 호출됨

    * `contstuctor() `
    * `static getDerivedStateFromProps()`
    * `render()`
    * `componentDidMount()`

  * **업데이트**

    props또는 state가 변경되면 갱신이 발생하는데, Component가 리렌더링 될 때 순서대로 호출됨

    * `static getDerivedStateFromProps()`
    * `shouldComponentUpdate()`
    * `render()`
    * `getSnapshotBeforeUpdate()`
    * `componentDidUpdate()`

  * **마운트 해제** 

    컴포넌트가 DOM에서 제거될 때 호출됨

    * `componentWillUnmount()`

* **Component의 종류**

  * Functtion Component
  * Class Component



### B. Virtual DOM

* **DOM(Document Object Model)이란?**
  * 객체로 문서 구조를 표현하는 방법으로 XML이나 HTML로 작성 함
  * 웹 브라우저는 DOM을 활용하여 객체에 JavaScript와 CSS를 적용함
  * DOM은 Tree형태로 특정 Node를 찾거나 수정 또는 제거하거나 원하는 곳에 삽입할 수 있음
* **DOM(Document Object Model)의 단점**
  * DOM은 UI에 최적화되어 있지 않다는 문제점이 있고 HTML은 자체적으로 정적이기 때문에 JavaScript를 사용하여 동적인 페이지를 구성할 수 있음
  * 큰 규모의 Application일 경우 DOM에 직접 접근하여 변화를 주다 보면 성능 이슈가 발생함
* **Virtual DOM**
  * React는 Virtual DOM 방식을 사용하여 DOM 업데이트를 추상화함으로써 DOM 처리 횟수를 최소화하여 효율족으로 진행 



### C. JSX

* **JSX란?**
  * JSX(JavaScript XML)는 Javascript에 XML을 추가한 확장한 문법임
  * JSX는 공식적인 JavaScript 문법은 아님 
  * Browser에서 실행하기 전에 Babel을 사용하여 JavaScript 형태의 코드로 변환됨
* **JSX 문법**
  * 반드시 부모 요소 하나가 감싸는 형태
  * React DOM은 HTML 어트리뷰트 이름 대신 camelCase 프로퍼티 명명 규칙을 사용
  * JavaScript 표현식을 사용할 때는 `{ }`로 감싸줌
  * JSX 상에서는 `style={ }` 안에 `{ }` 자료형으로 삽입
  * if문(for문) 대신 삼항 연산자(조건부 연산자) 사용



## 3. 참고 자료

* **React란?**
  * https://dev-yakuza.posstree.com/ko/react/create-react-app/react/

* **SPA(Single Page Application)**
  * https://poiemaweb.com/js-spa

* **서버 사이드 렌더링 / 클라이언트 사이드 렌더링**
  * https://ctdlog.tistory.com/46
  * https://velog.io/@zansol/%ED%99%95%EC%9D%B8%ED%95%98%EA%B8%B0-%EC%84%9C%EB%B2%84%EC%82%AC%EC%9D%B4%EB%93%9C%EB%A0%8C%EB%8D%94%EB%A7%81SSR-%ED%81%B4%EB%9D%BC%EC%9D%B4%EC%96%B8%ED%8A%B8%EC%82%AC%EC%9D%B4%EB%93%9C%EB%A0%8C%EB%8D%94%EB%A7%81CSR

* **Component Lifecycle**
  * https://kyun2da.dev/react/%EB%A6%AC%EC%95%A1%ED%8A%B8-%EB%9D%BC%EC%9D%B4%ED%94%84%EC%82%AC%EC%9D%B4%ED%81%B4%EC%9D%98-%EC%9D%B4%ED%95%B4/

* **Virtual DOM**
  * https://velopert.com/3236
  * https://developerntraveler.tistory.com/51

* **React Document**
  * https://ko.reactjs.org/docs/hello-world.html