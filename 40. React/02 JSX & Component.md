# 02 JSX & Component

## 1. 학습 내용

### A. JSX

> **JSX란?**
>
> - JSX는 함수 호출과 객체 생성을 위한 문법적 편의를 제공하는 JavaScript의 확장
>
> - HTML과 비슷하게 생겼으나 JavaScript이고 HTML과 다른 부분이 있음
> - JSX는 Babel에 의해서 Transcompile 됨

- **JSX의 장점**

  - 개발자 편의성
  - 협업에 용이하며 생산성이 향상됨
  - 문법 오류와 코드량이 감소함

- **JSX의 특징**
  - HTML과 차이점
    - HTML 태그 내에 JavaScript 연산
    - class → className
    - 스타일은 object로 표현하여 Inline Style의 Property name은 camelCase로 명명함
    - 닫는 태그 필수
    - 최상단 element는 반드시 하나임

### B. Component

> **Component란?**
>
> - React에서 페이지를 구성하는 최소단위
> - Component의 이름은 대문자로 시작
> - Class Component / Function Component
>
> - Controlled Component / Uncontrolled Component

- **Component의 특징**

  - Component에 Attribute에 해당하는 부분을 Props(Properties)라고 하며 Component끼리 Data를 주고 받을 때 Props를 사용
  - Component 내에서 Data를 관리할 때는 State
  - Component에 작성된 하위 Element를 children이라고 함
  - Children도 결국엔 props중 하나임
  - Data는 부모 → 자식으로만 전달

  ```react
  // 상위 Element로부터 전달받은 props를 활용하는 예시
  // 해당 Component의 Children 요소 역시 props 로부터 값을 받아옴
  const MyComponent = (props) => {
    const { user, color, children } = props

    return (
      <div style= {{ color }}>
        <p>{user.name}님의 하위 element는!</p>
          {children}
      </div>
    )
  }
  ```

## 2. 보충 내용

### A. Babel

> **Babel이란?**
>
> ES6+ 버전 이상의 JavaScript나 JSX, TypeScript 코드를 하위 버전으로 변환시켜 IE나 다른 브라우저에서 동작할 수 있도록 하는 Transpiler

- **Babel을 사용하는 이유**
- **Babel-polyfill**
  - Polyfill
    - Polyfill은 개발자가 특정 기능을 지원되지 않는 브라우저를 위해 사용할 수 있는 코드 조각이나 플러그인을 의미
  - Babel-polyfill
    - Babel은 문법을 변환해주는 역할을 함
    - 이에 Babel-polyfill을 이용하여 현재 브라우저에서 지원하지 않은 함수를 검사하여 각 Object의 Prototype에 붙여주는 역할을 함
    - Babel은 Compile-time에 실행되되고 Babel-polyfill은 Run-time에 실행됨
    - Babel-polyfill을 사용하려면 별도의 설정이 필요함

### B. Webpack

> **Webpack이란?**
>
> - Webpack = 모듈 번들링이라고 함
> - HTML 파일에 들어가는 JavaScript 파일들을 하나의 JavaScript 파일로 만들어주는 방식을 모듈 번들링이라고 함
> - Webpack은 필요한 다수의 JavaScript 파일을 하나의 JavaScript 파일로 만들어 주는 역할을 함

- **Webpack을 사용하는 이유?**
  - 전통적인 페이지는 페이지의 변경이 필요할 때 새로운 HTML을 loading 함
  - 그런데 최근의 SPA(Single Page Application)은 최초에 서버로 부터 전달받은 HTML페이지에 여러개의 JavaScript 파일들이 포함되어 있음
  - 파일을 컴파일 할 때, 여러 모듈들의 파일을 loading을 하면 반응속도가 느려짐
  - Webpack은 여러 개의 파일 중 서로 연관 되어 종송석이 존재하는 파일을 하나의 파일로 패키징함으로써 웹페이지 성능 최적화 함

## 3. 참고 자료

- **Babel 공식 홈페이지**

  - https://babeljs.io/

- **바벨 사용법**

  - https://www.daleseo.com/js-babel/

- **Babel-polyfill**
  - https://babeljs.io/docs/en/babel-polyfill/
