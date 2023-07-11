# 03 Props & State

## 1. 학습 내용

### ▶ Props(Properties)

> **Props란?**
>
> - Component에 원하는 값을 넘겨줄 때 사용
> - Component의 ‘재사용’을 위해 사용
> - 넘겨줄 수있는 값은 변수, 함수, 객체, 배열 등 JavaScript의 요소라면 제한이 없음
>
> ```react
> // Component 생성
> const Welcome = (props) => {
> 	retutn (
> 		<h1>Hello, {props.name}</h1>
> 	);
> }
>
> // Component 사용
> const App = () => {
>  return (
>    <div>
>      <Welcome name="수영"/>
>      <Welcome name="민수"/>
>      <Welcome name="영희"/>
>    </div>
>  );
> }
> ```

- **Props의 특징**

  - Props는 읽기 전용임

  ```react
  // Props의 값을 변경하고 싶다면
  // Props의 값을 직접 변경하지 않고 새로운 변수를 생성하여 변경함

  // Don't
  const Welcome = (props) => {
    props.name = props.name + "님";
    return (
      <h1>Hello, {props.name}</h1>
    );
  }

  // Do
  const Welcome = (props) => {
    const username = props.name + "님";
    return (
      <h1>Hello, {username}</h1>
    );
  }
  ```

- **DOM Element의 Attributes**

  - 기본적인 DOM Element(div, span 등)들의 Attribute는 camel case로 작성함

    ex. tabIndex, className 등

  - 그러나 ‘data-’ 또는 ‘aria-’ 로 시작하는 Attribute는 예외

    ex. data-type, aria-label 등

  - HTML의 Attribute와 다른 이름을 가지는 Attribute가 있음

    ex. class → className, for → htmlFor 등

  - HTML의 Attribute와 다른 동작 방식을 가진 Attribute가 있음

    ex. checked(defaultChecked), value(defaultValue), style 등

  - React에서만 쓰이는 새로운 Attribute가 있음

    ex. key, dangerouslySetInnerHTML 등

- **HTML과 다른 방식의 React Attribute(checked, value)**

```react
<input type = "checkbox" checked={false} />

// HTML에서 checked 또는 value는 해당 값이 ‘초기값’으로 사용되지만,
// React 내에서는 현재 값을 의미함
// 예시 코드처럼 checked 값이 false로 고정돼있는 경우에 user는 checkbox를 클릭하여도 값의 변화가 없음
// ‘초기값’ 설정 Attribute는 defaultChecked, defaultValueAttribute로 설정
```

- **React에서만 사용하는 새로운 Attribute(key)**

```react
const Names = () => {
  constnames = [
    {key: '1', value: '민수'},
    {key: '1', value: '영희'},
    {key: '1', value: '길동'},
  ]
  return (
    <div>
      {names.map((item) => (
          <li key={item.key}>{item.value}</li>
      ))}
    </div>
  )
}

// Key는 React가 어떤 항목을 변경, 추가 또는 삭제할지 식별하는 것을 도움
// Key는 Element에 안정적인 고유성을 부여하기 위해 배열 내부의 Element에 지정
// Key는 배열 안에서 형제 사이에서 고유해야 하고 전체 범위에서 고유할 필요는 없음
// 두개의 다른 배열을 만들 때 동일한 key를 사용할 수 있음
```

### ▶ State

> **State란?**
>
> - State는 Component 내의 유동적으로 변할 수 있는 값을 저장함
> - 개발자가 의도한 동작에 의해 변할 수도 있고 user의 입력에 따라 새로운 값으로 변경될 수도있음
> - State 값이 변경되어 재렌더링이 필요한 경우에 React가 자동으로 계산하여 변경된 부분을 렌더링함

- **State 값의 변경**

  - State 값을 직접 변경하게 되면 React가 Component를 재렌더링할 타이밍을 감지하지 못함
  - 따라서 State 값은 직접 변경하지 않고, setState function을 이용하여 변경함
  - setState function 호출시 React에서 재렌더링 명령이 내려지게 됨

- **State 변경 방법**

  - setState내에 변경할 값 삽입

  ```react
  const[count, setCount] = useState(0);
  setCount(count + 1);
  ```

  - setState에 function 삽입

  ```react
  const[count, setCount] = useState(0);
  setCount((current) => {
    return current+ 1
  })
  ```

  - 현재 값을 기반으로 State를 변경하고자 하는 경우 함수 삽입 방법을 권장함

- **Object를 갖는 State를 만들때 주의사항**

  - Object를 직접 변경하는 경우 React가 변경을 감지 하지 못함
  - user의 grade가 변경되었지만, user의 내용을 담는 Object 자체가 변경된 것은 아님

  ![03 State1](https://user-images.githubusercontent.com/46704032/182531437-f6ca2134-0c7d-4bb8-b09d-2043195c7715.png)

  ```react
  const[user, setUser] = useState({ name: "민수", grade: 1 })
  setUser((current) => {
    current.grade= 2;
    return current;
  })
  ```

  - 기존의 user 내용을 새로운 Object에 담고 grade를 변경함

  ![03 State2](https://user-images.githubusercontent.com/46704032/182531492-bda86b64-914c-4783-9113-3b300a0b8cca.png)

  ```react
  const[user, setUser] = useState({name: '민수',grade: 1 })
  setUser((current) => {
    const newUser = { ...current}
    newUser.grade = 2
    returnnewUser
  })
  ```

## 2. 학습 내용

### ▶ Array / Object 동작원리

- 참조자료형

  - JavaScript에서 Array / Object 를 생성하면 해당 값은 RAM이라는 가상공간에 저장이 되고 이를 변수로 선언하면 변수에서는 이 값을 참조하게 됨

  ```javascript
  let arr = [1, 2, 3];
  ```

  ![img](https://codingapple.com/wp-content/uploads/2020/04/%EC%BA%A1%EC%B2%98423134.png)

  - 이에 해당 값을 복사하면 다름과 같은 현상이 나타남

  ```javascript
  let data1 = [1, 2, 3];
  let data2 = data1; // 복사문법
  ```

  - `data2` 출력하면 `[1, 2, 3]`으로 출력이 되지만, `data1`과 `data2`는 각각 `[1, 2, 3]`을 별개로 저장하는 것이 아님 **`data1`과 `data2`는 같은 값을 공유함**

  - 이에, `data1`을 변경하면 `data2`의 값도 변경됨

  - 이는 변수에서 해당 값(`[1, 2, 3]`)을 참조한 것 값만 복사를 하여 `data1`과 `data2`이 같은 참조값을 가지게 되어 같은 값을 가지게 됨

  ```javascript
  let data1 = [1, 2, 3];
  let data2 = data1; // 복사
  data2[0] = 1000; // data2 내부 변경
  console.log(data2 === data1); // true
  ```

  - 이러한 이유로 State 값을 직접 변경하면 동일한 참조값에는 변함이 없기 때문에 동일한 State의 변화가 없다고 판단한 React은 재렌더링 타이밍을 감지하지 못함
  - 따라서 Array / Object에서의 State의 변경이 이뤄질 경우는 새로운 Array / Object를 생성하여 기존 값을 담고 변경함

  ```react
  const[user, setUser] = useState({name: '민수',grade: 1 })
  setUser((current) => {
    const newUser = { ...current}
    newUser.grade = 2
    returnnewUser
  })
  ```

## 3. 참고 자료

- **State 소개**

  - https://opentutorials.org/module/4058/24738

- **JavaScript의 Reference Data Type**

  - https://codeburst.io/explaining-value-vs-reference-in-javascript-647a975e12a0

- **State의 Key 사용**
  - https://ko.reactjs.org/docs/lists-and-keys.html#keys
