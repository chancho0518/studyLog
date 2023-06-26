# 04 React Event Handling



## 1. 학습 내용

### ▶ Event Handling 방법

* **Handling function 선언**

```react
const App = () => {
    const handleClick = () => {
        alert("클릭했습니다.");
    }
    return (
        <div>
            <button onClick={handleClick}>클릭하세요</button>
        </div>
    );
};
```

* **익명함수 처리**

```react
const App = () => {
    return (
        <div>
            <button onClick={() => { alert('클릭했습니다.') }
                            }>클릭하세요</button>
        </div>
    )
}
```



### ▶ Event Object

```react
const App= () => {
    consthandleChange = (event) => {
        console.log(event.target.value) + "라고입력하셨네요.");
    }
    return(
        <div>
            <input onChange={handleChange} />
        </div>
    );
};
```

* **DOM Element의 경우 handling function에 Event Object를 매개변수로 전달**

* **Event Object를 이용하여 event의 발생 원인, even가 일어난 Element에 대한 정보를 얻을수 있음**
* **Event Type(click, key press 등)과 DOM 종류(button, form, input 등)에 따라 전달되는 Event Object의 내용도 다름**
* **참고: https://developer.mozilla.org/ko/docs/Web/API/Event**



### ▶ 자주 사용되는 DOM Event

* **onClick**: Element를 클릭한 경우
* **onChange**: Element의 내용이 변경되었된 경우(input의 텍스트를 변경, 파일 선택 등)
* **onKeyDown, onKeyUp, onKeyPress**: 키보드 입력이 일어난 경우
* **onDoubleClick**: Element를 더블 클릭한 경우
* **onFocus**: Element에 Focus된 경우
* **onBlur**: Element가 Focus를 잃은 경우
* **onSubmit**: Form Element에서 Submit 한 경우



### ▶ Conponent내의 Event Handling

* **DOM Button Click**

```react
// DOM element의 Click Event 예제

const App = () => {
    const handleClick= () => {
        alert("클릭했습니다.");
    }
    return(
        <div>
            <buttononClick={handleClick}>클릭하세요</button>
        </div>
    );
};
```

* **DOM Input 값을 State에 저장하기**

```react
const App = () => {
    const[inputValue, setInputValue] = useState("defaultValue");
    const handleChange = (event) => {
        setInputValue(event.target.value);
    }
    
    return (
        <div>
            <input onChange={hadleChange} defaultValue={inputValue} />
			<br/>입력한값은:{inputValue}
        </div>
    );
};

// Event Object의 target은 event의 원인이 되는 Element를 가리킴
// 현재 event의 target은 input element이므로 입력된 value를 가져와 setState를 하는 모습임
```

* **다중 Input Value 동시에 처리하기**

```react
const App = () => {
    const[user, setUser] = useState({ 
        name; "민수",
        school: "엘리스대학교"
    });
    const handleChange = (event) => {
        const { name, value }
        const newUser = { ...user };
        newUser[name] = value;
        setUser(newUser);
    };
    
    return(
        <div>
            <input name="name" onChange={handleChange} value={user.name}
            <br/>
			<input name="school" onChange={handleChange} value={user.school} />
            <p>
                {user.name}님 은{user.school}에 재학중입니다.
            </p>
        </div>
    );
};

// State를 여러 개 선언할 수도 있지만 Object를 활용하여 여러 개의 input을 state로 관리할 수 있음
// target으로 부터 name을 할당 받아 해당 name의 key에 해당하는 value를 변경하여 state에 반영함
```



### ▶ 다른 Conponent로 Event 전달

* **Component간에 Event 전달하기**

```react
// MyForm.js
const MyForm = ({ onChange }) => {
    return(
        <div>
            <span>이름:</span>
            <input onChange={onChange} />
        </div>
    )
}

// App.js
const App = () => {
	const[username, setUsername] = useState('');
    return(
        <div>
        	<h1>{username}님환영합니다.</h1>
            <MyForm onChange={(event) => {
                    setUsername(event.target.value)
                }} />
        </div>
    )
}

// 입력한 정보를 현재 Component가 아닌 부모 Component에서 활용해야 하는 경우 Evnet를Props로 전달하여 처리함
```

* **Custom Event**

```react
// SOS.js
const SOS = ({onSOS}) => {
    const [count, setCount] = useState(0);
    const handleClick = () => {
        if(count>= 2) {
            onSOS();
        }
        setCount(count + 1);
    }
    return(
        <button onClick={handleClick}>
            세 번 누르면 긴급호출({count})
        </button>
    )
}


// App.js
const App = () => {
    return(
        <div>
            <SOS onSOS={() => {
                    alert("긴급사태!");
                }} />
        </div>
    );
};
```

* **Event 명명법**

  * "on" + 동사 또는 "on' + 명사+ 동사 형태로 작성

    ex. `onClick`, `onButtonClick`, `onInputChange`

  * handling function 경우도 "handle" + 동사 또는 "handle" + 명사+ 동사의 형태로 작성하며 "handle" 대신 event명과 동일한 "on"을 앞에 붙이는 것이 가능



## 2. 보충 내용

### ▶ Event Bubbling

> **Event Bubbling이란?**
>
> 한 element에 이벤트가 발생하면 해당 element에 할당된 handler가 동작하고 이어서 부모 element가 동작하고 최상단의 부모 element를 만날 때까지 반복되면서 handler가 동작하는 현상

* **Event Bubbling 예시**

```html
<body>
    <div class="DIV1">
      DIV1
      <div class="DIV2">
        DIV2
        <div class="DIV3">DIV3</div>
      </div>
    </div>
</body>
```

```javascript
const divs = document.querySelectorAll("div");

const clickEvent = (e) => {
  console.log(e.currentTarget.className);
};

divs.forEach((div) => {
  div.addEventListener("click", clickEvent);
});

/*
DIV3
DIV2
DIV1
*/
```

![04 Event](https://user-images.githubusercontent.com/46704032/183041821-9f2718fc-e56c-4a15-9bbd-40c886cf7213.png)

* `div`를 클릭하면 해당하는 class의 이름이 console로 출력되는 코드
* JavaScript는 기본적으로 bubbling이 발생하기 때문에 `<div class="DIV3">DIV3</div>`를 click한다면 console에는 DIV3, DIV2, DIV1이 순서대로 출력됨

* event bubbling을 막기 위해서는 `event.stoprPropagation()`을 사용하여 상위로 전달되는 event를 막을 수 있음

```javascript
const clickEvent = (e) => {
  e.stopPropagation();
  console.log(e.currentTarget.className);
};

/*
DIV3
*/
```



## 3. 참고 자료

* **React 작동 방법**
  * https://d2.naver.com/helloworld/9297403
* **Event Handling**
  * https://hyunalee.tistory.com/128
* **Event Bubbling**
  * https://ko.javascript.info/bubbling-and-capturing
  * https://joshua1988.github.io/web-development/javascript/event-propagation-delegation/